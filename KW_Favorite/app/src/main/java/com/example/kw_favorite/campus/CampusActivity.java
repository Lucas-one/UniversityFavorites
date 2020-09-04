package com.example.kw_favorite.campus;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kw_favorite.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CampusActivity extends AppCompatActivity implements OnMapReadyCallback {

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        LatLng location;


//        location = new LatLng(37.620464, 127.059433);//화도관
//        markerOptions.title("화도관");
//        //markerOptions.snippet("대학원");
//        markerOptions.position(location);
//        googleMap.addMarker(markerOptions);
//
//        location = new LatLng(37.619012, 127.059056);//옥의관
//        markerOptions.title("옥의관");
//        //markerOptions.snippet("대학원");
//        markerOptions.position(location);
//        googleMap.addMarker(markerOptions);
//
//        location = new LatLng(37.619265, 127.058372);//복지관
//        markerOptions.title("복지관");
//        //markerOptions.snippet("대학원");
//        markerOptions.position(location);
//        googleMap.addMarker(markerOptions);
//
//        location = new LatLng(37.619502, 127.057704);//연구관
//        markerOptions.title("연구관");
//        //markerOptions.snippet("대학원");
//        markerOptions.position(location);
//        googleMap.addMarker(markerOptions);
//
//        location = new LatLng(37.619110, 127.060028);//다산재
//        markerOptions.title("다산재");
//        //markerOptions.snippet("대학원");
//        markerOptions.position(location);
//        googleMap.addMarker(markerOptions);
//
//        //
//        location = new LatLng(37.619256, 127.060894);//참빛관
//        markerOptions.title("참빛관");
//        //markerOptions.snippet("대학원");
//        markerOptions.position(location);
//        googleMap.addMarker(markerOptions);

        location = new LatLng(37.620072, 127.054947);//누리관
        markerOptions.title("광운대(누리관)");
        //markerOptions.snippet("대학원");
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);

        location = new LatLng(37.619653, 127.059874);//비마관
        markerOptions.title("비마관");
        //markerOptions.snippet("전자정보공과대학");
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 17));


    }
}
