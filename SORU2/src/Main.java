
public class Main {

	public static void main(String[] args) {
		Dizi dizi = new Dizi();

		dizi.ekle(9);
		dizi.ekle(3);
		dizi.listele();
		System.out.println("---");
		dizi.ekle(1);
		dizi.ekle(3);
		dizi.listele();
		System.out.println("----");
		dizi.sil(3);
		dizi.listele();
		System.out.println("----");

		dizi.arayaEkle(2, 2);
		dizi.listele();

	}

}
