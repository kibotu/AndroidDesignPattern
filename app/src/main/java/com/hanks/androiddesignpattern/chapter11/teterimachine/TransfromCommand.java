package com.hanks.androiddesignpattern.chapter11.teterimachine;
/**
 * Created by hanks on 15-12-18.
 */
public class TransfromCommand implements Command {
    TetriMachine tetriMachine;

    public TransfromCommand(TetriMachine tetriMachine) {
        this.tetriMachine = tetriMachine;
    }

    @Override public void executed() {
        tetriMachine.transform();
    }
}
