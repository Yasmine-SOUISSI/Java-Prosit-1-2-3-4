/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Date;

/**
 *
 * @author ASUS TUF GAMMING
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Chemise produit1 = new Chemise();
        Chemise produit2 = new Chemise(1021, "Lait", "Delice");
        Chemise produit3 = new Chemise(2510, "yaourt", "Vitalait");
        Chemise produit4 = new Chemise(3250, "Tomate", "Sicam", 1.200f);
        Chemise produit44 = new Chemise(3250, "Tomate", "Sicam", 1.200f);

//        produit2.afficher();
//        
        produit2.setPrix(0.7f);
//        
//        produit2.afficher();
//        
//        System.out.println( produit2.toString());
//        System.out.println(produit2);
//        
//        produit2.affecterDateExpiration(new Date(1377249026));
//        System.out.println(produit2.dateExpriration.toString());

//---------------------------------------
        Magasin m1 = new Magasin(12345, "El Aouina");
//        System.out.println(m1);

        m1.ajouter(produit1);
        m1.ajouter(produit2);
        m1.ajouter(produit3);
        m1.ajouter(produit4);
        // m1.ajouterProduit(produit44);

//        System.out.println(m1);
//        
//        System.out.println("Total des Produits  " + m1.getTotalProduits() );
//---------------------------------------
//        System.out.println(produit44.comparer(produit4));
//        
//        System.out.println(Magasin.comparer(produit4,produit2));
//        
        m1.supprimerProduit(new Chemise(98798, "qsd", "qsd"));
        System.out.println(m1);

        //---------------------------
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah6");

        Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);

        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
            System.out.println("SALAIRE :"+responsableM1.getSalaireEmploye());
        monoprix.ajouter(caissierC1);
        monoprix.ajouter(caissierC2);
        monoprix.ajouter(vendeurC1);
        monoprix.ajouter(responsableC1);

        carrefour.ajouter(caissierM1);
        carrefour.ajouter(vendeurM1);
        carrefour.ajouter(responsableM1);
//        System.out.println("-------------");
//        monoprix.afficherEmployes();
//        System.out.println("-------------");
//        carrefour.afficherEmployes();

        monoprix.ajouter(produit2);
        monoprix.ajouter(produit3);
        carrefour.ajouter(produit3);
        carrefour.ajouter(produit4);
        System.out.println("-------------");
        System.out.println(monoprix);
        System.out.println("-------------");
        System.out.println(carrefour);

    }

}




        
    
    
}
