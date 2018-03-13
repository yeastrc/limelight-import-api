//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.13 at 03:16:22 PM PDT 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="search_program" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="annotation_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="cutoff_value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "search_annotation_cutoff")
public class SearchAnnotationCutoff {

    @XmlAttribute(name = "search_program", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String searchProgram;
    @XmlAttribute(name = "annotation_name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String annotationName;
    @XmlAttribute(name = "cutoff_value", required = true)
    protected BigDecimal cutoffValue;

    /**
     * Gets the value of the searchProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchProgram() {
        return searchProgram;
    }

    /**
     * Sets the value of the searchProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchProgram(String value) {
        this.searchProgram = value;
    }

    /**
     * Gets the value of the annotationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotationName() {
        return annotationName;
    }

    /**
     * Sets the value of the annotationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotationName(String value) {
        this.annotationName = value;
    }

    /**
     * Gets the value of the cutoffValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCutoffValue() {
        return cutoffValue;
    }

    /**
     * Sets the value of the cutoffValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCutoffValue(BigDecimal value) {
        this.cutoffValue = value;
    }

}
