package com.example.instituto_tecnologico_Loja.ui.Listar_Datos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.instituto_tecnologico_Loja.R;
import com.example.instituto_tecnologico_Loja.adapter.ListAdapter;
import com.example.instituto_tecnologico_Loja.database.Persona;
import com.example.instituto_tecnologico_Loja.database.PersonaLab;
import com.example.instituto_tecnologico_Loja.ui.Insertar_Datos.HomeViewModel;
import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ListAdapter listItemAdapter;
    private ArrayList<Persona> listaNombres=new ArrayList<>();
    private ListView listView;
    private PersonaLab mPersonaLab;
    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }});

        super.onCreate(savedInstanceState);
        mPersonaLab=new PersonaLab(getActivity().getApplicationContext());
        listView=root.findViewById(R.id.list);

        getAllPersonas();
        listItemAdapter=new ListAdapter(getActivity().getApplicationContext(),listaNombres);
        listView.setAdapter(listItemAdapter);
        return root;
    }
    public void getAllPersonas(){
        listaNombres.clear();
        listaNombres.addAll(mPersonaLab.getPersonas());
    }
}