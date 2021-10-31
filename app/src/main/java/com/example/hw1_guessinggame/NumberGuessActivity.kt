package com.example.hw1_guessinggame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class NumberGuessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
        var aleatorio = (1..1000).random()
        var btn = btnCalcular as Button
        var valor=0

        btn.setOnClickListener {
        valor= valor+1
            intentos.text= valor.toString()
            var numero1 = tntNumero1.text.toString().toInt()
            alea.text=aleatorio.toString()




            if (numero1 < aleatorio) {
                resultado.text= "mayor el numero que di yo aleatoriamente"
                            }else{
                               resultado.text="menor el numero que di yo aleatoriamente"
                            }
            if (numero1==aleatorio){
                resultado.text="FELICIDADES ADIVINASTE EL NUMERO"
            }
        }
    }
}


