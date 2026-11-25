package com.willisaraujo.miasistentemujica

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.location.Location
import android.location.LocationManager

class RastreadorGPSReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "com.willisaraujo.miasistentemujica.TRACK_GPS") {
            val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
            try {
                val location: Location? = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                location?.let {
                    val lat = it.latitude
                    val lon = it.longitude
                    // Coordenadas listas para el sistema Mujica Core
                }
            } catch (e: SecurityException) {
                e.printStackTrace()
            }
        }
    }
}
