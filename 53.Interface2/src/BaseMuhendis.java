
public class BaseMuhendis {

private String isim;

private String soyisim;

private double tecrube;

private  double maas;

private String askerlikDurum;

private String [] diller; // String veri tipinde ismi diller olan bir dizi oluşturdum.

public BaseMuhendis() {
}



public BaseMuhendis(String isim, String soyisim, double tecrube, double maas, String askerlikDurum) {
	this.isim = isim;
	this.soyisim = soyisim;
	this.tecrube = tecrube;
	this.maas = maas;
	this.askerlikDurum = askerlikDurum;
}



public String getIsim() {
	return isim;
}

public void setIsim(String isim) {
	this.isim = isim;
}

public String getSoyisim() {
	return soyisim;
}

public void setSoyisim(String soyisim) {
	this.soyisim = soyisim;
}

public double getTecrube() {
	return tecrube;
}

public void setTecrube(double tecrube) {
	this.tecrube = tecrube;
}

public double getMaas() {
	return maas;
}

public void setMaas(double maas) {
	this.maas = maas;
}

public String getAskerlikDurum() {
	return askerlikDurum;
}

public void setAskerlikDurum(String askerlikDurum) {
	this.askerlikDurum = askerlikDurum;
}



public String[] getDiller() {
	return diller;
}



public void setDiller(String[] diller) {
	this.diller = diller;
}



}
