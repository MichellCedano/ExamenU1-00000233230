package mx.edu.potros.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)
        val etC: EditText = findViewById(R.id.etC)
        val etF: EditText = findViewById(R.id.etF)

        btnGF.setOnClickListener {
            val celsius = etC.text.toString().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = celsius * 1.8 + 32
                val formattedNumber1 = "%.2f".format(fahrenheit)
                etF.setText(formattedNumber1.toString())
            } else {
                etC.setText("ERROR!!: escribe algo para convertirlo")
            }
        }

        btnGC.setOnClickListener {
            val fahrenheit = etF.text.toString().toDoubleOrNull()
            if (fahrenheit != null) {
                val celsius = (fahrenheit - 32) / 1.8
                val formattedNumber2 = "%.2f".format(celsius)
                etC.setText(formattedNumber2.toString())
            } else {
                etF.setText("ERROR!!: escribe algo para convertirlo")
            }
        }

    }
}