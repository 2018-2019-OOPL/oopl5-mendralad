package pl.edu.ur.oopl5.stack;

import java.util.EmptyStackException;   

/**
 */
public class Stack extends AbstractStack {

    private int[] tab;
    private int n;
    private int index;
    
    public Stack(int[] tab, int n, int index){
        this.tab = tab;
        this.n = n;
        this.index = index;
        
    }
    
    public int peek(){
        return tab[index];
    }
    
    public boolean isFull(){
        if (index == n){
            return true;
        }
        else
            return false;
    }
    
    @Override
    public void push(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!isFull()){
           index = index+1;
           tab[index] = i;
        }
        else{
            System.out.println("Stos jest pe³ny");
        }
    }

    @Override
    public int pop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(n<1){
            return true;
        }
        else
            return false;
    }

}
