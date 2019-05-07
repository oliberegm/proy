package ve.com.olibersystem.ia.iacomerce.etoro;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ManagerTransaction {
	
	public void consultarTransacciones() throws URISyntaxException, ClientProtocolException, IOException {
		// https://api.etorostatic.com/sapi/instrumentsmetadata/V1.1/instruments?cv=e338281e435975a47483279a4ed21e09_d2d679188ebffc144cb5752f40672d27
		CloseableHttpClient httpclient = HttpClients.createDefault();		
		URI uri = new URIBuilder()
	            .setScheme("https")
	            .setHost("api.etorostatic.com")
	            .setPath("/sapi/instrumentsmetadata/V1.1/instruments")
	            .setParameter("cv", "e338281e435975a47483279a4ed21e09_d2d679188ebffc144cb5752f40672d27")
	            //.setParameter("client_request_id", "875a0b0b-9f32-4563-8f2b-2836c605059c")
	            .build();
		//=,Rates&client_request_id=875a0b0b-9f32-4563-8f2b-2836c605059c
	    HttpGet httpget = new HttpGet(uri);
	    
	    HttpResponse response = httpclient.execute(httpget);
	    
	    String responseString = new BasicResponseHandler().handleResponse(response);
	    System.out.println(responseString.indexOf("BTC"));
	    System.out.println(responseString);
	}
	
	public void login() {
		HttpClient httpclient = HttpClients.createDefault();

        try
        {
            URIBuilder builder = new URIBuilder("https://api.etoro.com/API/Trading/V1/Account/Login");


            URI uri = builder.build();
            HttpPost request = new HttpPost(uri);
            request.setHeader("Ocp-Apim-Subscription-Key", "{subscription key}");


            // Request body
            StringEntity reqEntity = new StringEntity("{body}");
            request.setEntity(reqEntity);

            HttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) 
            {
                System.out.println(EntityUtils.toString(entity));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}

}
