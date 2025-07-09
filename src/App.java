import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Prodotto prodotto1 = new Prodotto();
        int nProdotti = 1000;
        int codiceRandom = random.nextInt(nProdotti);
        prodotto1.codice = codiceRandom;
        

        System.out.println("Il codice prodotto e' = " + codiceRandom);
        System.out.println("Il prezzo base e' = " + prodotto1.prezzobase());
        System.out.println("Il prezzo con iva e' = " + prodotto1.prezzoIva());

        
        
        
        

        
        
        

        

        

        


    }
}
