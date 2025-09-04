import ex2.CatalogoFilmes;
import ex2.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("branca de neve", "David Hand", 1937, 9.1);
        Filme filme2 = new Filme("Matrix", "Wachowski", 1999, 9.0);
        Filme filme3 = new Filme("Gladiador", "Ridley Scott", 1999, 9.5);
        Filme filme4 = new Filme("O Resgate do Soldado Ryan", "Steven Spielberg", 1998, 7.7);
        Filme filme5 = new Filme("Interestelar", "Christopher Nolan", 2014, 8.6);

        CatalogoFilmes catalogoFilmes = new CatalogoFilmes();
        catalogoFilmes.addNovoFilme(filme1);
        catalogoFilmes.addNovoFilme(filme2);
        catalogoFilmes.addNovoFilme(filme3);
        catalogoFilmes.addNovoFilme(filme4);
        catalogoFilmes.addNovoFilme(filme5);

        catalogoFilmes.buscarFilmes("branca de neve");
        catalogoFilmes.listarFilmesPorAno(1999);
        System.out.println("-----");
        catalogoFilmes.filmesMelhorAvaliacao();
        System.out.println("-----");
        catalogoFilmes.listarFilmes();

    }
}