import java.io.*;
import java.util.*;


public class Main {

    public static List<Kutya> kutyak=new ArrayList<>();

    public static int gazdatlanKutyakSzama(){
        int gazdatlan = 0;
        for (int i = 0; i < kutyak.size() ; i++) {
          if (kutyak.get(i).getTulajdonos()==null){
              gazdatlan++;
          }
        }
        return gazdatlan;
    }
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("4_kutyak.csv");
            BufferedReader br = new BufferedReader(fr)) {
            br.readLine();
            String line = "";
            while ((line = br.readLine()) != null){
                String[] adatok = line.split(";");
                try {
                    Kutya ujkutya = new Kutya(Integer.parseInt(adatok[0]), adatok[1], adatok[2], adatok[3], adatok[4]);
                    kutyak.add(ujkutya);
                } catch (ArrayIndexOutOfBoundsException e){
                    Kutya ujkutya = new Kutya(Integer.parseInt(adatok[0]), adatok[1], adatok[2], adatok[3], "");
                    kutyak.add(ujkutya);
                }

            }


        } catch (IOException ioe){
            System.out.println("Fájl beolvasási hiba");
        }
        int gazdatlan = gazdatlanKutyakSzama();
        System.out.println("4.feladat 5.pontja : Gazdátlan/örökbefogadható kutyák száma:"+gazdatlan);
    }
}