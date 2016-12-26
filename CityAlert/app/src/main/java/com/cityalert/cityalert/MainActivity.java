package com.cityalert.cityalert;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRegistrarse;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the views
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnRegistrarse.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,RegistroActivity.class);
                startActivity(intent);
                /*Log.i("***","***");
                Toast.makeText(getActivity(), "XXXX", Toast.LENGTH_SHORT).show();*/
                //Snackbar.make(v, "Diste Like", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                /*Log.i("***","***");
                Toast.makeText(getActivity(), "XXXX", Toast.LENGTH_SHORT).show();*/
                //Snackbar.make(v, "Diste Like", Snackbar.LENGTH_LONG)
                //      .setAction("Action", null).show();
            }
        });
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
