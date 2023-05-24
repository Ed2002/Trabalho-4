package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button BtnListar, BtnNovo;
    private ListarFragment ListarFragment;
    private NovoEditarFragment NovoEditarFragment;
    private EditarFragment EditarFragment;
    private FragmentTransaction transaction;

    private Button Salvar;

    public void Editar()
    {
        EditarFragment = new EditarFragment();
        transaction.replace(R.id.FrameConteudo, EditarFragment);
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnListar = findViewById(R.id.BtnListar);
        BtnNovo = findViewById(R.id.BtnNovo);
        ListarFragment = new ListarFragment(MainActivity.this);
        NovoEditarFragment = new NovoEditarFragment();

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.FrameConteudo, ListarFragment);
        transaction.commit();

        BtnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.FrameConteudo, NovoEditarFragment);
                transaction.commit();
            }
        });

        BtnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.FrameConteudo, ListarFragment);
                transaction.commit();
            }
        });

    }
}