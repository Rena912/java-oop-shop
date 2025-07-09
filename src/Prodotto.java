
public class Prodotto {

    public int codice;
    
    public String nome;

    public String descrizione;

    public double prezzo;

    

    public double prezzobase(){
        double prezzoProdotto = 25.5;
        prezzo = prezzoProdotto;
        return prezzoProdotto;
    }
    public double iva;
    
    public double prezzoIva(){
        double iva = prezzobase() + prezzobase() * 22 / 100 ;
        return iva;

    }
    



}