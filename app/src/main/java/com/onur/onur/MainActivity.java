package com.onur.onur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import javax.xml.transform.sax.SAXResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* String[] renkler = new String[5];
        renkler[0]="Mor";
        renkler[1]="Mavi";
        renkler[2]="Turuncu";
        renkler[3]="Yeşil";
        renkler[4]="Kırmızı";
       // for (String renk : renkler)
            //System.out.println(renk);
        System.out.println(renkler.length);
        ArrayList<String> yazdırma = new ArrayList<>();
        yazdırma.add(renkler[0]);
        yazdırma.add(renkler[1]);
        yazdırma.add(renkler[2]);
        yazdırma.add(renkler[3]);
        yazdırma.add(renkler[4]);
        boolean kullanıcıyıbul = yazdırma.contains("Mor");
        System.out.println(kullanıcıyıbul);
        yazdırma.remove(0);
        for (String yazdır : yazdırma)
            System.out.println(yazdır);

        */
       /* HashMap<Integer,String> AlışverişListesi = new HashMap<>();
        AlışverişListesi.put(0,"Yumurta");
        AlışverişListesi.put(1,"Ekmek");
        AlışverişListesi.put(2,"Süt");
        AlışverişListesi.put(3,"Un");
        System.out.println(AlışverişListesi.remove(2));

        */
        /*String isim = "Onur";
        String yeniisim = isim.concat(" Balkara");
        String Ad1 = " Emirhan";
        String yeniad2= Ad1.concat(" Akar");
        String yeniad3 = yeniad2.concat(" Games");
        System.out.println(yeniisim + yeniad2 + yeniad3);

         */
        /*String Mevsim = "Ocak";
        boolean DoğumMevsimi = Mevsim.matches("Şubat");
        System.out.println("Onun doğum günü Şubat tarihi dir." + DoğumMevsimi);
        String ad = "Onur Balkara";
        boolean arama = ad.contains("Onur");
        System.out.println(arama);

         */
       /* String ad = "Onur";
        String değer = ad.toLowerCase();
        System.out.println(değer);


        String ad = "Onur";
        String büyütme = ad.toUpperCase();
        System.out.println(büyütme);

        */
        /*
        Claslar
        Clasların kullanımı yeni bir MainActivity açıyoruz ve bu MainActivity e istediğimiz değerleri atıyoruz.
        ve ilk önçe klasın adını yazıp sonra o klas a bir değer verip (=) koyup new tekrar klas adı();
        bunu ekrana yazdırırken de sout koyup burda klas a verdiğimiz adı koyup çağırmak istediğimiz değeri yazıp çağıtıyoruz.

         */
        /*
        Private
        öbür klas da verdiğimiz değerlerde başına private koyarsak o klas dışında başka hiç bir klas da erişilmemesini sağlıyor
         */
        /*
        Public
        eğer Public verirsek tüm class larda açık duruma gelir.
         */
        /*
        Static
        eğer öbür klas da değer i değiştireçeksen Static kullanarak yapıyoruz eğer öbür clas da başına static koymassan
        kökten değiştiremezsin.
        Static kullanırsak clas ın kendisinden ulaşaçaz
         */
        çalışanlar klas = new çalışanlar();
        klas.adı = "Balkara";
        System.out.println(klas.adı);
        System.out.println(çalışanlar.yaş); //Static kullanılan değeri böyle direk clas dan çağırıyoruz.
















    }
}