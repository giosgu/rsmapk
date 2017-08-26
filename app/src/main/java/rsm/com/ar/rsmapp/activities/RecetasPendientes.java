package rsm.com.ar.rsmapp.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import rsm.com.ar.rsmapp.R;
import rsm.com.ar.rsmapp.adapters.RecetaAdapter;
import rsm.com.ar.rsmapp.entities.Receta;
import rsm.com.ar.rsmapp.mocks.RecetasBuilder;

public class RecetasPendientes extends AppCompatActivity implements View.OnClickListener{

    ListView listView;
    RecetaAdapter recetaAdapter;
    public final static String RECETA_SELECCIONADA = "RECETA_SELECCIONADA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO sacar el mock
        ArrayList<Receta> recetas = (ArrayList<Receta>) new RecetasBuilder().generarListadoRecetas();
        //seteo el layout
        setContentView(R.layout.activity_recetas_pendientes);
        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setHomeButtonEnabled(true);
        listView = (ListView) findViewById(R.id.listaRecetasPendientes);
       // SimpleAdapter sa = this.setupSimpleAdapter(recetas);
        recetaAdapter = new RecetaAdapter(this, R.layout.activity_recetas_pendientes, recetas);
        listView.setAdapter(recetaAdapter);

        ((ListView)findViewById(R.id.listaRecetasPendientes)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Receta receta = (Receta) ((ListView) RecetasPendientes.this.findViewById(R.id.listaRecetasPendientes)).getItemAtPosition((int) id);
                //Toast.makeText(RecetasPendientes.this, receta.getDosis(), Toast.LENGTH_LONG).show();
                Intent intent=new Intent(RecetasPendientes.this,PrescribirRecetaActivity.class);
                intent.putExtra(RECETA_SELECCIONADA, receta);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
