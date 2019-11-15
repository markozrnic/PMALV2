package com.example.pma_lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class PersonalInfoActivity extends AppCompatActivity {

    private TextInputEditText oInputIme;
    private TextInputEditText oInputPrezime;
    private EditText oInputGodina;
    private Button oBtnUnesiImePrezime;

    private String sIme;
    private String sPrezime;
    private String sGodina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oInputIme=(TextInputEditText)findViewById(R.id.textIme);
        oInputPrezime=(TextInputEditText)findViewById(R.id.textPrezime);
        oInputGodina=(EditText)findViewById(R.id.editDatum);


        oBtnUnesiImePrezime = (Button)findViewById(R.id.buttonImePrezime);
        oBtnUnesiImePrezime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sIme = oInputIme.getText().toString();
                sPrezime= oInputPrezime.getText().toString();
                // sGodina=oInputGodina.getInputType();
                sGodina=oInputGodina.getText().toString();
                Intent oStudentInfoActivityIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oStudentInfoActivityIntent.putExtra("Ime", sIme);
                oStudentInfoActivityIntent.putExtra("Prezime", sPrezime);
                oStudentInfoActivityIntent.putExtra("Godina", sGodina);
                startActivity(oStudentInfoActivityIntent);

            }
        });



    }
}



