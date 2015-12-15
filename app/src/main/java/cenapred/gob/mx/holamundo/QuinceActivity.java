package cenapred.gob.mx.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class QuinceActivity extends AppCompatActivity {
    ListView lsvAct15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quince);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FrutasVerduras frutasVerduras_datos[] = new FrutasVerduras[]{
                new FrutasVerduras(R.drawable.icono,"Manzana"),
                new FrutasVerduras(R.drawable.icono,"Pera"),
                new FrutasVerduras(R.drawable.icono,"Uva"),
                new FrutasVerduras(R.drawable.icono,"Naranja"),
        };
        lsvAct15 = (ListView)findViewById(R.id.lsvAct15);

    }
}
