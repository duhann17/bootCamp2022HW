package loopDemo;

public class loopdemo {
 
	   public static void main (String[] args ) {
		   
		   for(int i=2;i<10 ; i+=2) {
			   
			   System.out.print(i);
			   
		   }
		   System.out.print("For Döngüsü Bitti");
		   
		   int i=2;
		   //While   		   
		   
		   while(i<10) {
			   System.out.print(i);
			   i+=2;
		   }
		   System.out.print("While Döngüsü Bitti");
		   
		   //Do-While
		    int j=1;
		    do{
		        System.out.println(j);
		        j+=2;
		        }while(j<10);
		    System.out.print("Do-While Döngüsü Bitti");
	   }
}
