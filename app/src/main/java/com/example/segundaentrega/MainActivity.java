package com.example.segundaentrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout contenedor =findViewById(R.id.contenedor);

        View TarjetaHomero = getLayoutInflater().inflate(R.layout.linearlayout,null);
        TextView titulotarjeta = TarjetaHomero.findViewById(R.id.titulotarjeta);
        TextView descripciontarjeta = TarjetaHomero.findViewById(R.id.descripcion);
        ImageView avatartarjeta = TarjetaHomero.findViewById(R.id.avatar);

        titulotarjeta.setText("HOMERO JAY SIMPSON");
        descripciontarjeta.setText("Homero Jay Simpson, es un personaje ficticio protagonista de la serie de televisión de dibujos animados Los Simpson. Es el padre de la familia protagonista y uno de los personajes centrales y más importantes de la serie. Fue creado por el dibujante Matt Groening e hizo su debut en televisión el 19 de abril de 1987. ");
        avatartarjeta.setImageResource(R.drawable.homer);

        contenedor.addView(TarjetaHomero);
        View TarjetaMarge = getLayoutInflater().inflate(R.layout.linearlayout,null);
        TextView titulomarge = TarjetaMarge.findViewById(R.id.titulotarjeta);
        TextView descripcionmarge = TarjetaMarge.findViewById(R.id.descripcion);
        ImageView avatarmarge = TarjetaMarge.findViewById(R.id.avatar);

        titulomarge.setText("MARGE SIMPSON");
        descripcionmarge.setText("Marjorie Jacqueline Simpson más conocida como Marge Simpson es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. Es la esposa de Homer Simpson y madre de los tres hijos que ha tenido de este matrimonio: Bart, Lisa y Maggie. Ella, junto al resto de su familia, conforman el elenco de personajes protagonistas de Los Simpson, su presencia ha demostrado ser fundamental para mantener la familia unida.");
        avatarmarge.setImageResource(R.drawable.marge);

        contenedor.addView(TarjetaMarge);

        TarjetaHomero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idobjeto =  getResources().getResourceEntryName(view.getId());
                Toast.makeText(MainActivity.this, "Homero Jay Simpson, es un personaje ficticio protagonista de la serie de televisión de dibujos animados Los Simpson. Es el padre de la familia protagonista y uno de los personajes centrales y más importantes de la serie. Fue creado por el dibujante Matt Groening e hizo su debut en televisión el 19 de abril de 1987. ", Toast.LENGTH_LONG).show();
            }
        });


        TarjetaMarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idobjeto =  getResources().getResourceEntryName(view.getId());
                Toast.makeText(MainActivity.this, "Marjorie Jacqueline Simpson más conocida como Marge Simpson es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. Es la esposa de Homer Simpson y madre de los tres hijos que ha tenido de este matrimonio: Bart, Lisa y Maggie. Ella, junto al resto de su familia, conforman el elenco de personajes protagonistas de Los Simpson, su presencia ha demostrado ser fundamental para mantener la familia unida.", Toast.LENGTH_LONG).show();

            }
        });


    }
    public void nextActivity(View v){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}