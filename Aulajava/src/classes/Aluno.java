package classes;

import java.util.ArrayList;

public class Aluno {
public ArrayList<Integer> notas;
//metodo construtor
public Aluno(String nome, String curso, String turma){
    this.nome= nome;
    this.curso= curso;
    this.turma= turma;
    this.notas = new ArrayList<Integer>();
}

    //atributos
    public String nome;
    public String curso;
    public String turma;
    
    public int SomarNotas() {

        int soma = 0;
        for(Integer nota : notas){
            soma+= nota;
        }
           return soma;
    }
        public void Situacao(){
          int soma = SomarNotas();
          int qtd = notas.size();
          int media = soma / qtd;

          if( media >= 6){
            System.out.println("aprovado");
          }
          else{
            System.out.println("reprovado");
          }


        }
}
