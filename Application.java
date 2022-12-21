import java.util.Date;
import java.util.Scanner;

public class Application {

    public static void main(String [] args)
    {
       Produit listeProduit [] = new Produit [1000];
       listeProduit[0] = new Produit("akara",10);
       listeProduit[1] = new Produit("dakhar",25);
       int lastIndexProduit = 2;

       Client listeClient [] = new Client [1000];
       listeClient[0] = new Client("1","diaby","cheikh");
       int lastIndexClient = 1;
       Facturation facturation =new Facturation();

       Scanner sc = new Scanner(System.in);
       String choix = "";
       do {
           System.out.println("1: Ajout Produit");
           System.out.println("2: Ajout Client");
           System.out.println("3: Ajout Facture");
           System.out.println("4: Calculer Chiffre d'Affaire");
           System.out.println("5: Lister Facture Client");
           System.out.println("6: Quantitee Produit Vendu");
           System.out.println("7: Lister Produit"); 
           System.out.println("8: Lister Client"); 
           System.out.println("9: Lister Facture"); 
           System.out.println("Q pour quitter");
           choix = sc.nextLine();
           switch(choix){
               case "1" :
                        System.out.println("Donner la description du Produit");
                        String desc = sc.nextLine();
                        System.out.println("Donner le prix du Produit");
                        double prix = sc.nextDouble(); sc.nextLine();
                        listeProduit[lastIndexProduit++] = new Produit(desc,prix);
                        break;
                case "2" :
                        System.out.println("Donner le code du Client");
                        String code = sc.nextLine();
                        System.out.println("Donner le nom du Client");
                        String nom =  sc.nextLine();
                        System.out.println("Donner le prenom du Client");
                        String prenom =  sc.nextLine();
                        listeClient[lastIndexClient++] = new Client(code, nom, prenom);
                        break;
                case "3" :
                        System.out.println("Donner le code du Client");
                        String cod = sc.nextLine();
                        Client c = Client.rechercherClient(cod, listeClient, lastIndexClient);
                        if(c == null){
                            System.out.println("Client introuvable");
                            break;
                        }
                        else{
                            System.out.println(c);
                        }
                        System.out.println("Donner le nombre de prduit a enregistrer dans la facture");
                        int nombre = sc.nextInt(); sc.nextLine();
                        Lignefacture lignefactures [] = new Lignefacture [nombre];
                        for(int i =0;i<nombre;i++){
                            Produit p = null;
                            
                            while(p == null){
                                System.out.println("Donner la description du produit");
                                String descP = sc.nextLine();
                                p = Produit.rechercherProduit(descP, listeProduit, lastIndexProduit);
                                
                            }
                            System.out.println("Donner la quantitee achetee");
                             double quantite = sc.nextDouble(); sc.nextLine();
                             lignefactures[i] = new Lignefacture(p, quantite);
                        } 
                        Facture facture = new Facture(lignefactures, new Date(), c);
                        facturation.addFacture(facture);
                        System.out.println(facture);
                        System.out.println(facture.totalFacture());

                        break;
                case "4":
                        System.out.println("Le chiffre d affaire"+ facturation.chiffreAffaire());
                        break;
                case "5":
                       System.out.println("Donner le code du client");      
                       String codeCl =sc.nextLine();
                       facturation.listeFactureClient(codeCl); 
                       break;
                case "6":
                        System.out.println("Donner le nom du produit");
                        String produit=sc.nextLine();
                        System.out.println("la quantite vendu ="+facturation.quantiteVendu(produit)) ;
                        break;
                
                case "7" :
                        System.out.println("Listes des Produits");
                        for(int i =0;i<lastIndexProduit;i++){
                            System.out.println(listeProduit[i]);
                        }
                        break;

                case "8" :
                        System.out.println("Listes des Clients");
                        for(int i =0;i<lastIndexClient;i++){
                            System.out.println(listeClient[i]);
                        }
                        break;
                
                    
           }
       } while (!choix.toUpperCase().equals("Q"));

        
    }
}