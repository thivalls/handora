package br.com.zup.edu.nutricionistas.controller;

import br.com.zup.edu.nutricionistas.model.Nutricionista;
import br.com.zup.edu.nutricionistas.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("nutricionistas")
public class NutricionistaController {
    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody @Valid NutricionistaRequest nutricionistaRequest, UriComponentsBuilder uriComponentsBuilder) {
        Nutricionista nutricionista = nutricionistaRequest.toModel();
        nutricionistaRepository.save(nutricionista);
        URI uri = uriComponentsBuilder.path("/nutricionistas/{id}").buildAndExpand(nutricionista.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public List<Nutricionista> nutricionistas() {
        List<Nutricionista> nutricionistas = nutricionistaRepository.findAll();
        return nutricionistas;
    }
}
