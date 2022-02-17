package com.example.calculator.mvp.presenter;


import com.example.calculator.mvp.model.HighLevelCalc;
import com.example.calculator.mvp.model.ICalcModel;
import com.example.calculator.mvp.view.ICalcView;

public class PresenterManager {
    //singleton to provide the correct presenter to each client
    private static PresenterManager instance;

    private static CalcPresenter presenter;
    private static ICalcModel calculator;

    private PresenterManager(){
    }

    public static PresenterManager getInstance(){
        if(instance == null){
            instance = new PresenterManager();
        }
        return instance;
    }

    public void initCalcPresenter(ICalcView view ){
        calculator = new HighLevelCalc();
        presenter = new CalcPresenter(calculator,view);
    }

}
