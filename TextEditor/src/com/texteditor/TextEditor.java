package com.texteditor;

public class TextEditor {
     public String text;

     public void setText(String text){
        this.text=text;
     }

     public String getText(){
        return this.text;
     }

     public Memento addText(){
        return new Memento(text);
     }
     public void undo(Memento memento){
        text=memento.getText();
     }
     public void redo(Memento memento){
        text=memento.getText();
     }
     public void displayText(){
        System.out.println(text);
     }
 
}