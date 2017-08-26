package rsm.com.ar.rsmapp.mocks;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import rsm.com.ar.rsmapp.entities.Receta;

/**
 * Created by guido.giosa on 20/8/2017.
 */

public class RecetasBuilder {

    public ArrayList<Receta> generarListadoRecetas(){
        ArrayList<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta("Leandro Gvirtz", new Date(), "Lotrial", "200 mg", "comprimidos" ,2));
        recetas.add(new Receta("Luis Stringoli", new Date(), "Alcanfort", "200 mg", "comprimidos" ,2));
        recetas.add(new Receta("Lucía Pechloff", new Date(), "Saraza", "200 mg", "comprimidos" ,2));
        recetas.add(new Receta("Juan Topo", new Date(), "Ondoprosol", "200 mg", "comprimidos" ,2));
        recetas.add(new Receta("Cosme Fulanito", new Date(), "Letrial", "200 mg", "comprimidos" ,2));
        return recetas;
    }
}
