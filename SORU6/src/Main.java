import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insan insan = new Insan();
		insan.isim = "ihsan";
		insan.cinsiyet = "erkek";

		String dosyaAdi = "Log.log";
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dosyaAdi));

			oos.writeObject(insan);
			oos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Hata oldu" + e.getMessage());
		} catch (NullPointerException e) {
			Log log = new Log(e.toString(), "Main", "main", System.currentTimeMillis(), "NULL deger hatasi");
		}
		System.out.println("yazma bitti");

	}

}
