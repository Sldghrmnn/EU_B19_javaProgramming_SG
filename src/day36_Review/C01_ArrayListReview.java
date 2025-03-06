package day36_Review;

import java.util.*;

public class C01_ArrayListReview {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        //yazdirma
        System.out.println("numberList = " + numberList);  //numberList = [10, 20, 30, 40, 50]
        System.out.println("numberList = " + numberList.toString());  //numberList = [10, 20, 30, 40, 50]

        //element sayisi
        System.out.println("numberList.size() = " + numberList.size()); //5

        //bos mu ?
        System.out.println("numberList.isEmpty() = " + numberList.isEmpty()); //false

        System.out.println("------for i ------------------");
        //for-i yazdirma
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i)+" ");
        }
        System.out.println();
        System.out.println("-------for each -------------");

        for (Integer number :numberList ) {
            System.out.println("number = " + number);
        }
        System.out.println("-------------------------------");
        //belirli index'e element ekleme

        numberList.add(4,45);
        System.out.println("numberList = " + numberList); //numberList = [10, 20, 30, 40, 45, 50]

        //belirli bir indeexteki elementi degerini degistirme
        numberList.set(2,300);
        System.out.println("numberList = " + numberList);

        //belli index'dekini silelim
        numberList.remove(4);
        System.out.println("numberList = " + numberList); //numberList = [10, 20, 30, 40, 50]

        //degeri 10 olan elementi silmek istersek
        System.out.println("numberList.remove(Integer.valueOf(10)) = " + numberList.remove(Integer.valueOf(10)));
              //true döner ve elementi siler
        System.out.println("numberList = " + numberList); //numberList = [20, 30, 40, 50]
        System.out.println("numberList.remove(Integer.valueOf(70)) = " + numberList.remove(Integer.valueOf(70)));
             //false doner islemi yapmaz,hata da vermez
        System.out.println("numberList = " + numberList);  //numberList = [20, 30, 40, 50]

        //contains() methodu
        System.out.println("numberList.contains(40) = " + numberList.contains(40)); //true
        System.out.println("numberList.contains(1000) = " + numberList.contains(1000)); //false

        //ArrayList'i tamamen silme
        numberList.clear();
        System.out.println("numberList = " + numberList);

        System.out.println("-------Bir ArrayyList'e element ekleme yollari----------");

        //1.yol add()
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(22);
        numbers.add(-78);
        numbers.add(200);
        System.out.println("numbers = " + numbers); //numbers = [2, 22, -78, 200]

        //2.yol
        //Collections addAll() mothodu ile
        Collections.addAll(numbers,32,36,98,-10);
        System.out.println("numbers = " + numbers); //numbers = [2, 22, -78, 200, 32, 36, 98, -10]

        //3.yol List.of() methodu ile
        //
        ArrayList<String>names = new ArrayList<>(List.of("Ali","Veli","Berrin"));
        System.out.println("names = " + names); //names = [Ali, Veli, Berrin]
        System.out.println("names.add(\"Zeliha\") = " + names.add("Zeliha"));// true
        System.out.println("names = " + names);   //names = [Ali, Veli, Berrin, Zeliha]

        //4.yol Arrays.asList() methodu ile
        ArrayList<String> isimler = new ArrayList<>(Arrays.asList("Ali","Elif","Serap"));
        System.out.println("isimler = " + isimler);  //isimler = [Ali, Elif, Serap]
        System.out.println("isimler.add(\"Hamza\") = " + isimler.add("Hamza")); // true
        System.out.println("isimler = " + isimler);   //isimler = [Ali, Elif, Serap, Hamza]

        Integer[] sayilar ={2,20,-9,33};
        ArrayList<Integer>sayilarList = new ArrayList<>(Arrays.asList(sayilar));
        System.out.println("sayilar = " + sayilar);

        //cift süslü prantez ile
        ArrayList<String> adlar = new ArrayList<>(){{
            add("Hasan") ;
            add("Yesim") ;
            add("Mahmut") ;

        }};
        System.out.println("adlar = " + adlar); //adlar = [Hazan, Yeşim, Mahmut]

        //ArrayList sıralama
        Collections.sort(adlar);
        System.out.println("adlar = " + adlar); //adlar = [Hasan, Mahmut, Yeşim]
        adlar.sort(Comparator.reverseOrder());
        System.out.println("adlar = " + adlar); //adlar = [Yeşim, Mahmut, Hasan]
        adlar.sort(Comparator.naturalOrder());
        System.out.println("adlar = " + adlar); //adlar = [Hasan, Mahmut, Yeşim]

        //ArrayList'i Array'e cevirme
        //1.yol for dongusu ile

        String[]adlarArray = new String[adlar.size()];

        for (int i = 0; i < adlar.size(); i++) {
          adlarArray[i] = adlar.get(i);
        }

        System.out.println("Arrays.toString(adlarArray) = " + Arrays.toString(adlarArray)); //[Hasan, Mahmut, Yesim]

        //2.yol
        //toArray() methodu ile
       String[] adlarArray2 = adlar.toArray(new String[0]);

        System.out.println("Arrays.toString(adlarArray2) = " + Arrays.toString(adlarArray2));

    }
}
