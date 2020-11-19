package com.svalero.mvpcalculadora.presenter;

import com.svalero.mvpcalculadora.contract.OperationContract;
import com.svalero.mvpcalculadora.model.OperationModel;
import com.svalero.mvpcalculadora.view.OperationActivityView;

public class OperationPresenter implements OperationContract.Presenter {

    private OperationActivityView operationActivityView;
    private OperationModel operationModelmodel;

    public OperationPresenter(OperationActivityView operationActivityView) {
        this.operationActivityView = operationActivityView;
        this.operationModelmodel = new OperationModel(this);
    }

    @Override
    public void showResult(String resultado) {
        if(operationActivityView != null) {
            operationActivityView.showResultado(resultado);
        }
    }

    @Override
    public void invalidOperation() {
        if(operationActivityView != null) {
            operationActivityView.invalidOperation();
        }
    }

    @Override
    public void suma(int numero1, int numero2) {
        if(operationModelmodel != null) {
            operationModelmodel.suma(numero1, numero2);
        }
    }

    @Override
    public void resta(int numero1, int numero2) {
        if(operationModelmodel != null) {
            operationModelmodel.resta(numero1, numero2);
        }
    }

    @Override
    public void producto(int numero1, int numero2) {
        if(operationModelmodel != null) {
            operationModelmodel.producto(numero1, numero2);
        }
    }

    @Override
    public void division(int numero1, int numero2) {
        if(operationModelmodel != null) {
            operationModelmodel.division(numero1, numero2);
        }
    }
}
