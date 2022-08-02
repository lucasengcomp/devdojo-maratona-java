package academy.devdojo.maratonajava.associacao.dominio.exercicios.test;


import academy.devdojo.maratonajava.associacao.dominio.exercicios.dominio.Aluno;
import academy.devdojo.maratonajava.associacao.dominio.exercicios.dominio.Local;
import academy.devdojo.maratonajava.associacao.dominio.exercicios.dominio.Professor;
import academy.devdojo.maratonajava.associacao.dominio.exercicios.dominio.Seminario;

public class AssociacaoTest01 {

    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar o one piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
