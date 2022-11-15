package ifba.bsi.lp2.projeto1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int op, opTS, opCONS;
		int cc = 0, cre = 0, cae = 0;
		int ad = 0, cm = 0, dcc = 0, ha = 0, me = 0, ra = 0, sca = 0, tc = 0, td = 0;
		boolean erro = false;

		Scanner sc = new Scanner(System.in);

		Discente discente = new Discente(0, null, null);
		Requerimento requerimento = new Requerimento(0, 0, null, null, null, null);
		ArrayList<Discente> listaDiscentes = new ArrayList<>();
		ArrayList<Requerimento> listaRequerimentos = new ArrayList<>();

		do {
			System.out.println("__________MENU__________");
			System.out.println("1 - Cadastrar Discente ");
			System.out.println("2 - Novo Requerimento ");
			System.out.println("3 - Consultas ");
			System.out.println("4 - Encerrar ");
			System.out.println("________________________");

			System.out.println("Digite a opcao (1-4): ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Cadastrar discente: ");

				System.out.println("Numero de matricula: ");
				int numeroMatricula = sc.nextInt();

				System.out.println("Nome: ");
				String nome = sc.next(); // não está aceitando espaços

				System.out.println("Curso: ");
				String curso = sc.next();

				discente = new Discente(numeroMatricula, nome, curso);
				listaDiscentes.add(discente);

				System.out.println("Discente de matricula: " + discente.getNumeroMatricula() + " cadastrado!");

				break;
			case 2:
				System.out.println("Novo Requerimento: ");

				int numeroProtocolo = requerimento.geraNumeroProtocolo();

				// Entrando em loop infinito, socorro!!!!!!!!!!!
				do {
					System.out.println("Numero de matricula do discente: ");
					int numeroMatriuclaR = sc.nextInt(); // matricula de requerimento
					for (int i = 0; i < listaDiscentes.size(); i++) {
						if ((listaDiscentes.get(i).getNumeroMatricula() == numeroMatriuclaR)) {
							break;
						}else {
							System.err.println("Numero de matricula inxistente, digite novamente!");
							erro = true;
						}
					}

				} while (erro = true);

				System.out.println("Tipo de solicitacao: ");

				System.out.println("1 - Aproveitamento de Disciplina");
				System.out.println("2 - Comprovante de Matrícula");
				System.out.println("3 - Diploma de Conclusão de Curso");
				System.out.println("4 - Histórico Acadêmico");
				System.out.println("5 - Matrícula em Estágio");
				System.out.println("6 - Revisão de Avaliação");
				System.out.println("7 - Segunda Chamada de Avaliação");
				System.out.println("8 - Trancamento de Curso");
				System.out.println("9 - Trancamento de Disciplina");

				System.out.println("Selecione o tipo de Solicitacao (1-9): ");

				String tipoSolicitacao = "";

				opTS = sc.nextInt();
				switch (opTS) {
				case 1:
					// setar o tipo como "Aproveitamento de Disciplina"
					tipoSolicitacao = "Aproveitamento de Disciplina";
					cc++; // incrementar cc +1
					ad++; // incrementar Aproveitamento de Disciplina +1
					break;
				case 2:
					tipoSolicitacao = "Comprovante de Matricula";
					cre++;
					cm++;
					break;
				case 3:
					tipoSolicitacao = "Diploma de Conclusão de Curso";
					cre++;
					dcc++;
					break;
				case 4:
					tipoSolicitacao = "Histórico Acadêmico";
					cre++;
					ha++;
					break;
				case 5:
					tipoSolicitacao = "Matrícula em Estágio";
					cae++;
					me++;
					break;
				case 6:
					tipoSolicitacao = "Revisão de Avaliação";
					cc++;
					ra++;
					break;
				case 7:
					tipoSolicitacao = "Segunda Chamada de Avaliação";
					cc++;
					sca++;
					break;
				case 8:
					tipoSolicitacao = "Trancamento de Curso";
					cre++;
					tc++;
					break;
				case 9:
					tipoSolicitacao = "Trancamento de Disciplina";
					cre++;
					td++;
					break;
				}

				System.out.println("Data: ");
				System.out.println("Dia: ");
				int dia = sc.nextInt();
				System.out.println("Mes: ");
				int mes = sc.nextInt();
				System.out.println("Ano: ");
				int ano = sc.nextInt();
				Date data = new Date(dia, mes, ano);

				System.out.println("Observacao: ");
				String observacao = sc.next(); // provavelmente tambem não vai aceitar espaços

				String status = "Aberto";
				numeroMatricula = discente.getNumeroMatricula();

				requerimento = new Requerimento(numeroProtocolo, numeroMatricula, tipoSolicitacao, data, observacao,
						status);

				break;
			case 3:
				// Consultas
				do {
					System.out.println("Digite a opção de consulta desejada ");
					opCONS = sc.nextInt();
					switch (opCONS) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					}
				} while (opCONS != 6);
				break;

			case 4:
				// Encerrar programa
				break;
			}

		} while (op != 4);
		sc.close();
	}
}
