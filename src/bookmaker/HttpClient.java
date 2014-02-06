/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookmaker;

import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;


/**
 *
 * @author vitaliy
 */
public class HttpClient implements org.apache.http.client.HttpClient {

    @Override
    public HttpParams getParams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClientConnectionManager getConnectionManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HttpResponse execute(HttpUriRequest hur) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HttpResponse execute(HttpUriRequest hur, HttpContext hc) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HttpResponse execute(HttpHost hh, HttpRequest hr) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HttpResponse execute(HttpHost hh, HttpRequest hr, HttpContext hc) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T execute(HttpUriRequest hur, ResponseHandler<? extends T> rh) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T execute(HttpUriRequest hur, ResponseHandler<? extends T> rh, HttpContext hc) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T execute(HttpHost hh, HttpRequest hr, ResponseHandler<? extends T> rh) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T execute(HttpHost hh, HttpRequest hr, ResponseHandler<? extends T> rh, HttpContext hc) throws IOException, ClientProtocolException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
