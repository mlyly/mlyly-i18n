package fi.zcode.i18n.service.impl;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mlyly
 */
@XmlRootElement
public class TranslationRDTO {

    private String key;
    private String locale;
    private String value;
    private String comment;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TranslationRDTO[");
        sb.append("key=");
        sb.append(getKey());
        sb.append(", locale=");
        sb.append(getLocale());
        sb.append(", value=");
        sb.append(getValue());
        sb.append(", comment=");
        sb.append(getComment());
        sb.append("]");

        return sb.toString();
    }




    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
