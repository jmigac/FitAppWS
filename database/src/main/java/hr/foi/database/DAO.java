package hr.foi.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import entiteti.Korisnik;
@Dao
public interface DAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] unosKorisnika(Korisnik... korisnici);
    @Update void azuriranjeKorisnika(Korisnik... korisnici);
    @Delete void brisanjeKorisnika(Korisnik... korisnici);

    @Query("SELECT * FROM korisnik")
    List<Korisnik> dohvatiSveKorisnike();
}
