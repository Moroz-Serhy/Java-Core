import java.util.Random;

public class home_1 {

    public static void main (String[] arqs){

        //1
        byte a = 50;
        short b = 20;
        int c = 56;
        long d = 485;
        float e = 22.3f;
        double f = 25.365;

        char g = 'l';

        boolean q = true;

        //2
        System.out.println("Byte min - "+Byte.MIN_VALUE);
        System.out.println("Byte max - "+Byte.MAX_VALUE);
        System.out.println("Short min - "+Short.MIN_VALUE);
        System.out.println("Short max - "+Short.MAX_VALUE);
        System.out.println("Integer min - "+Integer.MIN_VALUE);
        System.out.println("Integer max - "+Integer.MAX_VALUE);
        System.out.println("Long min - "+Long.MIN_VALUE);
        System.out.println("Long max - "+Long.MAX_VALUE);
        System.out.println("Float min - "+Float.MIN_VALUE);
        System.out.println("Float max - "+Float.MAX_VALUE);
        System.out.println("Double min - "+Double.MIN_VALUE);
        System.out.println("Double max - "+Double.MAX_VALUE);
        System.out.println();

        //3
        Random rnd = new Random();
        int[] array = new int[10];
        for(int i=0; i< array.length; i++){
            array[i] = rnd.nextInt(100)+1;
        }

        System.out.print("array = ");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+"; ");
        }
        System.out.println();

        int max_array = array[0], min_array = array[0];
        for(int i=1; i<array.length;i++){
            if(array[i]>max_array){
                max_array = array[i];
            }
        }
        System.out.println("максимальне значення "+ max_array);
        for(int i=1; i<array.length; i++){
            if(array[i]<min_array){
                min_array = array[i];
            }
        }
        System.out.println("мінімальне значення "+ min_array);

    }
}
