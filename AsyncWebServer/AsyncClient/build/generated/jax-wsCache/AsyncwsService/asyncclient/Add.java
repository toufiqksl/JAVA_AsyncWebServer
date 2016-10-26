
package asyncclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="add">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="str1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="str2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", propOrder = {
    "str1",
    "str2"
})
public class Add {

    protected int str1;
    protected int str2;

    /**
     * Gets the value of the str1 property.
     * 
     */
    public int getStr1() {
        return str1;
    }

    /**
     * Sets the value of the str1 property.
     * 
     */
    public void setStr1(int value) {
        this.str1 = value;
    }

    /**
     * Gets the value of the str2 property.
     * 
     */
    public int getStr2() {
        return str2;
    }

    /**
     * Sets the value of the str2 property.
     * 
     */
    public void setStr2(int value) {
        this.str2 = value;
    }

}
