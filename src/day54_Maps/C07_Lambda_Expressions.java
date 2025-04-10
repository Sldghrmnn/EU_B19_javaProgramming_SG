package day54_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class C07_Lambda_Expressions {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("word1","word2"));

        words.forEach((elem)-> {
            System.out.println(elem);
        });
        ShouldHaveOnlyOneAbstractMethod obj = (a,b) -> {
            return a+b;
        };

        System.out.println("obj.sum(5,10) = " + obj.sum(5, 10));

    }


}

//sadece ama sadece 1 abstract method iceren bir interface olusturulup,@FunctionalInterface tag'i eklenir
@FunctionalInterface
interface ShouldHaveOnlyOneAbstractMethod{
   int sum(int a,int b);
}
