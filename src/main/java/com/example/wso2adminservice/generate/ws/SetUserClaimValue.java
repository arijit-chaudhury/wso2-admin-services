
package com.example.wso2adminservice.generate.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "claimURI",
    "claimValue",
    "profileName"
})
@XmlRootElement(name = "setUserClaimValue")
public class SetUserClaimValue {

    @XmlElementRef(name = "userName", namespace = "http://service.ws.um.carbon.wso2.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "claimURI", namespace = "http://service.ws.um.carbon.wso2.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimURI;
    @XmlElementRef(name = "claimValue", namespace = "http://service.ws.um.carbon.wso2.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimValue;
    @XmlElementRef(name = "profileName", namespace = "http://service.ws.um.carbon.wso2.org", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileName;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * Gets the value of the claimURI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimURI() {
        return claimURI;
    }

    /**
     * Sets the value of the claimURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimURI(JAXBElement<String> value) {
        this.claimURI = value;
    }

    /**
     * Gets the value of the claimValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimValue() {
        return claimValue;
    }

    /**
     * Sets the value of the claimValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimValue(JAXBElement<String> value) {
        this.claimValue = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileName(JAXBElement<String> value) {
        this.profileName = value;
    }

}
