
public class MainClass {

	
	public static void main(String[] args) {
		
		// Bir diziye değer girmek için constructor veya metod içerisinde yeni bir dizi üreterek
		// body kısmı ile veri girebilirim

BilgisayarMuhendisi bilgisayarMuhendisi = 
 								new BilgisayarMuhendisi("Ali Osman", "Uzun", 1.5,22.500,new String[] {"Java","HTML","CSS"});

MakineMuhendisi makineMuhendisi =
								new MakineMuhendisi("Necdet","Yılmaz",2.5,30.000,new String[] {"Pyhton","Java","MSSQL","Javascript"});


// Ben objemi bulunduğu class ile yakalamak yerine , implements ettiği ınterface ile yakalayabilir ve obje tanımlayabilirim
// Objemi yakaladığım ınterface , onu türettiğim class'ın tüm özelliklerine sahip olur , aynı onun gibi davranır.

IMuhendis bilgisayarMuhendisi1 = new BilgisayarMuhendisi("Tarık","Çelik",8.5,60.000,new String[] {"Ruby","C","C++"} );

// Referans değişkenimin birden fazla tipi olabilir --> 1. Nesnenin türetildiği sınıf ,
													  //2. Nesnemin türetileceği sınıfın implements ettiği Interface
// Interface tipli referans değişkeni ile nesne oluşturmak programın daha esnek ve bakımının kolay olmasını sağlar.

	System.out.println("Bilgisayar Mühendisi\n");
	muhendisBilgileriYazdir(bilgisayarMuhendisi);
	System.out.println("\n\n");
	System.out.println("Makine Mühendisi\n");
	muhendisBilgileriYazdir(makineMuhendisi);
	System.out.println("Bilgisayar Mühendisi\n");
	System.out.println("\n\n");
	muhendisBilgileriYazdir(bilgisayarMuhendisi1);



	}
	// böyle uzun uzun yazmak yerine bu işlemi tek metoda indirip tek metod üzerinden bütün işlemleri
	// daha pratik ve hızlı şekilde yapabilirim ınterface şablonumu kullanarak
	// Polimorfizm: Bu yapı, polimorfizm adı verilen OOP kavramının bir örneğidir. 
	// Bir metod, interface tipli bir parametre alarak farklı türdeki nesneleri aynı metod ile işleyebilir.
	
	public static void muhendisBilgileriYazdir(IMuhendis muhendis) { // Imuhendis tipli muhendis parametrem
		muhendis.askerlikYapildiMi(true); // nesnelerimi Interface tipli şekilde bir parametre olarak aldım
		muhendis.bilgileriYazdir();		  // muhendis parametrem ilede onların metodlarına ulaştım
		// Bir nesneyi parametre olarak almak için sınıf adı ile parametre olarak alıyorduk.
		// Nesnelerim birden fazla olabileceği için teker teker sınıf adı ile ayrı metodlara parametre almak yerine 
		// Implements ettikleri interface'ın adı ile hepsini ortak bir metod ile alabiliyorum.
		
		
	}
	
	/*public static void muhendisBilgileriYazdir(BilgisayarMuhendisi bilgisayarMuhendisi) { 
												  // nesnelerimi parametre olarak kullandım , // veri tipleride türetildiği class'lar oldu
		bilgisayarMuhendisi.askerlikYapildiMi(true); // parametre olarak aldığın nesnemin sahip olduğu metodu çağır.	
		bilgisayarMuhendisi.bilgileriYazdir();	     
	}

	public static void muhendisBilgileriYazdir(MakineMuhendisi makineMuhendisi) {
		makineMuhendisi.askerlikYapildiMi(false);
		makineMuhendisi.bilgileriYazdir();
		
	}*/  
	
}
