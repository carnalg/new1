package z1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=null;
        int z,j=0;
        try {
            scanner = new Scanner(new File("src/in.txt"));

            int[] numbers=new int [scanner.nextInt()];


           for(int i=0;i<numbers.length;i++){
               numbers[i]=scanner.nextInt();
           }

           for(int i=0;i<numbers.length;i++){
               for(j=0;j<numbers.length-1;j++){
                   if(numbers[j]>numbers[j+1]){
                       z=numbers[j];
                       numbers[j]=numbers[j+1];
                       numbers[j+1]=z;
                   }
               }
           }

            for(int i=0;i<numbers.length;i++){
                for(j=0;j<numbers.length-1;j++){
                    if(numbers[j]>10&&numbers[j]<numbers[j+1]){
                        z=numbers[j];
                        numbers[j]=numbers[j+1];
                        numbers[j+1]=z;
                    }
                }
            }


            for(int i=0;i<numbers.length;i++) {
                System.out.println(numbers[i]);
            }

            int[] newmass=new int [numbers.length];

                for (int i = 0; i < numbers.length-1; i++) {
                    if (numbers[i] >= 0 && numbers[i] < 10) {
                        newmass[j] = numbers[i];
                        j++;
                    }
                }




            for(int i=0;i<newmass.length;i++) {
                System.out.print(newmass[i]+" ");
            }


        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
