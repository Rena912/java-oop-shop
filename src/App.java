

public class App {
    public static void main(String[] args) {
        
        Prodotto prodotto1 = new Prodotto();
        prodotto1.nome = "Maglietta";
        prodotto1.descrizione = "T-shirt";
        prodotto1.prezzo = 20 ;
        prodotto1.iva = 22 ;

        System.out.println("Il codice prodotto e' = " + prodotto1.codice);
        System.out.println("Il prezzo base e' = " + prodotto1.prezzobase());
        System.out.println("Il prezzo con iva e' = " + prodotto1.prezzoIva());
        System.out.println(prodotto1.nomeCodice());

        
        
        
        

        
        
        

        

        

        


    }
}
