package com.example.trabalho.model;

public class NumeroContato {
    private String Numero;
    private String Tipo;

    public NumeroContato(){
    }

    public NumeroContato(String numero, String tipo) {
        Numero = numero;
        Tipo = tipo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
