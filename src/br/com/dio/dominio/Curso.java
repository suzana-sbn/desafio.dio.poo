package br.com.dio.dominio;

public class Curso {
    private String Titulo;
    private String descricao;
    private int cargahorario;

    public String getTitulo() {
        return Titulo;
    }

    public Curso() {
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahorario() {
        return cargahorario;
    }

    public void setCargahorario(int cargahorario) {
        this.cargahorario = cargahorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargahorario=" + cargahorario +
                '}';
    }
}

