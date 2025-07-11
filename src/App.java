public class App {
    public static void main(String[] args) {
        
        Prodotto prodotto1 = new Prodotto();
        prodotto1.setNome("Maglietta");
        prodotto1.descrizione = "T-shirt";
        

        System.out.println("Il codice prodotto e' = " + prodotto1.getCodice());
        System.out.println("Il prezzo base e' = " + prodotto1.getPrezzoBase());
        System.out.println("Il prezzo con iva e' = " + prodotto1.getPrezzoIva());
        System.out.println(prodotto1.getNomeCodice());

        
        
        
        

        
        
        

        

        

        


    }
}
