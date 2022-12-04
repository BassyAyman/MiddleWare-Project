
package com.soap.ws.client.generated;

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
 * generated in the com.soap.ws.client.generated package. 
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

    private final static QName _DirectionSuivre_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "DirectionSuivre");
    private final static QName _ArrayOfSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "ArrayOfSegment");
    private final static QName _Segment_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "Segment");
    private final static QName _ArrayOfStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "ArrayOfStep");
    private final static QName _Step_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "Step");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetItininaryOrigin_QNAME = new QName("http://tempuri.org/", "origin");
    private final static QName _GetItininaryDestination_QNAME = new QName("http://tempuri.org/", "destination");
    private final static QName _GetItininaryResponseGetItininaryResult_QNAME = new QName("http://tempuri.org/", "GetItininaryResult");
    private final static QName _RecuperationTestPapak_QNAME = new QName("http://tempuri.org/", "papak");
    private final static QName _RecuperationTestResponseRecuperationTestResult_QNAME = new QName("http://tempuri.org/", "RecuperationTestResult");
    private final static QName _StepInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "instruction");
    private final static QName _StepName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "name");
    private final static QName _StepWayPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "way_points");
    private final static QName _SegmentSteps_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "steps");
    private final static QName _DirectionSuivreSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/RoutingServeur", "segment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItininary }
     * 
     */
    public GetItininary createGetItininary() {
        return new GetItininary();
    }

    /**
     * Create an instance of {@link GetItininaryResponse }
     * 
     */
    public GetItininaryResponse createGetItininaryResponse() {
        return new GetItininaryResponse();
    }

    /**
     * Create an instance of {@link DirectionSuivre }
     * 
     */
    public DirectionSuivre createDirectionSuivre() {
        return new DirectionSuivre();
    }

    /**
     * Create an instance of {@link RecuperationTest }
     * 
     */
    public RecuperationTest createRecuperationTest() {
        return new RecuperationTest();
    }

    /**
     * Create an instance of {@link RecuperationTestResponse }
     * 
     */
    public RecuperationTestResponse createRecuperationTestResponse() {
        return new RecuperationTestResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSegment }
     * 
     */
    public ArrayOfSegment createArrayOfSegment() {
        return new ArrayOfSegment();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link ArrayOfStep }
     * 
     */
    public ArrayOfStep createArrayOfStep() {
        return new ArrayOfStep();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionSuivre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectionSuivre }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "DirectionSuivre")
    public JAXBElement<DirectionSuivre> createDirectionSuivre(DirectionSuivre value) {
        return new JAXBElement<DirectionSuivre>(_DirectionSuivre_QNAME, DirectionSuivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "ArrayOfSegment")
    public JAXBElement<ArrayOfSegment> createArrayOfSegment(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_ArrayOfSegment_QNAME, ArrayOfSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Segment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "Segment")
    public JAXBElement<Segment> createSegment(Segment value) {
        return new JAXBElement<Segment>(_Segment_QNAME, Segment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "ArrayOfStep")
    public JAXBElement<ArrayOfStep> createArrayOfStep(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_ArrayOfStep_QNAME, ArrayOfStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Step }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "Step")
    public JAXBElement<Step> createStep(Step value) {
        return new JAXBElement<Step>(_Step_QNAME, Step.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "origin", scope = GetItininary.class)
    public JAXBElement<String> createGetItininaryOrigin(String value) {
        return new JAXBElement<String>(_GetItininaryOrigin_QNAME, String.class, GetItininary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "destination", scope = GetItininary.class)
    public JAXBElement<String> createGetItininaryDestination(String value) {
        return new JAXBElement<String>(_GetItininaryDestination_QNAME, String.class, GetItininary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionSuivre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectionSuivre }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetItininaryResult", scope = GetItininaryResponse.class)
    public JAXBElement<DirectionSuivre> createGetItininaryResponseGetItininaryResult(DirectionSuivre value) {
        return new JAXBElement<DirectionSuivre>(_GetItininaryResponseGetItininaryResult_QNAME, DirectionSuivre.class, GetItininaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "papak", scope = RecuperationTest.class)
    public JAXBElement<String> createRecuperationTestPapak(String value) {
        return new JAXBElement<String>(_RecuperationTestPapak_QNAME, String.class, RecuperationTest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecuperationTestResult", scope = RecuperationTestResponse.class)
    public JAXBElement<String> createRecuperationTestResponseRecuperationTestResult(String value) {
        return new JAXBElement<String>(_RecuperationTestResponseRecuperationTestResult_QNAME, String.class, RecuperationTestResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "instruction", scope = Step.class)
    public JAXBElement<String> createStepInstruction(String value) {
        return new JAXBElement<String>(_StepInstruction_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "name", scope = Step.class)
    public JAXBElement<String> createStepName(String value) {
        return new JAXBElement<String>(_StepName_QNAME, String.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "way_points", scope = Step.class)
    public JAXBElement<ArrayOfint> createStepWayPoints(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_StepWayPoints_QNAME, ArrayOfint.class, Step.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "steps", scope = Segment.class)
    public JAXBElement<ArrayOfStep> createSegmentSteps(ArrayOfStep value) {
        return new JAXBElement<ArrayOfStep>(_SegmentSteps_QNAME, ArrayOfStep.class, Segment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", name = "segment", scope = DirectionSuivre.class)
    public JAXBElement<ArrayOfSegment> createDirectionSuivreSegment(ArrayOfSegment value) {
        return new JAXBElement<ArrayOfSegment>(_DirectionSuivreSegment_QNAME, ArrayOfSegment.class, DirectionSuivre.class, value);
    }

}
