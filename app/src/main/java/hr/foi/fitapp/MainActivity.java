package hr.foi.fitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import entiteti.Korisnik;
import hr.foi.core.RetroEntiteti.RetroKorisnik;
import hr.foi.database.MyDatabase;
import hr.foi.webservice.JsonApi;
import hr.foi.webservice.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

//import static hr.foi.database.MyDatabase.getInstance;

public class MainActivity extends AppCompatActivity {
    public static MyDatabase baza;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = RetrofitInstance.getInstance();
        JsonApi jApi = retrofit.create(JsonApi.class);
        Call<List<RetroKorisnik>> poziv = jApi.dohvatiSveKorisnike();

        // Deklaracija lokalne baze

        baza = MyDatabase.getInstance(this);

        poziv.enqueue(new Callback<List<RetroKorisnik>>() {
            @Override
            public void onResponse(Call<List<RetroKorisnik>> call, Response<List<RetroKorisnik>> response) {
                Korisnik korisnikZaUnos = new Korisnik();
                for (RetroKorisnik kor:response.body()){
                    korisnikZaUnos.setIme(kor.getIme());
                    korisnikZaUnos.setPrezime(kor.getPrezime());
                    baza.getDAO().unosKorisnika(korisnikZaUnos);
                }
                MockData();

            }

            @Override
            public void onFailure(Call<List<RetroKorisnik>> call, Throwable t) {

            }
        });


    }
    private void MockData(){
        TextView prikazKorisnika = findViewById(R.id.ispisKorisnika);
        List<Korisnik> sviKorisnici = baza.getDAO().dohvatiSveKorisnike();
        for (Korisnik k:sviKorisnici){
            String sadrzaj = "";
            sadrzaj += k.getIme()+" "+k.getPrezime()+System.getProperty("line.separator");
            prikazKorisnika.append(sadrzaj);
        }
    }
}
