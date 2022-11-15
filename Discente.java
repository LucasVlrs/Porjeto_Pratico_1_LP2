package ifba.bsi.lp2.projeto1;

public class Discente{
	int numeroMatricula;
	String nome;
	String curso;
	
	//Curso curso
	
	public Discente(int numeroMatricula, String nome, String curso) {
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.curso = curso;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
