import java.time.LocalDate;

import br.com.mrodrigochaves.desafio.dominio.Bootcamp;
import br.com.mrodrigochaves.desafio.dominio.Curso;
import br.com.mrodrigochaves.desafio.dominio.Dev;
import br.com.mrodrigochaves.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
    
    
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMarcio = new Dev();
        devMarcio.setNome("Márcio");
        devMarcio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Márcio" + devMarcio.getConteudosInscritos());
        devMarcio.progredir();
        System.out.println("*");
        System.out.println("Conteúdos Inscritos de Márcio" + devMarcio.getConteudosInscritos());
        System.out.println("Conteudos Concluídos de Márcio" + devMarcio.getConteudosConcluidos());

        System.out.println("**********");

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Rodrigo" + devRodrigo.getConteudosInscritos());
        System.out.println("*");
        System.out.println("Conteúdos Inscritos de Rodrigo" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        System.out.println("Conteúdos Concluídos de Rodrigo" + devRodrigo.getConteudosConcluidos());

    }    
}
