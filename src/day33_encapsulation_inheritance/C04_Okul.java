package day33_encapsulation_inheritance;

public class C04_Okul {
    String okulAdi = "Yildiz Koleji";
    int ogrenciSayisi = 234;
    public String okulAdresi = "Ankara";

    /*
    bazi developer'lar erisim yetkisini sinirlamak icin degil
     yapilan ise vurgu olmasi icin getter ve setter kullanabilirler.
      bu uygulamanin tek artisi
        yapilan isleme vurgu yapmasidir
     */
    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }
}
