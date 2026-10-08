package br.com.fiap.natura.filas;

import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
        FilaEmpresas filaTriagem = new FilaEmpresas(50);
        filaTriagem.inicializa();

        FilaEmpresas filaPendente = new FilaEmpresas(50);
        filaPendente.inicializa();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Início de Cadastro");
            System.out.println("2. Atendimento de Cadastro");
            System.out.println("3. Atendimento de Pendências");
            System.out.println("4. Encerrar Atendimento");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Informe o CNPJ da empresa: ");
                    String cnpj = scanner.nextLine();
                    System.out.print("Informe o material a ser usado no projeto (plástico, vidro, papel): ");
                    String material = scanner.nextLine();

                    Empresa empresa = new Empresa(cnpj, material, "inicial");
                    filaTriagem.enfileirar(empresa);

                    System.out.println("Empresa cadastrada com CNPJ " + cnpj + " na fila de triagem.");
                    break;
                case 2:
                    atenderCadastro(filaTriagem, filaPendente, scanner);
                    break;
                case 3:
                    atenderPendencias(filaPendente, scanner);
                    break;
                case 4:
                    if (!filaTriagem.estaVazia()) {
                        System.out.println("Esvaziando a fila de triagem...");
                        while (!filaTriagem.estaVazia()) {
                            atenderCadastro(filaTriagem, filaPendente, scanner);
                        }
                    }

                    if (!filaPendente.estaVazia()) {
                        System.out.println("Esvaziando a fila de documentação pendente...");
                        while (!filaPendente.estaVazia()) {
                            atenderPendencias(filaPendente, scanner);
                        }
                    }

                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
        
    public static void atenderCadastro(FilaEmpresas filaTriagem, FilaEmpresas filaPendente, Scanner scanner) {
        if (filaTriagem.estaVazia()) {
            System.out.println("A fila de triagem está vazia. Não há empresas para atender.");
            return;
        }

        System.out.println("Atendendo empresas na fila de triagem:");
        while (!filaTriagem.estaVazia()) {
            Empresa empresa = filaTriagem.peek();
            System.out.print("A empresa com CNPJ " + empresa.pegarCnpj() + " tem todos os documentos necessários? (S/N): ");
            String resposta = scanner.nextLine().toUpperCase();

            if (resposta.equals("S")) {
                empresa.StatusDocumentacao("aprovado");
                System.out.println("Empresa aprovada: CNPJ " + empresa.pegarCnpj() + " Status Documentação: aprovado");

                // Encaminhar o projeto para o or de análise técnica e julgamento aqui
            } else if (resposta.equals("N")) {
                System.out.print("A empresa pode obter o documento em 24 horas? (S/N): ");
                resposta = scanner.nextLine().toUpperCase();
                if (resposta.equals("S")) {
                    empresa.StatusDocumentacao("pendente");
                    filaPendente.enfileirar(empresa); // Adiciona a empresa à fila de documentação pendente
                    System.out.println("Empresa atendida: CNPJ " + empresa.pegarCnpj() + " Status Documentação: pendente");
                } else if (resposta.equals("N")) {
                    empresa.StatusDocumentacao("reprovado");
                    System.out.println("Empresa reprovada: CNPJ " + empresa.pegarCnpj() + " Status Documentação: reprovado");
                } else {
                    System.out.println("Resposta inválida. A empresa não foi atendida.");
                }
            } else {
                System.out.println("Resposta inválida. A empresa não foi atendida.");
            }

            filaTriagem.desenfileirar();
        }
    }

    public static void atenderPendencias(FilaEmpresas filaPendente, Scanner scanner) {
        if (filaPendente.estaVazia()) {
            System.out.println("A fila de documentação pendente está vazia. Não há empresas pendentes para atender.");
            return;
        }

        System.out.println("Atendendo empresas pendentes na fila de documentação pendente:");
        while (!filaPendente.estaVazia()) {
            Empresa empresa = filaPendente.peek();
            System.out.print("A empresa com CNPJ " + empresa.pegarCnpj() + " obteve os documentos em 24 horas? (S/N): ");
            String resposta = scanner.nextLine().toUpperCase();

            if (resposta.equals("S")) {
                empresa.StatusDocumentacao("aprovado");
                System.out.println("Empresa aprovada: CNPJ " + empresa.pegarCnpj() + " Status Documentação: aprovado");

                // Encaminhar o projeto para o or de análise técnica e julgamento aqui
            } else if (resposta.equals("N")) {
                empresa.StatusDocumentacao("reprovado");
                System.out.println("Empresa reprovada: CNPJ " + empresa.pegarCnpj() + " Status Documentação: reprovado");
            } else {
                System.out.println("Resposta inválida. A empresa não foi atendida.");
            }

            filaPendente.desenfileirar();
        }
    }
}