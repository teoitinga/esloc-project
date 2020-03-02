package br.com.jp.jpesloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jp.jpesloc.model.RacaBovino;

@Repository
public interface RacaBovinoRepository extends JpaRepository<RacaBovino, Long>{

}
