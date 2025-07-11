
import java.util.Random;

public class Prodotto {

    private int codice;
    
    private String nome;

    public String descrizione;

    private double prezzo = 20;
    
    public Prodotto() {
        Random random = new Random();
        this.codice = random.nextInt(1000);
    }

    
    private String nomeCodice(){
        String nomeEsteso = getNome() +"-"+ getCodice() ;
        return nomeEsteso;
    } 

    private double prezzobase(){
        return this.prezzo;
    }
    
    private double iva = 22;
    
    private double prezzoIva(){
        return prezzobase() + prezzobase() * iva / 100 ;
    }
    
        public String getNomeCodice(){
            return nomeCodice();
        }
  
         public double getPrezzoBase(){
            return this.prezzo;
        }
 
        public double getIva(){
            return this.iva;
        }

        public double getPrezzoIva(){
            return prezzoIva();
        }

        public int getCodice() {
            return this.codice;
        }

        public String getNome() {
            return this.nome;
        }

        public double getPrezzo() {
            return this.prezzo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }
    



}