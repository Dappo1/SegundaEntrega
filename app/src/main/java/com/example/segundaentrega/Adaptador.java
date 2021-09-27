package com.example.segundaentrega;

import static com.example.segundaentrega.R.id.avatar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderspersonaje> {
    ArrayList<PersonajeBO> listapersonaje;

    public Adaptador(ArrayList<PersonajeBO> listapersonaje) {
        this.listapersonaje = listapersonaje;
    }



    @NonNull
    @Override
    public ViewHolderspersonaje onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.linearlayout,null,false);
        return new ViewHolderspersonaje(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderspersonaje holder, int position) {
        holder.titulo.setText(listapersonaje.get(position).getTitulo());
        holder.descripcion.setText(listapersonaje.get(position).getDescripcion());
        holder.avatar.setImageResource(listapersonaje.get(position).getAvatar());


    }

    @Override
    public int getItemCount() {
        return listapersonaje.size();
    }


    public class ViewHolderspersonaje extends RecyclerView.ViewHolder {
        TextView titulo, descripcion;
        ImageView avatar;

        public ViewHolderspersonaje(View itemView) {
            super(itemView);
            titulo=itemView.findViewById(R.id.titulotarjeta);
            descripcion=itemView.findViewById(R.id.descripcion);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }
}
