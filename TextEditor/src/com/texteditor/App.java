package com.texteditor;
public class App {
    public static void main(String[] args) throws Exception {
        TextEditor textEditor=new TextEditor();
        CareTaker careTaker=new CareTaker();

        textEditor.setText("Hello,");
        careTaker.push(textEditor.addText());
        textEditor.displayText();

        textEditor.setText("how are");
        careTaker.push(textEditor.addText());
        textEditor.displayText();

        textEditor.setText("you");
        careTaker.push(textEditor.addText());
        textEditor.displayText();

        textEditor.undo(careTaker.cancel());
        textEditor.displayText();

        
        textEditor.undo(careTaker.cancel());
        textEditor.displayText();

        textEditor.undo(careTaker.cancel());
        textEditor.displayText();

        textEditor.redo(careTaker.recover());
        textEditor.displayText();

        
        textEditor.redo(careTaker.recover());
        textEditor.displayText();

        textEditor.redo(careTaker.recover());
        textEditor.displayText();
    }
}
