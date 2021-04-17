package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber
import java.sql.Time

class PusherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}