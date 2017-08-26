package rsm.com.ar.rsmapp.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import rsm.com.ar.rsmapp.R;
import rsm.com.ar.rsmapp.entities.Receta;

/**
 * Created by guido.giosa on 25/8/2017.
 */

public class RecetaAdapter extends ArrayAdapter<Receta> {

    private ArrayList<Receta> recetas;

    public RecetaAdapter(Context context, int textViewResourceId, ArrayList<Receta> recetas) {
        super(context, textViewResourceId, recetas);
        this.recetas = recetas;
    }

    @Override
    public int getCount() {
        if(recetas!=null)
            return recetas.size();
        return 0;
    }

    @Override
    public Receta getItem(int position) {
        if(recetas!=null && position < recetas.size()){
            return (Receta) recetas.get(position);
        }
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // assign the view we are converting to a local variable
        View view = convertView;

        // first check to see if the view is null. if so, we have to inflate it.
        // to inflate it basically means to render, or show, the view.
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.two_lines, null);
        }

        /*
		 * Recall that the variable position is sent in as an argument to this method.
		 * The variable simply refers to the position of the current object in the list. (The ArrayAdapter
		 * iterates through the list we sent it)
		 *
		 * Therefore, receta refers to the current Receta object.
		 */
        Receta receta = recetas.get(position);

        if (receta != null) {
            TextView lineA = (TextView) view.findViewById(R.id.line_a);
            lineA.setText(receta.getPaciente());
            TextView lineB = (TextView) view.findViewById(R.id.line_b);
            lineB.setText(receta.getMedicamento());

        }
        return view;
    }

}

