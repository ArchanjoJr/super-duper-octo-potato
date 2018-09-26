package br.com.fatec.engine;

import java.io.Serializable;
import java.util.List;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;

public class Agenda implements Serializable {
	private List<Aluno> alunos;
	private List<Professor> professores;
	/*
	 */
	public void removerAluno (String numMat){
    int remov = 0;
	  for (Aluno al: alunos) {
      if(al.getNumeroMatricula() == numMat){
        alunos.remove(alunos.indexOf(al));
        remov++;
      }
    }
    if(remov == 0){
      System.out.print("Nenhum aluno Removido");
    }else{
      System.out.print("ALUNO REMOVIDO COM SUCESSO");
    }
  }
	public void inserirAlunos(String nome, String telefone, String email, String numMat){
		Aluno a = new Aluno(nome, telefone, email, numMat);
		alunos.add(a);
		System.out.println("Aluno Inserido com sucesso");
	}
	public void editarAlunos(String numMat, Aluno al){
	  int encontrou = 0;
	  for(Aluno a: alunos){
	    if(a.getNumeroMatricula() == numMat){
	      encontrou++;
	      a.setNome(al.getNome());
	      a.setEmail(al.getEmail());
	      a.setTelefone(al.getTelefone());
      }
    }
    if(encontrou == 0){
      System.out.print("Nenhum Usuario Editado");
    }
    System.out.print("Usuario Editado com Sucesso");
  }

  public void removerProfessor (String numReg){
    int remov = 0;
    for (Professor pr: professores) {
      if(pr.getNumeroRegistro() == numReg){
        professores.remove(professores.indexOf(pr));
        remov++;
      }
    }
    if(remov == 0){
      System.out.print("Nenhum Professor Removido");
    }else{
      System.out.print("PROFESSOR REMOVIDO COM SUCESSO");
    }
  }
  public void inserirProfessor(String nome, String telefone, String email, String numReg, String qtdHoras) {
    Professor pr = new Professor(nome, telefone, email, numReg, qtdHoras);
    professores.add(pr);
    System.out.println("Professor Inserido com sucesso");
  }
  public void editarProfessor(String numReg, Professor pr){
    int encontrou = 0;
    for(Professor p : professores){
      if (p.getNumeroRegistro() == numReg) {
        encontrou++;
        p.setNumeroRegistro(pr.getNumeroRegistro());
        p.setQuantidadeHoraAula(pr.getQuantidadeHoraAula());
        p.setEmail(pr.getEmail());
        p.setNome(pr.getNome());
        p.setTelefone(pr.getTelefone());
      }
    }
    if(encontrou == 0){
      System.out.print("Nenhum Professor Editado");
    }
    System.out.print("Professor Editado com Sucesso");
  }

  public void listarTodos() {
		System.out.println("Lista de contatos de alunos: ");
		for(Aluno aluno:alunos)
		{
			System.out.println(aluno);
		}
		System.out.println("Lista de contatos de alunos: ");
		for(Professor professor:professores)
		{
			System.out.println("Nome: "+professor.getNome());
			System.out.println("Telefone: "+professor.getTelefone());
			System.out.println("Email: "+professor.getEmail());
			System.out.println("Registro: "+professor.getNumeroRegistro());
			System.out.println("Quantidade Hora: "+professor.getQuantidadeHoraAula()+"\n");
		}

	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
}
