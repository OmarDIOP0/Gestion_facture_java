public class Produit{
    private String descProduit; 
    private double prixProduit;

    public Produit(String desc, double prix) {
        descProduit = desc; 
        prixProduit = prix;
    }

    
    public String getDescProduit()
    {
        return this.descProduit;
    }
    public double getPrixProduit()
    {
        return this.prixProduit;
    }
    public  void setDescProduit(String desc)
    {
        this.descProduit = desc;
    }
    public void setPrixProduit(double prix)
    {
        this.prixProduit = prix;
    }

    public String toString()
    {
        return " le produit est: " + descProduit + " , son prix est: " + prixProduit;
    }
    
    public boolean equals(Produit autreProduit)
    {
        boolean resultat = false;
        if(this.descProduit.equalsIgnoreCase(autreProduit.descProduit)) 
        { resultat = true;}
        return resultat;
           
    }

    public static Produit rechercherProduit(String desc,Produit[] listeProduit,int taille){
        Produit p = null;
        int i = 0;
        while(p == null && i<taille){
            if(desc.equalsIgnoreCase(listeProduit[i].descProduit)){
                p = listeProduit[i];
            }
            i++;
        }
        return p;
    }
   
}