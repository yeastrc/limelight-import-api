//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.02 at 12:07:38 PM PST 
//


package org.yeastrc.emozi.emozi_import.api.xml_dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}search_programs"/>
 *         &lt;element ref="{}annotation_cutoffs_on_import" minOccurs="0"/>
 *         &lt;element ref="{}default_visible_annotations"/>
 *         &lt;element ref="{}annotation_sort_order" minOccurs="0"/>
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
    "searchPrograms",
    "annotationCutoffsOnImport",
    "defaultVisibleAnnotations",
    "annotationSortOrder"
})
@XmlRootElement(name = "search_program_info")
public class SearchProgramInfo {

    @XmlElement(name = "search_programs", required = true)
    protected SearchPrograms searchPrograms;
    @XmlElement(name = "annotation_cutoffs_on_import")
    protected AnnotationCutoffsOnImport annotationCutoffsOnImport;
    @XmlElement(name = "default_visible_annotations", required = true)
    protected DefaultVisibleAnnotations defaultVisibleAnnotations;
    @XmlElement(name = "annotation_sort_order")
    protected AnnotationSortOrder annotationSortOrder;

    /**
     * The search program(s) used to generate the PSMs and associated scores in this search. More than one search program may be used, as in the case of using Percolator to assign q-values for data search with Comet. Percolator and Comet would each have an entry here.
     * 
     * @return
     *     possible object is
     *     {@link SearchPrograms }
     *     
     */
    public SearchPrograms getSearchPrograms() {
        return searchPrograms;
    }

    /**
     * Sets the value of the searchPrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPrograms }
     *     
     */
    public void setSearchPrograms(SearchPrograms value) {
        this.searchPrograms = value;
    }

    /**
     * Optional, but recommended, cutoffs to use when importing data. E.g., limit imported PSMs to those with a q-value of 0.05 or better. Data not meeting these cutoffs will not be imported into the database--helps to prevent the database filling up with unwanted (and unneeded) data.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationCutoffsOnImport }
     *     
     */
    public AnnotationCutoffsOnImport getAnnotationCutoffsOnImport() {
        return annotationCutoffsOnImport;
    }

    /**
     * Sets the value of the annotationCutoffsOnImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationCutoffsOnImport }
     *     
     */
    public void setAnnotationCutoffsOnImport(AnnotationCutoffsOnImport value) {
        this.annotationCutoffsOnImport = value;
    }

    /**
     * Gets the value of the defaultVisibleAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultVisibleAnnotations }
     *     
     */
    public DefaultVisibleAnnotations getDefaultVisibleAnnotations() {
        return defaultVisibleAnnotations;
    }

    /**
     * Sets the value of the defaultVisibleAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultVisibleAnnotations }
     *     
     */
    public void setDefaultVisibleAnnotations(DefaultVisibleAnnotations value) {
        this.defaultVisibleAnnotations = value;
    }

    /**
     * The sort order applied to filterable annotations when presenting the default listing of PSMs or peptides. The order will be in the order the annotations appear here. E.g. if "q-value" is listed first and "p-value" is listed next, the items will be sorted on q-value first, then, sorted on p-value in the case of ties. Note: all annotation types listed here must be filterable. If this element is not present, no default sorting will be applied to listed PSMs or peptides in emozi.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationSortOrder }
     *     
     */
    public AnnotationSortOrder getAnnotationSortOrder() {
        return annotationSortOrder;
    }

    /**
     * Sets the value of the annotationSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationSortOrder }
     *     
     */
    public void setAnnotationSortOrder(AnnotationSortOrder value) {
        this.annotationSortOrder = value;
    }

}
