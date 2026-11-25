package com.willisaraujo.miasistentemujica

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MemoriaLargoPlazo(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("MujicaCore_Prefs", Context.MODE_PRIVATE)
    private val gson = Gson()

    fun guardarHistorial(historial: List<Map<String, String>>) {
        val json = gson.toJson(historial)
        prefs.edit().putString("chat_history", json).apply()
    }

    fun obtenerHistorial(): List<Map<String, String>> {
        val json = prefs.getString("chat_history", null) ?: return emptyList()
        val type = object : TypeToken<List<Map<String, String>>>() {}.type
        return gson.fromJson(json, type)
    }

    fun borrarMemoria() {
        prefs.edit().remove("chat_history").apply()
    }
}
