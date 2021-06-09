
package midpuri.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DAarray.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DAarray">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xs:array"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DAarray")
@XmlEnum
public enum DAarray {

    @XmlEnumValue("xs:array")
    XS_ARRAY("xs:array");
    private final String value;

    DAarray(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DAarray fromValue(String v) {
        for (DAarray c: DAarray.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
