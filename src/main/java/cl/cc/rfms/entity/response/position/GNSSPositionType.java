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
 * <p>Java class for GNSSPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GNSSPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Latitude" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}LatitudeType"/>
 *         &lt;element name="Longitude" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}LongitudeType"/>
 *         &lt;element name="Heading" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}HeadingType" minOccurs="0"/>
 *         &lt;element name="Altitude" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}AltitudeType" minOccurs="0"/>
 *         &lt;element name="Speed" type="{http://fms-standard.com/rfms/v1.0.0/xsd/common/position}SpeedType" minOccurs="0"/>
 *         &lt;element name="PositionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GNSSPositionType", namespace = "http://fms-standard.com/rfms/v1.0.0/xsd/common/position", propOrder = {
    "latitude",
    "longitude",
    "heading",
    "altitude",
    "speed",
    "positionDateTime"
})
public class GNSSPositionType {

    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Heading")
    @XmlSchemaType(name = "integer")
    protected Integer heading;
    @XmlElement(name = "Altitude")
    @XmlSchemaType(name = "integer")
    protected Integer altitude;
    @XmlElement(name = "Speed")
    protected Double speed;
    @XmlElement(name = "PositionDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar positionDateTime;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeading(Integer value) {
        this.heading = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAltitude(Integer value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpeed(Double value) {
        this.speed = value;
    }

    /**
     * Gets the value of the positionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPositionDateTime() {
        return positionDateTime;
    }

    /**
     * Sets the value of the positionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPositionDateTime(XMLGregorianCalendar value) {
        this.positionDateTime = value;
    }

}