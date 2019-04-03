package vitaty14.kg.era_checker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        timer(name = "time",period = 1000){
            val calendar = Calendar.getInstance()

            val year = calendar.get(Calendar.YEAR)
            val hour = calendar.get(Calendar.HOUR_OF_DAY)
            val minute = calendar.get(Calendar.MINUTE)
            val second = calendar.get(Calendar.SECOND)
            val a = calendar.get(Calendar.DAY_OF_YEAR)

            val year_h = calendar.get(Calendar.YEAR) - 1989
            val hour_h = calendar.get(Calendar.HOUR_OF_DAY)

            handler.post{
                val time_now = findViewById<TextView>(R.id.textview_now)
                time_now.text = "現在時刻:${year}年${hour}時${minute}分${second}秒"

                val time_h = findViewById<TextView>(R.id.textView_h)
                time_h.text = "平成始まってから:${a}年"
            }
        }
    }

}
