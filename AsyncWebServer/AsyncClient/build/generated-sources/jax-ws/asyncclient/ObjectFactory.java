
package asyncclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the asyncclient package. 
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

    private final static QName _Add_QNAME = new QName("http://example.com/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://example.com/", "addResponse");
    private final static QName _IncResponse_QNAME = new QName("http://example.com/", "incResponse");
    private final static QName _Inc_QNAME = new QName("http://example.com/", "inc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: asyncclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Inc }
     * 
     */
    public Inc createInc() {
        return new Inc();
    }

    /**
     * Create an instance of {@link IncResponse }
     * 
     */
    public IncResponse createIncResponse() {
        return new IncResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "incResponse")
    public JAXBElement<IncResponse> createIncResponse(IncResponse value) {
        return new JAXBElement<IncResponse>(_IncResponse_QNAME, IncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "inc")
    public JAXBElement<Inc> createInc(Inc value) {
        return new JAXBElement<Inc>(_Inc_QNAME, Inc.class, null, value);
    }

}
