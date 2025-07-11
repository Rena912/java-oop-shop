
import java.util.Random;

public class Prodotto {

    public int codice;
    
    public String nome = "Zaino";

    public String descrizione;

    public double prezzo;

    public Prodotto() {
        Random random = new Random();
        this.codice = random.nextInt(1000);
    }

    public String nomeCodice(){
        String nomeEsteso = nome +"-"+ codice ;
        return nomeEsteso;

    } 

    public double prezzobase(){
       return this.prezzo;
    }

    public double iva;
    
    public double prezzoIva(){
        return prezzobase() + prezzobase() * iva / 100 ;
    }
    



}