package week1.day2;

public class launchBrowser {

public void launchBrowser(String browserName)
{     System.out.println( browserName); 
	}
 
public String loadUrl()
{ 
	return "Url loaded successfully";
	}

public static void main (String args[])
{
	launchBrowser lb = new launchBrowser();
	lb.launchBrowser("chrome");
	String url = lb.loadUrl();
	System.out.println(url);
	
	}



}
