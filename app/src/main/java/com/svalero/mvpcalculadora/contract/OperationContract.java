package com.svalero.mvpcalculadora.contract;

public interface OperationContract {

    interface View {
        void showResultado (String resultado);
        void invalidOperation();
    }

    interface Presenter {
        void showResult(String resultado);
        void invalidOperation();
        void suma(int numero1, int numero2);
        void resta(int numero1, int numero2);
        void producto(int numero1, int numero2);
        void division(int numero1, int numero2);
    }

    interface Model {
        void suma(int numero1, int numero2);
        void resta(int numero1, int numero2);
        void producto(int numero1, int numero2);
        void division(int numero1, int numero2);
    }
}
