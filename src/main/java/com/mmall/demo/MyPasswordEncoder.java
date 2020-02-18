package com.mmall.demo;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

   /* private final static String SALT = "123456";
    @Override
    public String encode(CharSequence charSequence) {
        MD5PasswordEncoder encoder= new  MD5PasswordEncoder();
        return encoder.encoderPassword(charSequence,SALT);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        MD5PasswordEncoder encoder= new  MD5PasswordEncoder();
        return encoder.isPasswordValid(s,charSequence.toString(),SALT);
    }*/
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
