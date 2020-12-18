package br.david.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.david.spring02.dao.UserDAO;
import br.david.spring02.dto.UserDto;
import br.david.spring02.model.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    // anotação
    @Autowired
    // JPA cria classe a partir do UserDAO com todos os métodos, gerando objeto
    // "dao"
    // injeção de dependência
    private UserDAO dao;

    // métodos - pedidos usuários e devolver

    @GetMapping("/all")
    public List<User> listarTodos() {
        List<User> lista = (List<User>) dao.findAll();
        return lista;
    }

    @GetMapping("/id/{id}") // nome da variável = {id}
    public ResponseEntity<User> buscaPorId(@PathVariable int id) { // igual ao nome acima - fazer correspondência
        // findbyid - retornar objeto
        // criar objeto "user" para receber
        // se não achou, move nullo
        User user = dao.findById(id).orElse(null);

        if (user != null) {
            user.setPassword("******"); // troca informação só de memória
            return ResponseEntity.ok(user); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }

    @PostMapping("/new")
    public ResponseEntity<User> novoUsuario(@RequestBody User user) { // recebe no corpo da requisição
        User newUser = dao.save(user); // cria novo usuário

        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/email")
    public ResponseEntity<UserDto> buscaPorEmail(@RequestBody User user) {
        // não é atualização, mas usa post porque usa informações no body
        User userFinded = dao.findByEmail(user.getEmail());

        if (userFinded != null) {
            // mapear no novo objeto para reduzir os campos apresentados.
            UserDto userDto = new UserDto(userFinded);
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/emailx")
    public ResponseEntity<User> buscaPorEmailX(@RequestBody User user) {
        // não é atualização, mas usa post porque usa informações no body
        User userFinded = dao.findByEmail(user.getEmail());

        if (userFinded != null) {
            return ResponseEntity.ok(userFinded);
        }
        return ResponseEntity.notFound().build();
    }

    // ???? não funcionou ????
    @GetMapping("/email/{emaillike}")
    public ResponseEntity<User> buscaPorEmailLike(@PathVariable String emaillike) {
        User userX = dao.findByEmailLike(emaillike);

        if (userX != null) {
            return ResponseEntity.ok(userX); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }

    // ???? não funcionou ????
    @PostMapping("/emaily")
    public ResponseEntity<User> buscaPorEmailLikeY(@RequestBody User user) {
        User userX = dao.findByEmailLike(user.getEmail());

        if (userX != null) {
            return ResponseEntity.ok(userX); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }

    @PostMapping("/loginemail")
    public ResponseEntity<UserDto> loginPorEmail(@RequestBody User user) {
        User userY = dao.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (userY != null) {
            // 200 - achou e volta objeto
            UserDto userDto = new UserDto(userY);
            return ResponseEntity.ok(userDto);
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }

    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody User user) {
        User userF = dao.findByEmailOrCpf(user.getEmail(), user.getCpf());

        if (userF != null) {
            if (user.getPassword().equals(userF.getPassword())) {
                UserDto userDto = new UserDto(userF);
                return ResponseEntity.ok(userDto);
            } // else {
              // não é uma boa prática explicar o erro - normal: Usuário e/ou Senha inválido
              // return ResponseEntity.status(402).build(); // se quiser avisar erro senha
              // }
        }
        // return ResponseEntity.status(403).build(); // se quiser avisar erro e-mail ou
        // cpf
        return ResponseEntity.status(401).build(); // Usuário e/ou Senha inválido!

    }

    // GET para nova busca com Select na mão
    @GetMapping("/id2/{id}")
    public ResponseEntity<User> buscarPersonalizado(@PathVariable int id) {
        User userPersonalizado = dao.buscaPorId(id);
        if (userPersonalizado != null) {
            return ResponseEntity.ok(userPersonalizado); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }
    /*
     * exemplo de retorno: { "id": 0, "name": "Bruce Wayne", "email":
     * "bruce.wayne@aol.com", "cpf": null, "password": null, "anuncios": null }
     */

    // GET para nova busca com Select NATIVO na mão
    @GetMapping("/idN/{id}")
    public ResponseEntity<Object> buscarPersonalizadoN(@PathVariable int id) {
        Object userPersonalizado = dao.buscaPorIdN(id);
        if (userPersonalizado != null) {
            return ResponseEntity.ok(userPersonalizado); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }
    /*
     * exemplo de retorno: "Bruce Wayne", "bruce.wayne@aol.com"
     */

    // !!! não funcionou ???? 405 ??? ...!!!!
    @GetMapping("/emailw/{email}")
    public ResponseEntity<User> buscaPorEmailLikeW(@PathVariable String email) {
        User userw = dao.buscaPorEmailLike(email);

        if (userw != null) {
            return ResponseEntity.ok(userw); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }


        // !!! não funcionou ???? 405 ??? ...!!!!
        @GetMapping("/emailN/{email}")
        public ResponseEntity<Object> buscaPorEmailLikeN(@PathVariable String email) {
            Object userw = dao.buscaPorEmailLike(email);
    
            if (userw != null) {
                return ResponseEntity.ok(userw); // 200 - achou e volta objeto
            } else {
                return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
            }
        }
}
