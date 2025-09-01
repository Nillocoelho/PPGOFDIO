package com.dio.design.command;
public class RemoteControl {
    private Command command;
    public void setCommand(Command c) { this.command = c; }
    public void press() { if (command!=null) command.execute(); }
}
