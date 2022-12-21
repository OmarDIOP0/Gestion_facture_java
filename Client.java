public class Client {
    private String codeClient;
    private String nomClient;
    private String prenomClient;

    //Encapsulation 
    public  String getcodeClient()
    {
        return this.codeClient;
    }
    public  String getnomClient()
    {
        return this.nomClient;
    }
    public  String getprenomClient()
    {
        return this.prenomClient;
    }
    

    public  void setcodeClient(String codeClient)
    {
        this.codeClient = codeClient;
    }
    public  void setnomClient(String nomClient)
    {
        this.nomClient = nomClient;
    }
    public  void setprenomClient(String prenomClient)
    {
        this.prenomClient = prenomClient;
    }
    

        // constructeur
        public Client(String code,String nom, String prenom)
        {
            codeClient = code;
            nomClient = nom;
            prenomClient = prenom;
        }
        
        // la methode toString;
        public String toString()
        {
            return  "le prenom du client est " +prenomClient+ " son nom est " +nomClient+ " et son code est " +codeClient+ " ";
        }

        public boolean equals(Client autreClient){
            boolean resultat = false;
            if(this.codeClient.equalsIgnoreCase(autreClient.codeClient))
                resultat = true;
            return resultat;
        }

        public static Client rechercherClient(String code,Client[] listeClient,int taille){
            Client c = null;
            int i = 0;
            while(c == null && i<taille){
                if(code.equalsIgnoreCase(listeClient[i].codeClient)){
                    c = listeClient[i];
                }
                i++;
            }
            return c;
        }
            
}
