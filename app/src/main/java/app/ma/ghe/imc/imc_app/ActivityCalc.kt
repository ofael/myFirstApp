package app.ma.ghe.imc.imc_app

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import java.math.BigDecimal

class ActivityCalc : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        calcular()

    }

    private fun calcular(){
        val edAltura = findViewById<EditText>(R.id.alturaText)
        val edPeso = findViewById<EditText>(R.id.pesoText)
        val calcular = findViewById<Button>(R.id.calcular_btn)
        val updateProgress = findViewById<ProgressBar>(R.id.progress_bar)
        val textView = findViewById<TextView>(R.id.text_view_progress)
        val resultText = findViewById<TextView>(R.id.resultView)
        calcular.setOnClickListener {
            val peso: String = edPeso.text.toString()
            val altura: String = edAltura.text.toString()

            if(peso.isEmpty() && altura.isEmpty()){
                Toast.makeText(this, "Digite o peso e a altura", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (peso.isEmpty()){
                Toast.makeText(this,"Digite o seu peso",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            else if (altura.isEmpty()){
                Toast.makeText(this,"Digite sua altura",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val resulted: BigDecimal = peso.toBigDecimal() / (altura.toBigDecimal() * altura.toBigDecimal())
            updateProgress.progress = resulted.toDouble().toInt()
            textView.text = "$resulted%"
            resultText.isVisible = true

        }
    }
}

