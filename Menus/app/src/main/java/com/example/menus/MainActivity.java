package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.texto);
        registerForContextMenu(textView);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.MnuOpc1:
                textView.setText("Pulsado op 1");
                Toast.makeText(getApplicationContext(), "Has pulsado op 1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.MnuOpc2:

                textView.setText("Pulsado op 2");
                Toast.makeText(getApplicationContext(), "Has pulsado op 2", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.MnuOpc3:

                textView.setText("Pulsado op 3");
                Toast.makeText(getApplicationContext(), "Has pulsado op 3", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Submenu1:

                textView.setText("Pulsado submenu 1");
                Toast.makeText(getApplicationContext(), "Has pusaldo el SubMenu 1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Submenu2:

                textView.setText("Pulsado submenu 2");
                Toast.makeText(getApplicationContext(), "Has pulsado el  SubMenu 2", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Submenu3:

                textView.setText("Pulsado submenu 3");
                Toast.makeText(getApplicationContext(), "Has pulsado el SubMenu 3", Toast.LENGTH_SHORT).show();
                return true;


            default:
                return super.onOptionsItemSelected(menuItem);

        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, contextMenu);

    }

    public boolean onContextItemSelected(MenuItem itemMnuContex) {
        switch (itemMnuContex.getItemId()) {
            case R.id.contextOp1:
                textView.setText("Etiqueta: Opcion 1 pulsada!");
                return true;
            case R.id.contextOp2:
                textView.setText("Etiqueta: Opcion 2 pulsada!");
                return true;
            default:
                return super.onContextItemSelected(itemMnuContex);
        }

    }
}
