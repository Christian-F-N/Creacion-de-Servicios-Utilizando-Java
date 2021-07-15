
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para esrudiantes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="esrudiantes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APELLIDO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_ESTUD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROMEDIO1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PROMEDIO2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esrudiantes", propOrder = {
    "apellido",
    "idcuenta",
    "idestud",
    "nombre",
    "promedio1",
    "promedio2"
})
public class Esrudiantes {

    @XmlElement(name = "APELLIDO")
    protected String apellido;
    @XmlElement(name = "ID_CUENTA")
    protected String idcuenta;
    @XmlElement(name = "ID_ESTUD")
    protected String idestud;
    @XmlElement(name = "NOMBRE")
    protected String nombre;
    @XmlElement(name = "PROMEDIO1")
    protected double promedio1;
    @XmlElement(name = "PROMEDIO2")
    protected double promedio2;

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

    /**
     * Obtiene el valor de la propiedad promedio1.
     * 
     */
    public double getPROMEDIO1() {
        return promedio1;
    }

    /**
     * Define el valor de la propiedad promedio1.
     * 
     */
    public void setPROMEDIO1(double value) {
        this.promedio1 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio2.
     * 
     */
    public double getPROMEDIO2() {
        return promedio2;
    }

    /**
     * Define el valor de la propiedad promedio2.
     * 
     */
    public void setPROMEDIO2(double value) {
        this.promedio2 = value;
    }

}
