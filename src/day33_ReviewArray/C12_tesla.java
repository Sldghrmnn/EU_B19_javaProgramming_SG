package day33_ReviewArray;

public class C12_tesla {
    public static void main(String[] args) {

    }
    //A string S made of uppercase English letters is given. In one move, six letters forming the word
    // "BANANA" (one 'B', three 'A's and two 'N's) can be deleted from S. What is the maximum number of
    // times such a move can be applied to S?
    //Write a function: class Solution { public int solution(String S); }
    //that, given a string S of length N, returns the maximum number of moves that can be applied.
    //Examples:
    //1.    Given S = "NAABXXAN", the function should return 1.
    //2.    Given S = "NAAAAXNAABYNBZ", the function should return 2.
    //3.    Given S = "QABAAAWOBI", the function should return 0.

//  Bir S dizesi (string) verilmiştir ve bu dize yalnızca büyük harflerden oluşmaktadır.
// Bir hamlede, "BANANA" kelimesini oluşturan altı harfi (1 tane 'B', 3 tane 'A' ve 2 tane 'N') dizeden silebiliriz.
//  Bu işlemi en fazla kaç kez uygulayabiliriz?
//  Bu sorunun çözümü için bir metod yazınız.

    public int solution(String S){
       int sayacB =0;
       int sayacA =0;
       int sayacN =0;

       for (char x : S.toCharArray() ) {
           if (x == 'B')sayacB++;
           if (x == 'A')sayacA++;
           if (x == 'N')sayacN++;
       }
       return Math.min(sayacB/1,Math.min(sayacA/3,sayacN/2));

    }
}
