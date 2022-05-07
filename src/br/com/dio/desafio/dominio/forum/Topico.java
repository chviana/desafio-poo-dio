package br.com.dio.desafio.dominio.forum;

import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {

    private Dev usuario;
    private String titulo;
    private String mensagem;
    private LocalDateTime data = LocalDateTime.now();
    private List<Comentario> comentarios;

    public Dev getUsuario() {
        return usuario;
    }

    public void setUsuario(Dev usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    private List<Comentario> getComentarios() {
        if (this.comentarios == null) {
            this.comentarios = new ArrayList<>();
        }
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        getComentarios().add(comentario);
    }

    @Override
    public String toString() {
        return "Topico{" +
                "usuario=" + usuario +
                ", titulo='" + titulo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", data=" + data +
                ", comentarios=" + comentarios +
                '}';
    }
}
