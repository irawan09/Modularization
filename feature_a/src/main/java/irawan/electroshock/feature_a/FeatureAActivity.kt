package irawan.electroshock.feature_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import irawan.electroshock.feature_a.databinding.ActivityFeatureABinding

class FeatureAActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFeatureABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeatureABinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent: Intent? = null
            try{
                intent = Intent(
                    this,
                    Class.forName("irawan.electroshock.feature_b.FeatureBActivity")
                )
                startActivity(intent)
            } catch (e : ClassNotFoundException){
                e.printStackTrace()
            }
        }
    }
}