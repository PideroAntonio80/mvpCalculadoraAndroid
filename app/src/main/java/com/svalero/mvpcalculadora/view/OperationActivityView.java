package com.svalero.mvpcalculadora.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.mvpcalculadora.R;
import com.svalero.mvpcalculadora.contract.OperationContract;
import com.svalero.mvpcalculadora.presenter.OperationPresenter;

public class OperationActivityView extends AppCompatActivity implements OperationContract.View {

    private EditText edtNumero1;
    private EditText edtNumero2;
    private TextView tvResultado;
    private OperationPresenter operationPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);

        initComponents();
        operationPresenter = new OperationPresenter(this);
    }

    public void initComponents() {
        edtNumero1 = findViewById(R.id.edtNumero1);
        edtNumero2 = findViewById(R.id.edtNumero2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void sumar(View view) {

        try {
            int numero1 = Integer.parseInt(edtNumero1.getText().toString());
            int numero2 = Integer.parseInt(edtNumero2.getText().toString());
            operationPresenter.suma(numero1, numero2);
        } catch (NumberFormatException nfe) {
            invalidOperation();
        }

    }

    public void restar(View view) {

        try {
            int numero1 = Integer.parseInt(edtNumero1.getText().toString());
            int numero2 = Integer.parseInt(edtNumero2.getText().toString());
            operationPresenter.resta(numero1, numero2);
        } catch (NumberFormatException nfe) {
            invalidOperation();
        }

    }

    public void multiplicar(View view) {

        try {
            int numero1 = Integer.parseInt(edtNumero1.getText().toString());
            int numero2 = Integer.parseInt(edtNumero2.getText().toString());
            operationPresenter.producto(numero1, numero2);
        } catch (NumberFormatException nfe) {
            invalidOperation();
        }

    }

    public void dividir(View view) {

        try {
            int numero1 = Integer.parseInt(edtNumero1.getText().toString());
            int numero2 = Integer.parseInt(edtNumero2.getText().toString());
            operationPresenter.division(numero1, numero2);
        } catch (NumberFormatException nfe) {
            invalidOperation();
        }

    }

    @Override
    public void showResultado(String resultado) {
        tvResultado.setText(resultado);
    }

    @Override
    public void invalidOperation() {
        Toast.makeText(this, "Operación no válida", Toast.LENGTH_SHORT).show();
    }
}