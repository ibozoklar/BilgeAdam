package com.ihsan;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static CRUD crud = new CRUD("etrade3");

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		kızErkekSayisi();
		herOyuncaginSayisi();

	}

	public static void herOyuncaginSayisi() {

		try {
			ResultSet rs = crud.findAll(
					"select itemname, count(id) from items group by itemname having itemname ilike '%oyuncak%'");
			System.out.println("  count          itemname");
			System.out.println("---------------------------------------------------");
			while (rs.next()) {
				String itemname = rs.getString("itemname");
				int miktar = rs.getInt("count");
				System.out.println("  " + miktar + "              " + itemname);
				System.out.println("----------------------------------------------------");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void kızErkekSayisi() {
		try {
			ResultSet rs = crud.findAll("select gender, count(id) from users group by gender");
			System.out.println("  Gender     Count");
			System.out.println("---------------------");
			while (rs.next()) {
				String cinsiyet = rs.getString("gender");
				int miktar = rs.getInt("count");
				System.out.println("    " + cinsiyet + "         " + miktar);
				System.out.println("---------------------");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}