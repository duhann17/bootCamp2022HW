package name;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmelerine java'da camelCase yazılır.
		String ortaMetin ="İlginizi Çekebilir";
		String altMetin ="Vade Süresi";
		
		System.out.println(ortaMetin);
		
		// integer
		int vade = 12;
		
		//ondalık = double
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = ""; 
		
		if (dolarBugun<dolarDun) { //false
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
			//array 
		
	       String[] krediler = {"Hızlı Kredi", "Maaşını Halkbantan","Mutlu Emekli",};
	       

	       
	       for (int i = 0; i < krediler.length; i++) {
	    	   System.out.println(krediler[i]);
			
		}

		}
		
		

	}


