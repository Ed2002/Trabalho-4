package com.example.trabalho.model;

public class NumeroContato {
    private String Numero;
    private int Tipo;

    public NumeroContato(){
    }

    public NumeroContato(String numero, int tipo) {
        Numero = numero;
        Tipo = tipo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        Tipo = tipo;
    }
}
