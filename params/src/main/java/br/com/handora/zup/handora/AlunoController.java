package br.com.handora.zup.handora;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @GetMapping("/{id}")
    public ResponseEntity<?> index(@PathVariable String id, UrlParams urlParams, @RequestBody FormController form) {
        return ResponseEntity.ok(
                Map.of(
                        "id", id,
                        "url", urlParams,
                        "body", form
                )
        );
    }

}
