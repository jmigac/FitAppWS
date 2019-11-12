package hr.foi.core.RetroEntiteti;

public class RetroNamirnica {
    private int id;
    private String naziv;
    private int brojKalorija;
    private int tezina;
    private String isbn;

    public RetroNamirnica(int id, String naziv, int brojKalorija, int tezina, String isbn) {
        this.id = id;
        this.naziv = naziv;
        this.brojKalorija = brojKalorija;
        this.tezina = tezina;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojKalorija() {
        return brojKalorija;
    }

    public void setBrojKalorija(int brojKalorija) {
        this.brojKalorija = brojKalorija;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "RetroNamirnica{" +
                "naziv='" + naziv + '\'' +
                '}';
    }
}
