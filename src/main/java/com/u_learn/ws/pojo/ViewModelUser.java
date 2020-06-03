
package com.u_learn.ws.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ViewModelUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ViewModelUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ImageBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LostGames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Picture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalGames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WonGames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewModelUser", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", propOrder = {
    "confirmedPassword",
    "country",
    "email",
    "id",
    "imageBytes",
    "lastName",
    "lostGames",
    "name",
    "password",
    "picture",
    "totalGames",
    "userName",
    "wonGames"
})
public class ViewModelUser {

    @XmlElementRef(name = "ConfirmedPassword", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confirmedPassword;
    @XmlElementRef(name = "Country", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElementRef(name = "ImageBytes", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> imageBytes;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElement(name = "LostGames")
    protected Integer lostGames;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "Picture", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> picture;
    @XmlElement(name = "TotalGames")
    protected Integer totalGames;
    @XmlElementRef(name = "UserName", namespace = "http://schemas.datacontract.org/2004/07/sap_soap", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;
    @XmlElement(name = "WonGames")
    protected Integer wonGames;

    /**
     * Obtiene el valor de la propiedad confirmedPassword.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfirmedPassword() {
        return confirmedPassword;
    }

    /**
     * Define el valor de la propiedad confirmedPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfirmedPassword(JAXBElement<String> value) {
        this.confirmedPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad imageBytes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getImageBytes() {
        return imageBytes;
    }

    /**
     * Define el valor de la propiedad imageBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setImageBytes(JAXBElement<byte[]> value) {
        this.imageBytes = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad lostGames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLostGames() {
        return lostGames;
    }

    /**
     * Define el valor de la propiedad lostGames.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLostGames(Integer value) {
        this.lostGames = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad picture.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPicture(JAXBElement<String> value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalGames() {
        return totalGames;
    }

    /**
     * Define el valor de la propiedad totalGames.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalGames(Integer value) {
        this.totalGames = value;
    }

    /**
     * Obtiene el valor de la propiedad userName.
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
     * Define el valor de la propiedad userName.
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
     * Obtiene el valor de la propiedad wonGames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWonGames() {
        return wonGames;
    }

    /**
     * Define el valor de la propiedad wonGames.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWonGames(Integer value) {
        this.wonGames = value;
    }

}
