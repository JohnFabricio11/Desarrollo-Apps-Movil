package com.example.instituto_tecnologico_Loja.ui.Insertar_Datos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("Ingrese aqui el texto");
    }

    public LiveData<String> getText() {
        return mText;
    }
}