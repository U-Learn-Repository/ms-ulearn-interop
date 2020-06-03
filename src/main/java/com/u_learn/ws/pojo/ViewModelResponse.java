
package com.u_learn.ws.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ViewModelResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ViewModelResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User" type="{http://schemas.datacontract.org/2004/07/sap_soap}ViewModelUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewModelResponse", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", propOrder = {
    "error",
    "response",
    "token",
    "uri",
    "user"
})
public class ViewModelResponse {

    @XmlElement(name = "Error")
    protected Boolean error;
    @XmlElementRef(name = "Response", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> response;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> token;
    @XmlElementRef(name = "Uri", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uri;
    @XmlElementRef(name = "User", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<ViewModelUser> user;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setError(Boolean value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponse(JAXBElement<String> value) {
        this.response = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setToken(JAXBElement<Object> value) {
        this.token = value;
    }

    /**
     * Obtiene el valor de la propiedad uri.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUri() {
        return uri;
    }

    /**
     * Define el valor de la propiedad uri.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUri(JAXBElement<String> value) {
        this.uri = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ViewModelUser }{@code >}
     *     
     */
    public JAXBElement<ViewModelUser> getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ViewModelUser }{@code >}
     *     
     */
    public void setUser(JAXBElement<ViewModelUser> value) {
        this.user = value;
    }

}
