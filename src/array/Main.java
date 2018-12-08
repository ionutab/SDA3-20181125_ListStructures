package array;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add(4);
        myArrayList1.add(7);
        myArrayList1.add(3);
        myArrayList1.add(9);
        myArrayList1.add(11);
        myArrayList1.add(21);
        myArrayList1.add(17);
        myArrayList1.add(9);
        myArrayList1.showArray();
        myArrayList1.add(9);
        myArrayList1.showArray();
        myArrayList1.add(2);
        myArrayList1.showArray();
        myArrayList1.add(9);
        myArrayList1.showArray();
        myArrayList1.add(4);
        myArrayList1.showArray();
        myArrayList1.add(89);
        myArrayList1.showArray();
        myArrayList1.add(88);
        myArrayList1.showArray();
        myArrayList1.add(65);
        myArrayList1.showArray();
        myArrayList1.add(12);
        myArrayList1.showArray();
        myArrayList1.add(22);
        myArrayList1.showArray();
        myArrayList1.add(25);
        myArrayList1.showArray();
        myArrayList1.add(27);
        myArrayList1.showArray();
        myArrayList1.add(31);
        myArrayList1.showArray();
        myArrayList1.add(35);
        myArrayList1.showArray();

        //17
        System.out.println(myArrayList1.getAt(7));
        Integer exampleValue = myArrayList1.getAt(45);
        System.out.println(exampleValue);

    }

}
