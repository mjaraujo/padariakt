package br.com.mjaraujo.padariakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.mjaraujo.padariakotlin.models.Categoria
import br.com.mjaraujo.padariakotlin.models.Pao
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_doces.*

class DocesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doces)

        btn_add_carrinho_doces.setOnClickListener {
            val paoSimples = Pao(
                "01",
                "Doce simples",
                "Doce feito com água, trigo, sal e fermento",
                3.80,
                Categoria.PAO
            )
            CarrinhoActivity(carrinhoListener, paoSimples).show(
                supportFragmentManager,
                "fragment_alert"
            )
        }


        btn_voltar_doces.setOnClickListener {
            finish()
        }
    }

    private val carrinhoListener: CarrinhoActivity.OkListener =
        object : CarrinhoActivity.OkListener {
            override fun onOkClick(quantidade: Int) {
                Snackbar.make(
                    btn_add_carrinho_doces,
                    quantidade.toString() + " Doce adicionado ao carrinho",
                    Snackbar.LENGTH_SHORT
                ).show()
            }

        }

}