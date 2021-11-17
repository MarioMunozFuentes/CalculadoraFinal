package com.mariomunozmyaplication.calculadorafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Ponemos los ID del activityMain
    public Button botonC, botonDEL, botonDIV, botonMULT, botonMENOS, botonMAS, botonIGUAL;
    public Button boton7, boton8, boton9, boton4, boton5, boton6, boton1, boton2, boton3, boton0, botonPUNTO;
    public TextView resultado;
    public Switch tema;

    Double numero1= 0.0, numero2= 0.0, valor=0.0;
    String operacion= "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonC= (Button) findViewById(R.id.botonC);
        botonDEL= (Button) findViewById(R.id.botonDEL);
        botonDIV= (Button) findViewById(R.id.botonDIV);
        botonMULT= (Button) findViewById(R.id.botonMULT);
        botonMENOS= (Button) findViewById(R.id.botonMENOS);
        botonMAS= (Button) findViewById(R.id.botonMAS);
        botonIGUAL= (Button) findViewById(R.id.botonIGUAL);

        boton1= (Button) findViewById(R.id.boton1);
        boton2= (Button) findViewById(R.id.boton2);
        boton3= (Button) findViewById(R.id.boton3);
        boton4= (Button) findViewById(R.id.boton4);
        boton5= (Button) findViewById(R.id.boton5);
        boton6= (Button) findViewById(R.id.boton6);
        boton7= (Button) findViewById(R.id.boton7);
        boton8= (Button) findViewById(R.id.boton8);
        boton9= (Button) findViewById(R.id.boton8);
        boton0= (Button) findViewById(R.id.boton0);
        botonPUNTO= (Button) findViewById(R.id.botonPUNTO);

        resultado= (TextView) findViewById(R.id.resultado);
    }



    public void escribir0(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if(valor == 0.0){
            resultado.setText("0");
        }
        else{
            resultado.setText(resultado.getText() + "0");
        }
    }

    public void escribir1(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if(valor == 0.0){
            resultado.setText("1");
        }
        else{
            resultado.setText(resultado.getText() + "1");
        }
    }

    public void  escrbir2(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0.0){
            resultado.setText("2");
        }
        else{
            resultado.setText(resultado.getText() + "2");
        }
    }

    public void escrbir3(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("3");
        }
        else{
            resultado.setText(resultado.getText() + "3");
        }
    }

    public void escribir4(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("4");
        }
        else{
            resultado.setText(resultado.getText() + "4");
        }
    }

    public void escrbir5(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("5");
        }
        else{
            resultado.setText(resultado.getText() + "5");
        }
    }

    public void escribir6(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("6");
        }
        else{
            resultado.setText(resultado.getText() + "6");
        }
    }

    public void escribir7(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("7");
        }
        else{
            resultado.setText(resultado.getText() + "7");
        }
    }

    public void escribir8(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("8");
        }
        else{
            resultado.setText(resultado.getText() + "8");
        }
    }

    public void escribir9(View view){
        valor= Double.parseDouble(resultado.getText().toString());
        if (valor == 0){
            resultado.setText("9");
        }
        else{
            resultado.setText(resultado.getText() + "9");
        }
    }

    public void escribirPunto(View view){
        if(!String.valueOf(resultado.getText()).contains(".")){
            resultado.setText(resultado.getText() + ".");
        }
    }

    public void limpiadoC(View view){
        resultado.setText("0");
        numero1= 0.0;
        numero2= 0.0;
        valor= 0.0;
        operacion="";
    }

    public void borrar(View view){
        String cadena= String.valueOf(resultado.getText());
        if (cadena.equals("0")){
            resultado.setText("0");
        }
        else{
            cadena= cadena.substring(0, cadena.length() -1);
            resultado.setText(cadena);
        }
    }


    public void operacionSumar(View view){
        numero1= Double.parseDouble(String.valueOf(resultado.getText()));
        operacion= "+";
        resultado.setText("0");
    }

    public void operacionResta(View view){
        numero1= Double.parseDouble(String.valueOf(resultado.getText()));
        operacion= "-";
        resultado.setText("0");
    }

    public void operacionMultiplicar(View view){
        numero1= Double.parseDouble(String.valueOf(resultado.getText()));
        operacion= "*";
        resultado.setText("0");
    }

    public void operacionDividir(View view){
        numero1= Double.parseDouble(String.valueOf(resultado.getText()));
        operacion= "/";
        resultado.setText("0");
    }

    public void mostrarResultado(View view){
        numero2= Double.parseDouble(String.valueOf(resultado.getText()));
        Double result= 0.0;
        if (operacion.equals("/")){
            if (numero2 != 0){
                result= numero1/numero2;
                resultado.setText("" + result);
            }
            else{
                resultado.setText("0");
                Toast.makeText(this, "OPERACIÓN NO VALIDA", Toast.LENGTH_LONG).show();
            }
        }
        else if (operacion.equals("+")){
            result= numero1 + numero2;
            resultado.setText("" + result);
        }
        else if (operacion.equals("-")){
            result= numero1 - numero2;
            resultado.setText("" + result);
        }
        else if (operacion.equals("*")){
            result= numero1 * numero2;
            resultado.setText("" + result);
        }
        numero1= 0.0;
        numero2= 0.0;
        operacion="";
        valor= 0.0;
        result= 0.0;
    }
}































