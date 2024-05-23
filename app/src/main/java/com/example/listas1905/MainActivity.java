package com.example.listas1905;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] comida = {
            "Hamburguesas",
            "Pizza",
            "Gelatina",
            "Ceviche",
            "Albóndigas",
            "Spaguetti",
            "Ravioli",
            "Tacos",
            "Chilaquiles",
            "Molletes",
            "Verduras asadas",
            "Almuerzo",
            "Club sandwich"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, comida));
    }

    public void onListItemClick(ListView padre, View v, int posicion, long id){
        Toast.makeText(this, "Seleccionó "+comida[posicion], Toast.LENGTH_LONG).show();

    }
}