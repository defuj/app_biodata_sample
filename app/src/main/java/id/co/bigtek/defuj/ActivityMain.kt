package id.co.bigtek.defuj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        functions()
    }

    private fun functions() {
        toolbarHome!!.setNavigationOnClickListener {
            finish()
        }

        btndetail!!.setOnClickListener {
            startActivity(Intent(this,ActivityProfile::class.java))
        }
    }
}
