package com.orhan.basvuruuygulamasi;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends Activity {

    EditText isim, email, tarih;
    Spinner sehir;
    RadioButton kadin, erkek;
    CheckBox geldimi;
    Button buton;
    DatePickerDialog.OnDateSetListener date;
    // DatePickerDialog :
    Calendar myCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // göstereceğim tasarımı burada belirtiyorum
        /* activty_main üzerine kod yazılmaz ! */
        isim = findViewById(R.id.isimEt);
        email = findViewById(R.id.emailEt);
        tarih = findViewById(R.id.bdayEt);
        sehir = findViewById(R.id.sehirSpn);
        kadin = findViewById(R.id.kadinRb);
        erkek = findViewById(R.id.erkekRb);
        geldimi = findViewById(R.id.chkBx);
        buton = findViewById(R.id.btn);


    }

    void basvuru(View view){
        if(isim.getText().toString().isEmpty() || email.getText().toString().isEmpty() || tarih.getText().toString().isEmpty()){
            Toast.makeText(this, "Lütfen boş alanları doldurunuz", Toast.LENGTH_SHORT).show();
            // LENGTH_SHORT : ne kadar süre göstermek istiyoruz
        }else{
            String msg = "";
            msg += "Adınız ve Soyadınız: " + isim.getText().toString();
            msg += "Emailiniz: " + email.getText().toString();
            if (geldimi.isChecked()) {
                msg += "Akademik Bilişim'e daha önceden başvuru yaptınız!\n";
            }else{
                msg += "Akademil Bilişim'e daha önceden başvuru yapmadınız.\n";
            }

            if (kadin.isChecked()){
                msg += "Cinsiyetiniz: kadın\n";
            }else{
                msg += "Cinsiyetiniz: erkek\n";
            }
        }
    }
}

// resource kaynaklarımızı bulundurduğumuz klasör
/*
    drawable : resimler
    mipmap : icon
    values : tanımlamalar; stiller, stringler
*/