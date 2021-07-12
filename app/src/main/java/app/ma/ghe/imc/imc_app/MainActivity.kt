package app.ma.ghe.imc.imc_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btSelect(view: View){
        val btSelected = view as Button
        var cellID = 0

        when(btSelected.id){
            R.id.calc_btn -> intent = Intent(this,ActivityCalc::class.java)
            R.id.tabela_btn -> cellID = 2
            R.id.mais_btn -> cellID = 3
            R.id.creat_btn -> intent = Intent(this, ActivityCriarConta::class.java)
        }
        startActivity(intent)
    }
}