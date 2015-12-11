package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SextaActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAct6;
    EditText edtAct6;
    Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtAct6 = (EditText)findViewById(R.id.edtAct6);
        btnAct6 = (Button)findViewById(R.id.btnAct6);
        btnAct6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAct6:
                intent = new Intent(this,SextaDatosActivity.class);
                intent.putExtra("DATO",edtAct6.getText().toString());
                break;
            default:
                break;
        }

        if( intent!= null){
            startActivity(intent);
        }
    }
}
