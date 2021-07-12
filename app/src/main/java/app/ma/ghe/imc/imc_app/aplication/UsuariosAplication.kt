package app.ma.ghe.imc.imc_app.aplication

import android.app.Application
import android.os.Build
import androidx.annotation.RequiresApi
import app.ma.ghe.imc.imc_app.helpers.HelperDB

class UsuariosAplication : Application(){
    var helperDB : HelperDB? = null
        private set

    companion object{
        lateinit var instances : UsuariosAplication
    }
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate() {
        super.onCreate()
        instances = this
        helperDB = HelperDB(this)
    }
}