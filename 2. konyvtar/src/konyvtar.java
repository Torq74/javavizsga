import java.util.*;

public class konyvtar implements IkonyvekSzama {
    private List<konyv> konyvek = new ArrayList<konyv>();

    public void  konyvHozzaAd(konyv konyv){
       konyvek.add(konyv);
    }
    public List<konyv> getKonyvek(){
        return this.konyvek;
    }

    @Override
    public int ISBNperDarab(String ISBNSzam) {
        int szam = 0;
        for (int i = 0; i < konyvek.size(); i++) {
           if (konyvek.get(i).getISBN().equals(ISBNSzam)){
               szam++;
           }
        }
        return szam;
    }
}
