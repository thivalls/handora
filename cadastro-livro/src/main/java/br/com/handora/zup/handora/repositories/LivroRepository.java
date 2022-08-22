package br.com.handora.zup.handora.repositories;

import br.com.handora.zup.handora.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
