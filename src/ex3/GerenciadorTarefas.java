package ex3;

import ex2.NotFoundException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private final String caminhoArquivo = "C:\\Users\\Users\\OneDrive\\Documentos\\estudos\\src\\ex3\\tarefas.txt";
    public List<Tarefa> tarefaList = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(proximoId++, descricao, false);
        tarefaList.add(tarefa);
        try (BufferedWriter file = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            file.write(tarefa.getId() + ";" + tarefa.getDescricao() + ";" + tarefa.isConcluida() + "\n");
            System.out.println("Tarefa adicionada com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar a tarefa no arquivo: " + e.getMessage());
        }
    }

    public void concluirTarefa(int id) {
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.id == id) {
                tarefa.setConcluida(true);
                System.out.println("tarefa concluida com sucesso");
                break;
            }
            throw new NotFoundException("tarefa não encontrada");
        }
    }

    public void removerTarefa(int id) {
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.id == id) {
                tarefaList.remove(tarefa);
                System.out.println("tarefa removida com sucesso");
                break;
            }
            throw new NotFoundException("tarefa não encontrada");
        }
    }

    public void listarTarefas() {
        if (tarefaList.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada");
        }
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa);
        }
    }

}
