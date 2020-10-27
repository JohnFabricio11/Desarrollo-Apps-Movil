package instituto.loja.project_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,paswoord;
    Button entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log();
    }
    private  void log(){
        setContentView(R.layout.login);
        username =(EditText)findViewById(R.id.editnombre);
        paswoord=(EditText)findViewById(R.id.editpassword);
        entrar=(Button)findViewById(R.id.btniniciar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(("john"))){
                    if ((paswoord.getText().toString().equals("puglla"))){
                        setContentView(R.layout.activity_interfaz);

                    }else{
                        Toast.makeText(getApplicationContext(),"Pasword puglla",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Username john",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}