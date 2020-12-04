package com.company;

public class Main {

    public static void main(String[] args) {
	for (int i=1;i<=100;i++)
    {
        switch (i%5){
            case 0: {
                if (i%3==0){System.out.println("BrendenShilling");}else{System.out.println("Shilling");}
                break;
            }
            default: if(i%3==0){System.out.println("Brenden");}else{System.out.println(i);} break;
        }
    }
    }
}
