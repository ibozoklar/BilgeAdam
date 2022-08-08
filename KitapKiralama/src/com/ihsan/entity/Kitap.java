package com.ihsan.entity;

import java.util.List;
import java.util.UUID;

public class Kitap {

	private String isim;
	private String yazar;
	private String id;
	private int kiralanmaSayisi;
	private boolean musaitMi = true;
	private List<Musteri> kiralayanMusteriler;
	private Musteri suAnKimde;

	public Musteri getSuAnKimde() {
		return suAnKimde;
	}

	public void setSuAnKimde(Musteri suAnKimde) {
		this.suAnKimde = suAnKimde;
	}

	public void kiralayanMusteriEkle(Musteri musteri) {

		kiralayanMusteriler.add(musteri);
	}

	public List<Musteri> getKiralayanMusteriler() {
		return kiralayanMusteriler;
	}

	public void setKiralayanMusteriler(List<Musteri> kiralayanMusteriler) {
		this.kiralayanMusteriler = kiralayanMusteriler;
	}

	public Kitap() {

	}

	public Kitap(String isim, String yazar) {
		super();
		this.isim = isim;
		this.yazar = yazar;
		this.id = UUID.randomUUID().toString();

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getId() {
		return id;
	}

	public int getKiralanmaSayisi() {
		return kiralanmaSayisi;
	}

	public void setKiralanmaSayisi(int kiralanmaSayisi) {
		this.kiralanmaSayisi = kiralanmaSayisi;
	}

	public boolean isMusaitMi() {
		return musaitMi;
	}

	public void setMusaitMi(boolean musaitMi) {
		this.musaitMi = musaitMi;
	}

	@Override
	public String toString() {
		return "Kitap [isim=" + isim + ", yazar=" + yazar + "]";
	}

}
