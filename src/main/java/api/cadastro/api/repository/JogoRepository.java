package api.cadastro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.cadastro.api.jogo.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
