package com.example.sophos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Offices : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map:GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offices)
        createFragment()
    }

    private fun createFragment(){
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        createMarker()
    }

    private fun createMarker(){
        val coordinates = LatLng(6.218229100000025, -75.58021739999998)
        val coordinates2 = LatLng(6.224464299999994, -75.57474939999997)
        val marker = MarkerOptions().position(coordinates).title("CEOH - 107")
        val marker2 = MarkerOptions().position(coordinates2).title("Ciudad del Rio - 1009")
        map.addMarker(marker)
        map.addMarker(marker2)
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(coordinates, 13f),
            4000,
            null
        )
    }
}