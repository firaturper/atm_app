import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 5000;
		String islemler="1. İşlem Bakiye Öğren\n"
				      + "2. İşlem Para Çekme\n"
				      + "3. İşlem Para Ekleme\n"
				      + "Çıkış İçin 'q'ya Basın";
		System.out.println(islemler);
		System.out.println("---------------------------");
				
		while(true){
			
			System.out.println("İşlem Seçiniz");
			String islem = scan.nextLine();
			 	if(islem.equals("q")) {
			 		
			 		System.out.println("Sistemden Çıkılıyor...");
			 		
			 		break;
			 		
			 	}else if(islem.equals("1")) {
			 		
			 		System.out.println("Bakiyeniz: "+bakiye);
			 		
			 		
			 		
			 	}else if(islem.equals("2")) {
			 		
			 		System.out.println("Çekmek İstediğiniz Parayı Giriniz: ");
			 		
			 		int cek = scan.nextInt();
			 		
			 		scan.nextLine();
			 		
			 		if(bakiye >= cek) {bakiye=bakiye-cek; 
			 						System.out.println("Kalan Bakiye: "+bakiye);}
			 		else if(bakiye<cek) {System.out.println("Yanlış Giriş Yaptınız...");}
			 		
			 		
			 		
			 	}else if(islem.equals("3")) {
			 		System.out.println("Kaç Para Ekleyeceksiniz: ");
			 		
			 		int ekle = scan.nextInt();
			 		
			 		bakiye = bakiye + ekle;
			 		
			 		System.out.println("Kalan Bakiyeniz: "+bakiye);
			 		
			 		
			 	}else {
			 		
			 		System.out.println("Yanlış Bir İşlem Girdiniz...");
			 		
			 		
			 	} 
			
		}

	}

}
