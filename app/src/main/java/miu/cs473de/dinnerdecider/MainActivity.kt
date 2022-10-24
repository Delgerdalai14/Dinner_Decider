package miu.cs473de.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import miu.cs473de.dinnerdecider.databinding.ActivityMainBinding
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val allFood:Array<String> ?= arrayOf("Hamburger", "Pizza", "Mexican", "American", "Chinese", "Tofo")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFoodBtn.setOnClickListener({
            if (addFoodName.text.toString() != ""){
                allFood?.set(0,addFoodName.text.toString())
            }
        })

        desideBtn.setOnClickListener({
            showFoodName.setText(""+ getRandomFood())
        })

    }

    fun getRandomFood():String{
        val r = Random()
        var random = r.nextInt(allFood!!.size-0) + 0;
        return allFood?.get(random).toString()
    }

}