/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asyncclient;

import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Toufiq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @WebServiceRef(wsdlLocation = "http://toufiq-pc:8080/AsyncServer/AsyncwsService?wsdl")
    static AsyncwsService service;

    public void doTest(String[] args) {
        try {
            System.out.println("Retrive data from : " + service);

            //SIMPLE USE (by default synchronous)
            AsyncServer port = service.getAsyncServerPort();
            int response = port.add(5, 10);
            System.out.println("Sum is : " + response);

            //ASYNCH use CALLBACK METHOD
            CallbackHandler[] callbackHandler = new CallbackHandler[5];
            Future<?>[] resp = new Future<?>[5];
            for (int k = 0; k < 5; k++) {
                callbackHandler[k] = new CallbackHandler();
                resp[k] = port.incAsync(callbackHandler[k]);
            }

            for (int k = 0; k < 5; k++) {
                if (!resp[k].isDone()) {
                    System.out.println("Waiting for request : " + k);
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        try {
            Main client = new Main();
            client.doTest(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class CallbackHandler implements AsyncHandler<IncResponse> {

    private IncResponse output;

    public void handleResponse(Response<IncResponse> response) {
        try {
            output = response.get();
            System.out.println("CallBack returned : " + output.getReturn());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    IncResponse getResponse() {
        return output;
    }
}
