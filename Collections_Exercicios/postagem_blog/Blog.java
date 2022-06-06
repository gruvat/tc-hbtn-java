package postagem_blog;

import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) throws Exception {
        if (postagens.contains(postagem)) {
            throw new Exception("Postagem jah existente");
        } else {
            this.postagens.add(postagem);
        }
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        for (Post post : this.postagens) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        TreeMap<Categorias, Integer> postsPorCategoria = new TreeMap<>();

        for (Post post : this.postagens) {
            Categorias categoria = post.getCategoria();
            Integer numeroDePostsCategoria = postsPorCategoria.get(categoria);

            if (numeroDePostsCategoria == null) {
                postsPorCategoria.put(categoria, 1);
            } else {
                postsPorCategoria.put(categoria, ++numeroDePostsCategoria);
            }
        }

        return postsPorCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsDoAutor = new TreeSet<>();

        for (Post post : this.postagens) {
            if ( autor.equals(post.getAutor()) ) {
                postsDoAutor.add(post);
            }
        }

        return postsDoAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsDaCategoria = new TreeSet<>();

        for (Post post : this.postagens) {
            if (categoria.equals(post.getCategoria())) {
                postsDaCategoria.add(post);
            }
        }

        return postsDaCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosPostsPorCategoria = new TreeMap<>();

        for (Categorias categoria : Categorias.values()) {
            Set<Post> postsDaCategoria = this.obterPostsPorCategoria(categoria);
            todosPostsPorCategoria.put(categoria, postsDaCategoria);
        }

        return todosPostsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPostsPorAutor = new TreeMap<>();

        for (Autor autor : this.obterTodosAutores()) {
            Set<Post> postsDoAutor = this.obterPostsPorAutor(autor);
            todosPostsPorAutor.put(autor, postsDoAutor);
        }

        return todosPostsPorAutor;
    }

}
