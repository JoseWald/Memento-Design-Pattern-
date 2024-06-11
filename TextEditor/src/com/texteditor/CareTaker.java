package com.texteditor;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    public List<Memento> history=new ArrayList<>();
    private int historyIndex=0;

    public void push(Memento memento){
        history.add(memento);
        historyIndex=history.size()-1;
    }

   public Memento cancel(){
        if (historyIndex>0) {
            historyIndex--;
            return history.get(historyIndex);
        } 
        return history.get(0);
   }

   public Memento recover(){
        if (historyIndex<history.size()-1) {
            historyIndex++;
             history.get(historyIndex);
        }
        return history.get(historyIndex);
   }


    
}
