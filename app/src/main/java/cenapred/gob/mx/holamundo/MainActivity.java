package cenapred.gob.mx.holamundo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.app.ActionBar;

public class MainActivity extends AppCompatActivity {
    private TextView contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contenido = (TextView)findViewById(R.id.txtSaludo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                contenido.setText("metodo para agregar");
                return true;
            case R.id.search:
                contenido.setText("metodo para buscar");
                return true;
            case R.id.edit:
                contenido.setText("metodo para editar");
                return true;
            case R.id.delete:
                contenido.setText("metodo para borrar");
                return true;
            case R.id.action_settings:
                contenido.setText("metodo para opciones");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
