package rsm.com.ar.rsmapp.activities;

import android.app.ListActivity;
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
import rsm.com.ar.rsmapp.entities.Receta;
import rsm.com.ar.rsmapp.mocks.RecetasBuilder;

public class RecetasPendientes extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO sacar el mock
        List<Receta> recetas = new RecetasBuilder().generarListadoRecetas();
        //seteo el layout
        setContentView(R.layout.activity_recetas_pendientes);
        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setHomeButtonEnabled(true);
        listView = (ListView) findViewById(R.id.listaRecetasPendientes);
        SimpleAdapter sa = this.setupSimpleAdapter(recetas);
        listView.setAdapter(sa);
    }

    private SimpleAdapter setupSimpleAdapter(List<Receta> lista){
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> item;
        for (Receta receta: lista ) {
            item = new HashMap<String,String>();
            item.put("linea1", receta.getPaciente());
            item.put("linea2", receta.getMedicamento());
            list.add(item);
        }
        SimpleAdapter sa = new SimpleAdapter(this, list,
                R.layout.two_lines,
                new String[] { "linea1","linea2" },
                new int[] {R.id.line_a, R.id.line_b});

        return sa;
    }
/*
      public void onItemClick (AdapterView < ? > adapter, View view,int position, long id){
        //By using data id
        StringBuilder sb = new StringBuilder("Selected:\n");
        HashMap<String, String> selected =
                (HashMap<String, String>) ((ListView) RecetasPendientes.this.findViewById(R.id.listaRecetasPendientes)).getItemAtPosition((int) id);
        selected.get("line1");
    }
*/
}
