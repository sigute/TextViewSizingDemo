package com.github.sigute.textviewsizing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.github.sigute.textviewsizing.examples.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onResume() {
        super.onResume()
        spVsDpButton.setOnClickListener { goTo(SpVsDpActivity::class.java) }
        ellipsizingButton.setOnClickListener { goTo(EllipsizingActivity::class.java) }
        cutOffButton.setOnClickListener { goTo(CutOffActivity::class.java) }
        overlayButton.setOnClickListener { goTo(OverlayActivity::class.java) }
        autosizingButton.setOnClickListener { goTo(AutosizingActivity::class.java) }
    }

    private fun <T> goTo(activityClass: Class<T>) {
        startActivity(Intent(this, activityClass))
    }
}
