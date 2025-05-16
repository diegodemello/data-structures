package array;

import java.util.Arrays;

public class Array {
    private String[] elements;
    private int sizeArray;

    public Array(int size) {
        this.elements = new String[size];
        this.sizeArray = 0;
    }

    public boolean addElement(String element){
        if (sizeArray < elements.length) {
            this.elements[this.sizeArray] = element;
            this.sizeArray++;
            return true;
        }
        return false;
    }

    public int getSize(){
        return this.sizeArray;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        s.append("[");
        for(int i = 0; i < this.sizeArray-1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        if(this.sizeArray>0){
            s.append(this.elements[this.sizeArray-1]);
        }
        s.append("]");

        return s.toString();
    }
}
