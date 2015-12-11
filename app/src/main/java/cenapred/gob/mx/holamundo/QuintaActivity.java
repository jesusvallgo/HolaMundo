package cenapred.gob.mx.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuintaActivity extends AppCompatActivity implements  View.OnClickListener{
    ImageView imgAct5;
    TextView txvAct5;
    Button btnAct5Imagen, btnAct5Txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgAct5 = (ImageView)findViewById(R.id.imgAct5);
        txvAct5 = (TextView)findViewById(R.id.txvAct5);
        btnAct5Imagen = (Button)findViewById(R.id.btnAct5Imagen);
        btnAct5Imagen.setOnClickListener(this);
        btnAct5Txv = (Button)findViewById(R.id.btnAct5Txv);
        btnAct5Txv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAct5Imagen:
                imgAct5.setImageResource(R.drawable.prueba2);
                break;
            case R.id.btnAct5Txv:
                txvAct5.setText("Actualizado desde aplicación");
                break;
            default:
                break;
        }
    }
}
