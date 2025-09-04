package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CatalogoFilmes {
    List<Filme> filmeList = new ArrayList<>();


    public void addNovoFilme(Filme filme) {
        filmeList.add(filme);
    }

    public void buscarFilmes(String titulo) {
        for (Filme filme : filmeList) {
            if (Objects.equals(filme.titulo, titulo)) {
                System.out.println(filme);
                return;
            }
        }
        throw new NotFoundException("Filme com o titulo " + titulo + " n encontrado");
    }

    public void listarFilmesPorAno(int ano) {
        for (Filme filme : filmeList) {
            if (filme.anoDeLancamento == ano) {
                System.out.println(filme);
            }
        }
    }
    public void listarFilmes() {
        for (Filme filme : filmeList) {
            System.out.println(filme);
        }
    }

    public void filmesMelhorAvaliacao() {
        double maiorAvalicao = 0;
        for (Filme filme : filmeList) {
            if (filme.avaliacao > maiorAvalicao) {
                maiorAvalicao = filme.avaliacao;
            }
        }

        for (Filme filme : filmeList) {
            if (filme.avaliacao == maiorAvalicao) {
                System.out.println(filme);
            }
        }
    }
}
