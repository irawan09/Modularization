package irawan.electroshock.modularization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import irawan.electroshock.feature_a.FeatureAActivity
import irawan.electroshock.feature_b.FeatureBActivity
import irawan.electroshock.modularization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            startActivity(Intent(this, FeatureAActivity::class.java))
        }
        binding.btnB.setOnClickListener {
            startActivity(Intent(this, FeatureBActivity::class.java))
        }

    }
}