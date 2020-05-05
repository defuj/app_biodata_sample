package id.co.bigtek.defuj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*

class ActivityProfile : AppCompatActivity() {
    private var count = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        functions()
    }

    private fun functions() {
        toolbarDetails!!.setNavigationOnClickListener {
            back()
        }
    }

    override fun onBackPressed() {
        back()
    }

    private fun back(){
        if(count == 0){
            finish()
        }else{
            count -=1
            Toast.makeText(this,"Tekan sekali lagi untuk keluar",Toast.LENGTH_LONG).show()
            object : CountDownTimer(3000,1000){
                override fun onFinish() {
                    count = 1
                }

                override fun onTick(millisUntilFinished: Long) {

                }
            }.start()
        }
    }
}
