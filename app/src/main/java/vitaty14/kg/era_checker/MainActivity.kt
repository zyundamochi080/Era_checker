package vitaty14.kg.era_checker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.String.format
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val df = SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault())
        val date = Date()
        textview.setText(df.format(date))
    }
}
