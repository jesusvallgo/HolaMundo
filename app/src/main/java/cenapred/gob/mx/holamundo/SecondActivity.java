package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity{
    TextView txvAct2Nombre;
    EditText edtAct2Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txvAct2Nombre = (TextView)findViewById(R.id.txvAct2Nombre);
        edtAct2Nombre = (EditText)findViewById(R.id.edtAct2Nombre);
        edtAct2Nombre.setText(edtAct2Nombre.getHint() + " " + txvAct2Nombre.getText().toString());
    }
}
