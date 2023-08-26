package com.martintecno.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.martintecno.listview.modelo.Inmueble;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> ListaInmuebles = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generListView();
    }

    public void generListView(){


        ArrayAdapter<Inmueble> Adapter = new AdapterLista(this,R.layout.item,ListaInmuebles,getLayoutInflater());

        ListView LV = findViewById(R.id.LVLista);

        LV.setAdapter(Adapter);
    }

    public void cargarDatos(){

        ListaInmuebles.add(new Inmueble(R.drawable.casa1,"San Luis", 25000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa2,"Juana Koslay", 40000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa3,"Merlo", 15000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa1,"San Luis", 25000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa2,"Juana Koslay", 40000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa3,"Merlo", 15000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa1,"San Luis", 25000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa2,"Juana Koslay", 40000.0));
        ListaInmuebles.add(new Inmueble(R.drawable.casa3,"Merlo", 15000.0));
    }

}