package br.david.spring02.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.david.spring02.model.User;

// CRUD - Create Read Update Delete  (+ findAll + findById) -  vem pronto do JPA
public interface UserDAO extends CrudRepository<User, Integer> {
   // +- abstrato
   // só descrever métodos, não codificar arqui
   // definir modelo que deve ser seguido para criar outras classes


    // findByemail - nome atributo objeto, seguindo convenção
    // só declaração !!
    public User findByEmail (String email) ;

    // consulta por e-mail e password - encontrou ou não
    public User findByEmailAndPassword (String email, String password) ;

    // consulta por e-mail ou cpf
    public User findByEmailOrCpf(String email, String cpf);


    // findByemailLike
    public User findByEmailLike (String email) ;


    // fazendo consulta na mão
    // considerando objetos (não nativa) e não tabelas do banco de dados - mantém a independência
    // só vai ter 2 informações, precisa de um construtor
    @Query(value="Select new User(u.name, u.email) from User u where u.id = :cod")
    public User buscaPorId(@Param("cod") Integer codigo);


    // fazendo na mão  - Query Nativa
    @Query(value="Select name, email from user where id = :cod", nativeQuery = true)
    public Object buscaPorIdN(@Param("cod") Integer codigo);



    @Query(value="Select new User(u.name, u.email) from User u where u.email like :email")
    public User buscaPorEmailLike(@Param("email") String email);

    @Query(value="Select new User(u.name, u.email) from User u where u.email like :email")
    public Object[] buscaPorEmailLikeN(@Param("email") String email);


}


