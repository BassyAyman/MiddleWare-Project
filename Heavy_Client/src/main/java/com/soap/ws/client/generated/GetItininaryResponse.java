
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItininaryResult" type="{http://schemas.datacontract.org/2004/07/RoutingServeur}DirectionSuivre" minOccurs="0"/&gt;
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
    "getItininaryResult"
})
@XmlRootElement(name = "GetItininaryResponse", namespace = "http://tempuri.org/")
public class GetItininaryResponse {

    @XmlElementRef(name = "GetItininaryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectionSuivre> getItininaryResult;

    /**
     * Obtient la valeur de la propriété getItininaryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectionSuivre }{@code >}
     *     
     */
    public JAXBElement<DirectionSuivre> getGetItininaryResult() {
        return getItininaryResult;
    }

    /**
     * Définit la valeur de la propriété getItininaryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectionSuivre }{@code >}
     *     
     */
    public void setGetItininaryResult(JAXBElement<DirectionSuivre> value) {
        this.getItininaryResult = value;
    }

}
