package com.example.karenduarte.restaurante;


import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

    public class MainActivity extends AppCompatActivity{
        private Button calcular;

        private EditText consumo;
        private EditText couvertartistico;
        private EditText dividir;

        private EditText taxa;
        private EditText contatotal;
        private EditText valorpessoa;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            consumo = findViewById(R.id.consumoTotal_Id);
            couvertartistico = findViewById(R.id.couvert_Id);
            dividir = findViewById(R.id.divisao_Id);

            taxa = findViewById(R.id.taxaServico_Id);
            contatotal = findViewById(R.id.contaTotal_Id);
            valorpessoa = findViewById(R.id.valorPessoa_Id);
            calcular = findViewById(R.id.bt_calcular);

            calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double cons = Double.parseDouble(consumo.getText().toString());
                    double couver= Double.parseDouble(couvertartistico.getText().toString());
                    int porPessoa = Integer.parseInt(dividir.getText().toString());



                    double totalDaConta = cons+couver;
                    double pagarCadaPessoa = totalDaConta/porPessoa;
                    double taxaServico = ((totalDaConta*10)/100);

                    contatotal.setText(String.valueOf(totalDaConta));
                    valorpessoa.setText(String.valueOf(pagarCadaPessoa));
                    taxa.setText(String.valueOf(taxaServico));

                }
            });



        }
    }
