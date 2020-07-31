package com.company;

class Box {
    double width;
    double height;
    double depth;
}

public class Main {

    public static void main(String[] args) {
	// write your code here

    /* Вывод всех простых чисел до заданного
    int a = 100, j = 0;
    int arrayNum [] = new int[a + 1];

    arrayNum [1] = 0;

    for (int i = 1; i <= a; i++)
        arrayNum [i] = i;

    for (int i = 2; i <= a/i; i++)
        if (arrayNum [i] != 0) {
            j = i;
            while ((j += i) <= a)
                arrayNum[j] = 0;
        }
    for (int i = 1; i <= a; i++)
        if (arrayNum[i] != 0) System.out.print(arrayNum[i]+" ");

     */


        double vol;
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 100;
        mybox1.height = 12;
        mybox1.depth = 5;
        mybox2.width = 7;
        mybox2.height = 45;
        mybox2.depth = 19;

        vol = mybox1.height * mybox1.depth * mybox1.width;
        System.out.println(vol);

        vol = mybox2.height * mybox2.depth * mybox2.width;
        System.out.println(vol);
    }
}
