package GG;
import org.testng.annotations.Test;

public class GetPropertyTestR {
	
	@Test
	public void getProp() {
	
	System.out.println("Reading Data");
	
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	
}
	
}
