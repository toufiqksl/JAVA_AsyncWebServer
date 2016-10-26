
package asyncclient;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AsyncServer", targetNamespace = "http://example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AsyncServer {


    /**
     * 
     * @param str2
     * @param str1
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://example.com/", className = "asyncclient.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://example.com/", className = "asyncclient.AddResponse")
    @Action(input = "http://example.com/AsyncServer/addRequest", output = "http://example.com/AsyncServer/addResponse")
    public int add(
        @WebParam(name = "str1", targetNamespace = "")
        int str1,
        @WebParam(name = "str2", targetNamespace = "")
        int str2);

    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<asyncclient.IncResponse>
     */
    @WebMethod(operationName = "inc")
    @RequestWrapper(localName = "inc", targetNamespace = "http://example.com/", className = "asyncclient.Inc")
    @ResponseWrapper(localName = "incResponse", targetNamespace = "http://example.com/", className = "asyncclient.IncResponse")
    public Response<IncResponse> incAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "inc")
    @RequestWrapper(localName = "inc", targetNamespace = "http://example.com/", className = "asyncclient.Inc")
    @ResponseWrapper(localName = "incResponse", targetNamespace = "http://example.com/", className = "asyncclient.IncResponse")
    public Future<?> incAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<IncResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inc", targetNamespace = "http://example.com/", className = "asyncclient.Inc")
    @ResponseWrapper(localName = "incResponse", targetNamespace = "http://example.com/", className = "asyncclient.IncResponse")
    @Action(input = "http://example.com/AsyncServer/incRequest", output = "http://example.com/AsyncServer/incResponse")
    public int inc();

}