package br.david.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



// anotações = javax.persistence
@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "anuncio") // ligar com tabela

public class Anuncio {

    @Id // ligar com coluna e chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
    @Column(name = "id") // nome da coluna
    private int id;

    @Column(name = "descricao", length = 200, nullable = false)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private double valor;


      // 1 User faz 1 Anúncio e um Usuário tem vários anuncios
      @ManyToOne
      @JoinColumn(name = "id_user")
      // evitar looping - no JSON se estiver listando anúncio não mostrar user duplicado
      @JsonIgnoreProperties("anuncios")
      private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // só com o get/set é que passa a mostrar informações do usuário no anúncio.
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
