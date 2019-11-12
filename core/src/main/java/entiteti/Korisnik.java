package entiteti;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="korisnik")
public class Korisnik {
    @PrimaryKey(autoGenerate = true)
    int id;

    private String google_id;
    private String ime;
    private String prezime;
    private String email;
    private Float visina;
    private String spol;
    private String datumRodenja;
    private Integer razinaAktivnosti;
    private Integer ciljMase;
    private Float ciljTjednogMrsavljenja;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoogle_id() {
        return google_id;
    }

    public void setGoogle_id(String google_id) {
        this.google_id = google_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getVisina() {
        return visina;
    }

    public void setVisina(Float visina) {
        this.visina = visina;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public String getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(String datumRodenja) {
        this.datumRodenja = datumRodenja;
    }

    public Integer getRazinaAktivnosti() {
        return razinaAktivnosti;
    }

    public void setRazinaAktivnosti(Integer razinaAktivnosti) {
        this.razinaAktivnosti = razinaAktivnosti;
    }

    public Integer getCiljMase() {
        return ciljMase;
    }

    public void setCiljMase(Integer ciljMase) {
        this.ciljMase = ciljMase;
    }

    public Float getCiljTjednogMrsavljenja() {
        return ciljTjednogMrsavljenja;
    }

    public void setCiljTjednogMrsavljenja(Float ciljTjednogMrsavljenja) {
        this.ciljTjednogMrsavljenja = ciljTjednogMrsavljenja;
    }
}
