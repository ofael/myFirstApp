package app.ma.ghe.imc.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import java.math.BigDecimal
import kotlin.math.roundToInt

class activity_calc : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        calcular()

    }

    fun calcular(){
        val edAltura = findViewById<EditText>(R.id.alturaText)
        var edPeso = findViewById<EditText>(R.id.pesoText)
        val calcular = findViewById<Button>(R.id.calcular_btn)
        val updateProgress = findViewById<ProgressBar>(R.id.progress_bar)
        val textView = findViewById<TextView>(R.id.text_view_progress)
        calcular.setOnClickListener {
            val peso: String = edPeso.text.toString()
            val altura: String = edAltura.text.toString()

            if(peso.isEmpty() || altura.isEmpty()){
                Toast.makeText(this, "Digite o peso e a altura", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val resultado: BigDecimal = peso.toBigDecimal() / (altura.toBigDecimal() * altura.toBigDecimal())
            updateProgress.progress = resultado.toInt()
            textView.text = "$resultado%"
        }
    }
}

