package id.co.bigtek.defuj

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.pedant.SweetAlert.SweetAlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class ActivityMain : AppCompatActivity() {
    var count = 0
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
            if(count == 3){
                startActivity(Intent(this,ActivityProfile::class.java))
            }else{
                if(count == 0){
                    confirm("Baru Mulai","Klik Ok dan ulangi",SweetAlertDialog.WARNING_TYPE)
                }else if(count == 1){
                    confirm("Yang kedua","Klik Ok dan ulangi",SweetAlertDialog.WARNING_TYPE)
                }else{
                    confirm("Yang terakhir","Klik Ok dan ulangi",SweetAlertDialog.WARNING_TYPE)
                }
            }
        }
    }

    private fun confirm(title : String,content : String, type : Int){
        val dialog = SweetAlertDialog(this,SweetAlertDialog.WARNING_TYPE)
        dialog.titleText = title
        dialog.contentText = content
        dialog.setConfirmClickListener {
            count +=1
            dialog.dismissWithAnimation()
        }
        dialog.show()
    }
}
