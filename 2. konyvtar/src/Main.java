import org.w3c.dom.ranges.RangeException;

public class Main {
    public static void main(String[] args)
    {
        konyvtar Konyvtar = new konyvtar();

        try {
            konyv konyv1=new konyv("9783404142163","Egri Csillagok","Gárdonyi Géza","magyar",1899);
            konyv konyv2=new konyv("9788807900365","A Pál utcai fiúk","Molnár Ferenc","magyar",1906);
            Konyvtar.konyvHozzaAd(konyv1);
            Konyvtar.konyvHozzaAd(konyv2);
            int db = Konyvtar.ISBNperDarab("9783404142163");
            System.out.println("A könyvtárban "+db+" db 9783404142163-as ISBN számmal rendelkező könyv található");
        }
        catch (RangeException e){
            System.out.println(e.getMessage());
        }

    }
}