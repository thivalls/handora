package br.com.handora.zup.handora.controllers;

import br.com.handora.zup.handora.entities.Livro;
import br.com.handora.zup.handora.repositories.LivroRepository;
import br.com.handora.zup.handora.requests.LivroRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("livros")
public class LivroController {
    private LivroRepository livroRepository;

    public LivroController(LivroRepository repository) {
        this.livroRepository = repository;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid LivroRequest livroRequest, UriComponentsBuilder uriComponentsBuilder) {
        Livro livro = livroRequest.toModel();
        livroRepository.save(livro);

        URI uri = uriComponentsBuilder.path("livros/{id}").buildAndExpand(livro.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public ResponseEntity<List<Livro>> index() {
        List<Livro> livros = livroRepository.findAll();
        return ResponseEntity.ok(livros);
    }
}
