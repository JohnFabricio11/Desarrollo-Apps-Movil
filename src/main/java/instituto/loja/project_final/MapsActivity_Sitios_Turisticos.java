package instituto.loja.project_final;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity_Sitios_Turisticos extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener{

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps__sitios__turisticos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

//agreganfo marcadores en google maps
        LatLng ParqueJipiro = new LatLng(-3.9717437, -79.2038966);
        mMap.addMarker(new MarkerOptions().position(ParqueJipiro).title("Te Encuentras en Jipiro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ParqueJipiro));

        LatLng Bellavista = new LatLng(-3.161624737245589, -79.13806882191123);
        mMap.addMarker(new MarkerOptions().position(Bellavista).title("Te Encuentras en Bellavista"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Bellavista));


    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }
}