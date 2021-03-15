package br.com.mjaraujo.padariakotlin.models

import br.com.mjaraujo.padariakotlin.model.interfaces.IProduto
import java.io.Serializable

class Pao(
    override var id: String? = null,
    override var nome: String? = null,
    override var descricao: String? = null,
    override var preco: Double? = null,
    override var categoria: Categoria? = null
) : IProduto, Serializable {
}