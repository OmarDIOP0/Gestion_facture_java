public class Facturation{
        private Facture factures [];
        private int lastIndexFacture=0;


        public Facturation(){
            this.factures  = new Facture[1000];
        }
        public Facture [] getFactures(){
            return this.factures;
        }
       
        public void addFacture(Facture factures){
            this.factures[lastIndexFacture++] = factures;
        }
        

        public double chiffreAffaire(){
            double gainTotal = 0;
            for(int i = 0;i<lastIndexFacture;i++){
                gainTotal += factures[i].totalFacture();
            }
            return gainTotal;
        }

        public void listeFactureClient(String codeClient){
            for(int i = 0;i<lastIndexFacture;i++){
                if(codeClient.equals(factures[i].getClient().getcodeClient()))
                    System.out.println(factures[i]);
            }
        }
        public double quantiteVendu(String descriptionproduit){
            double quantite=0;
            for(int i=0;i<lastIndexFacture;i++){
                for(int j=0;j<factures[i].getLigneFactures().length;j++){
                    if(descriptionproduit.equalsIgnoreCase(factures[i].getLigneFactures()[j].getProduitAcquis().getDescProduit())){
                      quantite=quantite+factures[i].getLigneFactures()[j].getQuantiteAchetee();  
                    }
                        
                    
                }
            }
            return quantite;
        }
}