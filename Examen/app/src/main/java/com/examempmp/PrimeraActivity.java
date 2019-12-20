package com.examempmp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PrimeraActivity extends AppCompatActivity {

    public static final String DATOS_PIZZA = "Factura_pizza";


    private ArrayList<Pizza> pizzas;
    private Spinner spPizzas;
    private Button btTotal_Pedido, btFactura;
    private CheckBox cbTamaño, cbIngrediente, cbExtraQueso;
    private RadioButton rbLugar;
    private EditText numUnidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        //Lo primero que hago es obtener el bundle que he metido al intent en la activity anterior
        Bundle bundle = getIntent().getExtras();
        //Y a continuación saco el arrayList de dentro
        pizzas = (ArrayList<Pizza>) bundle.getSerializable(MainActivity.Datos);
        //Asigno los elementos
        spPizzas = findViewById(R.id.Factura_sp_pizzas);
        btTotal_Pedido = findViewById(R.id.Factura_bt_total);
        btFactura = findViewById(R.id.Factura_bt_Factura);
        cbTamaño = findViewById(R.id.Factura_cb_MasGrande);
        cbIngrediente = findViewById(R.id.Factura_cb_MasIngredientes);
        cbExtraQueso = findViewById(R.id.Factura_cb_MasQueso);
        rbLugar = findViewById(R.id.rb_enLocal);
        numUnidades = findViewById(R.id.Factura_en_unidades);


        //Añado un listener al botón del total
        btTotal_Pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularFactura calularFactura = new CalcularFactura(getFactura());
                Toast.makeText(PrimeraActivity.this, "El preico total seria: " +
                        calularFactura.calcularPrecio(), Toast.LENGTH_SHORT).show();
            }
        });


        //Añado listener al botón de la factura
        btFactura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(DATOS_PIZZA, getFactura());
                Intent intent = new Intent(PrimeraActivity.this, Pizza.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    private Factura getFactura() {
        Factura f = new Factura();
        f.setPizza((Pizza) spPizzas.getSelectedItem());
        f.setEsMasGrande(cbTamaño.isChecked());
        f.setTieneMasingredientes(cbIngrediente.isChecked());
        f.setTieneMasQueso(cbExtraQueso.isChecked());
        f.setDomicilio(rbLugar.isChecked());
        return f;

    }
}
