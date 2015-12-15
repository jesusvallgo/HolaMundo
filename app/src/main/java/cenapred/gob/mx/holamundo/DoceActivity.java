package cenapred.gob.mx.holamundo;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DoceActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAct12;
    CheckBox chk1, chk2, chk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doce);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAct12 = (Button)findViewById(R.id.btnAct12);
        btnAct12.setOnClickListener(this);
        chk1 = (CheckBox)findViewById(R.id.chk1);
        chk2 = (CheckBox)findViewById(R.id.chk2);
        chk3 = (CheckBox)findViewById(R.id.chk3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAct12:
                StringBuffer resultado = new StringBuffer();
                resultado.append("Uno: ").append(chk1.isChecked());
                resultado.append(" ");
                resultado.append("Dos: ").append(chk2.isChecked());
                resultado.append(" ");
                resultado.append("Tres: ").append(chk3.isChecked());
                Toast.makeText(this,resultado.toString(),Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
