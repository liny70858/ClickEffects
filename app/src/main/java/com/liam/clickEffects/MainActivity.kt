package com.liam.clickEffects

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.liam.clickEffects.bloom.Bloom
import com.liam.clickEffects.bloom.effector.BloomEffector
import com.liam.clickEffects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val viewBinding: ActivityMainBinding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(viewBinding.root)
        initClickListener()
    }

    private fun initClickListener() {
        viewBinding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Bloom.with(this)
            .setParticleRadius(5f)
            .setEffector(
                BloomEffector.Builder()
                    .setDuration(800)
                    .setAnchor(((v?.width ?:0) / 2).toFloat(), ((v?.height ?:0) / 2).toFloat())
                    .build()
            )
            .boom(v)
        if (v == viewBinding.button) {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
        }
    }
}