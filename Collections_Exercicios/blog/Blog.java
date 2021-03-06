package blog;

import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem) {
        this.postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<String>();

        for (Post post : this.postagens) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        TreeMap<String, Integer> postsPorCategoria = new TreeMap<String, Integer>();

        for (Post post : this.postagens) {
            String categoria = post.getCategoria();
            Integer numeroDePostsCategoria = postsPorCategoria.get(categoria);

            if (numeroDePostsCategoria == null) {
                postsPorCategoria.put(categoria, 1);
            } else {
                postsPorCategoria.put(categoria, ++numeroDePostsCategoria);
            }
        }

        return postsPorCategoria;
    }

}
