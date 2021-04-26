package me.doundeway.future;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class grabber {
	
    public String IPgrab() throws IOException {
    	//Get ip 
    	URL ip = new URL("http://checkip.amazonaws.com");
    	BufferedReader reader = new BufferedReader(new InputStreamReader(ip.openStream()));
    	String final_ip = reader.readLine();
    	return final_ip;
    }
}
