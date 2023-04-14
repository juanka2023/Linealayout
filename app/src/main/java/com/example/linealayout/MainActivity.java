package com.example.linealayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tvresul;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvresul = findViewById(R.id.tvresul);
        tvresul.setText("0");
    }

    public void cero(View view) {
        if (tvresul.getText().toString().equals("0")) {
            tvresul.setText("0");
        } else {
            tvresul.setText(tvresul.getText() + "0");
        }

    }

    public void uno(View view) {
        if (tvresul.getText().toString().equals("1")) {
            tvresul.setText("1");
        } else {
            tvresul.setText(tvresul.getText() + "1");
        }

    }

    public void dos(View view) {
        if (tvresul.getText().toString().equals("2")) {
            tvresul.setText("2");
        } else {
            tvresul.setText(tvresul.getText() + "2");
        }

    }

    public void tres(View view) {
        if (tvresul.getText().toString().equals("3")) {
            tvresul.setText("3");
        } else {
            tvresul.setText(tvresul.getText() + "3");
        }

    }

    public void cuatro(View view) {
        if (tvresul.getText().toString().equals("4")) {
            tvresul.setText("4");
        } else {
            tvresul.setText(tvresul.getText() + "4");
        }

    }

    public void cinco(View view) {
        if (tvresul.getText().toString().equals("5")) {
            tvresul.setText("5");
        } else {
            tvresul.setText(tvresul.getText() + "5");
        }

    }

    public void seis(View view) {
        if (tvresul.getText().toString().equals("6")) {
            tvresul.setText("6");
        } else {
            tvresul.setText(tvresul.getText() + "6");
        }

    }

    public void siete(View view) {
        if (tvresul.getText().toString().equals("7")) {
            tvresul.setText("7");
        } else {
            tvresul.setText(tvresul.getText() + "7");
        }

    }

    public void ocho(View view) {
        if (tvresul.getText().toString().equals("8")) {
            tvresul.setText("8");
        } else {
            tvresul.setText(tvresul.getText() + "8");
        }

    }

    public void nueve(View view) {
        if (tvresul.getText().toString().equals("9")) {
            tvresul.setText("9");
        } else {
            tvresul.setText(tvresul.getText() + "9");
        }

    }

    public void dividir(View view) {
        operador = "/";
    }

    public void multiplicar(View view) {
        operador = "*";
    }
    public void suma(View view) {
        operador = "+";
    }
    public void restar(View view) {
        operador = "-";
        guardar1(view);
    }
    public void guardar1(View view) {
       numero1 =  Float.parseFloat(tvresul.getText().toString());
       tvresul.setText("0");
    }
    public void restaurarvalores(View view) {
        tvresul.setText("0");
        numero1 = 0.0f;
        numero1 = 0.0f;
        operador = "";
    }
    public void borrar(View view) {
        String text = tvresul.getText().toString(); tvresul.setText(text.substring(0,text.length() -1));

    }
    public void igaul(View view) {
        Float resul = 0.0f;
       numero2 = Float.parseFloat(tvresul.getText().toString());

       //suma
        if (operador == ("+")){
            resul = numero1 + numero2;
        }
        //resta
        if (operador == ("-")){
            resul = numero1 + numero2;
        }
        //multiplicacion
        if (operador == ("*")) {
            resul = numero1 + numero2;
        }
        //division
        if (operador == ("/")) {
            resul = numero1 + numero2;
        }
    }
}