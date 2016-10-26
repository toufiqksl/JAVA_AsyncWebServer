/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Toufiq
 */

@WebService(serviceName = "AsyncwsService")
public class AsyncServer {
    static int x= 0;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "str1") int i, @WebParam(name = "str2") int j) {
        int k= i + j;        
        return k;
    }
    
    @WebMethod(operationName= "inc")
    public int inc(){
        return x++;
    }

    /**/
    public static void main(){
        Endpoint.publish("http://localhost:8080/endpointService/", new AsyncServer());
    }

}
