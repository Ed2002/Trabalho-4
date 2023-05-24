package com.example.trabalho;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.trabalho.model.ContatoModel;
import com.example.trabalho.model.NumeroContato;

import java.util.List;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NovoEditarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NovoEditarFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NovoEditarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NovoEditarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NovoEditarFragment newInstance(String param1, String param2) {
        NovoEditarFragment fragment = new NovoEditarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    private Spinner TipoContato;
    private String OpcoesTipoContato[] = {"Celular","Casa","Trabalho"};

    private Button Salvar;



    private EditText NomeContato,Telefone;


    private String TpContact;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_novo_editar, container, false);

        NomeContato = view.findViewById(R.id.EdTextNomeContato);

        Telefone = view.findViewById(R.id.EdTextPhone);

        Salvar = view.findViewById(R.id.BtnSalvar);

        TipoContato = view.findViewById(R.id.SpinnerTipoContato);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_dropdown_item,
                OpcoesTipoContato);

        TipoContato.setAdapter(adapter);


        TipoContato.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TpContact = OpcoesTipoContato[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContatoModel contato = new ContatoModel();

                contato.setNomeContato(NomeContato.getText().toString());

                contato.setTipoContato(TpContact);

                contato.setTelefone(Telefone.getText().toString());

                contato.setIdContato("contato-"+contato.getNomeContato());

                contato.Salvar();

                Toast.makeText(getActivity().getApplicationContext(),"Dados Salvos",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}