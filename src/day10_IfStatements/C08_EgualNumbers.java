package day10_IfStatements;

public class C08_EgualNumbers {
    public static void main(String[] args) {

 //3 sayı alın sayılar eşit olan sayıyı ekrana getiren
//(min 2 sayı eşit olmalı)
// eşit sayı yok ise ekrana eşit sayı yoktur
// yazan programı yazınız
// 1 ,2,3 eşit sayı yok
// 1,2,2 2
// 2,2,2 2
//2,3,2 2


int x,y,z;
x=333;
y=33;
z=3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
if (x==y){
    System.out.println(x);
}else if (y==z){
    System.out.println(z);
}else if (x==z){
    System.out.println(x);
}else{
    System.out.println("esit sayi yoktur");
}













    }
}
