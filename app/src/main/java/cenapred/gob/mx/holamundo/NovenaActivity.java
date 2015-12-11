package cenapred.gob.mx.holamundo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class NovenaActivity extends AppCompatActivity {
    ToggleButton tglAct9;
    String act9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novena);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tglAct9 = (ToggleButton)findViewById(R.id.tglAct9);
        tglAct9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    act9 = "TRUE";
                }else{
                    act9 = "FALSE";
                }

                Toast.makeText(getApplicationContext(), act9, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
