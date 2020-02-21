package com.example.proyecto.Clases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyecto.Base_Datos.DataBaseHelper;
import com.example.proyecto.R;

import org.w3c.dom.Text;

public class CancionPantallaCompleta extends AppCompatActivity {
    TextView textView;
    DataBaseHelper dataBaseHelper = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancion_pantalla_completa);



        Bundle bundle = getIntent().getExtras();
        final Cancion cancion = (Cancion) bundle.getSerializable("guardado");

        TextView nombre = (TextView)findViewById(R.id.nombre_cancion);
        nombre.setText(cancion.getTitulo());


        TextView fecha = (TextView)findViewById(R.id.fecha_publicacion_cancion);
        fecha.setText(cancion.getFecha());

        TextView autor = (TextView)findViewById(R.id.autor_cancion);
        autor.setText(cancion.getAutor());

        TextView genero = (TextView)findViewById(R.id.genero_cancion);
        genero.setText(cancion.getGenero());

        ImageView imagen =(ImageView)findViewById(R.id.ImagenView_foto);
        imagen.setImageResource(cancion.getFoto());

        final CheckBox checkBox =(CheckBox)findViewById(R.id.esFavorita);


        dataBaseHelper = new DataBaseHelper(this);
        dataBaseHelper.open();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    System.out.println("DEntro");;
                    dataBaseHelper.insertCancion(cancion.getTitulo(),cancion.getFecha(),cancion.getAutor(), cancion.getGenero());
                    dataBaseHelper.close();
                }
            }
        });








    }








    /*public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()) {
            case R.id.menu_cancion_favorita:
                textView.setText("Pulsado op 1");
                System.out.println("Entras o no");
                Toast.makeText(getApplicationContext(),"Has pulsado op 1", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);

        }*/

    }

