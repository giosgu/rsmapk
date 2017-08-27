package rsm.com.ar.rsmapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;

import rsm.com.ar.rsmapp.R;

public class PrescribirRecetaPaso2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescribir_receta_paso2);

        TextView diagnostico = (TextView) findViewById(R.id.prescribir_diagnostico);
        diagnostico.addTextChangedListener(new TextWatcher() {
               @Override
               public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

               }

               @Override
               public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

               }

               @Override
               public void afterTextChanged(Editable editable) {
                    habilitarBotonContinuar();
               }
           }

        );
    }

    private void habilitarBotonContinuar(){
        TextView diagnostico = (TextView) findViewById(R.id.prescribir_diagnostico);
        boolean diagnosticoCompleto = !TextUtils.isEmpty(diagnostico.getText());
        Button botonContinuar = (Button) findViewById(R.id.btn_prescribir_continuar_2);
        botonContinuar.setEnabled(diagnosticoCompleto);
    }
}
