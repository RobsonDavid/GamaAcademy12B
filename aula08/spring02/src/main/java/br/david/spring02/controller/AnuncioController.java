package br.david.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.david.spring02.dao.AnuncioDAO;
import br.david.spring02.model.Anuncio;

@RestController
@CrossOrigin("*")
@RequestMapping("/anuncio")
public class AnuncioController {
    
    @Autowired

    private AnuncioDAO dao;

    // métodos - pedidos usuários e devolver
    @GetMapping("/all")
    public List<Anuncio> listarTodos() {
        List<Anuncio> lista = (List<Anuncio>) dao.findAll();
        return lista;
    }

    @GetMapping("/id/{id}") 
    public ResponseEntity<Anuncio> buscaPorId(@PathVariable int id) { 
        Anuncio anuncio = dao.findById(id).orElse(null);

        if (anuncio != null) {
            return ResponseEntity.ok(anuncio); // 200 - achou e volta objeto
        } else {
            return ResponseEntity.notFound().build(); // 404 - not found e montar estrutura vazio
        }
    }

    @PostMapping("/new")
    public ResponseEntity<Anuncio> novoAnuncioo(@RequestBody Anuncio anuncio) {
        Anuncio newAnuncio = dao.save(anuncio); 

        return ResponseEntity.ok(newAnuncio);
    }
}
