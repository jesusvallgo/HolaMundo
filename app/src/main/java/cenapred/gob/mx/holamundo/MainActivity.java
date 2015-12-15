package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Intent intent = null;
    Button btnActividad2, btnActividad3, btnActividad4, btnActividad5, btnActividad6, btnActividad7, btnActividad8, btnActividad9, btnActividad10, btnActividad11, btnActividad12, btnActividad13, btnActividad14, btnActividad15;

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

        btnActividad6 = (Button)findViewById(R.id.btnActividad6);
        btnActividad6.setOnClickListener(this);

        btnActividad7 = (Button)findViewById(R.id.btnActividad7);
        btnActividad7.setOnClickListener(this);

        btnActividad8 = (Button)findViewById(R.id.btnActividad8);
        btnActividad8.setOnClickListener(this);

        btnActividad9 = (Button)findViewById(R.id.btnActividad9);
        btnActividad9.setOnClickListener(this);

        btnActividad10 = (Button)findViewById(R.id.btnActividad10);
        btnActividad10.setOnClickListener(this);

        btnActividad11 = (Button)findViewById(R.id.btnActividad11);
        btnActividad11.setOnClickListener(this);

        btnActividad12 = (Button)findViewById(R.id.btnActividad12);
        btnActividad12.setOnClickListener(this);

        btnActividad13 = (Button)findViewById(R.id.btnActividad13);
        btnActividad13.setOnClickListener(this);

        btnActividad14 = (Button)findViewById(R.id.btnActividad14);
        btnActividad14.setOnClickListener(this);

        btnActividad15 = (Button)findViewById(R.id.btnActividad15);
        btnActividad15.setOnClickListener(this);
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
                break;
            case  R.id.btnActividad6:
                intent = new Intent(this,SextaActivity.class);
                break;
            case R.id.btnActividad7:
                intent = new Intent(this,SeptimaActivity.class);
                break;
            case  R.id.btnActividad8:
                intent = new Intent(this,OctavaActivity.class);
                break;
            case R.id.btnActividad9:
                intent = new Intent(this,NovenaActivity.class);
                break;
            case R.id.btnActividad10:
                intent = new Intent(this,DecimaActivity.class);
                break;
            case  R.id.btnActividad11:
                intent = new Intent(this,OnceActivity.class);
                break;
            case  R.id.btnActividad12:
                intent = new Intent(this,DoceActivity.class);
                break;
            case  R.id.btnActividad13:
                intent = new Intent(this,TreceActivity.class);
                break;
            case  R.id.btnActividad14:
                intent = new Intent(this,CatorceActivity.class);
                break;
            case  R.id.btnActividad15:
                intent = new Intent(this,QuinceActivity.class);
                break;
            default:
                break;
        }

        if( intent!= null){
            startActivity(intent);
        }
    }
}
