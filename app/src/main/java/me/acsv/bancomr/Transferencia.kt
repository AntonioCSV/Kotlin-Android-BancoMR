package me.acsv.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import me.acsv.bancomr.databinding.ActivityTransferenciaBinding

class Transferencia : AppCompatActivity() {

    private lateinit var binding: ActivityTransferenciaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransferenciaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.toolbarTransferencia.let {
            it.title = "Transferência"
            it.setTitleTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            it.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.light_blue))
            it.navigationIcon = ContextCompat.getDrawable(applicationContext, R.drawable.ic_voltar)
            it.setNavigationOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}