//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.12 at 02:48:17 PM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}protein_label" maxOccurs="unbounded"/>
 *         &lt;element name="matched_protein_annotations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}filterable_matched_protein_annotations" minOccurs="0"/>
 *                   &lt;element ref="{}descriptive_matched_protein_annotations" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" use="required" type="{}sequence_type" />
 *       &lt;attribute name="unique_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "proteinLabel",
    "matchedProteinAnnotations"
})
@XmlRootElement(name = "protein")
public class Protein {

    @XmlElement(name = "protein_label", required = true)
    protected List<ProteinLabel> proteinLabel;
    @XmlElement(name = "matched_protein_annotations")
    protected Protein.MatchedProteinAnnotations matchedProteinAnnotations;
    @XmlAttribute(name = "sequence", required = true)
    protected String sequence;
    @XmlAttribute(name = "unique_id")
    protected String uniqueId;

    /**
     * Annotations for this protein sequence from the sequence database used to search the data. Since there may be multiple annotations for a single sequence (separate entries for the same protein sequence or multiple annotations separated by control-A characters in a FASTA file), each annotation should appear here as a separate annotation for the protein sequence.Gets the value of the proteinLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proteinLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProteinLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinLabel }
     * 
     * 
     */
    public List<ProteinLabel> getProteinLabel() {
        if (proteinLabel == null) {
            proteinLabel = new ArrayList<ProteinLabel>();
        }
        return this.proteinLabel;
    }

    /**
     * Gets the value of the matchedProteinAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Protein.MatchedProteinAnnotations }
     *     
     */
    public Protein.MatchedProteinAnnotations getMatchedProteinAnnotations() {
        return matchedProteinAnnotations;
    }

    /**
     * Sets the value of the matchedProteinAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protein.MatchedProteinAnnotations }
     *     
     */
    public void setMatchedProteinAnnotations(Protein.MatchedProteinAnnotations value) {
        this.matchedProteinAnnotations = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}filterable_matched_protein_annotations" minOccurs="0"/>
     *         &lt;element ref="{}descriptive_matched_protein_annotations" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "filterableMatchedProteinAnnotations",
        "descriptiveMatchedProteinAnnotations"
    })
    public static class MatchedProteinAnnotations {

        @XmlElement(name = "filterable_matched_protein_annotations")
        protected FilterableMatchedProteinAnnotations filterableMatchedProteinAnnotations;
        @XmlElement(name = "descriptive_matched_protein_annotations")
        protected DescriptiveMatchedProteinAnnotations descriptiveMatchedProteinAnnotations;

        /**
         * Gets the value of the filterableMatchedProteinAnnotations property.
         * 
         * @return
         *     possible object is
         *     {@link FilterableMatchedProteinAnnotations }
         *     
         */
        public FilterableMatchedProteinAnnotations getFilterableMatchedProteinAnnotations() {
            return filterableMatchedProteinAnnotations;
        }

        /**
         * Sets the value of the filterableMatchedProteinAnnotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterableMatchedProteinAnnotations }
         *     
         */
        public void setFilterableMatchedProteinAnnotations(FilterableMatchedProteinAnnotations value) {
            this.filterableMatchedProteinAnnotations = value;
        }

        /**
         * Gets the value of the descriptiveMatchedProteinAnnotations property.
         * 
         * @return
         *     possible object is
         *     {@link DescriptiveMatchedProteinAnnotations }
         *     
         */
        public DescriptiveMatchedProteinAnnotations getDescriptiveMatchedProteinAnnotations() {
            return descriptiveMatchedProteinAnnotations;
        }

        /**
         * Sets the value of the descriptiveMatchedProteinAnnotations property.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptiveMatchedProteinAnnotations }
         *     
         */
        public void setDescriptiveMatchedProteinAnnotations(DescriptiveMatchedProteinAnnotations value) {
            this.descriptiveMatchedProteinAnnotations = value;
        }

    }

}
