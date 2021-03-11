package com.uem.restconcesionario.modelo.persistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer> {

}

