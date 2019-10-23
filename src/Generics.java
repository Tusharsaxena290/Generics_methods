import java.util.Scanner;
public class Generics {
    public <E> void printArray( E[]s){
        for ( E x:s)
              {
                  System.out.println(x);

        }


        }


    public static void main(String[]args){
        Generics obj=new Generics();
        String countries[]=new String[]{"India","Australia","England","South Africa"};
        Integer number[]=new Integer[]{1,2,3,4};
        obj.printArray(countries);
        obj.printArray(number);
    }



}
