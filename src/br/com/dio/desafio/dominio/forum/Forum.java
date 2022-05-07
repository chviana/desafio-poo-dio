package br.com.dio.desafio.dominio.forum;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<Topico> topicos;

    public void adicionarTopico(Topico topico) {
        this.getTopicos().add(topico);
    }

    public void listarTodosTopicos() {
        List<Topico> listaTopicos = getTopicos();
        System.out.println("Lista de tópicos: " + listaTopicos);
    }

    private List<Topico> getTopicos() {
        if (this.topicos == null) {
            this.topicos = new ArrayList<>();
        }
        return topicos;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "topicos=" + topicos +
                '}';
    }
}
