public class Kutya {

    private int ID;
    private String KutyaNeve;
    private String Ivar;
    private String ChipSzama;
    private String Tulajdonos;

    public Kutya(){

    }
    public Kutya(int ID,String nev,String ivar, String chipSzama, String tulaj){
        this.ID = ID;
        this.KutyaNeve = nev;
        this.Ivar = ivar;
        this.ChipSzama = chipSzama;
        this.Tulajdonos = tulaj;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getKutyaNeve() {
        return KutyaNeve;
    }

    public void setKutyaNeve(String kutyaNeve) {
        KutyaNeve = kutyaNeve;
    }

    public String getIvar() {
        return Ivar;
    }

    public void setIvar(String ivar) {
        Ivar = ivar;
    }

    public String getChipSzama() {
        return ChipSzama;
    }

    public void setChipSzama(String chipSzama) {
        ChipSzama = chipSzama;
    }

    public String getTulajdonos() {
        return Tulajdonos;
    }

    public void setTulajdonos(String tulajdonos) {
        Tulajdonos = tulajdonos;
    }


}
