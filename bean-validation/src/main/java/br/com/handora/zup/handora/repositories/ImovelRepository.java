package br.com.handora.zup.handora.repositories;

import br.com.handora.zup.handora.entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
