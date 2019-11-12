package hr.foi.webservice;

import java.util.List;

import hr.foi.core.RetroEntiteti.RetroKorisnik;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonApi {
    @GET("korisnik.php?query=getAll")
    Call<List<RetroKorisnik>> dohvatiSveKorisnike();
}
