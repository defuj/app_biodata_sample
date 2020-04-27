package id.co.bigtek.defuj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ActivityProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        functions()
    }

    private fun functions() {
        toolbarDetails!!.setNavigationOnClickListener {
            finish()
        }
    }
}
