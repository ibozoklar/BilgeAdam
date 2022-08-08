import java.io.Serializable;

public class Insan implements Serializable {

	public String isim;
	public int yas;
	public String cinsiyet;
	public String uyruk;

	@Override
	public String toString() {
		return "Insan [isim=" + isim + ", yas=" + yas + ", cinsiyet=" + cinsiyet + ", uyruk=" + uyruk + "]";
	}

}
