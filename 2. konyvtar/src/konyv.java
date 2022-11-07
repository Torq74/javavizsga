public class konyv extends rekord{
    public String Cim;
    public String Szerzo;
    public String Nyelv;
    public int MegjelenesiDatum;

    public konyv(){

    }
    public konyv(String ISBN,String cim, String szerzo,String nyelv, int megjelenesiDatum){
        setISBN(ISBN) ;
        this.Cim = cim;
        this.Szerzo = szerzo;
        this.Nyelv= nyelv;
        this.MegjelenesiDatum = megjelenesiDatum;
    }
}
