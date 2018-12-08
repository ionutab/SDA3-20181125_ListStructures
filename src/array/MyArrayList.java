package array;

public class MyArrayList {

    static int DEFAULT_SEGMENT_LENGTH = 10;

    int[] values;

    int length;

    MyArrayList(){
        this.values = new int[DEFAULT_SEGMENT_LENGTH];
        this.length = 0;
    }

    void increaseSize(){
        // 1. create new array
        int[] newValues = new int[values.length + DEFAULT_SEGMENT_LENGTH];
        // 2. copy values
        for (int i=0; i<values.length;i++) {
            newValues[i]=values[i];
        }
        // 3. atribuirea
        values = newValues;
    }

    void add(int value){
        // 1. test if we are max capacity
        if(length == values.length){
            increaseSize();
        }
        // 2. set value
        values[length] = value;
        // 3. increase current length
        length++;
    }

    void showArray(){
        System.out.println( length + " / " + values.length);
        for (int i = 0; i < length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    Integer getAt(int index){
        if(index >= 0 && index < length){
            return values[index];
        }
        return null;
    }

}
