package com.martintecno.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.martintecno.listview.modelo.Inmueble;

import java.util.List;

public class AdapterLista extends ArrayAdapter<Inmueble> {

    private Context context;
    private List<Inmueble> ListaInmuebles;
    private LayoutInflater LI;
    public AdapterLista(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater inflater) {
        super(context, resource, objects);
        this.context = context;
        this.ListaInmuebles = objects;
        this.LI = inflater;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;

        if(itemView == null){
            itemView = LI.inflate(R.layout.item,parent,false);
        }
        Inmueble inmueble = ListaInmuebles.get(position);

        ImageView foto = itemView.findViewById(R.id.IMGFoto);
        foto.setImageResource(inmueble.getFoto());

        TextView direccion = itemView.findViewById(R.id.TVDireccion);
        direccion.setText(inmueble.getDireccion());

        TextView precio = itemView.findViewById(R.id.TVPrecio);
        precio.setText(inmueble.getPrecio()+"");

        return itemView;


    }
}
