
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para notas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="notas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_DOCENTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ESTUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_NOTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PARCIAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOTA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notas", propOrder = {
    "iddocente",
    "idestud",
    "idnota",
    "idparcial",
    "nota"
})
public class Notas {

    @XmlElement(name = "ID_DOCENTE")
    protected String iddocente;
    @XmlElement(name = "ID_ESTUD")
    protected String idestud;
    @XmlElement(name = "ID_NOTA")
    protected String idnota;
    @XmlElement(name = "ID_PARCIAL")
    protected String idparcial;
    @XmlElement(name = "NOTA")
    protected Double nota;

    /**
     * Obtiene el valor de la propiedad iddocente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDDOCENTE() {
        return iddocente;
    }

    /**
     * Define el valor de la propiedad iddocente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDDOCENTE(String value) {
        this.iddocente = value;
    }

    /**
     * Obtiene el valor de la propiedad idestud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDESTUD() {
        return idestud;
    }

    /**
     * Define el valor de la propiedad idestud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDESTUD(String value) {
        this.idestud = value;
    }

    /**
     * Obtiene el valor de la propiedad idnota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNOTA() {
        return idnota;
    }

    /**
     * Define el valor de la propiedad idnota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNOTA(String value) {
        this.idnota = value;
    }

    /**
     * Obtiene el valor de la propiedad idparcial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPARCIAL() {
        return idparcial;
    }

    /**
     * Define el valor de la propiedad idparcial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPARCIAL(String value) {
        this.idparcial = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNOTA() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNOTA(Double value) {
        this.nota = value;
    }

}
