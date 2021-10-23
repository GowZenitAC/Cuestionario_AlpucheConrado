package armando.alpuche.cuestionario_alpucheconrado;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Cuestionario1 extends AppCompatActivity {
    public static Activity Cu1;
    private RadioButton rb2;
    public int total1 = 0;
    public int total2 = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            Cu1=this;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cuestionario1);
            rb2=(RadioButton)findViewById(R.id.radio1);
            //se inicializa el radiobutton en este caso
            //se esta diciendo que la respuesta corrrecta es el radio0 o el id del primer
            // radiobutton
            Bundle extras = getIntent().getExtras();
            if (extras !=null){
                total1 = (Integer) extras.get("Resultados1");
            }

        }
        public void cuestionario2 (View v){
            //Se crea y asigna la informacion a enviar
            // opcion 1 es la respuesta correcta en este caso es con la propiedad Checked
            if (rb2.isChecked() == true){
                total2 = total1 + 1; //se suma la respuesta anterior mas esta y ese es el resultado de
                //la variable total2
            }
            Intent i=new Intent(this, Cuestionario2.class);
            i.putExtra("Resultados2", total2);
            //Inicia la actividad enviando el extra
            startActivity(i);
        }
}
