
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para profesor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="profesor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APELLIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_PRO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profesor", propOrder = {
    "apellido",
    "idcuenta",
    "idpro",
    "nombre"
})
public class Profesor {

    @XmlElement(name = "APELLIDO")
    protected String apellido;
    @XmlElement(name = "ID_CUENTA")
    protected String idcuenta;
    @XmlElement(name = "ID_PRO")
    protected String idpro;
    @XmlElement(name = "NOMBRE")
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad apellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPELLIDO() {
        return apellido;
    }

    /**
     * Define el valor de la propiedad apellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPELLIDO(String value) {
        this.apellido = value;
    }

    /**
     * Obtiene el valor de la propiedad idcuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCUENTA() {
        return idcuenta;
    }

    /**
     * Define el valor de la propiedad idcuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCUENTA(String value) {
        this.idcuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idpro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPRO() {
        return idpro;
    }

    /**
     * Define el valor de la propiedad idpro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPRO(String value) {
        this.idpro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMBRE() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMBRE(String value) {
        this.nombre = value;
    }

}
