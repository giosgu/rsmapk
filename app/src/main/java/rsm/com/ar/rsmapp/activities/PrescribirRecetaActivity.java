package rsm.com.ar.rsmapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import rsm.com.ar.rsmapp.R;
import rsm.com.ar.rsmapp.entities.Receta;

public class PrescribirRecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescribir_receta);
        Receta receta = (Receta) getIntent().getSerializableExtra(RecetasPendientes.RECETA_SELECCIONADA);
  //      TextView txtPaciente = (TextView) findViewById(R.id.prescribir_paciente);
    //    txtPaciente.setText(receta.getPaciente());
        TextView txtNombre = (TextView) findViewById(R.id.prescribir_nombre);
        txtNombre.setText(receta.getMedicamento());
        TextView txtMarca = (TextView) findViewById(R.id.prescribir_marca_medicamento);
        txtMarca.setText(receta.getMarca());
        TextView txtDosis = (TextView) findViewById(R.id.prescribir_dosis_medicamento);
        txtDosis.setText(receta.getDosis());
        TextView txtPresentacion = (TextView) findViewById(R.id.prescribir_presentacion_medicamento);
        txtPresentacion.setText(receta.getPresentación());

        findViewById(R.id.btn_prescribir_continuar_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(validacionExitosaBotonContinuar()){
                    Receta receta = (Receta) getIntent().getSerializableExtra(RecetasPendientes.RECETA_SELECCIONADA);
                    Intent intent=new Intent(PrescribirRecetaActivity.this,PrescribirRecetaPaso2Activity.class);
                    intent.putExtra(RecetasPendientes.RECETA_SELECCIONADA, receta);
                    startActivity(intent);
                }
            }
        });

    }

    private Boolean validacionExitosaBotonContinuar(){
        Boolean validacionExitosa = Boolean.TRUE;
        TextView txtNombre = (TextView) findViewById(R.id.prescribir_nombre);
        if(TextUtils.isEmpty(txtNombre.getText())) {
            txtNombre.setError(getString(R.string.valor_requerido));
            validacionExitosa = Boolean.FALSE;
        }
        TextView txtDosis = (TextView) findViewById(R.id.prescribir_dosis_medicamento);
        if(TextUtils.isEmpty(txtDosis.getText())){
            txtDosis.setError(getString(R.string.valor_requerido));
            validacionExitosa = Boolean.FALSE;
        }
        TextView txtCantidad = (TextView) findViewById(R.id.prescribir_cantidad);
        if(TextUtils.isEmpty(txtCantidad.getText())) {
            txtCantidad.setError(getString(R.string.valor_requerido));
            validacionExitosa = Boolean.FALSE;
        }
        return validacionExitosa;
    }
}
