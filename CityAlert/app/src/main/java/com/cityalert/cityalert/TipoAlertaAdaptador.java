package com.cityalert.cityalert;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by john on 20/08/2016.
 */
public class TipoAlertaAdaptador extends RecyclerView.Adapter<TipoAlertaAdaptador.TipoAlertaViewHolder> {
    private TextView tvfavorito;
   // ListMascotasFavoritas listMascotasFavoritas= new ListMascotasFavoritas();
    ArrayList<TipoAlerta> listMacotas;

   // ArrayList<Mascota> listMacotasFavoritas;

   public TipoAlertaAdaptador(ArrayList<TipoAlerta> listMacotas){
        this.listMacotas=listMacotas;
   }




        @Override
        public TipoAlertaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tipo_alertas,parent,false);
            return new TipoAlertaViewHolder(v);
        }



        @Override
        public void onBindViewHolder(final TipoAlertaViewHolder mascotaViewHolder, int position) {
            final TipoAlerta mascota=listMacotas.get(position);
            mascotaViewHolder.ivMascota.setImageResource(mascota.getFoto());
            mascotaViewHolder.tvNombre.setText(mascota.getNombre());

        }

    @Override
    public int getItemCount() {
        return listMacotas.size();
    }

    public static class TipoAlertaViewHolder extends RecyclerView.ViewHolder{


        private ImageView ivMascota;
        private TextView tvNombre;


        public TipoAlertaViewHolder(final View itemView) {
            super(itemView);
            ivMascota=(ImageView) itemView.findViewById(R.id.ivMascota);
            tvNombre=(TextView)  itemView.findViewById(R.id.tvNombre);
/*
            ivHuesoBlanco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    tvRate.setText(String.valueOf(10));
                }
            });*/
        }
    }
}
