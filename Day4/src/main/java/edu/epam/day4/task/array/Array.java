package edu.epam.day4.task.array;

import edu.epam.day4.task.service.ArrayService;

import java.util.Arrays;
import java.util.Objects;

public class Array {
    private int length;
    private int[] array;




    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void add(int a){
        array[length+1]= a;
        length++;
    }

    public int length() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder().append("length=").append(length)
                .append(", array=").append(Arrays.toString(array));
        return String.valueOf(result);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if (obj==null|| getClass() !=obj.getClass()){
            return false;
        }

        Array array = (Array) obj;
        if (array.length()!=this.length()){
            return false;
        }
        for (int i = 0; i<length; i++){
            if(array.getArray()[i]!=this.getArray()[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(length);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
