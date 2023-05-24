package com.example.trabalho.model;

import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class ContatoModel {
    private String IdContato;
    private String NomeContato;
    private String TipoContato;
    private String Telefone;

    public ContatoModel() {
    }

    public ContatoModel(String idContato, String nomeContato, String tipoContato, String telefone) {
        IdContato = idContato;
        NomeContato = nomeContato;
        TipoContato = tipoContato;
        Telefone = telefone;
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

    public String getTipoContato() {
        return TipoContato;
    }

    public void setTipoContato(String tipoContato) {
        TipoContato = tipoContato;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public void Salvar()
    {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("usuarios").child(getIdContato()).setValue(this);
    }
}
