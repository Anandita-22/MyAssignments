package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
     int n1=0;
     int n2=1;
     
     System.out.print(n1 +" "+ n2);
     for (int i=3;i<=10; i++ )
     {
    	 int n3=n1+n2;
    	  System.out.print(" "+ n3); 
    	  
    	  n1=n2;
    	  n2=n3;
    }

	}

}
