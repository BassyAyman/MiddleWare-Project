
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DirectionSuivre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DirectionSuivre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="segment" type="{http://schemas.datacontract.org/2004/07/RoutingServeur}ArrayOfSegment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionSuivre", propOrder = {
    "cas",
    "segment"
})
public class DirectionSuivre {

    protected Integer cas;
    @XmlElementRef(name = "segment", namespace = "http://schemas.datacontract.org/2004/07/RoutingServeur", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSegment> segment;

    /**
     * Obtient la valeur de la propriété cas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCas() {
        return cas;
    }

    /**
     * Définit la valeur de la propriété cas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCas(Integer value) {
        this.cas = value;
    }

    /**
     * Obtient la valeur de la propriété segment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSegment> getSegment() {
        return segment;
    }

    /**
     * Définit la valeur de la propriété segment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSegment }{@code >}
     *     
     */
    public void setSegment(JAXBElement<ArrayOfSegment> value) {
        this.segment = value;
    }

}
