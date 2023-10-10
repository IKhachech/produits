package com.imen.produits.produits.service.copy;


import java.util.List;


import com.imen.produits.entities.Categorie;
import com.imen.produits.entities.Produit;


public interface ProduitService {
		Produit saveProduit(Produit p);
		Produit updateProduit(Produit p);
		
		void deleteProduit(Produit p);
		void deleteProduitById(Long id);
		
		Produit getProduit(Long id);
		List<Produit> getAllProduits();
		
		
		List<Produit> findByNomProduit(String nom);
		List<Produit> findByNomProduitContains(String nom);
		List<Produit> findByNomPrix (String nom, Double prix);
		List<Produit> findByCategorie (Categorie categorie);
		List<Produit> findByCategorieIdCat(Long id);
		List<Produit> findByOrderByNomProduitAsc();
		List<Produit> trierProduitsNomsPrix();
	}
