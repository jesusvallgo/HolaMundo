package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SextaDatosActivity extends AppCompatActivity {
    TextView txvAct6;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexta_datos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txvAct6 = (TextView)findViewById(R.id.txvAct6);
        intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle!=null){
            txvAct6.setText((String) bundle.get("DATO"));
        }
    }
}
