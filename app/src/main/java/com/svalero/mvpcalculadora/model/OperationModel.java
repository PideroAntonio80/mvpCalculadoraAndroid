package com.svalero.mvpcalculadora.model;

import com.svalero.mvpcalculadora.contract.OperationContract;
import com.svalero.mvpcalculadora.presenter.OperationPresenter;

public class OperationModel implements OperationContract.Model {
    private int resultado;
    private OperationPresenter operationPresenter;

    public OperationModel(OperationPresenter operationPresenter) {
        this.operationPresenter = operationPresenter;
    }

    @Override
    public void suma(int numero1, int numero2) {
        resultado = numero1 + numero2;
        operationPresenter.showResult(Integer.toString(resultado));
    }

    @Override
    public void resta(int numero1, int numero2) {
        resultado = numero1 - numero2;
        operationPresenter.showResult(Integer.toString(resultado));
    }

    @Override
    public void producto(int numero1, int numero2) {
        resultado = numero1 * numero2;
        operationPresenter.showResult(Integer.toString(resultado));
    }

    @Override
    public void division(int numero1, int numero2) {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
            operationPresenter.showResult(Integer.toString(resultado));
        } else {
            operationPresenter.invalidOperation();
        }

    }
}
