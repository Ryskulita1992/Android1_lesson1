package com.example.android1_lesson1;

public class Calculator {
    int firstArg;
    int secondArg;


    StringBuilder inputStr=new StringBuilder();


    private State state;
    private enum State{
        firstArgInput,
        secondArgInput,
        resultShow,}


        private  Calculator(){

        }

    public Calculator(int firstArg) {
        state = State.firstArgInput;
    }
    public void onNumPressed(int buttonId){

    }
    public void onActionPressed(int actionId){

    }
}
