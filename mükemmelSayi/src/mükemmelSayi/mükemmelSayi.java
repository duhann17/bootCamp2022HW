package mükemmelSayi;

public class mükemmelSayi {

	public static void main(String[] args) {
		//6 -->1,2,3
		//28-->1,2,4,7,14
		int number = 28;
		int toplam = 0;
		
		for(int i=1; i<number; i++) { 
			if(number % i ==0) { 
				toplam = toplam +i ;
			
			}
		} 
			if(toplam == number) { 
				System.out.println("Mükemmel sayıdır.");
				
			} else {
		       System.out.println("Mükemmel sayı değildir.");
		

	}

}
}
