package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int a = 100, j = 0;
    int arrayNum [] = new int[a + 1];

    arrayNum [1] = 0;

    for (int i = 1; i <= a; i++)
        arrayNum [i] = i;

    for (int i = 4; i <= a/i; i++)
        if (arrayNum [i] != 0) {
            j = i;
            while ((j += i) <= a)
                arrayNum[j] = 0;
        }
    for (int i = 1; i <= a; i++)
        if (arrayNum[i] != 0) System.out.print(arrayNum[i]+" ");
    }
}
