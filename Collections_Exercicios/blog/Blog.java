package blog;

import java.util.*;

public class Blog {
    private ArrayList<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post postagem) {
        this.posts.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<String>();

        for (Post post : this.posts) {
            autores.add(post.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        TreeMap<String, Integer> postsPorCategoria = new TreeMap<String, Integer>();

        for (Post post : this.posts) {
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
