package com.example.calculator.mvp.presenter;

import com.example.calculator.mvp.model.ICalcModel;
import com.example.calculator.mvp.view.ICalcView;

public class CalcPresenter implements ICalcView.IComputationListener {
    private ICalcModel model;

    private ICalcView gui;

    public CalcPresenter(ICalcModel model, ICalcView gui) {
        this.model = model;
        this.gui = gui;

        setListeners();
    }

    private void setListeners(){
        gui.subscribe(this);
    }

    @Override
    public void onAdd() {
        double result = model.add(gui.getOperand1(), gui.getOperand2());
        gui.updateDisplay(result);
    }

    @Override
    public void onMult() {
        double result = model.mult(gui.getOperand1(), gui.getOperand2());
        gui.updateDisplay(result);
    }

    @Override
    public void onDiv() {
        double result = model.div(gui.getOperand1(), gui.getOperand2());
        gui.updateDisplay(result);
    }

    @Override
    public void onSub() {
        double result = model.sub(gui.getOperand1(), gui.getOperand2());
        gui.updateDisplay(result);
    }
}
