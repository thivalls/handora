package br.com.handora.zup.handora.controllers;

import br.com.handora.zup.handora.entities.Imovel;
import br.com.handora.zup.handora.repositories.ImovelRepository;
import br.com.handora.zup.handora.requests.ImovelRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("imoveis")
public class ImovelController {

    private final EntityManager entityManager;
    private ImovelRepository imovelRepository;

    public ImovelController(EntityManager entityManager, ImovelRepository repository) {
        this.entityManager = entityManager;
        this.imovelRepository = repository;
    }

    @PostMapping
    public void cadastrar(@RequestBody @Valid ImovelRequest imovelRequest) {
        Imovel imovel = imovelRequest.toModel();
        imovelRepository.save(imovel);
    }

    @GetMapping
    public ResponseEntity<List<Imovel>> index() {
        List<Imovel> imoveis = imovelRepository.findAll();
        return ResponseEntity.ok(imoveis);
    }
}
