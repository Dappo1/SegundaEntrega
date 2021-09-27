package com.example.segundaentrega;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<PersonajeBO> listapersonaje;
    RecyclerView recyclerPersonajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    listapersonaje = new ArrayList<>();
    recyclerPersonajes = findViewById(R.id.Reciclerview);
    recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

    llenarpersonajes();
    Adaptador adapter = new Adaptador(listapersonaje);
    recyclerPersonajes.setAdapter(adapter);




    }
    private void llenarpersonajes(){
        listapersonaje.add(new PersonajeBO("Lisa Simpson", "Lisa Marie Simpson 3\u200B4\u200B es un personaje de la serie de televisión de dibujos animados Los Simpson. Es la hija mediana de Homer y Marge Simpson y hermana de Bart y Maggie. Goza de notable protagonismo y complejidad en la serie.",R.drawable.lisa));
        listapersonaje.add(new PersonajeBO("Bart Simpson","Bartolomeo J. Simpson  es uno de los personajes ficticios protagonistas de la serie de televisión de dibujos animados Los Simpson. Bart tiene diez años y es el primogénito y único hijo varón de Homer y Marge Simpson. Es el hermano mayor de Lisa y Maggie.",R.drawable.bart));

    }
    public void nextActivity2(View v){
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }

}