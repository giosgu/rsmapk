package rsm.com.ar.rsmapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import rsm.com.ar.rsmapp.R;
import rsm.com.ar.rsmapp.entities.Receta;

public class PrescribirRecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescribir_receta);
        Receta receta = (Receta) getIntent().getSerializableExtra(RecetasPendientes.RECETA_SELECCIONADA);
        TextView txtPaciente = (TextView) findViewById(R.id.prescribir_paciente);
        txtPaciente.setText(receta.getPaciente());
        TextView txtNombre = (TextView) findViewById(R.id.prescribir_nombre);
        txtNombre.setText(receta.getMedicamento());

    }
}
