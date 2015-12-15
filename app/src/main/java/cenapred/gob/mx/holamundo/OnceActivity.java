package cenapred.gob.mx.holamundo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OnceActivity extends AppCompatActivity {
    Button btnAct11;
    Context contexto = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_once);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAct11 = (Button) findViewById(R.id.btnAct11);
        btnAct11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateDialog(0).show();

                //AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(contexto);
                //alertDialogBuilder.setMessage("Mensaje").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                //@Override
                //public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(contexto,"Has presionado el boton afirmaivo",Toast.LENGTH_SHORT).show();
                //}
                //}).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                //@Override
                //public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(contexto,"Has presionado el boton NO",Toast.LENGTH_SHORT).show();
                //}
                //});
                //AlertDialog alertDialog = alertDialogBuilder.create();
                //alertDialog.show();
            }
        });
    }

    protected Dialog onCreateDialog(int id) {
        Dialog dialog = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(contexto);
        builder = builder.setIcon(R.drawable.icono);
        builder = builder.setTitle("Custom");
        builder = builder.setCancelable(false);
        builder = builder.setMessage("Mensaje");
        builder = builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(contexto, "Has presionado el boton afirmaivo", Toast.LENGTH_SHORT).show();
            }
        });
        builder = builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(contexto, "Has presionado el boton negativo", Toast.LENGTH_SHORT).show();
            }
        });

        dialog = builder.create();

        return dialog;
    }
}
