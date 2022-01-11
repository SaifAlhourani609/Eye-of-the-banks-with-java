package com.example.eyeofthebanks;

import androidx.fragment.app.FragmentActivity;

import android.location.Location;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Arab_Bank_ATM_Irbid extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arab__bank__a_t_m__irbid);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng arab__bank__a_t_m__irbid = new LatLng(32.53844072690702, 35.86287933680875); //عنوان البنك من الخريطة
        mMap.addMarker(new MarkerOptions().position(arab__bank__a_t_m__irbid).title(" Arab Bank ATM, Open 24 hours ")); // اسم الفرع اللي رح يظهر بالخريطة
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arab__bank__a_t_m__irbid));
        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                arab__bank__a_t_m__irbid).zoom(19).build();   //بعد الخريطة عن الارض
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.setTrafficEnabled(true);
        googleMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
            @Override
            public void onMyLocationChange(Location location) {

            }
        });
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.setTrafficEnabled(true);
        googleMap.setBuildingsEnabled(true);
        googleMap.getUiSettings().setAllGesturesEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);




    }

}