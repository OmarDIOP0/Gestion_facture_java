public class Lignefacture{
    private Produit produitAcquis;
    private double quantiteAchetee;


    public Lignefacture(Produit produitAcquis, double quantiteAchetee){
        this.produitAcquis = produitAcquis;
        this.quantiteAchetee = quantiteAchetee;
    }

    public Produit getProduitAcquis(){
        return this.produitAcquis;
    }
    
    public double getQuantiteAchetee(){
        return this.quantiteAchetee;
    }

    public void setProduitAcquis(Produit produitAcquProduit){
        this.produitAcquis = produitAcquProduit;
    }

    public void setQuantiteAchetee(double quantiteAchetee){
        this.quantiteAchetee = quantiteAchetee;
    }

    public String toString(){
        return  produitAcquis + " et la quantite achetee est  " +quantiteAchetee+ " ";
    }
}
