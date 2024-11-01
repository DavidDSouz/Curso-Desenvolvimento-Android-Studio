package com.example.pooencapsulamento;

/**
 *  Classe Livro - ENcapsulamento
 *
 *  Atributos
 *
 *  - Titulo - caracteres / String
 *  - Autor - caracteres / String
 *  - Editora - caracteres / String
 *  - Paginas - numeros inteiros / int / Integer
 *  - Localizacao - caracteres / String
 *
 * Construtors - cria a instancia dos objetos da classe
 *
 * Métodos
 *
 * gets
 * sets
 *
 */

public class Livro {

    private String Titulo;
    private String Autor;
    private String Editora;
    private int Paginas;
    private String Localizacao;


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int paginas) {
        Paginas = paginas;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }
}
