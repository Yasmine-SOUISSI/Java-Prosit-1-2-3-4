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
class Chemise{

private String libellé;
private String marque ; 
private float prix;
private int identifiant;
private Date dateExpriration ; 


Chemise () {}

Chemise(int identifiant,String marque,String libellé) {
this.identifiant=identifiant;
this.libellé=libellé;
this.marque=marque;

}
Chemise(int identifiant,String marque,String libellé,float prix) {
this.identifiant=identifiant;
this.libellé=libellé;
this.marque=marque;
this.prix=prix;

}
 public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libellé;
    }

    public void setLibelle(String libelle) {
        this.libellé = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Date getDateExpriration() {
        return dateExpriration;
    }

    public void setDateExpriration(Date dateExpriration) {
        this.dateExpriration = dateExpriration;
    }
   public void afficher(){
        System.out.println("------------------------");
        System.out.println("identifiant : "+this.identifiant);
        System.out.println("libelle : "+this.libellé);
        System.out.println("marque : "+this.marque);
        System.out.println("prix : "+this.prix);
        System.out.println("------------------------");
    }
     public void affecterDateExpiration(Date date){
        this.dateExpriration = date;
    }
  @Override
    public String toString(){
        String s = "";
        s+="identifiant : "+this.identifiant+"\n";
        s+="libelle : "+this.libellé+"\n";
        s+="marque : "+this.marque+"\n";
        s+="prix : "+this.prix+"\n";
        return s;
    }
    public boolean comparer(Chemise produit){
        return this.identifiant==produit.identifiant&&
                this.prix==produit.prix&&
                this.libellé==produit.libellé;
    }

}
