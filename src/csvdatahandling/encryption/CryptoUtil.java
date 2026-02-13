package csvdatahandling.encryption;

import java.util.Base64;

public class CryptoUtil {

    // Encrypt
    public static String encrypt(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    // Decrypt
    public static String decrypt(String encryptedData) {
        return new String(Base64.getDecoder().decode(encryptedData));
    }
}
