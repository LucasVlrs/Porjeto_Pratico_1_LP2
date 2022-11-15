package ifba.bsi.lp2.projeto1;

import java.util.ArrayList;
import java.util.Date;

public class Requerimento {
	int numeroProtocolo;
	int numeroMatricula;
	Date data;
	String tipoSolicitacao;
	String observacao;
	String status;
	
	//ArrayList<Requerimento> requerimentosList = new ArrayList<>();
	
	public Requerimento( int numeroProtocolo, int numeroMatricula, String tipoSolicitacao, Date data, String observacao, String status) {
		
		this.numeroProtocolo = numeroProtocolo;
		this.numeroMatricula = numeroMatricula;
		this.data = data;
		this.tipoSolicitacao = tipoSolicitacao;
		this.observacao = observacao;
		this.status = status;
		
	}

	public int geraNumeroProtocolo() {
//		Geração automática de número de protocolo ao se registrar requerimento, considerando, para tal, sequencial de 5 (cinco) dígitos
//		iniciado em 1 (um) acompanhado de dígito verificador de módulo 7 (sete) obtido da seguinte forma:
//			a) Multiplicação de cada dígito, da esquerda para a direita, por número crescente a partir de 6 (seis);
//			b) Soma das multiplicações obtidas no passo anterior;
//			c) Dedução de dígito verificador a partir do cálculo de resto da divisão inteira da soma obtida no passo anterior por 7 (sete).
		numeroProtocolo = 999;
		return numeroProtocolo;
	}
	
	public String atendido(int numProtocolo){ 
		//mudar status do requerimento para atendido
		//exibir numero de protocolo ou recebe numero de protocolo ?? (ver cm Nata)
		status = "Atendido";
		return status;
	}
	
	public String naoPodeSerAtendido(int numProtocolo) {
		//mudar status para não atendido
		System.out.println("Impossível atender o requerimento de número: " + this.numeroProtocolo);
		status = "Não atendido";
		return status;
	}
	public void impedirOperacao(Requerimento r) {
		if(status != "Aberto") {
			System.out.println("Não é permitida a operação em Requerimentos com status diferentes de: Aberto ");
		}
	}
	
	//G&Ss
	
	public String getTipoSolicitacao() {
		return tipoSolicitacao;
	}

	public void setTipoSolicitacao(String tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(int numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacao() {
		return observacao;
	}
}
