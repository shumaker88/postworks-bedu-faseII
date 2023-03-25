package org.bedu.java.backend.e5.service;

import org.springframework.stereotype.Service;

@Service
public class PhoneValidator {

    public boolean isValid(String param) {
        String regex = "^([0-9]{2,4}[-\\s.]?){2}[0-9]{4}$";
        return param.matches(regex);
    }

    public String cleanNumber(String phoneNumber) {
        return phoneNumber.replaceAll("[^\\d]", "");
    }
}
