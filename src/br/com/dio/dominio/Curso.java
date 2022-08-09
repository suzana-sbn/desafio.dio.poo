package br.com.dio.dominio;

public class Curso extends Conteudo{

    private int cargahorario;


    @Override
    public double calcularxp() {
        return XP_PADRAO * cargahorario;
    }

    public Curso() {
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
                "Titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahorario=" + cargahorario +
                '}';
    }
}

