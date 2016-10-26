/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.Endpoint;

/**
 *
 * @author sagar
 */
@WebService(serviceName = "TestwsService")
public class Testws {
    static int x= 0;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "concat")
    public String concat(@WebParam(name = "str1") String i, @WebParam(name = "str2") String j) {
        String k= i+" "+j;        
        return k;
    }
    
    @WebMethod(operationName= "inc")
    public int inc(){
        return x++;
    }
    
    @WebMethod(operationName= "get")
    public int get(){
        return x;
    }
    /**/
    public static void main(){
        Endpoint.publish("http://localhost:8080/endpointService/", new Testws());
    }
}
