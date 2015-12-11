package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity2 extends AppCompatActivity{
    TextView txvDato;
    RadioGroup rdbOpciones;
    Spinner spinner;
    ToggleButton tglBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txvDato = (TextView)findViewById(R.id.txvDato);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle!=null){
            String cadena = (String) bundle.get("PASO");
            txvDato.setText(cadena);
        }

        rdbOpciones = (RadioGroup)findViewById(R.id.rdbOpciones);
        rdbOpciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if( checkedId == R.id.rdbOp1){
                    Toast.makeText(getApplicationContext(),"1",Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.rdbOp2){
                    Toast.makeText(getApplicationContext(),"2",Toast.LENGTH_SHORT).show();
                }
                else if(checkedId == R.id.rdbOp3){
                    Toast.makeText(getApplicationContext(),"3",Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinner = (Spinner)findViewById(R.id.spinner);
        List listaSpinner = new ArrayList();
        listaSpinner.add("Item 1");
        listaSpinner.add("Item 2");
        listaSpinner.add("Item 3");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,listaSpinner);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"Posición: "+ String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_SHORT).show();
                Toast.makeText(SecondActivity2.this, "Posición: " + String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        tglBtn = (ToggleButton)findViewById(R.id.tglBtn);
        tglBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"True",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"False",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
