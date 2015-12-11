package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Intent intent = null;
    Button btnActividad2, btnActividad3, btnActividad4, btnActividad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnActividad2 = (Button)findViewById(R.id.btnActividad2);
        btnActividad2.setOnClickListener(this);

        btnActividad3 = (Button)findViewById(R.id.btnActividad3);
        btnActividad3.setOnClickListener(this);

        btnActividad4 = (Button)findViewById(R.id.btnActividad4);
        btnActividad4.setOnClickListener(this);

        btnActividad5 = (Button)findViewById(R.id.btnActividad5);
        btnActividad5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnActividad2:
                intent = new Intent(this,SecondActivity.class);
                break;
            case R.id.btnActividad3:
                intent = new Intent(this,ThirdActivity.class);
                break;
            case  R.id.btnActividad4:
                intent = new Intent(this,CuartaActivity.class);
                break;
            case  R.id.btnActividad5:
                intent = new Intent(this,QuintaActivity.class);
            default:
                break;
        }

        if( intent!= null){
            startActivity(intent);
        }
    }
}
