/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testclient;

import java.util.concurrent.ExecutionException;
import javax.xml.ws.WebServiceRef;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

/**
 *
 * @author sagar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    @WebServiceRef(wsdlLocation= "http://localhost:8080/TestService/TestwsService?wsdl")
    static TestwsService service;

    public void doTest(String[] args) {
        try {
            System.out.println("Retrieving the port from the following service: " + service);
            System.out.println("Invoking the operation on the port.");
            
            
            //SIMPLE USE (by default synchronous)
            Testws port = service.getTestwsPort();
            String response = port.concat("sagar ", "0000");
            
            int j= 5;            
            while (j-- >0 )
                System.out.println(port.inc());           
            System.out.println(response);
           
            
            //ASYNCH use POLLING METHOD
            javax.xml.ws.Response< IncResponse > res = port.incAsync();
            j = 0;
            while(!res.isDone())
                System.out.print(j++ + " ");
            System.out.println("\n\nPolling Returned  : " + res.get().getReturn());
        
            
            
            //ASYNCH use CALLBACK METHOD
            CallbackHandler[] callbackHandler= new CallbackHandler[5];
            Future<?> [] resp= new Future<?>[5];
            for(int k=0; k< 5; k++){
                callbackHandler[k] = new CallbackHandler();
                resp[k] = port.incAsync(callbackHandler[k]);
            }
            
            for(int k=0; k< 5; k++){
                if( !resp[k].isDone() )
                    System.out.println("... hey "+ k +"! I'm waiting :( ");
            }
            
            for(int k=0; k< 5; k++){
                while( !resp[k].isDone() );
            }
            //while( !resp[k].isDone() );
            //System.out.println("\nCallBack returned :"+  callbackHandler.getResponse().getReturn() );
            /**/
            
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        
    }
    
    public static void main(String[] args) {
        try {
            Main client = new Main();
            client.doTest(args);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}

class CallbackHandler implements AsyncHandler<IncResponse>  {
    private IncResponse output;
    
    public void handleResponse(Response<IncResponse> response) {
        try {
            output = response.get();
            System.out.println("OPERATION COMPLETED");// \\:D/");
            System.out.println("CallBack returned : "+  output.getReturn() );
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    IncResponse getResponse() {
        return output;
    }
}
