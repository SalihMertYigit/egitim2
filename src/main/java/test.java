
public class test {

	public static void main(String[] args) {
		ogrenci ogrenci1 = new ogrenci();
		ogrenci1.id=1;
		ogrenci1.isim="isim";
		ogrenci1.soyisim="soyisim";
		ogrenci1.bilgileriYazdır();
		ogrenci1.setYas(10);
		System.out.println("ogrencinin yası : "+ ogrenci1.getYas());
	}

}
