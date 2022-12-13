public class Assi2 {
    public static void main(String[]args){
        int z=5;
        if (z>0)
        {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
         // 10 se divide or modulo
        int x=3245;
        System.out.println("unit digit is= " +x%10);// numbercha last digit milato

        System.out.println("remove last digit = "+x/10);//numbercha last digit remove hoto

        // swapping value
        int a=10,b=20 ,c;
        System.out.println("a= "+ a + " b= "+b);

        c=a;
        a=b;
        b=c;
        System.out.println("a= "+ a + " b= "+b);

         // logical oprator

        int p=35,r=83, k ,j, h;
        k= p & r;
        System.out.println(k);
        j= p ^ r;
        System.out.println(j);
        h= p | r;
        System.out.println(h);

        // Rotate digit
        int  d, f =2563;
        System.out.println("f= "+ f);
        d= f % 10;
        f= f / 10;

        System.out.println(" "+d + f);



    }


    }




