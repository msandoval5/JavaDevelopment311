//package ;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonReader 
{
    public static void main( String[] args )
    {
    	JSONParser parser = new JSONParser();
    	try {
    		Object obj = parser.parse(new FileReader("C:\\Users\\Uriel\\eclipse-workspace\\2\\src\\main\\java\\settings.json"));
    		
    		JSONObject jsonObject = (JSONObject) obj;
    		String baseUrl = (String) jsonObject.get("BaseUrl");
    		String browserTarget = (String) jsonObject.get("BrowserTarget");
    		
    		System.out.println("Base Url: " + baseUrl);
    		System.out.println("Browser Target: " + browserTarget);		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }
}
