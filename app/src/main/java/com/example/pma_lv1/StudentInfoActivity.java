package com.example.pma_lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoActivity extends AppCompatActivity {
    private TextInputEditText oInputPredmet;
    private Button oBtnUnesiPredmet;
    private String sPredmet;
    private String sIme;
    private String sPrezime;

    private String sGodina;
    private String sImeProfesra;
    private TextView oImeProfesora;

    private String sAkademskaGodina;
    private TextView oAkademskaGodina;

    private String sBrojSatiPred;
    private TextView oBrojSatiPred;

    private String sBrojSatiVjezbi;
    private TextView oBrojSatiVjezbi;

    private TextView oIme;
    private TextView oGodina;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("Ime");
        sPrezime = oExtras.getString("Prezime");
        sGodina = oExtras.getString("Godina");


        //oIme.setText(sIme + " " + sPrezime);

        //oGodina.setText(sGodina);

        //Dohvaćanje unosa
        oImeProfesora = (TextView) findViewById(R.id.textImeNastavnika);
        oAkademskaGodina = (TextView) findViewById(R.id.textGodina);
        oBrojSatiPred = (TextView) findViewById(R.id.textPredavanja);
        oBrojSatiVjezbi = (TextView) findViewById(R.id.textLV);
        oInputPredmet = (TextInputEditText) findViewById(R.id.textPredmet);

        oBtnUnesiPredmet = (Button) findViewById(R.id.buttonPredmet);
        oBtnUnesiPredmet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sPredmet = oInputPredmet.getText().toString();
                sImeProfesra = oImeProfesora.getText().toString();
                sAkademskaGodina = oAkademskaGodina.getText().toString();
                sBrojSatiPred = oBrojSatiPred.getText().toString();
                sBrojSatiVjezbi = oBrojSatiVjezbi.getText().toString();
                Intent oSummaryActivityIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oSummaryActivityIntent.putExtra("predmet", sPredmet);
                oSummaryActivityIntent.putExtra("Ime", sIme);
                oSummaryActivityIntent.putExtra("Prezime", sPrezime);
                oSummaryActivityIntent.putExtra("Godina", sGodina);
                oSummaryActivityIntent.putExtra("ImeProfesora", sImeProfesra);
                oSummaryActivityIntent.putExtra("AkademGod", sAkademskaGodina);
                oSummaryActivityIntent.putExtra("BrojSatiPred", sBrojSatiPred);
                oSummaryActivityIntent.putExtra("BrojSatiVjezbi", sBrojSatiVjezbi);
                startActivity(oSummaryActivityIntent);

            }
        });
    }
}
