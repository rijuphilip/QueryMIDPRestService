
package midpuri.soap;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="WARNINGCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WARNINGDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERRORCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLICATIONOUT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TOTALMATCHSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="HUNTERSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="HUNTERMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DECISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DECISIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PERFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MAXLOANAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LOANAMTAPP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="PROCFEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CHARGE1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MAXTenor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MAXEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DISBPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="DECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MINEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="MSGTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EXISTEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CNTADDMATCH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="RAWHUNTER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FILLERFIELD4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="CURRADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PINCODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="APPLNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RAWDEDUPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FILLERFIELD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NONACHFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="APPLICANT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="APPLICANTOUT">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="EXPBURSC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CIBILSC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="RAWBUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BURSCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BURSCSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BURSCSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="BURSCPARAMS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BURSCPARAMSSC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="APPSC1BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPSC2NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPSC2SEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPSC2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="APPSC2PARAM" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="APPSC2PARAMSC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="APPSC2BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPSCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPSCSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPSCSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="APPSCPARAM" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="APPSCPARAMSC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="APPSC3BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SORTDECRSNCODE2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SORTDECRSNCODE3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SORTDECRSNCODE4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SORTDECRSNCODE5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="APPLDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PINMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PINMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LINE1MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LINE1MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LINE2MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LINE2MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LINE3MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LINE3MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CITYMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="STATEMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FITRIGGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BANKNAME" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LASTFOURDIGBANKACC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SELFDECINC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FINALINCUSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="INCIMPFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPLNAPPLYRSSERVICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="IMPUTEDINCOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ALTDATAINCOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD15" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="FILLERFIELD16" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="DEDUPE" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="PDMAPPLNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DPDMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PDMCUSTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PDMBRANCHLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PDMPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PDMSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PDMLOANACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="DPDFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DPDFLAGREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SCORECARD" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="ENQL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="GEORISKRANKING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SCORECARDFIELD25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="POLICY" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="NIL30" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="NILX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="NILTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PLENQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="POLICYFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="POLICYFIELD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="POLICYFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="POLICYFIELD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="POLICYFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="POLICYFIELD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PREAPPROVEDOUT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="PREAPPROVEDLOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PREAPPOVEDTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ISPREAPPORVEDCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDMAXEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDFILLER8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PREAPPROVEDPRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MANTHANOUT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="LAMANTHANOFFERFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LAROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LALOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LAMINROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LAMAXELIGIBLEEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LAEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LAMAXELIGIBLELOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LALOANEXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="LALOANEXPIRYFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LAPROCESSINGFEES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LAOCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LATENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="LAFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LAFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LAFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CREDITVIDYAOUT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="Standingofferavailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Cveligibleloanamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EFFECTIVEMULTIPLIER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="RISKSEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TRADELINEUSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="KICKER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="MULTIPLIER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="CARDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ACTIVECC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TRIGGER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="PINMATCHBUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BURMOBMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BUREMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RISKSEGEMENT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FCUTRIGGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DERCBSCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DHANICARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="QLFNGTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DCLSALNTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CLUSTERNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DHANIHEALTHLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MAXCOMBEXPOS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DHANISS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DHANIPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="APPIALTDCL" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="ALTDECISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ALTMAXLOANAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ALTMAXTenor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ALTROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ALTPROCFEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ALTDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EXISTINGEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="LINECUSTSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ENQ_L3M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ENQ_UNSEC_L6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ENQ_L6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DPDL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DPDL3M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="DCLSEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
        "warningcode",
        "warningdesc",
        "errorcode",
        "errordesc",
        "applicationout",
        "applicant"
})
@XmlRootElement(name = "APLCTION_RES")
public class APLCTIONRES {

    @XmlElement(name = "WARNINGCODE")
    protected String warningcode;
    @XmlElement(name = "WARNINGDESC")
    protected String warningdesc;
    @XmlElement(name = "ERRORCODE")
    protected String errorcode;
    @XmlElement(name = "ERRORDESC")
    protected String errordesc;
    @XmlElement(name = "APPLICATIONOUT", required = true)
    protected APLCTIONRES.APPLICATIONOUT applicationout;
    @XmlElement(name = "APPLICANT", required = true)
    protected APLCTIONRES.APPLICANT applicant;

    /**
     * Gets the value of the warningcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWARNINGCODE() {
        return warningcode;
    }

    /**
     * Sets the value of the warningcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWARNINGCODE(String value) {
        this.warningcode = value;
    }

    /**
     * Gets the value of the warningdesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWARNINGDESC() {
        return warningdesc;
    }

    /**
     * Sets the value of the warningdesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWARNINGDESC(String value) {
        this.warningdesc = value;
    }

    /**
     * Gets the value of the errorcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getERRORCODE() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setERRORCODE(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the errordesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getERRORDESC() {
        return errordesc;
    }

    /**
     * Sets the value of the errordesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setERRORDESC(String value) {
        this.errordesc = value;
    }

    /**
     * Gets the value of the applicationout property.
     *
     * @return
     *     possible object is
     *     {@link APLCTIONRES.APPLICATIONOUT }
     *
     */
    public APLCTIONRES.APPLICATIONOUT getAPPLICATIONOUT() {
        return applicationout;
    }

    /**
     * Sets the value of the applicationout property.
     *
     * @param value
     *     allowed object is
     *     {@link APLCTIONRES.APPLICATIONOUT }
     *
     */
    public void setAPPLICATIONOUT(APLCTIONRES.APPLICATIONOUT value) {
        this.applicationout = value;
    }

