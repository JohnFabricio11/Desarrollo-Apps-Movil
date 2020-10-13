package com.example.instituto_tecnologico_Loja.ui.Insertar_Datos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.instituto_tecnologico_Loja.R;
import com.example.instituto_tecnologico_Loja.adapter.ListAdapter;
import com.example.instituto_tecnologico_Loja.database.Persona;
import com.example.instituto_tecnologico_Loja.database.PersonaLab;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private ListAdapter listItemAdapter;
    private ArrayList<Persona> listaNombres=new ArrayList<>();
    private ListView listView;
    private PersonaLab mPersonaLab;
    private Persona mPersona;
    private TextView guardar;
    private Button bguardar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.editTextTextPersonName);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

            }
        });
        super.onCreate(savedInstanceState);
        mPersonaLab=new PersonaLab(getActivity().getApplicationContext());

        listView=root.findViewById(R.id.list);
        guardar=root.findViewById(R.id.editTextTextPersonName);
        bguardar=root.findViewById(R.id.buttonGuardar);
        bguardar.setOnClickListener(this);

        getAllPersonas();
        listItemAdapter=new ListAdapter(getActivity().getApplicationContext(),listaNombres);
        listView.setAdapter(listItemAdapter);
        return root;}

    public void insertPersonas() {
        mPersona=new Persona();
        mPersona.setNombre(guardar.getText().toString());
        mPersonaLab.addPersona(mPersona);
        guardar.setText(" ");}


    public void getAllPersonas(){
        listaNombres.clear();
        listaNombres.addAll(mPersonaLab.getPersonas()); }

    @Override
    public void onClick(View view) {
        if (view==bguardar) {
            insertPersonas();
            getAllPersonas();
            listItemAdapter.notifyDataSetChanged(); }
    }
}
