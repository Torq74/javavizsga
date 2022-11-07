import java.sql.Array;
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static int[] tomb = new int[3];
    public static List<int[]> Naplo = new ArrayList<>();
    public static Random rnd=new Random();
    public static int jegyGenerator(int szazalek){
        int jegy;
        if (szazalek <= 10){
            jegy = 1;
        } else if (szazalek > 10 && szazalek <=25){
            jegy = 2;
        } else if (szazalek > 25 && szazalek <=45) {
            jegy = 3;
        } else if (szazalek > 45 && szazalek <= 70) {
            jegy = 4;
        } else {
            jegy = 5;
        }
        return jegy;
    }
    public static double diakEvVegiErtekelese(int diakKod){
        double atlag = 0;
        int osszjegy = 0;
        int diakDb = 0;
        for (int i = 0; i < Naplo.size() ; i++) {
            int[]egydiak = Naplo.get(i);
            if (egydiak[0] == diakKod){
            //    System.out.println("Talált");
                diakDb++;
                osszjegy += egydiak[2];
            }

        }
        atlag = osszjegy/diakDb;
        return atlag;
    }
    public static void main(String[] args) {
        Map<String, Integer> Diakok = new HashMap();
        Diakok.put("Edina",1);
        Diakok.put("Géza",2);
        Diakok.put("Réka",3);
        Diakok.put("Béla",4);
        Diakok.put("Zita",5);
        Diakok.put("Tamás",6);
        try {
            for (int i = 0; i < 5; i++) {
                //diák ciklus
                for (int j = 0; j < 10; j++) {
                    // hónap ciklus
                   int jegySzam = rnd.nextInt(5);
                    for (int k = 0; k < jegySzam; k++) {
                        int szazalek = rnd.nextInt(100);
                        int jegy = jegyGenerator(szazalek);
                        tomb = new int[3];
                        tomb[0] = i+1;
                        tomb[1] = j+1;
                        tomb[2] = jegy;
                     //   System.out.println(tomb[0]+"-"+tomb[1]+"-"+tomb[2]);
                        Naplo.add(tomb);
                      //  System.out.println(Naplo);
                    }
                }

            }
            System.out.print("Adja meg egy diák nevét:    ");
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            String diakNeve = sc.next();
            int diakKodja = Diakok.get(diakNeve);
            double diakAtlaga = diakEvVegiErtekelese(diakKodja);
            int kerek = (int)Math.round(diakAtlaga);
            System.out.printf("%s Programozási alapok tantárgy átlaga: %.2f . Év végi jegye %d",diakNeve,diakAtlaga,kerek);
        }
        catch (NullPointerException e)
        {
            System.out.println("Nincs ilyen nevű diák!");
        }
    }
}