package com.example.segundaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private String[] opcionesSpiner = {"opcion 1", "opcion 2", "opcion 3"};
    private TextView caja;
    private Spinner spiner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        caja = findViewById(R.id.mostar);
        spiner = findViewById(R.id.spiner);

        ArrayAdapter adaptadorSpinner = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, opcionesSpiner);
        spiner.setAdapter(adaptadorSpinner);



        spiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity3.this, ""+adapterView.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void obtenerseleccion(View v){
        String textoItemSelecionado = "";
        long idItemselecionado = 0;
        textoItemSelecionado = spiner.getSelectedItem().toString();
        idItemselecionado = spiner.getSelectedItemId();

        caja.setText("");
        caja.append("Usted Seleccionó : "+ textoItemSelecionado+"\n");
        caja.append("El ID del item selecionado es :"+idItemselecionado);
    }
    //fin
}
