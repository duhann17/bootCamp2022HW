package methods;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranıcak = 3;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranıcak) {
				varMi = true;
				break;
			}
		}
		String mesaj =" ";
		if (varMi) {
			
			mesaj="Sayı mevcuttur: " + aranıcak;
			mesajVer(mesaj);

		} else {
			mesajVer("Sayı mevcut değildir: " + aranıcak);

		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	
	}
	

}
