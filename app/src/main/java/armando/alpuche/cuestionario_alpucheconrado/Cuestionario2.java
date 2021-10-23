package armando.alpuche.cuestionario_alpucheconrado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Cuestionario2 extends AppCompatActivity {
    public static Activity Cu2;
    private RadioButton rb3;
    public int total2=0;
    public int total3=0;

    @Override
    public void onCreate(Bundle saveInstanceState){
        Cu2=this;

        super.onCreate(saveInstanceState);
        setContentView(R.layout.cuestionario2);
        rb3=(RadioButton) findViewById(R.id.radio2);//se inicializa el radiobutton en este caso
        //se esta diciendo que la respuesta corrrecta es el radio0 o el id del primer radiobutton
        Bundle extras = getIntent().getExtras();
        if (extras !=null){
            total2 = (Integer) extras.get("Resultados2");
        }
    }
    public void resultados (View v){
        //Se crea y asigna la informacion a enviar
        // opcion 1 es la respuesta correcta en este caso es con la propiedad Checked
        if (rb3.isChecked() == true){
            total3 = total2 + 1; //se suma la respuesta anterior mas esta y ese es el resultado de
            //la variable total2
        }
        Intent i=new Intent(this, Resultados.class);
        i.putExtra("Resultados3", total3);
        //inicia la actividad enviando el extra
        startActivity(i);
    }

}
