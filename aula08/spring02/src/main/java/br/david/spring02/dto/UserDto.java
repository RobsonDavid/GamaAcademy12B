package br.david.spring02.dto;

import br.david.spring02.model.User;

// DTO - Data Transfer Objects
public class UserDto {
    // << Atributos >>
    //..... mudando o padrão de nomes (fugindo do padrão)
    private String nomeUsuario;
    private String enderecoEletronico;
    private String cadastroPessoaFisica;

    // << Métodos >>
    // botão direito ... source action
    public UserDto(User user) {
        this.nomeUsuario = user.getName();
        this.enderecoEletronico = user.getEmail();
        this.cadastroPessoaFisica = user.getCpf();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEnderecoEletronico() {
        return enderecoEletronico;
    }

    public void setEnderecoEletronico(String enderecoEletronico) {
        this.enderecoEletronico = enderecoEletronico;
    }

    public String getCadastroPessoaFisica() {
        return cadastroPessoaFisica;
    }

    public void setCadastroPessoaFisica(String cadastroPessoaFisica) {
        this.cadastroPessoaFisica = cadastroPessoaFisica;
    }

        
    

    
}
