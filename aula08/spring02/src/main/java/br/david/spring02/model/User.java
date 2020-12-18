package br.david.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// anotações = javax.persistence
@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "user") // ligar com tabela
@Getter @Setter @NoArgsConstructor  // gerar na compilação todos os métodos

public class User {
    // << atributos >>

    // anotações - sempre antes do campo
    @Id // ligar com coluna e chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
    @Column(name = "id") // nome da coluna
    private int id;

    // correspondencia tipo JAVA com tipo Banco Dados
    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "cpf", length = 11, nullable = false, unique =  true)
    private String cpf;

    @Column(name = "password", length = 30, nullable = false)
    private String password;

    // 1 User faz 1 Anúncio e um Usuário tem vários anuncios
    @OneToMany(mappedBy = "user")
    // evitar lopping - no JSON se estiver listando usuário não mostrar anúncio duplicado
    @JsonIgnoreProperties("user")
    private List<Anuncio> anuncios;


    // << métodos >>

    // só tinha o construtor genérico - não declarado
    // mas... agora precisamos de um novo consutrutor com 2 atributos e 
    // também temos que declarar o construtor sem atributos


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    
 
}
