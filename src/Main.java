import br.com.mrodrigochaves.desafio.dominio.Curso;

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
        

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
