package com.Grb.literalura.modelos.dto;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
        @JsonAlias("name") String nombre,
        @JsonAlias("birth_year") Integer fechaDeNacimiento,
        @JsonAlias("death_year") Integer fechaDeMuerte
) {
}

// import com.fasterxml.jackson.annotation.JsonAlias;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// @JsonIgnoreProperties(ignoreUnknown = true)
// public record DatosAutor(
// @JsonAlias("name")String nombre,
// @JsonAlias("birth_year")Integer annoNacimiento,
// @JsonAlias("death_year")Integer annoMuerte) {

// }
