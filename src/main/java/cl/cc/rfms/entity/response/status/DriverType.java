//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 11:42:42 AM CLST 
//


package cl.cc.rfms.entity.response.status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DriverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverTachoIdentification" type="{http://fms-standard.com/rfms/v1.0.0/xsd/status}DriverTachoIdentificationType" minOccurs="0"/>
 *         &lt;element name="DriverOemIdentification" type="{http://fms-standard.com/rfms/v1.0.0/xsd/status}DriverOemIdentificationType" minOccurs="0"/>
 *         &lt;element name="DriverWorkingState" type="{http://fms-standard.com/rfms/v1.0.0/xsd/status}DriverWorkingStateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverType", propOrder = {
    "driverTachoIdentification",
    "driverOemIdentification",
    "driverWorkingState"
})
public class DriverType {

    @XmlElement(name = "DriverTachoIdentification")
    protected String driverTachoIdentification;
    @XmlElement(name = "DriverOemIdentification")
    protected String driverOemIdentification;
    @XmlElement(name = "DriverWorkingState")
    @XmlSchemaType(name = "string")
    protected DriverWorkingStateType driverWorkingState;

    /**
     * Gets the value of the driverTachoIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverTachoIdentification() {
        return driverTachoIdentification;
    }

    /**
     * Sets the value of the driverTachoIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverTachoIdentification(String value) {
        this.driverTachoIdentification = value;
    }

    /**
     * Gets the value of the driverOemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverOemIdentification() {
        return driverOemIdentification;
    }

    /**
     * Sets the value of the driverOemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverOemIdentification(String value) {
        this.driverOemIdentification = value;
    }

    /**
     * Gets the value of the driverWorkingState property.
     * 
     * @return
     *     possible object is
     *     {@link DriverWorkingStateType }
     *     
     */
    public DriverWorkingStateType getDriverWorkingState() {
        return driverWorkingState;
    }

    /**
     * Sets the value of the driverWorkingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverWorkingStateType }
     *     
     */
    public void setDriverWorkingState(DriverWorkingStateType value) {
        this.driverWorkingState = value;
    }

}