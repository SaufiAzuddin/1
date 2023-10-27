package perputakaan;

public abstract class  buku {
    private String namaBuku = "";
    private String penulis;
    private String bahasa;
    private int halaman;
    private double Ratings;
    private String kategori;

    public void setNamaBuku(String Nama) {
        namaBuku = Nama;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setPenulisBuku(String Author){
        penulis = Author;
    }

    public String getPenulisBuku() {
        return penulis;
    }

    public void setBahasaBuku(String lang){
        bahasa = lang;
    }

    public String getBahasaBuku() {
        return bahasa;
    }

    public void setHalamanBuku(int page){
        halaman = page;
    }

    public int getHalamaBuku() {
        return halaman;
    }

    public void setRatingsBuku(double rate){
        Ratings = rate;
    }

    public double getRatingsBuku(){
        return Ratings;
    }

    public void setKategoriBuku(String cat){
        kategori = cat;
    }

    public String getKategoriBuku() {
        return kategori;
    }
    

    abstract void bukuUniverse();

    // public isiMatkul getData() {
    //     return null;
    // }
}