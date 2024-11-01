package com.example.pookotlinencapsulamento

class Livro(
    titulo: String,
    autor: String,
    editora: String,
    localizacao: String,
    paginas: Int
) {
    private var _titulo = titulo
    private var _autor = autor
    private var _editora = editora
    private var _localizacao = localizacao
    private var _paginas = paginas

    var titulo: String
        get() = _titulo
        set(valor) {
            _titulo = valor
        }

    var autor: String
        get() = _autor
        set(valor) {
            _autor = valor
        }

    var editora: String
        get() = _editora
        set(valor) {
            _editora = valor
        }

    var localizacao: String
        get() = _localizacao
        set(valor) {
            _localizacao = valor
        }

    var paginas: Int
        get() = _paginas
        set(valor) {
            _paginas = valor
        }
}