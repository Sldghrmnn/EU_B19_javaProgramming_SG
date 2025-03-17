package day42_staticMemebers;

public class C06_Dinner {


   static int pizzaDilimi = 8;


    public void dilimAl(){
        if (pizzaDilimi <= 0){
            System.out.println("Pizza bitti !!!");
            return;
        }
            pizzaDilimi--;
    }

    public void dilimAl(int istenenDilim){
        if (istenenDilim > pizzaDilimi){
            System.out.println(istenenDilim+" dilim pizza kalmadi.Kalan dilim sayisi :"+pizzaDilimi);

        }else{
            pizzaDilimi -= istenenDilim;
        }
    }


}
