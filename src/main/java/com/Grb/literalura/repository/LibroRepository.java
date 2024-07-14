package com.Grb.literalura.repository;

import com.Grb.literalura.modelos.Autor;
import com.Grb.literalura.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import java.util.List;
import java.util.Optional;





public interface LibroRepository extends JpaRepository<Libro,Long>{
    Optional<Libro> findByTitulo(String nombre);
    Optional<Libro> findByAutor(Autor autor);
    @Query("SELECT l FROM Libro l WHERE l.idioma = :idioma")
    List<Libro> encontrarPorIdioma(String idioma);
    

}
