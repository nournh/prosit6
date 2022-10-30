/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MG {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
		Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");

		ProduitFruit prod1 = null;
		try {
			prod1 = new ProduitFruit(12.3f, "mars", 1254, "Fraise", "", 10);
		} catch (PrixNegatifException ex) {

		}
		ProduitFruit prod2 = null;
		try {
			prod2 = new ProduitFruit(50f, "juin", 1224, "Pastèque", "", 0);
		} catch (PrixNegatifException ex) {
			System.out.println("");
		}
		ProduitFruit prod3 = null;
		try {
			prod3 = new ProduitFruit(25.6f, "décembre", 7896, "Mandarine", "", 0);
		} catch (PrixNegatifException ex) {

		}

		ProduitLegume prod4 = null;

		try {
			prod4 = new ProduitLegume(14f, "janvier", 8521, "Artichauts", "", 0);
		} catch (PrixNegatifException ex) {

		}

		try {
			carrefour.ajouterProduit(prod1);
			carrefour.ajouterProduit(prod2);
			carrefour.ajouterProduit(prod3);
			carrefour.ajouterProduit(prod4);
		} catch (MagasinPleinException ex) {
			System.out.println("une exception  a été levé");
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}

		System.out.println("LE PRODUIT EST FRAIS : " + prod4.estFrais("février"));

		System.out.println("LE TOTAL DES FRUITS :" + carrefour.calculStock());

	}
}
