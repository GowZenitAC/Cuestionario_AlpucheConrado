package armando.alpuche.cuestionario_alpucheconrado;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Cuestionario extends AppCompatActivity {
    public static Activity Cu;
    private RadioButton rb1;
    public int total1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Cu=this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        rb1=(RadioButton)findViewById(R.id.radio0);
    }
    public void cuestionario1 (View v){
        if (rb1.isChecked() == true){
            total1=1;
        }
        Intent i=new Intent(this, Cuestionario1.class);
        i.putExtra("Resultados1", total1);
        startActivity(i);
    }

}