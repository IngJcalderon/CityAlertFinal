package com.cityalert.cityalert;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.ActivityCompat;

/**
 * Created by john on 19/12/2016.
 */
public class MiLocalizacion extends Service implements LocationListener {
    private final Context ctx;
    double longitud;
    double latitud;
    boolean gpsActivo;
    LocationManager locationManager;
    Location location;

    public MiLocalizacion() {
        super();
        this.ctx = this.getApplicationContext();
        getLocation();
    }

    public MiLocalizacion(Context ctx) {
        super();
        this.ctx = ctx;
        getLocation();
    }

    public void getLocation() {
        try {
            locationManager = (LocationManager) this.ctx.getSystemService(LOCATION_SERVICE);
            gpsActivo = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch (Exception e) {

        }
        if (gpsActivo) {
          /*  locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER
                    , 1000 * 60
                    , 10
                    , this);

                location = locationManager.getLastKnownLocation(locationManager.GPS_PROVIDER);
                setLatitud(location.getAltitude());
                setLongitud(location.getLongitude());*/
            }

    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
