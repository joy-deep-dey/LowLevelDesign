package com.joy.design_patterns.command.controller;

import com.joy.design_patterns.command.service.Command;

public class Remote {
    private static final int numButtons=4;
    private Command[] buttons;
    private boolean[] buttonStatus;

    public Remote(){
        buttons = new Command[numButtons];
        buttonStatus = new boolean[numButtons];

        for (int i = 0; i < numButtons; i++) {
            buttons[i] = null;
            buttonStatus[i] = false;  // false = off, true = on
        }
    }

    public void setCommand(int idx, Command cmd) {
        if (idx >= 0 && idx < numButtons) {
            buttons[idx] = cmd;
            buttonStatus[idx] = false;
        }
    }

    public void pressButton(int idx) {
        if (idx >= 0 && idx < numButtons && buttons[idx] != null) {
            if (!buttonStatus[idx]) {
                buttons[idx].execute();
            } else {
                buttons[idx].undo();
            }
            buttonStatus[idx] = !buttonStatus[idx];
        } else {
            System.out.println("No command assigned at button " + idx);
        }
    }

}
