package cenapred.gob.mx.holamundo;

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
import android.app.ActionBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView contenido;
    private TextView texto;
    private EditText editText;
    private ImageView imgMain;
    private Button btnMain,btnImagen,btnTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        texto = (TextView)findViewById(R.id.txtNombre);
        editText = (EditText)findViewById(R.id.editText);
        imgMain = (ImageView)findViewById(R.id.imgMain);

        editText.setHint(editText.getHint() + " " + texto.getText() + " " + imgMain.getScaleType());

        btnMain = (Button)findViewById(R.id.btnMain);
        btnMain.setOnClickListener(this);

        btnImagen = (Button)findViewById(R.id.btnImagen);
        btnImagen.setOnClickListener(this);

        btnTexto = (Button)findViewById(R.id.btnTxv);
        btnTexto.setOnClickListener(this);
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
                contenido.setText("metodo para accion 1");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMain:
                Toast.makeText(getApplicationContext(),"Texto de prueba para toast",Toast.LENGTH_LONG).show();
                break;
            case R.id.btnTxv:
                editText.setText("Cambiado desde aplicacion");
                break;
            case R.id.btnImagen:
                imgMain.setImageResource(R.drawable.prueba);
                break;
            default:
                break;
        }
    }
}
