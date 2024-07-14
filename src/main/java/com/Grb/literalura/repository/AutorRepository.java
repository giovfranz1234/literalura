package com.Grb.literalura.repository;

import com.Grb.literalura.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import java.util.List;
import java.util.Optional;



public interface AutorRepository extends JpaRepository<Autor,Long>{

    Optional<Autor> findByNombre(String nombre);
    @Query("SELECT a FROM Autor a WHERE :anio between a.annoNacimiento AND a.annoMuerte")
    List<Autor> encontrarAutoresEntreFechas(Integer anio);

//     List<Autor> findByAnnoMuerteBeetweenAnno(Integer annoMuerte);
}

