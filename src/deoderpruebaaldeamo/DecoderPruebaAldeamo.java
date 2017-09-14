/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deoderpruebaaldeamo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cortiz
 */
public class DecoderPruebaAldeamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String encoded = "aHR0cHM6Ly9kb2NzLmdvb2dsZS5jb20vYS9hbGRlYW1vLmNvbS9kb2N1bWVudC9kLzFWV1oxN3QwdWNIUzIteXNyeTFVREhHYjBiVFExRS1HV0ZNRGZHQUZFYUV3L2VkaXQ/dXNwPXNoYXJpbmc=";
        byte[] decoded = Base64.getDecoder().decode(encoded);
        try {
            System.out.println(new String(decoded, "UTF-8"));

        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(DecoderPruebaAldeamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
