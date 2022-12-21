import java.util.Date;
public class Facture{
    private Lignefacture ligneFactures [] ;
    private Client client;
    private Date date;

    public Facture(Lignefacture [] ligneFactures, Date date, Client client){
        this.ligneFactures = ligneFactures;
        this.date = date;
        this.client = client;
    }

    public Date getDate(){
        return this.date;
    }
    public Client getClient(){
        return this.client;
    }
    public Lignefacture [] getLigneFactures(){
        return this.ligneFactures;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void  setClient(Client client){
        this.client = client;
    }
    public void setLigneFacture(Lignefacture [] ligneFactures){
        this.ligneFactures = ligneFactures;
    }

    public double totalFacture(){
        double montantAPayer = 0.0;
        int i;
        for(i=0;i<ligneFactures.length;i++)
            montantAPayer +=  ligneFactures[i].getProduitAcquis().getPrixProduit() * ligneFactures[i].getQuantiteAchetee();
        return montantAPayer;
    }

    public String toString(){
        String s =  " la date est " +date+ " et le client est  " +client+ " ligne de facture = ";
        for(int i = 0; i<ligneFactures.length;i++){
            s += ligneFactures[i].toString() + ";";
        }
        return s;
    }

}