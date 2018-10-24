package org.apache.commons.digester;

import com.veracode.annotation.CRLFCleanser;

import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;
import static org.apache.commons.lang3.StringEscapeUtils.escapeJava;

public class StringUtils {

    /**
     * Escapes the string to avoid log forgery or injecting malicious content. Java and HTML special
     * symbols are escaped. We need to escape HTML cause ReadyAPI logs can be opened in web browsers.
     * <p>
     * Related CWEs: 93, 113, 117.
     */
    @CRLFCleanser
    public static String escapeString(String value) {
        return escapeHtml4(escapeJava(value));
    }
}
