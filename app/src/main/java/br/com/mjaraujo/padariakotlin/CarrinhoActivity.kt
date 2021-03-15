package br.com.mjaraujo.padariakotlin

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import br.com.mjaraujo.padariakotlin.model.interfaces.IProduto
import kotlinx.android.synthetic.main.activity_carrinho.*
import kotlinx.android.synthetic.main.activity_paes.*

val EXTRA_PRODUCT = "extra_produto"

class CarrinhoActivity(var okListener: OkListener,var produto: IProduto) : DialogFragment() {

    interface OkListener {
        fun onOkClick()
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .create()

    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        showsDialog = false
        return inflater.inflate(R.layout.activity_carrinho, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val builder = AlertDialog.Builder(requireContext())
            .setView(view)
        val mAlertDialog = builder.show()

        Toast.makeText(requireContext(), produto.nome, Toast.LENGTH_SHORT).show()
        txt_nome.text = produto.nome
        txt_descricao_produto.text = produto.descricao

        btn_ok_add_carrinho.setOnClickListener {
            okListener.onOkClick()
            mAlertDialog.dismiss()
        }

    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
    }
}