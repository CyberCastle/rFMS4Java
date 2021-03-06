//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 11:42:12 AM CLST 
//


package cl.cc.rfms.entity.response.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehiclePositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehiclePositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VIN" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/vehicle}VinType"/>
 *         &lt;element name="TriggerType" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/trigger}TriggerType"/>
 *         &lt;element name="CreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReceivedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GNSSPosition" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}GNSSPositionType"/>
 *         &lt;element name="WheelBasedSpeed" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}SpeedType"/>
 *         &lt;element name="TachographSpeed" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}SpeedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePositionType", propOrder = {
    "vin",
    "triggerType",
    "createdDateTime",
    "receivedDateTime",
    "gnssPosition",
    "wheelBasedSpeed",
    "tachographSpeed"
})
public class VehiclePositionType {

    @XmlElement(name = "VIN", required = true)
    protected String vin;
    @XmlElement(name = "TriggerType", required = true)
    @XmlSchemaType(name = "string")
    protected TriggerType triggerType;
    @XmlElement(name = "CreatedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElement(name = "ReceivedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDateTime;
    @XmlElement(name = "GNSSPosition", required = true)
    protected GNSSPositionType gnssPosition;
    @XmlElement(name = "WheelBasedSpeed")
    protected double wheelBasedSpeed;
    @XmlElement(name = "TachographSpeed")
    protected Double tachographSpeed;

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerType }
     *     
     */
    public TriggerType getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerType }
     *     
     */
    public void setTriggerType(TriggerType value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the receivedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDateTime() {
        return receivedDateTime;
    }

    /**
     * Sets the value of the receivedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDateTime(XMLGregorianCalendar value) {
        this.receivedDateTime = value;
    }

    /**
     * Gets the value of the gnssPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GNSSPositionType }
     *     
     */
    public GNSSPositionType getGNSSPosition() {
        return gnssPosition;
    }

    /**
     * Sets the value of the gnssPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNSSPositionType }
     *     
     */
    public void setGNSSPosition(GNSSPositionType value) {
        this.gnssPosition = value;
    }

    /**
     * Gets the value of the wheelBasedSpeed property.
     * 
     */
    public double getWheelBasedSpeed() {
        return wheelBasedSpeed;
    }

    /**
     * Sets the value of the wheelBasedSpeed property.
     * 
     */
    public void setWheelBasedSpeed(double value) {
        this.wheelBasedSpeed = value;
    }

    /**
     * Gets the value of the tachographSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTachographSpeed() {
        return tachographSpeed;
    }

    /**
     * Sets the value of the tachographSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTachographSpeed(Double value) {
        this.tachographSpeed = value;
    }

}
