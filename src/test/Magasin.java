/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ASUS TUF GAMMING
 */
public class Magasin {
    int identifiant;
    String adresse;
    int capacite;
    String nom;
    int nbEmploye;
    /*Esemble de produit */
    Chemise[] produits;
    // Ensemble d'employe
    Employe[] employes = new Employe[20];    
    
    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new Chemise[50];
    };
       public Magasin(int identifiant,String nom,String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.nom=nom;
        this.produits = new Chemise[50];
    };
    
   @Override
    public String toString(){
        String s ="";
        s+= "identifiant : "+ this.identifiant +" \n";
        s+= "adresse : "+ this.adresse +" \n";
        s+= "capacite : "+ this.capacite +" \n";
       
        
        String prods = "";
        for ( int i=0; i<this.capacite;i++){
            prods+=this.produits[i];
        }
         String employes = "";
        for ( int i=0; i<this.nbEmploye;i++){
            employes+=this.employes[i];
        }
        
        return s+prods+employes;
    }
    
    public void ajouter(Chemise produit ){
        if(chercher(produit)){
            System.out.println("Produit existant");
        }else {
             this.produits[capacite] = produit;
             this.capacite ++ ;
        } 
    };
    
    public void ajouter(Employe employe ){
        this.employes[nbEmploye] = employe;
        this.nbEmploye ++ ;   
    };
    
    public int getTotalProduits(){
        return this.capacite;
    }
    
   
    public static boolean comparer(Chemise produit, Chemise produit2) {
        return produit2.getIdentifiant() == produit.getIdentifiant()
                && produit2.getPrix() == produit.getPrix()
                && produit2.getLibelle() == produit.getLibelle();
    }
    
    public boolean chercher(Chemise produit){
        for(int i=0;i<this.capacite;i++){
            if(this.produits[i].comparer(produit)){
                return true;   
            }
        }
         return false;
    };
    
    public int getIndexOfProduit(Chemise produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return i;
            }
        }
        return -1;
    }
    
    public void supprimerProduit(Chemise produit){
        int indexProduit = this.getIndexOfProduit(produit);
        if(indexProduit==-1){
            System.out.println("Produit inexistant");
        }else {
            for (int i = indexProduit; i < capacite; i++) {
                this.produits[i] = this.produits[i + 1];
                this.produits[capacite] = null;
                this.capacite--;
            }
        }
    };
    public Magasin comparer(Magasin m) {
        if (this.capacite >= m.capacite) {
            return this;
        } else {
            return m;
        }
    }
}
 