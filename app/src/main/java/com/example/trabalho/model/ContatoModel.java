package com.example.trabalho.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class ContatoModel {
    private String IdContato;
    private String NomeContato;
    private List<NumeroContato> Numeros;

    public ContatoModel(){

    }

    public ContatoModel(String idContato, String nomeContato, List<NumeroContato> numeros) {
        IdContato = idContato;
        NomeContato = nomeContato;
        Numeros = numeros;
    }

    public String getIdContato() {
        return IdContato;
    }

    public void setIdContato(String idContato) {
        IdContato = idContato;
    }

    public String getNomeContato() {
        return NomeContato;
    }

    public void setNomeContato(String nomeContato) {
        NomeContato = nomeContato;
    }

    public List<NumeroContato> getNumeros() {
        return Numeros;
    }

    public void setNumeros(List<NumeroContato> numeros) {
        Numeros = numeros;
    }

    public void Salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Contatos").child(getIdContato()).setValue(this);
    }
}
