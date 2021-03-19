package com.tugcenurdaglar.jsonparseuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonVeri = "{\"bayraklar\":[{\"bayrak_id\":\"1\",\"bayrak_ad\":\"T\\u00fcrkiye\",\"bayrak_resim\":\"turkiye\"},{\"bayrak_id\":\"2\",\"bayrak_ad\":\"Almanya\",\"bayrak_resim\":\"almanya\"},{\"bayrak_id\":\"3\",\"bayrak_ad\":\"\\u0130talya\",\"bayrak_resim\":\"italya\"},{\"bayrak_id\":\"4\",\"bayrak_ad\":\"Fransa\",\"bayrak_resim\":\"fransa\"},{\"bayrak_id\":\"5\",\"bayrak_ad\":\"Hollanda\",\"bayrak_resim\":\"hollanda\"},{\"bayrak_id\":\"6\",\"bayrak_ad\":\"\\u0130spanya\",\"bayrak_resim\":\"ispanya\"},{\"bayrak_id\":\"7\",\"bayrak_ad\":\"Slovenya\",\"bayrak_resim\":\"slovenya\"},{\"bayrak_id\":\"8\",\"bayrak_ad\":\"Slovakya\",\"bayrak_resim\":\"slovakya\"},{\"bayrak_id\":\"9\",\"bayrak_ad\":\"Estonya\",\"bayrak_resim\":\"estonya\"},{\"bayrak_id\":\"10\",\"bayrak_ad\":\"Rusya\",\"bayrak_resim\":\"rusya\"},{\"bayrak_id\":\"11\",\"bayrak_ad\":\"Bulgaristan\",\"bayrak_resim\":\"bulgaristan\"},{\"bayrak_id\":\"12\",\"bayrak_ad\":\"Romanya\",\"bayrak_resim\":\"romanya\"},{\"bayrak_id\":\"13\",\"bayrak_ad\":\"Norve\\u00e7\",\"bayrak_resim\":\"norvec\"},{\"bayrak_id\":\"14\",\"bayrak_ad\":\"Yunanistan\",\"bayrak_resim\":\"yunanistan\"},{\"bayrak_id\":\"15\",\"bayrak_ad\":\"Bosna Hersek\",\"bayrak_resim\":\"bosnahersek\"}],\"success\":1}";

        //bütün verileri alabileceğimiz bir json objesi oluştur yani
        //jsonVeri sini json objesine dönüştürmemiz lazım

        try {
            JSONObject jsonObject = new JSONObject(jsonVeri);

            //Arrayi yakala
            JSONArray bayraklarListe = jsonObject.getJSONArray("bayraklar");
            //formattaki ismi yazdık

            //for döngüsüyle array içindeki objelere erişim sağlanacak obje ->{}

            for (int i =0; i<bayraklarListe.length(); i++){
                JSONObject b = bayraklarListe.getJSONObject(i);

                int bayrak_id = b.getInt("bayrak_id");
                String bayrak_ad = b.getString("bayrak_ad");
                String bayrak_resim = b.getString("bayrak_resim");

                Log.e("*********","**********");
                Log.e("bayrak_id", String.valueOf(bayrak_id));
                Log.e("bayrak_ad", bayrak_ad);
                Log.e("bayrak_resim", bayrak_resim);
                Log.e("*********","**********");

            }



        } catch (JSONException e) {
            e.printStackTrace();
        }

        String jsonFilmVeri = "{\"filmler\":[{\"film_id\":\"1\",\"film_ad\":\"Interstellar\",\"film_yil\":\"2015\",\"film_resim\":\"interstellar.png\",\"kategori\":{\"kategori_id\":\"4\",\"kategori_ad\":\"Bilim Kurgu\"},\"yonetmen\":{\"yonetmen_id\":\"1\",\"yonetmen_ad\":\"Christopher Nolan\"}},{\"film_id\":\"2\",\"film_ad\":\"Inception\",\"film_yil\":\"2010\",\"film_resim\":\"inception.png\",\"kategori\":{\"kategori_id\":\"4\",\"kategori_ad\":\"Bilim Kurgu\"},\"yonetmen\":{\"yonetmen_id\":\"1\",\"yonetmen_ad\":\"Christopher Nolan\"}},{\"film_id\":\"3\",\"film_ad\":\"The Pianist\",\"film_yil\":\"2002\",\"film_resim\":\"thepianist.png\",\"kategori\":{\"kategori_id\":\"3\",\"kategori_ad\":\"Drama\"},\"yonetmen\":{\"yonetmen_id\":\"4\",\"yonetmen_ad\":\"Roman Polanski\"}},{\"film_id\":\"4\",\"film_ad\":\"Bir Zamanlar Anadolu'da\",\"film_yil\":\"2011\",\"film_resim\":\"birzamanlaranadoluda.png\",\"kategori\":{\"kategori_id\":\"3\",\"kategori_ad\":\"Drama\"},\"yonetmen\":{\"yonetmen_id\":\"3\",\"yonetmen_ad\":\"Nuri Bilge Ceylan\"}},{\"film_id\":\"5\",\"film_ad\":\"The Hateful Eight\",\"film_yil\":\"2015\",\"film_resim\":\"thehatefuleight.png\",\"kategori\":{\"kategori_id\":\"1\",\"kategori_ad\":\"Aksiyon\"},\"yonetmen\":{\"yonetmen_id\":\"2\",\"yonetmen_ad\":\"Quentin Tarantino\"}},{\"film_id\":\"18\",\"film_ad\":\"Django\",\"film_yil\":\"2013\",\"film_resim\":\"django.png\",\"kategori\":{\"kategori_id\":\"1\",\"kategori_ad\":\"Aksiyon\"},\"yonetmen\":{\"yonetmen_id\":\"2\",\"yonetmen_ad\":\"Quentin Tarantino\"}}],\"success\":1}";

        try {
            JSONObject jsonObject = new JSONObject(jsonFilmVeri);

            JSONArray filmlerListe = jsonObject.getJSONArray("filmler");


            for (int i =0; i<filmlerListe.length(); i++){
                JSONObject f = filmlerListe.getJSONObject(i);

                int film_id = f.getInt("film_id");
                String film_ad = f.getString("film_ad");
                int film_yil = f.getInt("film_yil");
                String film_resim = f.getString("film_resim");

                JSONObject kategori = f.getJSONObject("kategori");
                int kategori_id = kategori.getInt("kategori_id");
                String  kategori_ad = kategori.getString("kategori_ad");

                JSONObject yonetmen = f.getJSONObject("yonetmen");
                int yonetmen_id = yonetmen.getInt("yonetmen_id");
                String  yonetmen_ad = yonetmen.getString("yonetmen_ad");


                Log.e("*********","**********");
                Log.e("film_id", String.valueOf(film_id));
                Log.e("film_ad", film_ad);
                Log.e("film_yil",String.valueOf(film_yil));
                Log.e("film_resim", film_resim);
                Log.e("kategori_ad", kategori_ad);
                Log.e("yonetmen_ad", yonetmen_ad);
                Log.e("*********","**********");

            }



        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}