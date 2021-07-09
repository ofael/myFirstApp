package app.ma.ghe.imc.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.util.Log as Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btSelect(view: View){
        val btSelected = view as Button
        var cellID = 0

        when(btSelected.id){
            R.id.calc_btn -> intent = Intent(this,activity_calc::class.java)
            R.id.tabela_btn -> cellID = 2
            R.id.mais_btn -> cellID = 3
            R.id.info_btn -> cellID = 4
        }
        startActivity(intent)
    }
}