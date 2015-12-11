package cenapred.gob.mx.holamundo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    private TextView texto;
    private EditText editText;
    private ImageView imgMain;
    private Button btnMain,btnImagen,btnTexto, btnActividad2, btnActividad3, btnDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //btnImagen = (Button)findViewById(R.idbtnImagen);
        //btnImagen.setOnClickListener(this);

        //btnTexto = (Button)findViewById(R.id.btnTxv);
        //btnTexto.setOnClickListener(this);

        btnActividad2 = (Button)findViewById(R.id.btnActividad2);
        btnActividad2.setOnClickListener(this);

        btnActividad3 = (Button)findViewById(R.id.btnActividad3);
        btnActividad3.setOnClickListener(this);

        btnDato = (Button)findViewById(R.id.btnDato);
        btnDato.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.accion1:
                texto.setText("metodo para accion 1");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent2 = new Intent(this,SecondActivity.class);
        Intent intent3 = new Intent(this,ThirdActivity.class);
        switch (v.getId()){
            //case R.id.btnTxv:
                //editText.setText("Cambiado desde aplicacion");
                //break;
            //case R.id.btnImagen:
                //imgMain.setImageResource(R.drawable.prueba1);
                //break;
            case R.id.btnActividad2:
                startActivity(intent2);
                break;
            case R.id.btnActividad3:
                startActivity(intent3);
                break;
            case  R.id.btnDato:
                String dato = editText.getText().toString();
                intent2.putExtra("PASO",dato);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
