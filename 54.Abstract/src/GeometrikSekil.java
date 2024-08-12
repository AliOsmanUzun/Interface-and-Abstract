
public abstract class GeometrikSekil { // erişim belirleyicisinden sonra abstract kelimesini kullanıyorum.
	
	protected String sekilIsim; // abstract sınıf içerisinde abstract olmayan özellikler ve metodlarda tanımlanabilir.
	
// Abstract ile bu sınıfımın soyut metodları ve özellikleri barındıran bir sınıf olduğunu belirtmiş oldum.

// Alt sınıfların ortak metodlarını ve özelliklerini içerisinde soyut bir şekilde barındıran şablon class'dır.
// Metodların ne yaptığı tanımlanır kısaca ne yapacağı değil.
public abstract void  alanHesapla();

public abstract void cevreHesapla();

// Bir sınıf içerisinde en az 1 abstract metod var ise o sınıfta abstract olmak zorundadır.

}
