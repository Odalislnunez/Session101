package es.usj.mastertsa.onunez.session101

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_fifth.*

class FifthActivity : AppCompatActivity() {
    private val countryName = arrayOf("Argentina", "Brazil", "Bolivia", "Chile", "Colombia", "Ecuador", "Guayana Francesa",
        "Guyana", "Islas Falkland", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela")

    private val countryPopulation = arrayOf("43132000", "204519000", "10520000", "18006000", "45549000", "16279000", "262000",
        "747000", "3000", "7003000", "31153000", "560000", "3310000", "30620000")

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        lvCountries.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryName)
        lvCountries.onItemClickListener = AdapterView.OnItemClickListener {
                _, _, position, _ -> tvPopulation.text = "Population of ${countryName[position]} is ${countryPopulation[position]}"
        }
    }
}