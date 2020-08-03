package com.company;

class Test {
    int a,b;

    Test (int i, int j) {
        a = i;
        b = j;
    }

    Test meth () {
        Test temp = new Test (a*2,b+2);
        return  temp;
    }
}

class Stack {
    private int stck[];
    private int tos;
    final static int e = 2;
    static int y ;

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void  push(int item) {
        if (tos==stck.length-1)
            System.out.println("Стек заполнен");
        else {
            stck[++tos] = item;
            System.out.println(e);
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return  0;
        }
        else
            return stck[tos--];
    }
}

class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    Box (double len) {
        width = height = depth = len;
    }

    Box (double w, double h, double d) {
      //  System.out.println("Создаю объект");
        width = w;
        height = h;
        depth = d;
    }
    /*void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }*/
}

public class Main {

    public static void main(String args[]) {
	for (int i = 0; i < args.length;i++)
	    System.out.println(args[i]);
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
        Test ob = new Test(15, 20);
        Test ob1;
        System.out.println(ob.a+" "+ob.b);
        ob1 = ob.meth();
        System.out.println(ob1.a+" "+ob1.b);

        double vol;
        Box mybox1 = new Box(100, 12, 5);
        Box mybox2 = new Box(12);

        //mybox1.setDim(100, 12, 5);
       // mybox2.setDim(7, 45, 19);

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);

        Stack mystack1 = new Stack(4);
        Stack mystack2 = new Stack(10);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 7; i <= 10; i++) mystack2.push(i);

        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        for (int i = 7; i <= 10; i++)
            System.out.println(mystack2.pop());
        Stack.y=5;
        System.out.println(Stack.e);
        String str;
        str = "абв";
        System.out.println(str.charAt(1));
    }
}
