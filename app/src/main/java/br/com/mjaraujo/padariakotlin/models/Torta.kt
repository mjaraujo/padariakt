package br.com.mjaraujo.padariakotlin.models

import br.com.mjaraujo.padariakotlin.model.interfaces.IProduto
import java.io.Serializable

class Torta(
    override var id: String?,
    override var categoria: Categoria?,
    override var nome: String?,
    override var descricao: String?,
    override var preco: Double?
) : IProduto, Serializable {
}