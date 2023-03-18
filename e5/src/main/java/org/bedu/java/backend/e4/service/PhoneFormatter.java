package org.bedu.java.backend.e4.service;

import org.springframework.stereotype.Service;

@Service
public class PhoneFormatter {
    private static final String INITIAL_FORMAT = "(\\d{2})(\\d{4})(\\d+)";
    private static final String FINAL_FORMAT = "($1)-$2-$3";

    public String getFormat(String telefono) {
        return telefono.replaceFirst(INITIAL_FORMAT, FINAL_FORMAT);
    }
}