    /**
     * Gets the value of the applicant property.
     *
     * @return
     *     possible object is
     *     {@link APLCTIONRES.APPLICANT }
     *
     */
    public APLCTIONRES.APPLICANT getAPPLICANT() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     *
     * @param value
     *     allowed object is
     *     {@link APLCTIONRES.APPLICANT }
     *
     */
    public void setAPPLICANT(APLCTIONRES.APPLICANT value) {
        this.applicant = value;
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
     *       &lt;all>
     *         &lt;element name="APPLICANTOUT">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="EXPBURSC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CIBILSC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="RAWBUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BURSCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BURSCSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BURSCSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="BURSCPARAMS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BURSCPARAMSSC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="APPSC1BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPSC2NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPSC2SEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPSC2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="APPSC2PARAM" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="APPSC2PARAMSC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="APPSC2BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPSCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPSCSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPSCSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="APPSCPARAM" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="APPSCPARAMSC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="APPSC3BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SORTDECRSNCODE2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SORTDECRSNCODE3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SORTDECRSNCODE4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SORTDECRSNCODE5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="APPLDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PINMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PINMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LINE1MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LINE1MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LINE2MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LINE2MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LINE3MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LINE3MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CITYMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="STATEMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FITRIGGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BANKNAME" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LASTFOURDIGBANKACC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SELFDECINC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FINALINCUSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="INCIMPFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPLNAPPLYRSSERVICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="IMPUTEDINCOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ALTDATAINCOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD15" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="FILLERFIELD16" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="DEDUPE" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="PDMAPPLNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DPDMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PDMCUSTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PDMBRANCHLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PDMPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PDMSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PDMLOANACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="DPDFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DPDFLAGREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SCORECARD" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="ENQL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="GEORISKRANKING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SCORECARDFIELD25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="POLICY" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="NIL30" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="NILX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="NILTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PLENQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="POLICYFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="POLICYFIELD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="POLICYFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="POLICYFIELD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="POLICYFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="POLICYFIELD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PREAPPROVEDOUT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="PREAPPROVEDLOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PREAPPOVEDTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ISPREAPPORVEDCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDMAXEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDFILLER8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PREAPPROVEDPRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MANTHANOUT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="LAMANTHANOFFERFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LAROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LALOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LAMINROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LAMAXELIGIBLEEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LAEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LAMAXELIGIBLELOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LALOANEXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="LALOANEXPIRYFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LAPROCESSINGFEES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LAOCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LATENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="LAFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LAFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LAFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CREDITVIDYAOUT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="Standingofferavailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Cveligibleloanamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EFFECTIVEMULTIPLIER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="RISKSEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TRADELINEUSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="KICKER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="MULTIPLIER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="CARDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ACTIVECC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TRIGGER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="PINMATCHBUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BURMOBMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BUREMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RISKSEGEMENT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FCUTRIGGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DERCBSCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DHANICARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="QLFNGTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DCLSALNTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CLUSTERNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DHANIHEALTHLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MAXCOMBEXPOS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DHANISS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DHANIPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="APPIALTDCL" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="ALTDECISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ALTMAXLOANAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ALTMAXTenor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ALTROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ALTPROCFEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ALTDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EXISTINGEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="LINECUSTSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ENQ_L3M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ENQ_UNSEC_L6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ENQ_L6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DPDL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DPDL3M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="DCLSEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class APPLICANT {

        @XmlElement(name = "APPLICANTOUT", required = true)
        protected APLCTIONRES.APPLICANT.APPLICANTOUT applicantout;

        /**
         * Gets the value of the applicantout property.
         *
         * @return
         *     possible object is
         *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT }
         *
         */
        public APLCTIONRES.APPLICANT.APPLICANTOUT getAPPLICANTOUT() {
            return applicantout;
        }

        /**
         * Sets the value of the applicantout property.
         *
         * @param value
         *     allowed object is
         *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT }
         *
         */
        public void setAPPLICANTOUT(APLCTIONRES.APPLICANT.APPLICANTOUT value) {
            this.applicantout = value;
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
         *       &lt;all>
         *         &lt;element name="EXPBURSC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CIBILSC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="RAWBUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BURSCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BURSCSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BURSCSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="BURSCPARAMS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BURSCPARAMSSC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="APPSC1BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPSC2NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPSC2SEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPSC2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="APPSC2PARAM" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="APPSC2PARAMSC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="APPSC2BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPSCNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPSCSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPSCSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="APPSCPARAM" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="APPSCPARAMSC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="APPSC3BAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SORTDECRSNCODE2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SORTDECRSNCODE3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SORTDECRSNCODE4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SORTDECRSNCODE5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="APPLDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PINMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PINMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LINE1MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LINE1MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LINE2MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LINE2MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LINE3MATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LINE3MATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CITYMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="STATEMATCHCOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FITRIGGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BANKNAME" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LASTFOURDIGBANKACC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SELFDECINC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FINALINCUSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="INCIMPFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACCTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPLNAPPLYRSSERVICE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="IMPUTEDINCOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ALTDATAINCOME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD15" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="FILLERFIELD16" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="DEDUPE" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="PDMAPPLNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DPDMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PDMCUSTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PDMBRANCHLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PDMPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PDMSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PDMLOANACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="DPDFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DPDFLAGREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SCORECARD" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="ENQL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="GEORISKRANKING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SCORECARDFIELD25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="POLICY" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="NIL30" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="NILX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="NILTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PLENQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="POLICYFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="POLICYFIELD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="POLICYFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="POLICYFIELD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="POLICYFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="POLICYFIELD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PREAPPROVEDOUT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="PREAPPROVEDLOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PREAPPOVEDTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ISPREAPPORVEDCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDMAXEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDFILLER8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PREAPPROVEDPRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MANTHANOUT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="LAMANTHANOFFERFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LAROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LALOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LAMINROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LAMAXELIGIBLEEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LAEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LAMAXELIGIBLELOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LALOANEXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="LALOANEXPIRYFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LAPROCESSINGFEES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LAOCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LATENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="LAFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LAFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LAFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CREDITVIDYAOUT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="Standingofferavailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Cveligibleloanamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EFFECTIVEMULTIPLIER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="RISKSEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TRADELINEUSED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="KICKER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="MULTIPLIER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="CARDTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CUSTOMERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ACTIVECC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TRIGGER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="PINMATCHBUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BURMOBMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BUREMAIL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RISKSEGEMENT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FCUTRIGGER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DERCBSCR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DHANICARE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="QLFNGTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DCLSALNTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CLUSTERNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DHANIHEALTHLINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MAXCOMBEXPOS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DHANISS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DHANIPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="APPIALTDCL" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="ALTDECISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ALTMAXLOANAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ALTMAXTenor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ALTROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ALTPROCFEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ALTDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EXISTINGEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="LINECUSTSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ENQ_L3M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ENQ_UNSEC_L6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ENQ_L6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DPDL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DPDL3M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="DCLSEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class APPLICANTOUT {

            @XmlElementRef(name = "EXPBURSC", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> expbursc;
            @XmlElementRef(name = "CIBILSC", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> cibilsc;
            @XmlElementRef(name = "RAWBUR", type = JAXBElement.class, required = false)
            protected JAXBElement<String> rawbur;
            @XmlElementRef(name = "BURSCNAME", type = JAXBElement.class, required = false)
            protected JAXBElement<String> burscname;
            @XmlElementRef(name = "BURSCSEG", type = JAXBElement.class, required = false)
            protected JAXBElement<String> burscseg;
            @XmlElementRef(name = "BURSCSCORE", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> burscscore;
            @XmlElement(name = "BURSCPARAMS")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMS burscparams;
            @XmlElement(name = "BURSCPARAMSSC")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMSSC burscparamssc;
            @XmlElementRef(name = "APPSC1BAND", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appsc1BAND;
            @XmlElementRef(name = "APPSC2NAME", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appsc2NAME;
            @XmlElementRef(name = "APPSC2SEG", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appsc2SEG;
            @XmlElementRef(name = "APPSC2", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> appsc2;
            @XmlElement(name = "APPSC2PARAM")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAM appsc2PARAM;
            @XmlElement(name = "APPSC2PARAMSC")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAMSC appsc2PARAMSC;
            @XmlElementRef(name = "APPSC2BAND", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appsc2BAND;
            @XmlElementRef(name = "APPSCNAME", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appscname;
            @XmlElementRef(name = "APPSCSEG", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appscseg;
            @XmlElementRef(name = "APPSCSCORE", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> appscscore;
            @XmlElement(name = "APPSCPARAM")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAM appscparam;
            @XmlElement(name = "APPSCPARAMSC")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAMSC appscparamsc;
            @XmlElementRef(name = "APPSC3BAND", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appsc3BAND;
            @XmlElement(name = "SORTDECRSNCODE2")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE2 sortdecrsncode2;
            @XmlElement(name = "SORTDECRSNCODE3")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE3 sortdecrsncode3;
            @XmlElement(name = "SORTDECRSNCODE4")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE4 sortdecrsncode4;
            @XmlElement(name = "SORTDECRSNCODE5")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE5 sortdecrsncode5;
            @XmlElementRef(name = "APPLDECRSN", type = JAXBElement.class, required = false)
            protected JAXBElement<String> appldecrsn;
            @XmlElementRef(name = "PINMATCH", type = JAXBElement.class, required = false)
            protected JAXBElement<String> pinmatch;
            @XmlElementRef(name = "PINMATCHCOUNT", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> pinmatchcount;
            @XmlElementRef(name = "LINE1MATCH", type = JAXBElement.class, required = false)
            protected JAXBElement<String> line1MATCH;
            @XmlElementRef(name = "LINE1MATCHCOUNT", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> line1MATCHCOUNT;
            @XmlElementRef(name = "LINE2MATCH", type = JAXBElement.class, required = false)
            protected JAXBElement<String> line2MATCH;
            @XmlElementRef(name = "LINE2MATCHCOUNT", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> line2MATCHCOUNT;
            @XmlElementRef(name = "LINE3MATCH", type = JAXBElement.class, required = false)
            protected JAXBElement<String> line3MATCH;
            @XmlElementRef(name = "LINE3MATCHCOUNT", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> line3MATCHCOUNT;
            @XmlElementRef(name = "CITY", type = JAXBElement.class, required = false)
            protected JAXBElement<String> city;
            @XmlElementRef(name = "CITYMATCHCOUNT", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> citymatchcount;
            @XmlElementRef(name = "STATE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> state;
            @XmlElementRef(name = "STATEMATCHCOUNT", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> statematchcount;
            @XmlElementRef(name = "FITRIGGER", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fitrigger;
            @XmlElementRef(name = "ERROR", type = JAXBElement.class, required = false)
            protected JAXBElement<String> error;
            @XmlElementRef(name = "ERRORDESC", type = JAXBElement.class, required = false)
            protected JAXBElement<String> errordesc;
            @XmlElement(name = "BANKNAME")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.BANKNAME bankname;
            @XmlElement(name = "LASTFOURDIGBANKACC")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.LASTFOURDIGBANKACC lastfourdigbankacc;
            @XmlElementRef(name = "SELFDECINC", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> selfdecinc;
            @XmlElementRef(name = "FINALINCUSED", type = JAXBElement.class, required = false)
            protected JAXBElement<String> finalincused;
            @XmlElementRef(name = "INCIMPFLAG", type = JAXBElement.class, required = false)
            protected JAXBElement<String> incimpflag;
            @XmlElementRef(name = "FILLERFIELD3", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fillerfield3;
            @XmlElementRef(name = "FILLERFIELD4", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fillerfield4;
            @XmlElementRef(name = "FILLERFIELD5", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fillerfield5;
            @XmlElementRef(name = "ACCTYPE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> acctype;
            @XmlElementRef(name = "FILLERFIELD7", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fillerfield7;
            @XmlElementRef(name = "APPLNAPPLYRSSERVICE", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> applnapplyrsservice;
            @XmlElementRef(name = "IMPUTEDINCOME", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> imputedincome;
            @XmlElementRef(name = "ALTDATAINCOME", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> altdataincome;
            @XmlElementRef(name = "FILLERFIELD11", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> fillerfield11;
            @XmlElementRef(name = "FILLERFIELD12", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> fillerfield12;
            @XmlElementRef(name = "FILLERFIELD13", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> fillerfield13;
            @XmlElementRef(name = "FILLERFIELD14", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> fillerfield14;
            @XmlElementRef(name = "FILLERFIELD15", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> fillerfield15;
            @XmlElementRef(name = "FILLERFIELD16", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> fillerfield16;
            @XmlElement(name = "DEDUPE")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.DEDUPE dedupe;
            @XmlElement(name = "SCORECARD")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.SCORECARD scorecard;
            @XmlElement(name = "POLICY")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.POLICY policy;
            @XmlElement(name = "PREAPPROVEDOUT")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.PREAPPROVEDOUT preapprovedout;
            @XmlElement(name = "MANTHANOUT")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.MANTHANOUT manthanout;
            @XmlElementRef(name = "PRODUCTTYPE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> producttype;
            @XmlElement(name = "CREDITVIDYAOUT")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.CREDITVIDYAOUT creditvidyaout;
            @XmlElementRef(name = "EFFECTIVEMULTIPLIER", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> effectivemultiplier;
            @XmlElementRef(name = "RISKSEGMENT", type = JAXBElement.class, required = false)
            protected JAXBElement<String> risksegment;
            @XmlElementRef(name = "TRADELINEUSED", type = JAXBElement.class, required = false)
            protected JAXBElement<String> tradelineused;
            @XmlElementRef(name = "KICKER", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> kicker;
            @XmlElementRef(name = "MULTIPLIER", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> multiplier;
            @XmlElementRef(name = "CARDTYPE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> cardtype;
            @XmlElementRef(name = "CUSTOMERTYPE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> customertype;
            @XmlElementRef(name = "ACTIVECC", type = JAXBElement.class, required = false)
            protected JAXBElement<String> activecc;
            @XmlElementRef(name = "TRIGGER", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> trigger;
            @XmlElementRef(name = "PINMATCHBUR", type = JAXBElement.class, required = false)
            protected JAXBElement<String> pinmatchbur;
            @XmlElementRef(name = "BURMOBMATCH", type = JAXBElement.class, required = false)
            protected JAXBElement<String> burmobmatch;
            @XmlElementRef(name = "BUREMAIL", type = JAXBElement.class, required = false)
            protected JAXBElement<String> buremail;
            @XmlElementRef(name = "RISKSEGEMENT2", type = JAXBElement.class, required = false)
            protected JAXBElement<String> risksegement2;
            @XmlElementRef(name = "FCUTRIGGER", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fcutrigger;
            @XmlElementRef(name = "DERCBSCR", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> dercbscr;
            @XmlElementRef(name = "DHANICARE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dhanicare;
            @XmlElementRef(name = "QLFNGTRAD", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> qlfngtrad;
            @XmlElementRef(name = "DCLSALNTC", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dclsalntc;
            @XmlElementRef(name = "CLUSTERNO", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> clusterno;
            @XmlElementRef(name = "DHANIHEALTHLINE", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dhanihealthline;
            @XmlElementRef(name = "MAXCOMBEXPOS", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> maxcombexpos;
            @XmlElementRef(name = "DHANISS", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dhaniss;
            @XmlElementRef(name = "DHANIPRODUCT", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dhaniproduct;
            @XmlElement(name = "APPIALTDCL")
            protected APLCTIONRES.APPLICANT.APPLICANTOUT.APPIALTDCL appialtdcl;
            @XmlElementRef(name = "EXISTINGEMI", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> existingemi;
            @XmlElementRef(name = "LINECUSTSEG", type = JAXBElement.class, required = false)
            protected JAXBElement<String> linecustseg;
            @XmlElementRef(name = "ENQ_L3M", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> enql3M;
            @XmlElementRef(name = "ENQ_UNSEC_L6M", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> enqunsecl6M;
            @XmlElementRef(name = "ENQ_L6M", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> enql6M;
            @XmlElementRef(name = "DPDL6M", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> dpdl6M;
            @XmlElementRef(name = "DPDL3M", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> dpdl3M;
            @XmlElementRef(name = "DCLSEGMENT", type = JAXBElement.class, required = false)
            protected JAXBElement<String> dclsegment;

            /**
             * Gets the value of the expbursc property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getEXPBURSC() {
                return expbursc;
            }

            /**
             * Sets the value of the expbursc property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setEXPBURSC(JAXBElement<BigDecimal> value) {
                this.expbursc = value;
            }

            /**
             * Gets the value of the cibilsc property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getCIBILSC() {
                return cibilsc;
            }

            /**
             * Sets the value of the cibilsc property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setCIBILSC(JAXBElement<BigDecimal> value) {
                this.cibilsc = value;
            }

            /**
             * Gets the value of the rawbur property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getRAWBUR() {
                return rawbur;
            }

            /**
             * Sets the value of the rawbur property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setRAWBUR(JAXBElement<String> value) {
                this.rawbur = value;
            }

            /**
             * Gets the value of the burscname property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getBURSCNAME() {
                return burscname;
            }

            /**
             * Sets the value of the burscname property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setBURSCNAME(JAXBElement<String> value) {
                this.burscname = value;
            }

            /**
             * Gets the value of the burscseg property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getBURSCSEG() {
                return burscseg;
            }

            /**
             * Sets the value of the burscseg property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setBURSCSEG(JAXBElement<String> value) {
                this.burscseg = value;
            }

            /**
             * Gets the value of the burscscore property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getBURSCSCORE() {
                return burscscore;
            }

            /**
             * Sets the value of the burscscore property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setBURSCSCORE(JAXBElement<BigDecimal> value) {
                this.burscscore = value;
            }

            /**
             * Gets the value of the burscparams property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMS }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMS getBURSCPARAMS() {
                return burscparams;
            }

            /**
             * Sets the value of the burscparams property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMS }
             *
             */
            public void setBURSCPARAMS(APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMS value) {
                this.burscparams = value;
            }

            /**
             * Gets the value of the burscparamssc property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMSSC }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMSSC getBURSCPARAMSSC() {
                return burscparamssc;
            }

            /**
             * Sets the value of the burscparamssc property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMSSC }
             *
             */
            public void setBURSCPARAMSSC(APLCTIONRES.APPLICANT.APPLICANTOUT.BURSCPARAMSSC value) {
                this.burscparamssc = value;
            }

            /**
             * Gets the value of the appsc1BAND property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSC1BAND() {
                return appsc1BAND;
            }

            /**
             * Sets the value of the appsc1BAND property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSC1BAND(JAXBElement<String> value) {
                this.appsc1BAND = value;
            }

            /**
             * Gets the value of the appsc2NAME property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSC2NAME() {
                return appsc2NAME;
            }

            /**
             * Sets the value of the appsc2NAME property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSC2NAME(JAXBElement<String> value) {
                this.appsc2NAME = value;
            }

            /**
             * Gets the value of the appsc2SEG property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSC2SEG() {
                return appsc2SEG;
            }

            /**
             * Sets the value of the appsc2SEG property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSC2SEG(JAXBElement<String> value) {
                this.appsc2SEG = value;
            }

            /**
             * Gets the value of the appsc2 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getAPPSC2() {
                return appsc2;
            }

            /**
             * Sets the value of the appsc2 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setAPPSC2(JAXBElement<BigDecimal> value) {
                this.appsc2 = value;
            }

            /**
             * Gets the value of the appsc2PARAM property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAM }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAM getAPPSC2PARAM() {
                return appsc2PARAM;
            }

            /**
             * Sets the value of the appsc2PARAM property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAM }
             *
             */
            public void setAPPSC2PARAM(APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAM value) {
                this.appsc2PARAM = value;
            }

            /**
             * Gets the value of the appsc2PARAMSC property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAMSC }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAMSC getAPPSC2PARAMSC() {
                return appsc2PARAMSC;
            }

            /**
             * Sets the value of the appsc2PARAMSC property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAMSC }
             *
             */
            public void setAPPSC2PARAMSC(APLCTIONRES.APPLICANT.APPLICANTOUT.APPSC2PARAMSC value) {
                this.appsc2PARAMSC = value;
            }

            /**
             * Gets the value of the appsc2BAND property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSC2BAND() {
                return appsc2BAND;
            }

            /**
             * Sets the value of the appsc2BAND property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSC2BAND(JAXBElement<String> value) {
                this.appsc2BAND = value;
            }

            /**
             * Gets the value of the appscname property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSCNAME() {
                return appscname;
            }

            /**
             * Sets the value of the appscname property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSCNAME(JAXBElement<String> value) {
                this.appscname = value;
            }

            /**
             * Gets the value of the appscseg property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSCSEG() {
                return appscseg;
            }

            /**
             * Sets the value of the appscseg property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSCSEG(JAXBElement<String> value) {
                this.appscseg = value;
            }

            /**
             * Gets the value of the appscscore property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getAPPSCSCORE() {
                return appscscore;
            }

            /**
             * Sets the value of the appscscore property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setAPPSCSCORE(JAXBElement<BigDecimal> value) {
                this.appscscore = value;
            }

            /**
             * Gets the value of the appscparam property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAM }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAM getAPPSCPARAM() {
                return appscparam;
            }

            /**
             * Sets the value of the appscparam property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAM }
             *
             */
            public void setAPPSCPARAM(APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAM value) {
                this.appscparam = value;
            }

            /**
             * Gets the value of the appscparamsc property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAMSC }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAMSC getAPPSCPARAMSC() {
                return appscparamsc;
            }

            /**
             * Sets the value of the appscparamsc property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAMSC }
             *
             */
            public void setAPPSCPARAMSC(APLCTIONRES.APPLICANT.APPLICANTOUT.APPSCPARAMSC value) {
                this.appscparamsc = value;
            }

            /**
             * Gets the value of the appsc3BAND property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPSC3BAND() {
                return appsc3BAND;
            }

            /**
             * Sets the value of the appsc3BAND property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPSC3BAND(JAXBElement<String> value) {
                this.appsc3BAND = value;
            }

            /**
             * Gets the value of the sortdecrsncode2 property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE2 }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE2 getSORTDECRSNCODE2() {
                return sortdecrsncode2;
            }

            /**
             * Sets the value of the sortdecrsncode2 property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE2 }
             *
             */
            public void setSORTDECRSNCODE2(APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE2 value) {
                this.sortdecrsncode2 = value;
            }

            /**
             * Gets the value of the sortdecrsncode3 property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE3 }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE3 getSORTDECRSNCODE3() {
                return sortdecrsncode3;
            }

            /**
             * Sets the value of the sortdecrsncode3 property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE3 }
             *
             */
            public void setSORTDECRSNCODE3(APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE3 value) {
                this.sortdecrsncode3 = value;
            }

            /**
             * Gets the value of the sortdecrsncode4 property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE4 }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE4 getSORTDECRSNCODE4() {
                return sortdecrsncode4;
            }

            /**
             * Sets the value of the sortdecrsncode4 property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE4 }
             *
             */
            public void setSORTDECRSNCODE4(APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE4 value) {
                this.sortdecrsncode4 = value;
            }

            /**
             * Gets the value of the sortdecrsncode5 property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE5 }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE5 getSORTDECRSNCODE5() {
                return sortdecrsncode5;
            }

            /**
             * Sets the value of the sortdecrsncode5 property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE5 }
             *
             */
            public void setSORTDECRSNCODE5(APLCTIONRES.APPLICANT.APPLICANTOUT.SORTDECRSNCODE5 value) {
                this.sortdecrsncode5 = value;
            }

            /**
             * Gets the value of the appldecrsn property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getAPPLDECRSN() {
                return appldecrsn;
            }

            /**
             * Sets the value of the appldecrsn property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setAPPLDECRSN(JAXBElement<String> value) {
                this.appldecrsn = value;
            }

            /**
             * Gets the value of the pinmatch property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getPINMATCH() {
                return pinmatch;
            }

            /**
             * Sets the value of the pinmatch property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setPINMATCH(JAXBElement<String> value) {
                this.pinmatch = value;
            }

            /**
             * Gets the value of the pinmatchcount property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getPINMATCHCOUNT() {
                return pinmatchcount;
            }

            /**
             * Sets the value of the pinmatchcount property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setPINMATCHCOUNT(JAXBElement<BigDecimal> value) {
                this.pinmatchcount = value;
            }

            /**
             * Gets the value of the line1MATCH property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getLINE1MATCH() {
                return line1MATCH;
            }

            /**
             * Sets the value of the line1MATCH property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setLINE1MATCH(JAXBElement<String> value) {
                this.line1MATCH = value;
            }

            /**
             * Gets the value of the line1MATCHCOUNT property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getLINE1MATCHCOUNT() {
                return line1MATCHCOUNT;
            }

            /**
             * Sets the value of the line1MATCHCOUNT property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setLINE1MATCHCOUNT(JAXBElement<BigDecimal> value) {
                this.line1MATCHCOUNT = value;
            }

            /**
             * Gets the value of the line2MATCH property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getLINE2MATCH() {
                return line2MATCH;
            }

            /**
             * Sets the value of the line2MATCH property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setLINE2MATCH(JAXBElement<String> value) {
                this.line2MATCH = value;
            }

            /**
             * Gets the value of the line2MATCHCOUNT property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getLINE2MATCHCOUNT() {
                return line2MATCHCOUNT;
            }

            /**
             * Sets the value of the line2MATCHCOUNT property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setLINE2MATCHCOUNT(JAXBElement<BigDecimal> value) {
                this.line2MATCHCOUNT = value;
            }

            /**
             * Gets the value of the line3MATCH property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getLINE3MATCH() {
                return line3MATCH;
            }

            /**
             * Sets the value of the line3MATCH property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setLINE3MATCH(JAXBElement<String> value) {
                this.line3MATCH = value;
            }

            /**
             * Gets the value of the line3MATCHCOUNT property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getLINE3MATCHCOUNT() {
                return line3MATCHCOUNT;
            }

            /**
             * Sets the value of the line3MATCHCOUNT property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setLINE3MATCHCOUNT(JAXBElement<BigDecimal> value) {
                this.line3MATCHCOUNT = value;
            }

            /**
             * Gets the value of the city property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getCITY() {
                return city;
            }

            /**
             * Sets the value of the city property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setCITY(JAXBElement<String> value) {
                this.city = value;
            }

            /**
             * Gets the value of the citymatchcount property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getCITYMATCHCOUNT() {
                return citymatchcount;
            }

            /**
             * Sets the value of the citymatchcount property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setCITYMATCHCOUNT(JAXBElement<BigDecimal> value) {
                this.citymatchcount = value;
            }

            /**
             * Gets the value of the state property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getSTATE() {
                return state;
            }

            /**
             * Sets the value of the state property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setSTATE(JAXBElement<String> value) {
                this.state = value;
            }

            /**
             * Gets the value of the statematchcount property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getSTATEMATCHCOUNT() {
                return statematchcount;
            }

            /**
             * Sets the value of the statematchcount property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setSTATEMATCHCOUNT(JAXBElement<BigDecimal> value) {
                this.statematchcount = value;
            }

            /**
             * Gets the value of the fitrigger property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFITRIGGER() {
                return fitrigger;
            }

            /**
             * Sets the value of the fitrigger property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFITRIGGER(JAXBElement<String> value) {
                this.fitrigger = value;
            }

            /**
             * Gets the value of the error property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getERROR() {
                return error;
            }

            /**
             * Sets the value of the error property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setERROR(JAXBElement<String> value) {
                this.error = value;
            }

            /**
             * Gets the value of the errordesc property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getERRORDESC() {
                return errordesc;
            }

            /**
             * Sets the value of the errordesc property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setERRORDESC(JAXBElement<String> value) {
                this.errordesc = value;
            }

            /**
             * Gets the value of the bankname property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.BANKNAME }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.BANKNAME getBANKNAME() {
                return bankname;
            }

            /**
             * Sets the value of the bankname property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.BANKNAME }
             *
             */
            public void setBANKNAME(APLCTIONRES.APPLICANT.APPLICANTOUT.BANKNAME value) {
                this.bankname = value;
            }

            /**
             * Gets the value of the lastfourdigbankacc property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.LASTFOURDIGBANKACC }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.LASTFOURDIGBANKACC getLASTFOURDIGBANKACC() {
                return lastfourdigbankacc;
            }

            /**
             * Sets the value of the lastfourdigbankacc property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.LASTFOURDIGBANKACC }
             *
             */
            public void setLASTFOURDIGBANKACC(APLCTIONRES.APPLICANT.APPLICANTOUT.LASTFOURDIGBANKACC value) {
                this.lastfourdigbankacc = value;
            }

            /**
             * Gets the value of the selfdecinc property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getSELFDECINC() {
                return selfdecinc;
            }

            /**
             * Sets the value of the selfdecinc property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setSELFDECINC(JAXBElement<BigDecimal> value) {
                this.selfdecinc = value;
            }

            /**
             * Gets the value of the finalincused property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFINALINCUSED() {
                return finalincused;
            }

            /**
             * Sets the value of the finalincused property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFINALINCUSED(JAXBElement<String> value) {
                this.finalincused = value;
            }

            /**
             * Gets the value of the incimpflag property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getINCIMPFLAG() {
                return incimpflag;
            }

            /**
             * Sets the value of the incimpflag property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setINCIMPFLAG(JAXBElement<String> value) {
                this.incimpflag = value;
            }

            /**
             * Gets the value of the fillerfield3 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFILLERFIELD3() {
                return fillerfield3;
            }

            /**
             * Sets the value of the fillerfield3 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFILLERFIELD3(JAXBElement<String> value) {
                this.fillerfield3 = value;
            }

            /**
             * Gets the value of the fillerfield4 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFILLERFIELD4() {
                return fillerfield4;
            }

            /**
             * Sets the value of the fillerfield4 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFILLERFIELD4(JAXBElement<String> value) {
                this.fillerfield4 = value;
            }

            /**
             * Gets the value of the fillerfield5 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFILLERFIELD5() {
                return fillerfield5;
            }

            /**
             * Sets the value of the fillerfield5 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFILLERFIELD5(JAXBElement<String> value) {
                this.fillerfield5 = value;
            }

            /**
             * Gets the value of the acctype property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getACCTYPE() {
                return acctype;
            }

            /**
             * Sets the value of the acctype property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setACCTYPE(JAXBElement<String> value) {
                this.acctype = value;
            }

            /**
             * Gets the value of the fillerfield7 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFILLERFIELD7() {
                return fillerfield7;
            }

            /**
             * Sets the value of the fillerfield7 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFILLERFIELD7(JAXBElement<String> value) {
                this.fillerfield7 = value;
            }

            /**
             * Gets the value of the applnapplyrsservice property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getAPPLNAPPLYRSSERVICE() {
                return applnapplyrsservice;
            }

            /**
             * Sets the value of the applnapplyrsservice property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setAPPLNAPPLYRSSERVICE(JAXBElement<BigDecimal> value) {
                this.applnapplyrsservice = value;
            }

            /**
             * Gets the value of the imputedincome property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getIMPUTEDINCOME() {
                return imputedincome;
            }

            /**
             * Sets the value of the imputedincome property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setIMPUTEDINCOME(JAXBElement<BigDecimal> value) {
                this.imputedincome = value;
            }

            /**
             * Gets the value of the altdataincome property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getALTDATAINCOME() {
                return altdataincome;
            }

            /**
             * Sets the value of the altdataincome property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setALTDATAINCOME(JAXBElement<BigDecimal> value) {
                this.altdataincome = value;
            }

            /**
             * Gets the value of the fillerfield11 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getFILLERFIELD11() {
                return fillerfield11;
            }

            /**
             * Sets the value of the fillerfield11 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setFILLERFIELD11(JAXBElement<BigDecimal> value) {
                this.fillerfield11 = value;
            }

            /**
             * Gets the value of the fillerfield12 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getFILLERFIELD12() {
                return fillerfield12;
            }

            /**
             * Sets the value of the fillerfield12 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setFILLERFIELD12(JAXBElement<BigDecimal> value) {
                this.fillerfield12 = value;
            }

            /**
             * Gets the value of the fillerfield13 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getFILLERFIELD13() {
                return fillerfield13;
            }

            /**
             * Sets the value of the fillerfield13 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setFILLERFIELD13(JAXBElement<BigDecimal> value) {
                this.fillerfield13 = value;
            }

            /**
             * Gets the value of the fillerfield14 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getFILLERFIELD14() {
                return fillerfield14;
            }

            /**
             * Sets the value of the fillerfield14 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setFILLERFIELD14(JAXBElement<BigDecimal> value) {
                this.fillerfield14 = value;
            }

            /**
             * Gets the value of the fillerfield15 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public JAXBElement<XMLGregorianCalendar> getFILLERFIELD15() {
                return fillerfield15;
            }

            /**
             * Sets the value of the fillerfield15 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public void setFILLERFIELD15(JAXBElement<XMLGregorianCalendar> value) {
                this.fillerfield15 = value;
            }

            /**
             * Gets the value of the fillerfield16 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public JAXBElement<XMLGregorianCalendar> getFILLERFIELD16() {
                return fillerfield16;
            }

            /**
             * Sets the value of the fillerfield16 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public void setFILLERFIELD16(JAXBElement<XMLGregorianCalendar> value) {
                this.fillerfield16 = value;
            }

            /**
             * Gets the value of the dedupe property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.DEDUPE }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.DEDUPE getDEDUPE() {
                return dedupe;
            }

            /**
             * Sets the value of the dedupe property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.DEDUPE }
             *
             */
            public void setDEDUPE(APLCTIONRES.APPLICANT.APPLICANTOUT.DEDUPE value) {
                this.dedupe = value;
            }

            /**
             * Gets the value of the scorecard property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SCORECARD }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.SCORECARD getSCORECARD() {
                return scorecard;
            }

            /**
             * Sets the value of the scorecard property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.SCORECARD }
             *
             */
            public void setSCORECARD(APLCTIONRES.APPLICANT.APPLICANTOUT.SCORECARD value) {
                this.scorecard = value;
            }

            /**
             * Gets the value of the policy property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.POLICY }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.POLICY getPOLICY() {
                return policy;
            }

            /**
             * Sets the value of the policy property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.POLICY }
             *
             */
            public void setPOLICY(APLCTIONRES.APPLICANT.APPLICANTOUT.POLICY value) {
                this.policy = value;
            }

            /**
             * Gets the value of the preapprovedout property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.PREAPPROVEDOUT }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.PREAPPROVEDOUT getPREAPPROVEDOUT() {
                return preapprovedout;
            }

            /**
             * Sets the value of the preapprovedout property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.PREAPPROVEDOUT }
             *
             */
            public void setPREAPPROVEDOUT(APLCTIONRES.APPLICANT.APPLICANTOUT.PREAPPROVEDOUT value) {
                this.preapprovedout = value;
            }

            /**
             * Gets the value of the manthanout property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.MANTHANOUT }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.MANTHANOUT getMANTHANOUT() {
                return manthanout;
            }

            /**
             * Sets the value of the manthanout property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.MANTHANOUT }
             *
             */
            public void setMANTHANOUT(APLCTIONRES.APPLICANT.APPLICANTOUT.MANTHANOUT value) {
                this.manthanout = value;
            }

            /**
             * Gets the value of the producttype property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getPRODUCTTYPE() {
                return producttype;
            }

            /**
             * Sets the value of the producttype property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setPRODUCTTYPE(JAXBElement<String> value) {
                this.producttype = value;
            }

            /**
             * Gets the value of the creditvidyaout property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.CREDITVIDYAOUT }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.CREDITVIDYAOUT getCREDITVIDYAOUT() {
                return creditvidyaout;
            }

            /**
             * Sets the value of the creditvidyaout property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.CREDITVIDYAOUT }
             *
             */
            public void setCREDITVIDYAOUT(APLCTIONRES.APPLICANT.APPLICANTOUT.CREDITVIDYAOUT value) {
                this.creditvidyaout = value;
            }

            /**
             * Gets the value of the effectivemultiplier property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getEFFECTIVEMULTIPLIER() {
                return effectivemultiplier;
            }

            /**
             * Sets the value of the effectivemultiplier property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setEFFECTIVEMULTIPLIER(JAXBElement<BigDecimal> value) {
                this.effectivemultiplier = value;
            }

            /**
             * Gets the value of the risksegment property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getRISKSEGMENT() {
                return risksegment;
            }

            /**
             * Sets the value of the risksegment property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setRISKSEGMENT(JAXBElement<String> value) {
                this.risksegment = value;
            }

            /**
             * Gets the value of the tradelineused property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getTRADELINEUSED() {
                return tradelineused;
            }

            /**
             * Sets the value of the tradelineused property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setTRADELINEUSED(JAXBElement<String> value) {
                this.tradelineused = value;
            }

            /**
             * Gets the value of the kicker property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getKICKER() {
                return kicker;
            }

            /**
             * Sets the value of the kicker property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setKICKER(JAXBElement<BigDecimal> value) {
                this.kicker = value;
            }

            /**
             * Gets the value of the multiplier property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getMULTIPLIER() {
                return multiplier;
            }

            /**
             * Sets the value of the multiplier property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setMULTIPLIER(JAXBElement<BigDecimal> value) {
                this.multiplier = value;
            }

            /**
             * Gets the value of the cardtype property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getCARDTYPE() {
                return cardtype;
            }

            /**
             * Sets the value of the cardtype property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setCARDTYPE(JAXBElement<String> value) {
                this.cardtype = value;
            }

            /**
             * Gets the value of the customertype property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getCUSTOMERTYPE() {
                return customertype;
            }

            /**
             * Sets the value of the customertype property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setCUSTOMERTYPE(JAXBElement<String> value) {
                this.customertype = value;
            }

            /**
             * Gets the value of the activecc property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getACTIVECC() {
                return activecc;
            }

            /**
             * Sets the value of the activecc property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setACTIVECC(JAXBElement<String> value) {
                this.activecc = value;
            }

            /**
             * Gets the value of the trigger property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getTRIGGER() {
                return trigger;
            }

            /**
             * Sets the value of the trigger property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setTRIGGER(JAXBElement<BigDecimal> value) {
                this.trigger = value;
            }

            /**
             * Gets the value of the pinmatchbur property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getPINMATCHBUR() {
                return pinmatchbur;
            }

            /**
             * Sets the value of the pinmatchbur property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setPINMATCHBUR(JAXBElement<String> value) {
                this.pinmatchbur = value;
            }

            /**
             * Gets the value of the burmobmatch property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getBURMOBMATCH() {
                return burmobmatch;
            }

            /**
             * Sets the value of the burmobmatch property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setBURMOBMATCH(JAXBElement<String> value) {
                this.burmobmatch = value;
            }

            /**
             * Gets the value of the buremail property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getBUREMAIL() {
                return buremail;
            }

            /**
             * Sets the value of the buremail property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setBUREMAIL(JAXBElement<String> value) {
                this.buremail = value;
            }

            /**
             * Gets the value of the risksegement2 property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getRISKSEGEMENT2() {
                return risksegement2;
            }

            /**
             * Sets the value of the risksegement2 property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setRISKSEGEMENT2(JAXBElement<String> value) {
                this.risksegement2 = value;
            }

            /**
             * Gets the value of the fcutrigger property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getFCUTRIGGER() {
                return fcutrigger;
            }

            /**
             * Sets the value of the fcutrigger property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setFCUTRIGGER(JAXBElement<String> value) {
                this.fcutrigger = value;
            }

            /**
             * Gets the value of the dercbscr property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getDERCBSCR() {
                return dercbscr;
            }

            /**
             * Sets the value of the dercbscr property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setDERCBSCR(JAXBElement<BigDecimal> value) {
                this.dercbscr = value;
            }

            /**
             * Gets the value of the dhanicare property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getDHANICARE() {
                return dhanicare;
            }

            /**
             * Sets the value of the dhanicare property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setDHANICARE(JAXBElement<String> value) {
                this.dhanicare = value;
            }

            /**
             * Gets the value of the qlfngtrad property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getQLFNGTRAD() {
                return qlfngtrad;
            }

            /**
             * Sets the value of the qlfngtrad property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setQLFNGTRAD(JAXBElement<BigDecimal> value) {
                this.qlfngtrad = value;
            }

            /**
             * Gets the value of the dclsalntc property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getDCLSALNTC() {
                return dclsalntc;
            }

            /**
             * Sets the value of the dclsalntc property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setDCLSALNTC(JAXBElement<String> value) {
                this.dclsalntc = value;
            }

            /**
             * Gets the value of the clusterno property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getCLUSTERNO() {
                return clusterno;
            }

            /**
             * Sets the value of the clusterno property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setCLUSTERNO(JAXBElement<BigDecimal> value) {
                this.clusterno = value;
            }

            /**
             * Gets the value of the dhanihealthline property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getDHANIHEALTHLINE() {
                return dhanihealthline;
            }

            /**
             * Sets the value of the dhanihealthline property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setDHANIHEALTHLINE(JAXBElement<String> value) {
                this.dhanihealthline = value;
            }

            /**
             * Gets the value of the maxcombexpos property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getMAXCOMBEXPOS() {
                return maxcombexpos;
            }

            /**
             * Sets the value of the maxcombexpos property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setMAXCOMBEXPOS(JAXBElement<BigDecimal> value) {
                this.maxcombexpos = value;
            }

            /**
             * Gets the value of the dhaniss property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getDHANISS() {
                return dhaniss;
            }

            /**
             * Sets the value of the dhaniss property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setDHANISS(JAXBElement<String> value) {
                this.dhaniss = value;
            }

            /**
             * Gets the value of the dhaniproduct property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getDHANIPRODUCT() {
                return dhaniproduct;
            }

            /**
             * Sets the value of the dhaniproduct property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setDHANIPRODUCT(JAXBElement<String> value) {
                this.dhaniproduct = value;
            }

            /**
             * Gets the value of the appialtdcl property.
             *
             * @return
             *     possible object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPIALTDCL }
             *
             */
            public APLCTIONRES.APPLICANT.APPLICANTOUT.APPIALTDCL getAPPIALTDCL() {
                return appialtdcl;
            }

            /**
             * Sets the value of the appialtdcl property.
             *
             * @param value
             *     allowed object is
             *     {@link APLCTIONRES.APPLICANT.APPLICANTOUT.APPIALTDCL }
             *
             */
            public void setAPPIALTDCL(APLCTIONRES.APPLICANT.APPLICANTOUT.APPIALTDCL value) {
                this.appialtdcl = value;
            }

            /**
             * Gets the value of the existingemi property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getEXISTINGEMI() {
                return existingemi;
            }

            /**
             * Sets the value of the existingemi property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setEXISTINGEMI(JAXBElement<BigDecimal> value) {
                this.existingemi = value;
            }

            /**
             * Gets the value of the linecustseg property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getLINECUSTSEG() {
                return linecustseg;
            }

            /**
             * Sets the value of the linecustseg property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setLINECUSTSEG(JAXBElement<String> value) {
                this.linecustseg = value;
            }

            /**
             * Gets the value of the enql3M property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getENQL3M() {
                return enql3M;
            }

            /**
             * Sets the value of the enql3M property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setENQL3M(JAXBElement<BigDecimal> value) {
                this.enql3M = value;
            }

            /**
             * Gets the value of the enqunsecl6M property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getENQUNSECL6M() {
                return enqunsecl6M;
            }

            /**
             * Sets the value of the enqunsecl6M property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setENQUNSECL6M(JAXBElement<BigDecimal> value) {
                this.enqunsecl6M = value;
            }

            /**
             * Gets the value of the enql6M property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getENQL6M() {
                return enql6M;
            }

            /**
             * Sets the value of the enql6M property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setENQL6M(JAXBElement<BigDecimal> value) {
                this.enql6M = value;
            }

            /**
             * Gets the value of the dpdl6M property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getDPDL6M() {
                return dpdl6M;
            }

            /**
             * Sets the value of the dpdl6M property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setDPDL6M(JAXBElement<BigDecimal> value) {
                this.dpdl6M = value;
            }

            /**
             * Gets the value of the dpdl3M property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public JAXBElement<BigDecimal> getDPDL3M() {
                return dpdl3M;
            }

            /**
             * Sets the value of the dpdl3M property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *
             */
            public void setDPDL3M(JAXBElement<BigDecimal> value) {
                this.dpdl3M = value;
            }

            /**
             * Gets the value of the dclsegment property.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public JAXBElement<String> getDCLSEGMENT() {
                return dclsegment;
            }

            /**
             * Sets the value of the dclsegment property.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *
             */
            public void setDCLSEGMENT(JAXBElement<String> value) {
                this.dclsegment = value;
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
             *       &lt;all>
             *         &lt;element name="ALTDECISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ALTMAXLOANAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ALTMAXTenor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ALTROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ALTPROCFEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ALTDECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class APPIALTDCL {

                @XmlElementRef(name = "ALTDECISION", type = JAXBElement.class, required = false)
                protected JAXBElement<String> altdecision;
                @XmlElementRef(name = "ALTMAXLOANAMT", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> altmaxloanamt;
                @XmlElementRef(name = "ALTMAXTenor", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> altmaxTenor;
                @XmlElementRef(name = "ALTROI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> altroi;
                @XmlElementRef(name = "ALTPROCFEE", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> altprocfee;
                @XmlElementRef(name = "ALTDECRSN", type = JAXBElement.class, required = false)
                protected JAXBElement<String> altdecrsn;

                /**
                 * Gets the value of the altdecision property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getALTDECISION() {
                    return altdecision;
                }

                /**
                 * Sets the value of the altdecision property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setALTDECISION(JAXBElement<String> value) {
                    this.altdecision = value;
                }

                /**
                 * Gets the value of the altmaxloanamt property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getALTMAXLOANAMT() {
                    return altmaxloanamt;
                }

                /**
                 * Sets the value of the altmaxloanamt property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setALTMAXLOANAMT(JAXBElement<BigDecimal> value) {
                    this.altmaxloanamt = value;
                }

                /**
                 * Gets the value of the altmaxTenor property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getALTMAXTenor() {
                    return altmaxTenor;
                }

                /**
                 * Sets the value of the altmaxTenor property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setALTMAXTenor(JAXBElement<BigDecimal> value) {
                    this.altmaxTenor = value;
                }

                /**
                 * Gets the value of the altroi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getALTROI() {
                    return altroi;
                }

                /**
                 * Sets the value of the altroi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setALTROI(JAXBElement<BigDecimal> value) {
                    this.altroi = value;
                }

                /**
                 * Gets the value of the altprocfee property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getALTPROCFEE() {
                    return altprocfee;
                }

                /**
                 * Sets the value of the altprocfee property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setALTPROCFEE(JAXBElement<BigDecimal> value) {
                    this.altprocfee = value;
                }

                /**
                 * Gets the value of the altdecrsn property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getALTDECRSN() {
                    return altdecrsn;
                }

                /**
                 * Sets the value of the altdecrsn property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setALTDECRSN(JAXBElement<String> value) {
                    this.altdecrsn = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class APPSC2PARAM {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class APPSC2PARAMSC {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI1(JAXBElement<BigDecimal> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI2(JAXBElement<BigDecimal> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI3(JAXBElement<BigDecimal> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI4(JAXBElement<BigDecimal> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI5(JAXBElement<BigDecimal> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI6(JAXBElement<BigDecimal> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI7(JAXBElement<BigDecimal> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI8(JAXBElement<BigDecimal> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI9(JAXBElement<BigDecimal> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI10(JAXBElement<BigDecimal> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI11(JAXBElement<BigDecimal> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI12(JAXBElement<BigDecimal> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI13(JAXBElement<BigDecimal> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI14(JAXBElement<BigDecimal> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI15(JAXBElement<BigDecimal> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI16(JAXBElement<BigDecimal> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI17(JAXBElement<BigDecimal> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI18(JAXBElement<BigDecimal> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI19(JAXBElement<BigDecimal> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI20(JAXBElement<BigDecimal> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class APPSCPARAM {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class APPSCPARAMSC {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI1(JAXBElement<BigDecimal> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI2(JAXBElement<BigDecimal> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI3(JAXBElement<BigDecimal> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI4(JAXBElement<BigDecimal> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI5(JAXBElement<BigDecimal> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI6(JAXBElement<BigDecimal> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI7(JAXBElement<BigDecimal> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI8(JAXBElement<BigDecimal> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI9(JAXBElement<BigDecimal> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI10(JAXBElement<BigDecimal> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI11(JAXBElement<BigDecimal> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI12(JAXBElement<BigDecimal> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI13(JAXBElement<BigDecimal> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI14(JAXBElement<BigDecimal> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI15(JAXBElement<BigDecimal> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI16(JAXBElement<BigDecimal> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI17(JAXBElement<BigDecimal> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI18(JAXBElement<BigDecimal> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI19(JAXBElement<BigDecimal> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI20(JAXBElement<BigDecimal> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class BANKNAME {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class BURSCPARAMS {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class BURSCPARAMSSC {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI1(JAXBElement<BigDecimal> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI2(JAXBElement<BigDecimal> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI3(JAXBElement<BigDecimal> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI4(JAXBElement<BigDecimal> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI5(JAXBElement<BigDecimal> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI6(JAXBElement<BigDecimal> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI7(JAXBElement<BigDecimal> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI8(JAXBElement<BigDecimal> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI9(JAXBElement<BigDecimal> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI10(JAXBElement<BigDecimal> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI11(JAXBElement<BigDecimal> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI12(JAXBElement<BigDecimal> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI13(JAXBElement<BigDecimal> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI14(JAXBElement<BigDecimal> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI15(JAXBElement<BigDecimal> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI16(JAXBElement<BigDecimal> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI17(JAXBElement<BigDecimal> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI18(JAXBElement<BigDecimal> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI19(JAXBElement<BigDecimal> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI20(JAXBElement<BigDecimal> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="Standingofferavailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Cveligibleloanamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class CREDITVIDYAOUT {

                @XmlElementRef(name = "Standingofferavailable", type = JAXBElement.class, required = false)
                protected JAXBElement<String> standingofferavailable;
                @XmlElementRef(name = "Cveligibleloanamount", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> cveligibleloanamount;

                /**
                 * Gets the value of the standingofferavailable property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getStandingofferavailable() {
                    return standingofferavailable;
                }

                /**
                 * Sets the value of the standingofferavailable property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setStandingofferavailable(JAXBElement<String> value) {
                    this.standingofferavailable = value;
                }

                /**
                 * Gets the value of the cveligibleloanamount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getCveligibleloanamount() {
                    return cveligibleloanamount;
                }

                /**
                 * Sets the value of the cveligibleloanamount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setCveligibleloanamount(JAXBElement<BigDecimal> value) {
                    this.cveligibleloanamount = value;
                }

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
             *       &lt;all>
             *         &lt;element name="PDMAPPLNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DPDMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PDMCUSTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PDMBRANCHLOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PDMPRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PDMSYS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PDMLOANACCOUNTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="DPDFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DPDFLAGREASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="FILLERFIELD12" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class DEDUPE {

                @XmlElementRef(name = "PDMAPPLNO", type = JAXBElement.class, required = false)
                protected JAXBElement<String> pdmapplno;
                @XmlElementRef(name = "DPDMATCH", type = JAXBElement.class, required = false)
                protected JAXBElement<String> dpdmatch;
                @XmlElementRef(name = "PDMCUSTID", type = JAXBElement.class, required = false)
                protected JAXBElement<String> pdmcustid;
                @XmlElementRef(name = "PDMBRANCHLOCATION", type = JAXBElement.class, required = false)
                protected JAXBElement<String> pdmbranchlocation;
                @XmlElementRef(name = "PDMPRODUCT", type = JAXBElement.class, required = false)
                protected JAXBElement<String> pdmproduct;
                @XmlElementRef(name = "PDMSYS", type = JAXBElement.class, required = false)
                protected JAXBElement<String> pdmsys;
                @XmlElementRef(name = "PDMLOANACCOUNTNO", type = JAXBElement.class, required = false)
                protected JAXBElement<String> pdmloanaccountno;
                @XmlElementRef(name = "FILLERFIELD5", type = JAXBElement.class, required = false)
                protected JAXBElement<XMLGregorianCalendar> fillerfield5;
                @XmlElementRef(name = "FILLERFIELD6", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> fillerfield6;
                @XmlElementRef(name = "DPDFLAG", type = JAXBElement.class, required = false)
                protected JAXBElement<String> dpdflag;
                @XmlElementRef(name = "DPDFLAGREASON", type = JAXBElement.class, required = false)
                protected JAXBElement<String> dpdflagreason;
                @XmlElementRef(name = "FILLERFIELD7", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> fillerfield7;
                @XmlElementRef(name = "FILLERFIELD8", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> fillerfield8;
                @XmlElementRef(name = "FILLERFIELD9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> fillerfield9;
                @XmlElementRef(name = "FILLERFIELD10", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> fillerfield10;
                @XmlElementRef(name = "FILLERFIELD11", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> fillerfield11;
                @XmlElementRef(name = "FILLERFIELD12", type = JAXBElement.class, required = false)
                protected JAXBElement<XMLGregorianCalendar> fillerfield12;
                @XmlElementRef(name = "ERROR", type = JAXBElement.class, required = false)
                protected JAXBElement<String> error;
                @XmlElementRef(name = "ERRORDESC", type = JAXBElement.class, required = false)
                protected JAXBElement<String> errordesc;

                /**
                 * Gets the value of the pdmapplno property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPDMAPPLNO() {
                    return pdmapplno;
                }

                /**
                 * Sets the value of the pdmapplno property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPDMAPPLNO(JAXBElement<String> value) {
                    this.pdmapplno = value;
                }

                /**
                 * Gets the value of the dpdmatch property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getDPDMATCH() {
                    return dpdmatch;
                }

                /**
                 * Sets the value of the dpdmatch property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setDPDMATCH(JAXBElement<String> value) {
                    this.dpdmatch = value;
                }

                /**
                 * Gets the value of the pdmcustid property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPDMCUSTID() {
                    return pdmcustid;
                }

                /**
                 * Sets the value of the pdmcustid property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPDMCUSTID(JAXBElement<String> value) {
                    this.pdmcustid = value;
                }

                /**
                 * Gets the value of the pdmbranchlocation property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPDMBRANCHLOCATION() {
                    return pdmbranchlocation;
                }

                /**
                 * Sets the value of the pdmbranchlocation property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPDMBRANCHLOCATION(JAXBElement<String> value) {
                    this.pdmbranchlocation = value;
                }

                /**
                 * Gets the value of the pdmproduct property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPDMPRODUCT() {
                    return pdmproduct;
                }

                /**
                 * Sets the value of the pdmproduct property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPDMPRODUCT(JAXBElement<String> value) {
                    this.pdmproduct = value;
                }

                /**
                 * Gets the value of the pdmsys property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPDMSYS() {
                    return pdmsys;
                }

                /**
                 * Sets the value of the pdmsys property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPDMSYS(JAXBElement<String> value) {
                    this.pdmsys = value;
                }

                /**
                 * Gets the value of the pdmloanaccountno property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPDMLOANACCOUNTNO() {
                    return pdmloanaccountno;
                }

                /**
                 * Sets the value of the pdmloanaccountno property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPDMLOANACCOUNTNO(JAXBElement<String> value) {
                    this.pdmloanaccountno = value;
                }

                /**
                 * Gets the value of the fillerfield5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *
                 */
                public JAXBElement<XMLGregorianCalendar> getFILLERFIELD5() {
                    return fillerfield5;
                }

                /**
                 * Sets the value of the fillerfield5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *
                 */
                public void setFILLERFIELD5(JAXBElement<XMLGregorianCalendar> value) {
                    this.fillerfield5 = value;
                }

                /**
                 * Gets the value of the fillerfield6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getFILLERFIELD6() {
                    return fillerfield6;
                }

                /**
                 * Sets the value of the fillerfield6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setFILLERFIELD6(JAXBElement<BigDecimal> value) {
                    this.fillerfield6 = value;
                }

                /**
                 * Gets the value of the dpdflag property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getDPDFLAG() {
                    return dpdflag;
                }

                /**
                 * Sets the value of the dpdflag property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setDPDFLAG(JAXBElement<String> value) {
                    this.dpdflag = value;
                }

                /**
                 * Gets the value of the dpdflagreason property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getDPDFLAGREASON() {
                    return dpdflagreason;
                }

                /**
                 * Sets the value of the dpdflagreason property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setDPDFLAGREASON(JAXBElement<String> value) {
                    this.dpdflagreason = value;
                }

                /**
                 * Gets the value of the fillerfield7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getFILLERFIELD7() {
                    return fillerfield7;
                }

                /**
                 * Sets the value of the fillerfield7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setFILLERFIELD7(JAXBElement<BigDecimal> value) {
                    this.fillerfield7 = value;
                }

                /**
                 * Gets the value of the fillerfield8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getFILLERFIELD8() {
                    return fillerfield8;
                }

                /**
                 * Sets the value of the fillerfield8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setFILLERFIELD8(JAXBElement<BigDecimal> value) {
                    this.fillerfield8 = value;
                }

                /**
                 * Gets the value of the fillerfield9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getFILLERFIELD9() {
                    return fillerfield9;
                }

                /**
                 * Sets the value of the fillerfield9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setFILLERFIELD9(JAXBElement<String> value) {
                    this.fillerfield9 = value;
                }

                /**
                 * Gets the value of the fillerfield10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getFILLERFIELD10() {
                    return fillerfield10;
                }

                /**
                 * Sets the value of the fillerfield10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setFILLERFIELD10(JAXBElement<BigDecimal> value) {
                    this.fillerfield10 = value;
                }

                /**
                 * Gets the value of the fillerfield11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getFILLERFIELD11() {
                    return fillerfield11;
                }

                /**
                 * Sets the value of the fillerfield11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setFILLERFIELD11(JAXBElement<BigDecimal> value) {
                    this.fillerfield11 = value;
                }

                /**
                 * Gets the value of the fillerfield12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *
                 */
                public JAXBElement<XMLGregorianCalendar> getFILLERFIELD12() {
                    return fillerfield12;
                }

                /**
                 * Sets the value of the fillerfield12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *
                 */
                public void setFILLERFIELD12(JAXBElement<XMLGregorianCalendar> value) {
                    this.fillerfield12 = value;
                }

                /**
                 * Gets the value of the error property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getERROR() {
                    return error;
                }

                /**
                 * Sets the value of the error property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setERROR(JAXBElement<String> value) {
                    this.error = value;
                }

                /**
                 * Gets the value of the errordesc property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getERRORDESC() {
                    return errordesc;
                }

                /**
                 * Sets the value of the errordesc property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setERRORDESC(JAXBElement<String> value) {
                    this.errordesc = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class LASTFOURDIGBANKACC {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> i10;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI1(JAXBElement<BigDecimal> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI2(JAXBElement<BigDecimal> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI3(JAXBElement<BigDecimal> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI4(JAXBElement<BigDecimal> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI5(JAXBElement<BigDecimal> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI6(JAXBElement<BigDecimal> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI7(JAXBElement<BigDecimal> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI8(JAXBElement<BigDecimal> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI9(JAXBElement<BigDecimal> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setI10(JAXBElement<BigDecimal> value) {
                    this.i10 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="LAMANTHANOFFERFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LAROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LALOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LAMINROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LAMAXELIGIBLEEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LAEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LAMAXELIGIBLELOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LALOANEXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="LALOANEXPIRYFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LAPROCESSINGFEES" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LAOCCUPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LATENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="LAFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LAFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LAFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class MANTHANOUT {

                @XmlElementRef(name = "LAMANTHANOFFERFLAG", type = JAXBElement.class, required = false)
                protected JAXBElement<String> lamanthanofferflag;
                @XmlElementRef(name = "LAROI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> laroi;
                @XmlElementRef(name = "LALOANAMOUNT", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> laloanamount;
                @XmlElementRef(name = "LAMINROI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> laminroi;
                @XmlElementRef(name = "LAMAXELIGIBLEEMI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> lamaxeligibleemi;
                @XmlElementRef(name = "LAEMI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> laemi;
                @XmlElementRef(name = "LAMAXELIGIBLELOANAMOUNT", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> lamaxeligibleloanamount;
                @XmlElementRef(name = "LALOANEXPIRYDATE", type = JAXBElement.class, required = false)
                protected JAXBElement<XMLGregorianCalendar> laloanexpirydate;
                @XmlElementRef(name = "LALOANEXPIRYFLAG", type = JAXBElement.class, required = false)
                protected JAXBElement<String> laloanexpiryflag;
                @XmlElementRef(name = "LAPROCESSINGFEES", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> laprocessingfees;
                @XmlElementRef(name = "LAOCCUPATION", type = JAXBElement.class, required = false)
                protected JAXBElement<String> laoccupation;
                @XmlElementRef(name = "LATENURE", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> latenure;
                @XmlElementRef(name = "LAFILLER1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> lafiller1;
                @XmlElementRef(name = "LAFILLER2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> lafiller2;
                @XmlElementRef(name = "LAFILLER3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> lafiller3;

                /**
                 * Gets the value of the lamanthanofferflag property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getLAMANTHANOFFERFLAG() {
                    return lamanthanofferflag;
                }

                /**
                 * Sets the value of the lamanthanofferflag property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setLAMANTHANOFFERFLAG(JAXBElement<String> value) {
                    this.lamanthanofferflag = value;
                }

                /**
                 * Gets the value of the laroi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLAROI() {
                    return laroi;
                }

                /**
                 * Sets the value of the laroi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLAROI(JAXBElement<BigDecimal> value) {
                    this.laroi = value;
                }

                /**
                 * Gets the value of the laloanamount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLALOANAMOUNT() {
                    return laloanamount;
                }

                /**
                 * Sets the value of the laloanamount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLALOANAMOUNT(JAXBElement<BigDecimal> value) {
                    this.laloanamount = value;
                }

                /**
                 * Gets the value of the laminroi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLAMINROI() {
                    return laminroi;
                }

                /**
                 * Sets the value of the laminroi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLAMINROI(JAXBElement<BigDecimal> value) {
                    this.laminroi = value;
                }

                /**
                 * Gets the value of the lamaxeligibleemi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLAMAXELIGIBLEEMI() {
                    return lamaxeligibleemi;
                }

                /**
                 * Sets the value of the lamaxeligibleemi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLAMAXELIGIBLEEMI(JAXBElement<BigDecimal> value) {
                    this.lamaxeligibleemi = value;
                }

                /**
                 * Gets the value of the laemi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLAEMI() {
                    return laemi;
                }

                /**
                 * Sets the value of the laemi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLAEMI(JAXBElement<BigDecimal> value) {
                    this.laemi = value;
                }

                /**
                 * Gets the value of the lamaxeligibleloanamount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLAMAXELIGIBLELOANAMOUNT() {
                    return lamaxeligibleloanamount;
                }

                /**
                 * Sets the value of the lamaxeligibleloanamount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLAMAXELIGIBLELOANAMOUNT(JAXBElement<BigDecimal> value) {
                    this.lamaxeligibleloanamount = value;
                }

                /**
                 * Gets the value of the laloanexpirydate property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *
                 */
                public JAXBElement<XMLGregorianCalendar> getLALOANEXPIRYDATE() {
                    return laloanexpirydate;
                }

                /**
                 * Sets the value of the laloanexpirydate property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *
                 */
                public void setLALOANEXPIRYDATE(JAXBElement<XMLGregorianCalendar> value) {
                    this.laloanexpirydate = value;
                }

                /**
                 * Gets the value of the laloanexpiryflag property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getLALOANEXPIRYFLAG() {
                    return laloanexpiryflag;
                }

                /**
                 * Sets the value of the laloanexpiryflag property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setLALOANEXPIRYFLAG(JAXBElement<String> value) {
                    this.laloanexpiryflag = value;
                }

                /**
                 * Gets the value of the laprocessingfees property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLAPROCESSINGFEES() {
                    return laprocessingfees;
                }

                /**
                 * Sets the value of the laprocessingfees property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLAPROCESSINGFEES(JAXBElement<BigDecimal> value) {
                    this.laprocessingfees = value;
                }

                /**
                 * Gets the value of the laoccupation property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getLAOCCUPATION() {
                    return laoccupation;
                }

                /**
                 * Sets the value of the laoccupation property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setLAOCCUPATION(JAXBElement<String> value) {
                    this.laoccupation = value;
                }

                /**
                 * Gets the value of the latenure property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getLATENURE() {
                    return latenure;
                }

                /**
                 * Sets the value of the latenure property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setLATENURE(JAXBElement<BigDecimal> value) {
                    this.latenure = value;
                }

                /**
                 * Gets the value of the lafiller1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getLAFILLER1() {
                    return lafiller1;
                }

                /**
                 * Sets the value of the lafiller1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setLAFILLER1(JAXBElement<String> value) {
                    this.lafiller1 = value;
                }

                /**
                 * Gets the value of the lafiller2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getLAFILLER2() {
                    return lafiller2;
                }

                /**
                 * Sets the value of the lafiller2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setLAFILLER2(JAXBElement<String> value) {
                    this.lafiller2 = value;
                }

                /**
                 * Gets the value of the lafiller3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getLAFILLER3() {
                    return lafiller3;
                }

                /**
                 * Sets the value of the lafiller3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setLAFILLER3(JAXBElement<String> value) {
                    this.lafiller3 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="NIL30" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="NILX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="NILTRAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PLENQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="POLICYFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="POLICYFIELD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="POLICYFIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="POLICYFIELD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="POLICYFIELD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="POLICYFIELD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class POLICY {

                @XmlElementRef(name = "NIL30", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> nil30;
                @XmlElementRef(name = "NILX", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> nilx;
                @XmlElementRef(name = "NILTRAD", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> niltrad;
                @XmlElementRef(name = "PLENQ", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> plenq;
                @XmlElementRef(name = "POLICYFIELD5", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> policyfield5;
                @XmlElementRef(name = "POLICYFIELD6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> policyfield6;
                @XmlElementRef(name = "POLICYFIELD7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> policyfield7;
                @XmlElementRef(name = "POLICYFIELD8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> policyfield8;
                @XmlElementRef(name = "POLICYFIELD9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> policyfield9;
                @XmlElementRef(name = "POLICYFIELD10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> policyfield10;

                /**
                 * Gets the value of the nil30 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getNIL30() {
                    return nil30;
                }

                /**
                 * Sets the value of the nil30 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setNIL30(JAXBElement<BigDecimal> value) {
                    this.nil30 = value;
                }

                /**
                 * Gets the value of the nilx property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getNILX() {
                    return nilx;
                }

                /**
                 * Sets the value of the nilx property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setNILX(JAXBElement<BigDecimal> value) {
                    this.nilx = value;
                }

                /**
                 * Gets the value of the niltrad property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getNILTRAD() {
                    return niltrad;
                }

                /**
                 * Sets the value of the niltrad property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setNILTRAD(JAXBElement<BigDecimal> value) {
                    this.niltrad = value;
                }

                /**
                 * Gets the value of the plenq property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPLENQ() {
                    return plenq;
                }

                /**
                 * Sets the value of the plenq property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPLENQ(JAXBElement<BigDecimal> value) {
                    this.plenq = value;
                }

                /**
                 * Gets the value of the policyfield5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPOLICYFIELD5() {
                    return policyfield5;
                }

                /**
                 * Sets the value of the policyfield5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPOLICYFIELD5(JAXBElement<BigDecimal> value) {
                    this.policyfield5 = value;
                }

                /**
                 * Gets the value of the policyfield6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPOLICYFIELD6() {
                    return policyfield6;
                }

                /**
                 * Sets the value of the policyfield6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPOLICYFIELD6(JAXBElement<String> value) {
                    this.policyfield6 = value;
                }

                /**
                 * Gets the value of the policyfield7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPOLICYFIELD7() {
                    return policyfield7;
                }

                /**
                 * Sets the value of the policyfield7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPOLICYFIELD7(JAXBElement<String> value) {
                    this.policyfield7 = value;
                }

                /**
                 * Gets the value of the policyfield8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPOLICYFIELD8() {
                    return policyfield8;
                }

                /**
                 * Sets the value of the policyfield8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPOLICYFIELD8(JAXBElement<String> value) {
                    this.policyfield8 = value;
                }

                /**
                 * Gets the value of the policyfield9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPOLICYFIELD9() {
                    return policyfield9;
                }

                /**
                 * Sets the value of the policyfield9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPOLICYFIELD9(JAXBElement<String> value) {
                    this.policyfield9 = value;
                }

                /**
                 * Gets the value of the policyfield10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPOLICYFIELD10() {
                    return policyfield10;
                }

                /**
                 * Sets the value of the policyfield10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPOLICYFIELD10(JAXBElement<String> value) {
                    this.policyfield10 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="PREAPPROVEDLOANAMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PREAPPOVEDTENURE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDPF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ISPREAPPORVEDCUST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDMAXEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDFILLER8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PREAPPROVEDPRODUCTTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class PREAPPROVEDOUT {

                @XmlElementRef(name = "PREAPPROVEDLOANAMOUNT", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> preapprovedloanamount;
                @XmlElementRef(name = "PREAPPROVEDROI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> preapprovedroi;
                @XmlElementRef(name = "PREAPPROVEDEMI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> preapprovedemi;
                @XmlElementRef(name = "PREAPPOVEDTENURE", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> preappovedtenure;
                @XmlElementRef(name = "PREAPPROVEDPF", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> preapprovedpf;
                @XmlElementRef(name = "ISPREAPPORVEDCUST", type = JAXBElement.class, required = false)
                protected JAXBElement<String> ispreapporvedcust;
                @XmlElementRef(name = "PREAPPROVEDMAXEMI", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> preapprovedmaxemi;
                @XmlElementRef(name = "PREAPPROVEDFILLER1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller1;
                @XmlElementRef(name = "PREAPPROVEDFILLER2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller2;
                @XmlElementRef(name = "PREAPPROVEDFILLER3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller3;
                @XmlElementRef(name = "PREAPPROVEDFILLER4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller4;
                @XmlElementRef(name = "PREAPPROVEDFILLER5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller5;
                @XmlElementRef(name = "PREAPPROVEDFILLER6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller6;
                @XmlElementRef(name = "PREAPPROVEDFILLER7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller7;
                @XmlElementRef(name = "PREAPPROVEDFILLER8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedfiller8;
                @XmlElementRef(name = "PREAPPROVEDPRODUCTTYPE", type = JAXBElement.class, required = false)
                protected JAXBElement<String> preapprovedproducttype;

                /**
                 * Gets the value of the preapprovedloanamount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPREAPPROVEDLOANAMOUNT() {
                    return preapprovedloanamount;
                }

                /**
                 * Sets the value of the preapprovedloanamount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPREAPPROVEDLOANAMOUNT(JAXBElement<BigDecimal> value) {
                    this.preapprovedloanamount = value;
                }

                /**
                 * Gets the value of the preapprovedroi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPREAPPROVEDROI() {
                    return preapprovedroi;
                }

                /**
                 * Sets the value of the preapprovedroi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPREAPPROVEDROI(JAXBElement<BigDecimal> value) {
                    this.preapprovedroi = value;
                }

                /**
                 * Gets the value of the preapprovedemi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPREAPPROVEDEMI() {
                    return preapprovedemi;
                }

                /**
                 * Sets the value of the preapprovedemi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPREAPPROVEDEMI(JAXBElement<BigDecimal> value) {
                    this.preapprovedemi = value;
                }

                /**
                 * Gets the value of the preappovedtenure property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPREAPPOVEDTENURE() {
                    return preappovedtenure;
                }

                /**
                 * Sets the value of the preappovedtenure property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPREAPPOVEDTENURE(JAXBElement<BigDecimal> value) {
                    this.preappovedtenure = value;
                }

                /**
                 * Gets the value of the preapprovedpf property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPREAPPROVEDPF() {
                    return preapprovedpf;
                }

                /**
                 * Sets the value of the preapprovedpf property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPREAPPROVEDPF(JAXBElement<BigDecimal> value) {
                    this.preapprovedpf = value;
                }

                /**
                 * Gets the value of the ispreapporvedcust property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getISPREAPPORVEDCUST() {
                    return ispreapporvedcust;
                }

                /**
                 * Sets the value of the ispreapporvedcust property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setISPREAPPORVEDCUST(JAXBElement<String> value) {
                    this.ispreapporvedcust = value;
                }

                /**
                 * Gets the value of the preapprovedmaxemi property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getPREAPPROVEDMAXEMI() {
                    return preapprovedmaxemi;
                }

                /**
                 * Sets the value of the preapprovedmaxemi property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setPREAPPROVEDMAXEMI(JAXBElement<BigDecimal> value) {
                    this.preapprovedmaxemi = value;
                }

                /**
                 * Gets the value of the preapprovedfiller1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER1() {
                    return preapprovedfiller1;
                }

                /**
                 * Sets the value of the preapprovedfiller1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER1(JAXBElement<String> value) {
                    this.preapprovedfiller1 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER2() {
                    return preapprovedfiller2;
                }

                /**
                 * Sets the value of the preapprovedfiller2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER2(JAXBElement<String> value) {
                    this.preapprovedfiller2 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER3() {
                    return preapprovedfiller3;
                }

                /**
                 * Sets the value of the preapprovedfiller3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER3(JAXBElement<String> value) {
                    this.preapprovedfiller3 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER4() {
                    return preapprovedfiller4;
                }

                /**
                 * Sets the value of the preapprovedfiller4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER4(JAXBElement<String> value) {
                    this.preapprovedfiller4 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER5() {
                    return preapprovedfiller5;
                }

                /**
                 * Sets the value of the preapprovedfiller5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER5(JAXBElement<String> value) {
                    this.preapprovedfiller5 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER6() {
                    return preapprovedfiller6;
                }

                /**
                 * Sets the value of the preapprovedfiller6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER6(JAXBElement<String> value) {
                    this.preapprovedfiller6 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER7() {
                    return preapprovedfiller7;
                }

                /**
                 * Sets the value of the preapprovedfiller7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER7(JAXBElement<String> value) {
                    this.preapprovedfiller7 = value;
                }

                /**
                 * Gets the value of the preapprovedfiller8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDFILLER8() {
                    return preapprovedfiller8;
                }

                /**
                 * Sets the value of the preapprovedfiller8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDFILLER8(JAXBElement<String> value) {
                    this.preapprovedfiller8 = value;
                }

                /**
                 * Gets the value of the preapprovedproducttype property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getPREAPPROVEDPRODUCTTYPE() {
                    return preapprovedproducttype;
                }

                /**
                 * Sets the value of the preapprovedproducttype property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setPREAPPROVEDPRODUCTTYPE(JAXBElement<String> value) {
                    this.preapprovedproducttype = value;
                }

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
             *       &lt;all>
             *         &lt;element name="ENQL6M" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="GEORISKRANKING" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD11" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD13" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD14" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD15" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD16" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD17" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD18" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD19" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD20" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD21" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SCORECARDFIELD25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SCORECARD {

                @XmlElementRef(name = "ENQL6M", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> enql6M;
                @XmlElementRef(name = "GEORISKRANKING", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> georiskranking;
                @XmlElementRef(name = "SCORECARDFIELD3", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield3;
                @XmlElementRef(name = "SCORECARDFIELD4", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield4;
                @XmlElementRef(name = "SCORECARDFIELD5", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield5;
                @XmlElementRef(name = "SCORECARDFIELD6", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield6;
                @XmlElementRef(name = "SCORECARDFIELD7", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield7;
                @XmlElementRef(name = "SCORECARDFIELD8", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield8;
                @XmlElementRef(name = "SCORECARDFIELD9", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield9;
                @XmlElementRef(name = "SCORECARDFIELD10", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield10;
                @XmlElementRef(name = "SCORECARDFIELD11", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield11;
                @XmlElementRef(name = "SCORECARDFIELD12", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield12;
                @XmlElementRef(name = "SCORECARDFIELD13", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield13;
                @XmlElementRef(name = "SCORECARDFIELD14", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield14;
                @XmlElementRef(name = "SCORECARDFIELD15", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield15;
                @XmlElementRef(name = "SCORECARDFIELD16", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield16;
                @XmlElementRef(name = "SCORECARDFIELD17", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield17;
                @XmlElementRef(name = "SCORECARDFIELD18", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield18;
                @XmlElementRef(name = "SCORECARDFIELD19", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield19;
                @XmlElementRef(name = "SCORECARDFIELD20", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> scorecardfield20;
                @XmlElementRef(name = "SCORECARDFIELD21", type = JAXBElement.class, required = false)
                protected JAXBElement<String> scorecardfield21;
                @XmlElementRef(name = "SCORECARDFIELD22", type = JAXBElement.class, required = false)
                protected JAXBElement<String> scorecardfield22;
                @XmlElementRef(name = "SCORECARDFIELD23", type = JAXBElement.class, required = false)
                protected JAXBElement<String> scorecardfield23;
                @XmlElementRef(name = "SCORECARDFIELD24", type = JAXBElement.class, required = false)
                protected JAXBElement<String> scorecardfield24;
                @XmlElementRef(name = "SCORECARDFIELD25", type = JAXBElement.class, required = false)
                protected JAXBElement<String> scorecardfield25;

                /**
                 * Gets the value of the enql6M property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getENQL6M() {
                    return enql6M;
                }

                /**
                 * Sets the value of the enql6M property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setENQL6M(JAXBElement<BigDecimal> value) {
                    this.enql6M = value;
                }

                /**
                 * Gets the value of the georiskranking property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getGEORISKRANKING() {
                    return georiskranking;
                }

                /**
                 * Sets the value of the georiskranking property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setGEORISKRANKING(JAXBElement<BigDecimal> value) {
                    this.georiskranking = value;
                }

                /**
                 * Gets the value of the scorecardfield3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD3() {
                    return scorecardfield3;
                }

                /**
                 * Sets the value of the scorecardfield3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD3(JAXBElement<BigDecimal> value) {
                    this.scorecardfield3 = value;
                }

                /**
                 * Gets the value of the scorecardfield4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD4() {
                    return scorecardfield4;
                }

                /**
                 * Sets the value of the scorecardfield4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD4(JAXBElement<BigDecimal> value) {
                    this.scorecardfield4 = value;
                }

                /**
                 * Gets the value of the scorecardfield5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD5() {
                    return scorecardfield5;
                }

                /**
                 * Sets the value of the scorecardfield5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD5(JAXBElement<BigDecimal> value) {
                    this.scorecardfield5 = value;
                }

                /**
                 * Gets the value of the scorecardfield6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD6() {
                    return scorecardfield6;
                }

                /**
                 * Sets the value of the scorecardfield6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD6(JAXBElement<BigDecimal> value) {
                    this.scorecardfield6 = value;
                }

                /**
                 * Gets the value of the scorecardfield7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD7() {
                    return scorecardfield7;
                }

                /**
                 * Sets the value of the scorecardfield7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD7(JAXBElement<BigDecimal> value) {
                    this.scorecardfield7 = value;
                }

                /**
                 * Gets the value of the scorecardfield8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD8() {
                    return scorecardfield8;
                }

                /**
                 * Sets the value of the scorecardfield8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD8(JAXBElement<BigDecimal> value) {
                    this.scorecardfield8 = value;
                }

                /**
                 * Gets the value of the scorecardfield9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD9() {
                    return scorecardfield9;
                }

                /**
                 * Sets the value of the scorecardfield9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD9(JAXBElement<BigDecimal> value) {
                    this.scorecardfield9 = value;
                }

                /**
                 * Gets the value of the scorecardfield10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD10() {
                    return scorecardfield10;
                }

                /**
                 * Sets the value of the scorecardfield10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD10(JAXBElement<BigDecimal> value) {
                    this.scorecardfield10 = value;
                }

                /**
                 * Gets the value of the scorecardfield11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD11() {
                    return scorecardfield11;
                }

                /**
                 * Sets the value of the scorecardfield11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD11(JAXBElement<BigDecimal> value) {
                    this.scorecardfield11 = value;
                }

                /**
                 * Gets the value of the scorecardfield12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD12() {
                    return scorecardfield12;
                }

                /**
                 * Sets the value of the scorecardfield12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD12(JAXBElement<BigDecimal> value) {
                    this.scorecardfield12 = value;
                }

                /**
                 * Gets the value of the scorecardfield13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD13() {
                    return scorecardfield13;
                }

                /**
                 * Sets the value of the scorecardfield13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD13(JAXBElement<BigDecimal> value) {
                    this.scorecardfield13 = value;
                }

                /**
                 * Gets the value of the scorecardfield14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD14() {
                    return scorecardfield14;
                }

                /**
                 * Sets the value of the scorecardfield14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD14(JAXBElement<BigDecimal> value) {
                    this.scorecardfield14 = value;
                }

                /**
                 * Gets the value of the scorecardfield15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD15() {
                    return scorecardfield15;
                }

                /**
                 * Sets the value of the scorecardfield15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD15(JAXBElement<BigDecimal> value) {
                    this.scorecardfield15 = value;
                }

                /**
                 * Gets the value of the scorecardfield16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD16() {
                    return scorecardfield16;
                }

                /**
                 * Sets the value of the scorecardfield16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD16(JAXBElement<BigDecimal> value) {
                    this.scorecardfield16 = value;
                }

                /**
                 * Gets the value of the scorecardfield17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD17() {
                    return scorecardfield17;
                }

                /**
                 * Sets the value of the scorecardfield17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD17(JAXBElement<BigDecimal> value) {
                    this.scorecardfield17 = value;
                }

                /**
                 * Gets the value of the scorecardfield18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD18() {
                    return scorecardfield18;
                }

                /**
                 * Sets the value of the scorecardfield18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD18(JAXBElement<BigDecimal> value) {
                    this.scorecardfield18 = value;
                }

                /**
                 * Gets the value of the scorecardfield19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD19() {
                    return scorecardfield19;
                }

                /**
                 * Sets the value of the scorecardfield19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD19(JAXBElement<BigDecimal> value) {
                    this.scorecardfield19 = value;
                }

                /**
                 * Gets the value of the scorecardfield20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public JAXBElement<BigDecimal> getSCORECARDFIELD20() {
                    return scorecardfield20;
                }

                /**
                 * Sets the value of the scorecardfield20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *
                 */
                public void setSCORECARDFIELD20(JAXBElement<BigDecimal> value) {
                    this.scorecardfield20 = value;
                }

                /**
                 * Gets the value of the scorecardfield21 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getSCORECARDFIELD21() {
                    return scorecardfield21;
                }

                /**
                 * Sets the value of the scorecardfield21 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setSCORECARDFIELD21(JAXBElement<String> value) {
                    this.scorecardfield21 = value;
                }

                /**
                 * Gets the value of the scorecardfield22 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getSCORECARDFIELD22() {
                    return scorecardfield22;
                }

                /**
                 * Sets the value of the scorecardfield22 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setSCORECARDFIELD22(JAXBElement<String> value) {
                    this.scorecardfield22 = value;
                }

                /**
                 * Gets the value of the scorecardfield23 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getSCORECARDFIELD23() {
                    return scorecardfield23;
                }

                /**
                 * Sets the value of the scorecardfield23 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setSCORECARDFIELD23(JAXBElement<String> value) {
                    this.scorecardfield23 = value;
                }

                /**
                 * Gets the value of the scorecardfield24 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getSCORECARDFIELD24() {
                    return scorecardfield24;
                }

                /**
                 * Sets the value of the scorecardfield24 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setSCORECARDFIELD24(JAXBElement<String> value) {
                    this.scorecardfield24 = value;
                }

                /**
                 * Gets the value of the scorecardfield25 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getSCORECARDFIELD25() {
                    return scorecardfield25;
                }

                /**
                 * Sets the value of the scorecardfield25 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setSCORECARDFIELD25(JAXBElement<String> value) {
                    this.scorecardfield25 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SORTDECRSNCODE2 {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SORTDECRSNCODE3 {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SORTDECRSNCODE4 {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

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
             *       &lt;all>
             *         &lt;element name="I1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="I20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class SORTDECRSNCODE5 {

                @XmlElementRef(name = "I1", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i1;
                @XmlElementRef(name = "I2", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i2;
                @XmlElementRef(name = "I3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i3;
                @XmlElementRef(name = "I4", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i4;
                @XmlElementRef(name = "I5", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i5;
                @XmlElementRef(name = "I6", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i6;
                @XmlElementRef(name = "I7", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i7;
                @XmlElementRef(name = "I8", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i8;
                @XmlElementRef(name = "I9", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i9;
                @XmlElementRef(name = "I10", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i10;
                @XmlElementRef(name = "I11", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i11;
                @XmlElementRef(name = "I12", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i12;
                @XmlElementRef(name = "I13", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i13;
                @XmlElementRef(name = "I14", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i14;
                @XmlElementRef(name = "I15", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i15;
                @XmlElementRef(name = "I16", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i16;
                @XmlElementRef(name = "I17", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i17;
                @XmlElementRef(name = "I18", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i18;
                @XmlElementRef(name = "I19", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i19;
                @XmlElementRef(name = "I20", type = JAXBElement.class, required = false)
                protected JAXBElement<String> i20;

                /**
                 * Gets the value of the i1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI1() {
                    return i1;
                }

                /**
                 * Sets the value of the i1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI1(JAXBElement<String> value) {
                    this.i1 = value;
                }

                /**
                 * Gets the value of the i2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI2() {
                    return i2;
                }

                /**
                 * Sets the value of the i2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI2(JAXBElement<String> value) {
                    this.i2 = value;
                }

                /**
                 * Gets the value of the i3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI3() {
                    return i3;
                }

                /**
                 * Sets the value of the i3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI3(JAXBElement<String> value) {
                    this.i3 = value;
                }

                /**
                 * Gets the value of the i4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI4() {
                    return i4;
                }

                /**
                 * Sets the value of the i4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI4(JAXBElement<String> value) {
                    this.i4 = value;
                }

                /**
                 * Gets the value of the i5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI5() {
                    return i5;
                }

                /**
                 * Sets the value of the i5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI5(JAXBElement<String> value) {
                    this.i5 = value;
                }

                /**
                 * Gets the value of the i6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI6() {
                    return i6;
                }

                /**
                 * Sets the value of the i6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI6(JAXBElement<String> value) {
                    this.i6 = value;
                }

                /**
                 * Gets the value of the i7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI7() {
                    return i7;
                }

                /**
                 * Sets the value of the i7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI7(JAXBElement<String> value) {
                    this.i7 = value;
                }

                /**
                 * Gets the value of the i8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI8() {
                    return i8;
                }

                /**
                 * Sets the value of the i8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI8(JAXBElement<String> value) {
                    this.i8 = value;
                }

                /**
                 * Gets the value of the i9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI9() {
                    return i9;
                }

                /**
                 * Sets the value of the i9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI9(JAXBElement<String> value) {
                    this.i9 = value;
                }

                /**
                 * Gets the value of the i10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI10() {
                    return i10;
                }

                /**
                 * Sets the value of the i10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI10(JAXBElement<String> value) {
                    this.i10 = value;
                }

                /**
                 * Gets the value of the i11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI11() {
                    return i11;
                }

                /**
                 * Sets the value of the i11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI11(JAXBElement<String> value) {
                    this.i11 = value;
                }

                /**
                 * Gets the value of the i12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI12() {
                    return i12;
                }

                /**
                 * Sets the value of the i12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI12(JAXBElement<String> value) {
                    this.i12 = value;
                }

                /**
                 * Gets the value of the i13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI13() {
                    return i13;
                }

                /**
                 * Sets the value of the i13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI13(JAXBElement<String> value) {
                    this.i13 = value;
                }

                /**
                 * Gets the value of the i14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI14() {
                    return i14;
                }

                /**
                 * Sets the value of the i14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI14(JAXBElement<String> value) {
                    this.i14 = value;
                }

                /**
                 * Gets the value of the i15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI15() {
                    return i15;
                }

                /**
                 * Sets the value of the i15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI15(JAXBElement<String> value) {
                    this.i15 = value;
                }

                /**
                 * Gets the value of the i16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI16() {
                    return i16;
                }

                /**
                 * Sets the value of the i16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI16(JAXBElement<String> value) {
                    this.i16 = value;
                }

                /**
                 * Gets the value of the i17 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI17() {
                    return i17;
                }

                /**
                 * Sets the value of the i17 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI17(JAXBElement<String> value) {
                    this.i17 = value;
                }

                /**
                 * Gets the value of the i18 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI18() {
                    return i18;
                }

                /**
                 * Sets the value of the i18 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI18(JAXBElement<String> value) {
                    this.i18 = value;
                }

                /**
                 * Gets the value of the i19 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI19() {
                    return i19;
                }

                /**
                 * Sets the value of the i19 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI19(JAXBElement<String> value) {
                    this.i19 = value;
                }

                /**
                 * Gets the value of the i20 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public JAXBElement<String> getI20() {
                    return i20;
                }

                /**
                 * Sets the value of the i20 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *
                 */
                public void setI20(JAXBElement<String> value) {
                    this.i20 = value;
                }

            }

        }

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
     *       &lt;all>
     *         &lt;element name="TOTALMATCHSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="HUNTERSCORE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="HUNTERMATCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DECISION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DECISIONTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PERFREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MAXLOANAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LOANAMTAPP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ROI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="TENOR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="PROCFEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CHARGE1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MAXTenor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MAXEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DISBPERCENT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="DECRSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MINEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="MSGTXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ERROR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ERRORDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EXISTEMI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CNTADDMATCH" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="RAWHUNTER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FILLERFIELD4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="FILLERFIELD5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="CURRADD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PINCODE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="APPLNID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RAWDEDUPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FILLERFIELD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NONACHFLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class APPLICATIONOUT {

        @XmlElementRef(name = "TOTALMATCHSCORE", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> totalmatchscore;
        @XmlElementRef(name = "HUNTERSCORE", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> hunterscore;
        @XmlElementRef(name = "HUNTERMATCH", type = JAXBElement.class, required = false)
        protected JAXBElement<String> huntermatch;
        @XmlElementRef(name = "DECISION", type = JAXBElement.class, required = false)
        protected JAXBElement<String> decision;
        @XmlElementRef(name = "DECISIONTYPE", type = JAXBElement.class, required = false)
        protected JAXBElement<String> decisiontype;
        @XmlElementRef(name = "PERFREQ", type = JAXBElement.class, required = false)
        protected JAXBElement<String> perfreq;
        @XmlElementRef(name = "MAXLOANAMT", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> maxloanamt;
        @XmlElementRef(name = "LOANAMTAPP", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> loanamtapp;
        @XmlElementRef(name = "ROI", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> roi;
        @XmlElementRef(name = "TENOR", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tenor;
        @XmlElementRef(name = "PROCFEE", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> procfee;
        @XmlElementRef(name = "CHARGE1", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> charge1;
        @XmlElementRef(name = "MAXTenor", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> maxTenor;
        @XmlElementRef(name = "MAXEMI", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> maxemi;
        @XmlElementRef(name = "DISBPERCENT", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> disbpercent;
        @XmlElementRef(name = "DECRSN", type = JAXBElement.class, required = false)
        protected JAXBElement<String> decrsn;
        @XmlElementRef(name = "MINEMI", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> minemi;
        @XmlElementRef(name = "MSGTXT", type = JAXBElement.class, required = false)
        protected JAXBElement<String> msgtxt;
        @XmlElementRef(name = "ERROR", type = JAXBElement.class, required = false)
        protected JAXBElement<String> error;
        @XmlElementRef(name = "ERRORDESC", type = JAXBElement.class, required = false)
        protected JAXBElement<String> errordesc;
        @XmlElementRef(name = "EXISTEMI", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> existemi;
        @XmlElementRef(name = "CNTADDMATCH", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> cntaddmatch;
        @XmlElementRef(name = "RAWHUNTER", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> rawhunter;
        @XmlElementRef(name = "FILLERFIELD4", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fillerfield4;
        @XmlElementRef(name = "FILLERFIELD5", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> fillerfield5;
        @XmlElementRef(name = "CURRADD", type = JAXBElement.class, required = false)
        protected JAXBElement<String> curradd;
        @XmlElementRef(name = "PINCODE1", type = JAXBElement.class, required = false)
        protected JAXBElement<String> pincode1;
        @XmlElementRef(name = "APPLNID", type = JAXBElement.class, required = false)
        protected JAXBElement<String> applnid;
        @XmlElementRef(name = "RAWDEDUPE", type = JAXBElement.class, required = false)
        protected JAXBElement<String> rawdedupe;
        @XmlElementRef(name = "FILLERFIELD10", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fillerfield10;
        @XmlElementRef(name = "NONACHFLAG", type = JAXBElement.class, required = false)
        protected JAXBElement<String> nonachflag;

        /**
         * Gets the value of the totalmatchscore property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getTOTALMATCHSCORE() {
            return totalmatchscore;
        }

        /**
         * Sets the value of the totalmatchscore property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setTOTALMATCHSCORE(JAXBElement<BigDecimal> value) {
            this.totalmatchscore = value;
        }

        /**
         * Gets the value of the hunterscore property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getHUNTERSCORE() {
            return hunterscore;
        }

        /**
         * Sets the value of the hunterscore property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setHUNTERSCORE(JAXBElement<BigDecimal> value) {
            this.hunterscore = value;
        }

        /**
         * Gets the value of the huntermatch property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getHUNTERMATCH() {
            return huntermatch;
        }

        /**
         * Sets the value of the huntermatch property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setHUNTERMATCH(JAXBElement<String> value) {
            this.huntermatch = value;
        }

        /**
         * Gets the value of the decision property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getDECISION() {
            return decision;
        }

        /**
         * Sets the value of the decision property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setDECISION(JAXBElement<String> value) {
            this.decision = value;
        }

        /**
         * Gets the value of the decisiontype property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getDECISIONTYPE() {
            return decisiontype;
        }

        /**
         * Sets the value of the decisiontype property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setDECISIONTYPE(JAXBElement<String> value) {
            this.decisiontype = value;
        }

        /**
         * Gets the value of the perfreq property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getPERFREQ() {
            return perfreq;
        }

        /**
         * Sets the value of the perfreq property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setPERFREQ(JAXBElement<String> value) {
            this.perfreq = value;
        }

        /**
         * Gets the value of the maxloanamt property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getMAXLOANAMT() {
            return maxloanamt;
        }

        /**
         * Sets the value of the maxloanamt property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setMAXLOANAMT(JAXBElement<BigDecimal> value) {
            this.maxloanamt = value;
        }

        /**
         * Gets the value of the loanamtapp property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getLOANAMTAPP() {
            return loanamtapp;
        }

        /**
         * Sets the value of the loanamtapp property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setLOANAMTAPP(JAXBElement<BigDecimal> value) {
            this.loanamtapp = value;
        }

        /**
         * Gets the value of the roi property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getROI() {
            return roi;
        }

        /**
         * Sets the value of the roi property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setROI(JAXBElement<BigDecimal> value) {
            this.roi = value;
        }

        /**
         * Gets the value of the tenor property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getTENOR() {
            return tenor;
        }

        /**
         * Sets the value of the tenor property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setTENOR(JAXBElement<BigDecimal> value) {
            this.tenor = value;
        }

        /**
         * Gets the value of the procfee property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getPROCFEE() {
            return procfee;
        }

        /**
         * Sets the value of the procfee property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setPROCFEE(JAXBElement<BigDecimal> value) {
            this.procfee = value;
        }

        /**
         * Gets the value of the charge1 property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getCHARGE1() {
            return charge1;
        }

        /**
         * Sets the value of the charge1 property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setCHARGE1(JAXBElement<BigDecimal> value) {
            this.charge1 = value;
        }

        /**
         * Gets the value of the maxTenor property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getMAXTenor() {
            return maxTenor;
        }

        /**
         * Sets the value of the maxTenor property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setMAXTenor(JAXBElement<BigDecimal> value) {
            this.maxTenor = value;
        }

        /**
         * Gets the value of the maxemi property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getMAXEMI() {
            return maxemi;
        }

        /**
         * Sets the value of the maxemi property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setMAXEMI(JAXBElement<BigDecimal> value) {
            this.maxemi = value;
        }

        /**
         * Gets the value of the disbpercent property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getDISBPERCENT() {
            return disbpercent;
        }

        /**
         * Sets the value of the disbpercent property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setDISBPERCENT(JAXBElement<BigDecimal> value) {
            this.disbpercent = value;
        }

        /**
         * Gets the value of the decrsn property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getDECRSN() {
            return decrsn;
        }

        /**
         * Sets the value of the decrsn property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setDECRSN(JAXBElement<String> value) {
            this.decrsn = value;
        }

        /**
         * Gets the value of the minemi property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getMINEMI() {
            return minemi;
        }

        /**
         * Sets the value of the minemi property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setMINEMI(JAXBElement<BigDecimal> value) {
            this.minemi = value;
        }

        /**
         * Gets the value of the msgtxt property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getMSGTXT() {
            return msgtxt;
        }

        /**
         * Sets the value of the msgtxt property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setMSGTXT(JAXBElement<String> value) {
            this.msgtxt = value;
        }

        /**
         * Gets the value of the error property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getERROR() {
            return error;
        }

        /**
         * Sets the value of the error property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setERROR(JAXBElement<String> value) {
            this.error = value;
        }

        /**
         * Gets the value of the errordesc property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getERRORDESC() {
            return errordesc;
        }

        /**
         * Sets the value of the errordesc property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setERRORDESC(JAXBElement<String> value) {
            this.errordesc = value;
        }

        /**
         * Gets the value of the existemi property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getEXISTEMI() {
            return existemi;
        }

        /**
         * Sets the value of the existemi property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setEXISTEMI(JAXBElement<BigDecimal> value) {
            this.existemi = value;
        }

        /**
         * Gets the value of the cntaddmatch property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getCNTADDMATCH() {
            return cntaddmatch;
        }

        /**
         * Sets the value of the cntaddmatch property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setCNTADDMATCH(JAXBElement<BigDecimal> value) {
            this.cntaddmatch = value;
        }

        /**
         * Gets the value of the rawhunter property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getRAWHUNTER() {
            return rawhunter;
        }

        /**
         * Sets the value of the rawhunter property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setRAWHUNTER(JAXBElement<BigDecimal> value) {
            this.rawhunter = value;
        }

        /**
         * Gets the value of the fillerfield4 property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getFILLERFIELD4() {
            return fillerfield4;
        }

        /**
         * Sets the value of the fillerfield4 property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setFILLERFIELD4(JAXBElement<BigDecimal> value) {
            this.fillerfield4 = value;
        }

        /**
         * Gets the value of the fillerfield5 property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public JAXBElement<BigDecimal> getFILLERFIELD5() {
            return fillerfield5;
        }

        /**
         * Sets the value of the fillerfield5 property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *
         */
        public void setFILLERFIELD5(JAXBElement<BigDecimal> value) {
            this.fillerfield5 = value;
        }

        /**
         * Gets the value of the curradd property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getCURRADD() {
            return curradd;
        }

        /**
         * Sets the value of the curradd property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setCURRADD(JAXBElement<String> value) {
            this.curradd = value;
        }

        /**
         * Gets the value of the pincode1 property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getPINCODE1() {
            return pincode1;
        }

        /**
         * Sets the value of the pincode1 property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setPINCODE1(JAXBElement<String> value) {
            this.pincode1 = value;
        }

        /**
         * Gets the value of the applnid property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getAPPLNID() {
            return applnid;
        }

        /**
         * Sets the value of the applnid property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setAPPLNID(JAXBElement<String> value) {
            this.applnid = value;
        }

        /**
         * Gets the value of the rawdedupe property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getRAWDEDUPE() {
            return rawdedupe;
        }

        /**
         * Sets the value of the rawdedupe property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setRAWDEDUPE(JAXBElement<String> value) {
            this.rawdedupe = value;
        }

        /**
         * Gets the value of the fillerfield10 property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getFILLERFIELD10() {
            return fillerfield10;
        }

        /**
         * Sets the value of the fillerfield10 property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setFILLERFIELD10(JAXBElement<String> value) {
            this.fillerfield10 = value;
        }

        /**
         * Gets the value of the nonachflag property.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getNONACHFLAG() {
            return nonachflag;
        }

        /**
         * Sets the value of the nonachflag property.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setNONACHFLAG(JAXBElement<String> value) {
            this.nonachflag = value;
        }

    }

}
