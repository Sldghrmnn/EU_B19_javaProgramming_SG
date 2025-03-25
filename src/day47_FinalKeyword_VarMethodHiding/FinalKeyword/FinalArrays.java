package day47_FinalKeyword_VarMethodHiding.FinalKeyword;

public class FinalArrays {
    public static void main(String[] args) {

        int[] nums = new int[2];
        nums[0]=0;
        nums[1]=1;

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);

        nums[0]=10;
        nums[1]=11;
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);

        System.out.println();

        int[] nums2 ={30,31};
        nums=nums2;
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);

        /// //////
        System.out.println("-------------------------------------");

        final int[] nums3 ={40,41};
        System.out.println("nums3 = " + nums3);

        System.out.println("nums3[0] = " + nums3[0]);
        System.out.println("nums3[1] = " + nums3[1]);


        nums3[0]=50;
        nums3[1]=51;
        System.out.println("nums3[0] = " + nums3[0]);
        System.out.println("nums3[1] = " + nums3[1]);

        int[] nums4 ={60,61};
        System.out.println("nums4 = " + nums4);

        //nums3 = nums4; final keyword ile yapilan array referansini degistiremezsin

        System.out.println("nums4[0] = " + nums4[0]);
        System.out.println("nums4[1] = " + nums4[1]);

        //nums3 = new int[2];


    }
}
