/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookmaker;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitaliy
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        org.apache.http.impl.client.CloseableHttpClient httpclient
            = org.apache.http.impl.client.HttpClients.createDefault();
        org.apache.http.client.methods.HttpGet httpget
            = new org.apache.http.client.methods.HttpGet();
        try {
            httpget.setURI(
                    new java.net.URI("http://myscore.ru")
            );
        } catch (URISyntaxException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        org.apache.http.client.methods.CloseableHttpResponse response;
        try {
            response = httpclient.execute(httpget);
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            response = new org.apache.http.client.methods;
        }
        System.out.println(response.toString());
    }
    
}
