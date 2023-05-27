package com.example.implementgoogelmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap googleMap;
    FrameLayout map ;
    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_maps );
        map =findViewById ( R.id.map );
        SupportMapFragment mapFragment =(SupportMapFragment ) getSupportFragmentManager ().findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        this.googleMap=googleMap;
        LatLng mapIndia =new LatLng ( 35.115625,31.529326 );
        this.googleMap.addMarker ( new MarkerOptions ().position ( mapIndia ).title ( "Marke In palestine" ) );
        this.googleMap.moveCamera ( CameraUpdateFactory.newLatLng ( mapIndia ) );

    }
}