package idv.jerryexcc.gifdemoinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//minSdkVersion 最小支援只到17
class MainActivity : AppCompatActivity() {
    var isChange: Boolean = false//圖片狀態

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            if (isChange) {
                isChange = false//改變狀態
                pic.setImageResource(R.drawable.wtf)//設定圖片
            } else {
                isChange = true
                pic.setImageResource(R.drawable.ooo)
            }
        }
    }
}
