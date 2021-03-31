package com.example.final01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var he = 0.0
    var we = 0.0
    var aq = 0.0
    var pp = ""
    var op = ""
    var sum = 0.0
    var total = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rad_man.setOnClickListener {
            he = 5 * height.text.toString().toDouble()
            we = 13.7 * weight.text.toString().toDouble()
            aq = 6.8 * age.text.toString().toDouble()
            op = "M"

        }

        rad_girl.setOnClickListener {
            he = 5 * height.text.toString().toDouble()
            we = 13.7 * weight.text.toString().toDouble()
            aq = 6.8 * age.text.toString().toDouble()
            op = "G"
        }

        btn_bmr.setOnClickListener {
            if (op == "M") {
                sum = 66 + he + we - aq
                show.text = sum.toString()
            } else if (op == "G") {
                sum = 66 + he + we - aq
                show.text = sum.toString()

            }
        }

        btn_bmi.setOnClickListener {
            var sumhe = 0.0
            he = height.text.toString().toDouble()
            sumhe = he * we
            we = weight.text.toString().toDouble() / sumhe
            show.text = sum.toString()

        }
        btn_tdee.setOnClickListener {
            if (op == "1" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.2
                show.text = total.toString()

            } else if (op == "1" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.2
                show.text = total.toString()

            } else if (op == "2" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.375
                show.text = total.toString()

            } else if (pp == "2" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.375
                show.text = total.toString()

            } else if (pp == "3" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.55
                show.text = total.toString()

            } else if (pp == "3" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.55
                show.text = total.toString()

            } else if (pp == "4" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.725
                show.text = total.toString()

            } else if (pp == "4" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.725
                show.text = total.toString()

            } else if (pp == "5" && op == "G") {
                sum = 665 + he + we - aq
                total = sum * 1.9
                show.text = total.toString()

            } else if (pp == "5" && op == "M") {
                sum = 66 + he + we - aq
                total = sum * 1.9
                show.text = total.toString()

            }
        }

        btn1.setOnClickListener {
            pp = "1"
        }
        btn2.setOnClickListener {
            pp = "2"
        }
        btn3.setOnClickListener {
            pp = "3"
        }
        btn4.setOnClickListener {
            pp = "4"
        }
        btn5.setOnClickListener {
            pp = "5"
        }
    }
}