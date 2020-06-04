
package com.u_learn.ws.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.u_learn.ws.pojo package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ViewModelResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "ViewModelResponse");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ViewModelUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "ViewModelUser");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ViewModelUserLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "LastName");
    private final static QName _ViewModelUserCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Country");
    private final static QName _ViewModelUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Name");
    private final static QName _ViewModelUserPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Password");
    private final static QName _ViewModelUserImageBytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "ImageBytes");
    private final static QName _ViewModelUserEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Email");
    private final static QName _ViewModelUserUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "UserName");
    private final static QName _ViewModelUserConfirmedPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "ConfirmedPassword");
    private final static QName _ViewModelUserPicture_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Picture");
    private final static QName _ExistUserResponseExistUserResult_QNAME = new QName("http://tempuri.org/", "ExistUserResult");
    private final static QName _ViewModelResponseToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Token");
    private final static QName _ViewModelResponseUri_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Uri");
    private final static QName _ViewModelResponseUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "User");
    private final static QName _ViewModelResponseResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/sap_soap", "Response");
    private final static QName _ExistUserEmail_QNAME = new QName("http://tempuri.org/", "email");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.u_learn.ws.pojo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExistUser }
     * 
     */
    public ExistUser createExistUser() {
        return new ExistUser();
    }

    /**
     * Create an instance of {@link ExistUserResponse }
     * 
     */
    public ExistUserResponse createExistUserResponse() {
        return new ExistUserResponse();
    }

    /**
     * Create an instance of {@link ViewModelResponse }
     * 
     */
    public ViewModelResponse createViewModelResponse() {
        return new ViewModelResponse();
    }

    /**
     * Create an instance of {@link ViewModelUser }
     * 
     */
    public ViewModelUser createViewModelUser() {
        return new ViewModelUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "ViewModelResponse")
    public JAXBElement<ViewModelResponse> createViewModelResponse(ViewModelResponse value) {
        return new JAXBElement<ViewModelResponse>(_ViewModelResponse_QNAME, ViewModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewModelUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "ViewModelUser")
    public JAXBElement<ViewModelUser> createViewModelUser(ViewModelUser value) {
        return new JAXBElement<ViewModelUser>(_ViewModelUser_QNAME, ViewModelUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "LastName", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserLastName(String value) {
        return new JAXBElement<String>(_ViewModelUserLastName_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Country", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserCountry(String value) {
        return new JAXBElement<String>(_ViewModelUserCountry_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Name", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserName(String value) {
        return new JAXBElement<String>(_ViewModelUserName_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Password", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserPassword(String value) {
        return new JAXBElement<String>(_ViewModelUserPassword_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "ImageBytes", scope = ViewModelUser.class)
    public JAXBElement<byte[]> createViewModelUserImageBytes(byte[] value) {
        return new JAXBElement<byte[]>(_ViewModelUserImageBytes_QNAME, byte[].class, ViewModelUser.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Email", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserEmail(String value) {
        return new JAXBElement<String>(_ViewModelUserEmail_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "UserName", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserUserName(String value) {
        return new JAXBElement<String>(_ViewModelUserUserName_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "ConfirmedPassword", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserConfirmedPassword(String value) {
        return new JAXBElement<String>(_ViewModelUserConfirmedPassword_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Picture", scope = ViewModelUser.class)
    public JAXBElement<String> createViewModelUserPicture(String value) {
        return new JAXBElement<String>(_ViewModelUserPicture_QNAME, String.class, ViewModelUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExistUserResult", scope = ExistUserResponse.class)
    public JAXBElement<ViewModelResponse> createExistUserResponseExistUserResult(ViewModelResponse value) {
        return new JAXBElement<ViewModelResponse>(_ExistUserResponseExistUserResult_QNAME, ViewModelResponse.class, ExistUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Token", scope = ViewModelResponse.class)
    public JAXBElement<Object> createViewModelResponseToken(Object value) {
        return new JAXBElement<Object>(_ViewModelResponseToken_QNAME, Object.class, ViewModelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Uri", scope = ViewModelResponse.class)
    public JAXBElement<String> createViewModelResponseUri(String value) {
        return new JAXBElement<String>(_ViewModelResponseUri_QNAME, String.class, ViewModelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewModelUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "User", scope = ViewModelResponse.class)
    public JAXBElement<ViewModelUser> createViewModelResponseUser(ViewModelUser value) {
        return new JAXBElement<ViewModelUser>(_ViewModelResponseUser_QNAME, ViewModelUser.class, ViewModelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/sap_soap", name = "Response", scope = ViewModelResponse.class)
    public JAXBElement<String> createViewModelResponseResponse(String value) {
        return new JAXBElement<String>(_ViewModelResponseResponse_QNAME, String.class, ViewModelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = ExistUser.class)
    public JAXBElement<String> createExistUserEmail(String value) {
        return new JAXBElement<String>(_ExistUserEmail_QNAME, String.class, ExistUser.class, value);
    }

}
