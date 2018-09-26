package br.com.fatec.modelo;

public class Aluno extends Pessoa {
	private String numeroMatricula;
	@Override
	public String toString()
  {
	  return new StringBuffer("\nNumero Matricula: ").append(this.numeroMatricula).toString();
  }
	public Aluno(String nome, String telefone, String email, String numeroMatricula) {
		super(nome, telefone, email);
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String dadosFormatados()
	{
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados+"\nMatricula: "+this.getNumeroMatricula();
		return dadosFormatados;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}
