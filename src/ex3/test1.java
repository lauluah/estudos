package ex3;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======= MENU DE TAREFAS =======");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Concluir tarefa");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Listar tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;

                case 2:
                    System.out.print("ID da tarefa para concluir: ");
                    int idConcluir = scanner.nextInt();
                    gerenciador.concluirTarefa(idConcluir);
                    break;

                case 3:
                    System.out.print("ID da tarefa para remover: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerTarefa(idRemover);
                    break;

                case 4:
                    gerenciador.listarTarefas();
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

