package br.com.mjaraujo.padariakotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nv_principal.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mn_paes -> Intent(this, PaesActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_tortas -> Intent(this, TortasActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_bolos -> Intent(this, BolosActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_cafes -> Intent(this, CafesActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_doces -> Intent(this, DocesActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_omeletes -> Intent(this, OmeletesActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_salgados -> Intent(this, TortasActivity::class.java).apply {
                startActivity(this)
            }
            R.id.mn_sanduiches -> Intent(this, TortasActivity::class.java).apply {
                startActivity(this)
            }
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_lateral, menu)
        return true
    }
}