package com.epn.lab11mapsactivityapikey


import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.*
import com.google.android.gms.maps.StreetViewPanoramaFragment
import com.google.android.gms.maps.model.LatLng
//import com.sun.awt.SecurityWarning.setPosition


//class MapsActivity : AppCompatActivity(), OnMapReadyCallback {
class MapsActivity : FragmentActivity(), OnStreetViewPanoramaReadyCallback {


    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val streetViewPanoramaFragment = fragmentManager
            .findFragmentById(R.id.streetviewpanorama) as StreetViewPanoramaFragment
        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this)

    }


    override fun onStreetViewPanoramaReady(p0: StreetViewPanorama?) {

        p0!!.setPosition(LatLng(-33.87365, 151.20689))
    }
}
