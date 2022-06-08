package livraria;

import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class Livro {

    private String titulo;
    private String autor;
    private Double preco;

    public Livro(String titulo, String autor, Double preco) throws LivroInvalidoException, AutorInvalidoException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() >= 3){
            this.titulo = titulo;
        } else {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if (autor.split(" ").length >= 2) {
            this.autor = autor;
        } else {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
    }

    public void setPreco(Double preco) throws LivroInvalidoException {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new LivroInvalidoException("Preco de livro invalido");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }
}
