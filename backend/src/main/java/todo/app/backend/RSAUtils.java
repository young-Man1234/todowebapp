package todo.app.backend;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class RSAUtils {

    private KeyPairGenerator generator;
    private KeyFactory keyFactory;
    private KeyPair keyPair;
    private Cipher cipher;

    public RSAUtils() throws NoSuchAlgorithmException, NoSuchPaddingException {
        generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        keyFactory = KeyFactory.getInstance("RSA");
        cipher = Cipher.getInstance("RSA");
    }


}
