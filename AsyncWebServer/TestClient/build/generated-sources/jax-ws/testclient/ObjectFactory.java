
package testclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the testclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Concat_QNAME = new QName("http://test/", "concat");
    private final static QName _GetResponse_QNAME = new QName("http://test/", "getResponse");
    private final static QName _Get_QNAME = new QName("http://test/", "get");
    private final static QName _Inc_QNAME = new QName("http://test/", "inc");
    private final static QName _ConcatResponse_QNAME = new QName("http://test/", "concatResponse");
    private final static QName _IncResponse_QNAME = new QName("http://test/", "incResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: testclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inc }
     * 
     */
    public Inc createInc() {
        return new Inc();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link IncResponse }
     * 
     */
    public IncResponse createIncResponse() {
        return new IncResponse();
    }

    /**
     * Create an instance of {@link ConcatResponse }
     * 
     */
    public ConcatResponse createConcatResponse() {
        return new ConcatResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Concat }
     * 
     */
    public Concat createConcat() {
        return new Concat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Concat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "concat")
    public JAXBElement<Concat> createConcat(Concat value) {
        return new JAXBElement<Concat>(_Concat_QNAME, Concat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "inc")
    public JAXBElement<Inc> createInc(Inc value) {
        return new JAXBElement<Inc>(_Inc_QNAME, Inc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "concatResponse")
    public JAXBElement<ConcatResponse> createConcatResponse(ConcatResponse value) {
        return new JAXBElement<ConcatResponse>(_ConcatResponse_QNAME, ConcatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "incResponse")
    public JAXBElement<IncResponse> createIncResponse(IncResponse value) {
        return new JAXBElement<IncResponse>(_IncResponse_QNAME, IncResponse.class, null, value);
    }

}
