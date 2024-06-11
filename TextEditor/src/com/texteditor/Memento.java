package com.texteditor;

public class Memento {
    public final String text;

    public Memento(String text){
        this.text=text;
    }
    public String getText(){
        return this.text;
    }
    
}
