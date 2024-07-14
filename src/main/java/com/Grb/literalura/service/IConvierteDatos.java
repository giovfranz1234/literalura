package com.Grb.literalura.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}
