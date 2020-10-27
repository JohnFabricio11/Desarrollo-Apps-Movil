package instituto.loja.project_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Interfaz extends AppCompatActivity {
    Button btnmiubicacion,btnsitios_turisticos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz);
       btnmiubicacion=(Button)findViewById(R.id.btnmiubicacion);
       btnmiubicacion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(getApplicationContext(),MapsActivity_Mi_Ubicacion.class);
               startActivity(intent);
           }
       });
    }

}