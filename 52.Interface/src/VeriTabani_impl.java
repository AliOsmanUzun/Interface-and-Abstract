
public class VeriTabani_impl implements VeriTabani , Interface2 {
	
	// Bir sınıf birden fazla ınterface'i implements edebilir.
	
	@Override
	public void cikis() { // Diğer interface'imi implements ederek cikis metodunu override ettim.
		
	}
	
	@Override
	public void ekle() {
		// implements ettiğim metodu burada içeriğini sıfırdan tanımlıyorum
		System.out.println("Kullanıcı ismi alınıyor");
	}

	@Override
	public void sil() {
		
	}

	@Override
	public void guncelle() {
		
	}

	@Override
	public void getir() {
		
	}
	
	
	
}
