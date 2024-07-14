package com.Grb.literalura.modelos;



import com.Grb.literalura.modelos.dto.DatosLibros;
import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(unique = true)
    private String titulo;
    private String idioma;
    private Double descargas;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    public Libro() {
    }

    public Libro(DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.idioma = datosLibros.idioma().get(0);
        this.descargas = datosLibros.numeroDeDescargas();
    }

    @Override
    public String toString() {
         String libro = "__________________________________" +
                        "\n========== Libros ===============" +
                        "\nTitulo: " + this.titulo +
                        "\nAutor: " + this.autor.getNombre() +
                        "\nIdioma: " + this.idioma +
                        "\nDescargas: " + this.descargas;

        String footer = "\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°";
        return libro + footer;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Autor getAutor() {
        return autor;
    }

    public Double getDescargas() {
        return descargas;
    }

    public void setDescargas(Double descargas) {
        this.descargas = descargas;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

