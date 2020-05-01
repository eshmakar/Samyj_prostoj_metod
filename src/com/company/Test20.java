package com.company;
public class Test20 {

    int summa ( int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    }

    class Test21{
        public static void main(String[] args) {

            Test20 t = new Test20();
            int summaTrehChisel = t.summa(15, 25, 36);
            System.out.println(summaTrehChisel);

            //можно еще короче сделать
            System.out.println(new Test20().summa(15, 25, 35));


        }
    }