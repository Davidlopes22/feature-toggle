package com.mentoria.featuretoggle.infrastructure.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SecretKey {
    private static final  String KEY = "abc";
    public static SecretKeySpec convertStringToSecretKeyto() {
        byte[] decodedKey = Base64.getDecoder().decode(KEY);
        return  new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
    }

}
