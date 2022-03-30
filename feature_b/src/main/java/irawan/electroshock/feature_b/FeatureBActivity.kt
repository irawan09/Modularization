package irawan.electroshock.feature_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import irawan.electroshock.feature_b.databinding.ActivityFeatureBBinding

class FeatureBActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFeatureBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeatureBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent: Intent? = null
            try {
                intent = Intent(this,
                Class.forName("irawan.electroshock.modularization.MainActivity")
                )
                startActivity(intent)
            }catch(e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
    }
}