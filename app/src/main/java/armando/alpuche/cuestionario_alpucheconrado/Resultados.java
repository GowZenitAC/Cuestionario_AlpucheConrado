package armando.alpuche.cuestionario_alpucheconrado;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultados extends AppCompatActivity {
    private Cuestionario cu = new Cuestionario();
    private Cuestionario1 cu1 = new Cuestionario1();
    private Cuestionario2 cu2 = new Cuestionario2();

        int total=0;
        private TextView tv1;

        @Override
        public void onCreate(Bundle saveInstanceState){
            super.onCreate(saveInstanceState);
            setContentView(R.layout.resultados);
            tv1=(TextView) findViewById(R.id.textView2);
            Bundle extras = getIntent().getExtras();
            if (extras !=null){
                total=(Integer) extras.get("Resultados4");
                tv1.setText(Integer.toString(total));
            }
        }
        public void salir(View v){
            finish();
            cu.Cu.finish();
            cu1.Cu1.finish();
            cu2.Cu2.finish();
        }

}
