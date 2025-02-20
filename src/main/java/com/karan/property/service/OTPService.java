package com.karan.property.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OTPService {

    private final Map<String, String> otpData = new HashMap<>();
    private final Map<String, Long> otpExpiry = new HashMap<>();
    private static final long OTP_VALIDITY_PERIOD = 5 * 60 * 1000; // 5 minutes

    public String generateOTP(String mail) {
        if(!otpData.containsKey(mail)){
            String otp = String.valueOf((int) (Math.random() * 9000) + 1000); // Generate 4-digit OTP
            otpData.put(mail, otp);
            otpExpiry.put(mail, System.currentTimeMillis() + OTP_VALIDITY_PERIOD);
            return otp;
        }
        return "Use generated OTP for next five minutes..";

    }

    public boolean validateOTP(String mail, String otp) {
        if (!otpData.containsKey(mail)) return false;

        // Check OTP validity and expiration
        String validOtp = otpData.get(mail);
        long expiryTime = otpExpiry.get(mail);

        if (System.currentTimeMillis() > expiryTime) {
            otpData.remove(mail); // Expire OTP
            otpExpiry.remove(mail);
            return false;
        }

        return validOtp.equals(otp);
    }
}
