package br.com.mjaraujo.padariakotlin.model.interfaces

import br.com.mjaraujo.padariakotlin.models.Categoria
import java.io.Serializable

interface IProduto:Serializable {
    var id: String?
    var categoria: Categoria?
    var nome: String?
    var descricao: String?
    var preco: Double?
}