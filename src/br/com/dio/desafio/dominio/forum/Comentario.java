package br.com.dio.desafio.dominio.forum;

import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDateTime;

public class Comentario {
    private Dev usuario;
    private String mensagem;
    private LocalDateTime data = LocalDateTime.now();

    public Comentario(Dev usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public Dev getUsuario() {
        return usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "usuario=" + usuario +
                ", mensagem='" + mensagem + '\'' +
                ", data=" + data +
                '}';
    }
}
