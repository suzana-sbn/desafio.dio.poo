import br.com.dio.dominio.*;

import java.time.LocalDate;

public class Main {
public static void main(String[] args){
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargahorario(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descricao curso js");
    curso2.setCargahorario(5);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria do java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devSuzana = new Dev();
    devSuzana.setNome("Suzana");
    devSuzana.increverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Suzana:" + devSuzana.getConteudosInscritos());
    devSuzana.progredir();
    devSuzana.progredir();
    devSuzana.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos Suzana:" + devSuzana.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Suzana:" + devSuzana.getConteudosConcluidos());
    System.out.println("xp:" + devSuzana.calcularTotalXp());

    System.out.println("-------");

    Dev devCaio = new Dev();
    devCaio.setNome("Caio");
    devCaio.increverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Caio:" + devCaio.getConteudosInscritos());
    devCaio.progredir();
    devCaio.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos Caio:" + devCaio.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Caio:" + devCaio.getConteudosConcluidos());
    System.out.println("xp:" + devCaio.calcularTotalXp());

    Dev devCaic = new Dev();
    devCaic.setNome("Caic");
    devCaic.increverBootcamp(bootcamp);
    System.out.println("Conteudos Inscritos Caic:"+ devCaic.getConteudosInscritos());
    devCaic.progredir();
    System.out.println("-");
    System.out.println("Conteudos Inscritos Caic:"+ devCaic.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Caic:"+ devCaic.getConteudosConcluidos());
    System.out.println("xp:" + devCaic.calcularTotalXp());



    //System.out.println(curso1);
    //System.out.println(curso2);
    //System.out.println(mentoria);

}
}
