
public class MainClass {
		public static void main(String[] args) {
		
		// Abstract ( soyut ) 
		// Ortak özelliklere ve metodllara sahip alt sınıflar için tek bir yerde
		// o metodları ve özellikleri soyut bir şekilde tutan şablondur.
		// Metotların sadece imzası vardır , body kısımları yoktur.
		// Bir sınıfın içerisinde en az bir tane absctract metod var ise o sınıfın absctract olarak tanımlanması gerekir
		// Abstract bir sınıf içerisinde abstract olan , olmayan metodlar bulunabilir.
		// Çalışma mantıkları interface ile benzer , 
		// Farkları birisi soyutlama yapılan bir sınıf iken , diğeri soyutlama yapılan bir yapıdır
		// Bir sınıf birden fazla interface impplement ederken , sadece tek bir soyut sınıfı miras alabilir.
		// Faydaları ise koda esneklik sağlaması , bakımın kolay olması , hataların çabuk tespiti.
		
			
			
		Ucgen ucgen = new Ucgen(15, 5, 5);
		ucgen.alanHesapla();
		ucgen.cevreHesapla();
		
		Dikdortgen dikdortgen = new Dikdortgen(15.5,20.2);
		
		dikdortgen.alanHesapla();
		dikdortgen.cevreHesapla();
		
		// Abstract bir sınıftan nesne oluşturamayız , hata alırım
		
	// 	GeometrikSekil geometrikSekil = new GeometrikSekil() ;
			
		}
}		

