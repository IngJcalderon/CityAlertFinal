package com.cityalert.cityalert;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by j350 on 26/12/2016.
 */
public  class MenuApp extends AppCompatActivity {


    public boolean onCreateOptionsMenuApp(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public boolean onOptionsItemSelectedApp(Class activity, MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        switch (id){
            case R.id.mMapa:
                intent=new Intent(this,MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.mTipoAlerta:
                intent=new Intent(this,TipoAlertasActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
