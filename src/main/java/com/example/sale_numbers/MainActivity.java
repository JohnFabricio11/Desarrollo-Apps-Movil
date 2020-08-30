package com.example.sale_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public  class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtnum;
        final Button btngenerar;
        final TextView txtresult;
        txtnum=(EditText)findViewById(R.id.txtnum);
        btngenerar=(Button)findViewById(R.id.btngenerar);
        txtresult=(TextView)findViewById(R.id.textresult);
        btngenerar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (btngenerar==view){
                    Random r=new Random();
                    int resultado;
                    String  taks=txtnum.getText().toString();
                    resultado=Integer.parseInt(taks);
                    int va=Integer.parseInt(taks);
                    for (int i=0;i<va ;i=resultado){
                        int random = r.nextInt(resultado)+1;
                        System.out.println(random);
                        String randoString=Integer.toString(random);
                        txtresult.setText(randoString);

            }

            }
        }
        });
    }

    @Override
    public void onClick(View view) {

    }
}