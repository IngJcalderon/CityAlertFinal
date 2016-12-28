package com.cityalert.cityalert;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

import xyz.hanks.library.SmallBang;

public class TipoAlertasActivity extends AppCompatActivity {
    Toolbar toolbar;
    private SmallBang mSmallBang;
    TipoAlerta mascota;
    ArrayList<TipoAlerta> listMacotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_alertas);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_reorder_black_24dp);
        setSupportActionBar(toolbar);

        mSmallBang = SmallBang.attach2Window(this);


        rvMascotas=(RecyclerView) findViewById(R.id.rvMascotas);

        rvMascotas.addOnItemTouchListener(
                new RecyclerItemClickListener(this.getApplicationContext(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        // Intent intent = new Intent(view.getContext(), fragment_favoritos.class);
                        //intent=new Intent(this,Activity_Contacto.class);
                        // startActivity(intent);
                       // enviarToken(view);
                        Intent intent;
                        intent=new Intent(getApplicationContext(),PublicarActivity.class); //TipoAlertasActivity
                        startActivity(intent);
                       /* Snackbar.make(view, "Mascota : "+position, Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();*/
                    }
                })
        );
/*
        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
         //rvMascotas.setLayoutManager(llm);
*/
        generarGridLayout();


        //listMacotas=mascota.InicializarLista();
        InicializarLista();

        InicializarAdaptdor();
    }

    public void InicializarAdaptdor(){
        TipoAlertaAdaptador adaptador=new TipoAlertaAdaptador(listMacotas);
        rvMascotas.setAdapter(adaptador);
    }


    public void generarGridLayout() {
        GridLayoutManager glm=new GridLayoutManager(this,3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(glm);

        //tvNombreMascota.setText(UserGral.nombre);
    }


    public void InicializarLista(){
        listMacotas=new ArrayList<TipoAlerta>();
        listMacotas.add(new TipoAlerta(1,"Robo Personal",R.drawable.robo_personal));
        listMacotas.add(new TipoAlerta(2,"Robo Comercial",R.drawable.robo_tienda));
        listMacotas.add(new TipoAlerta(3,"Robo Vehiculo",R.drawable.robo_vehiculo));
        listMacotas.add(new TipoAlerta(4,"Robo Domicilio",R.drawable.robo_domicilio));
        listMacotas.add(new TipoAlerta(5,"Atentado",R.drawable.atentado));
        listMacotas.add(new TipoAlerta(6,"Incendio",R.drawable.incendio));
        listMacotas.add(new TipoAlerta(7,"Asesinato",R.drawable.asesinato));
        listMacotas.add(new TipoAlerta(8,"Vandalismo",R.drawable.vandalismo));
        listMacotas.add(new TipoAlerta(9,"Venta de Drogas",R.drawable.venta_drogas));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();
        Intent intent;
        switch (id){
            case R.id.mMapa:
                intent=new Intent(this,MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.mTipoAlerta:
                intent=new Intent(this,TipoAlertasActivity.class); //TipoAlertasActivity
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);

    }

}
