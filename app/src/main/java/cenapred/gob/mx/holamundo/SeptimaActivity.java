package cenapred.gob.mx.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SeptimaActivity extends AppCompatActivity {
    RadioGroup rdbOpciones;
    String textoOpcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_septima);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rdbOpciones = (RadioGroup)findViewById(R.id.rdbOpciones);
        rdbOpciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if( checkedId == R.id.rdbOp1){
                    textoOpcion = "Opción 1";
                }
                else if(checkedId == R.id.rdbOp2){
                    textoOpcion = "Opción 2";
                }
                else if(checkedId == R.id.rdbOp3){
                    textoOpcion = "Opción 3";
                }
                Toast.makeText(getApplicationContext(), textoOpcion, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
