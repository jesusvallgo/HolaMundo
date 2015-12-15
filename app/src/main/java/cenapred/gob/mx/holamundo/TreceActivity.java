package cenapred.gob.mx.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class TreceActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAct13;
    AutoCompleteTextView actxvAct13;
    TextView txvAct13;

    String[] nombres = {"Nancy","Ana","Jazmin","Laura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trece);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAct13 = (Button)findViewById(R.id.btnAct13);
        btnAct13.setOnClickListener(this);
        actxvAct13 = (AutoCompleteTextView)findViewById(R.id.actxvAct13);
        txvAct13 = (TextView)findViewById(R.id.txvAct13);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,nombres);
        actxvAct13.setThreshold(3);
        actxvAct13.setAdapter(adaptador);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAct13:
                String cambio = actxvAct13.getText().toString();
                txvAct13.setText(cambio);
                break;
            default:
                break;
        }
    }
}
