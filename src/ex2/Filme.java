package ex2;

public class Filme {
    String titulo;
    String diretor;
    int anoDeLancamento;
    double avaliacao;

    public Filme(String titulo, String diretor, int anoDeLancamento, double avaliacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Movie" +
                "titulo ='" + titulo + '\'' +
                ", diretor ='" + diretor + '\'' +
                ", anoDeLancamento =" + anoDeLancamento +
                ", avaliacao =" + avaliacao;
    }
}
