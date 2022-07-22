package Pattern;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Methodpro {
    //block
    public int block(int a)
    {
            for(int i=1;i<=40;i++)
            {
                for(int j=1;j<=40;j++)
                {
                    if(j==a && i==a ||j==a && i==a+1 ||j==a+1 && i==a ||j==a+1 && i==a+1 )
                    {
                        System.out.print("*");
                    }
                    else
                        System.out.print(".");
                }
                System.out.println();
            }

        
        return a;

    }
    public int U(int a)
    {
        for(int i=1;i<=40;i++)
        {
            for(int j=1;j<=40;j++)
            {
                if(j==a && i==a ||j==a && i==a+1 ||j==a && i==a+2 ||i==a+3 && j==a ||i==a+4 && j==a ||j==a+6 && i==a ||j==a+6 && i==a+1 ||j==a+6 && i==a+2 ||i==a+3 && j==a+6 ||i==a+4 && j==a+6 || i==a+4 && j==a+1
                || i==a+4 && j==a+2 || i==a+4 && j==a+2 || i==a+4 && j==a+3 || i==a+4 && j==a+4 || i==a+4 && j==a+5  )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(".");
            }
            System.out.println();
        }
            return a;

    }
    public int square(int a)
    {
        for(int i=1;i<=40;i++)
            {
                for(int j=1;j<=40;j++)
                {
                    if(j==a+1 && i==a ||j==a+1 && i==a+2 ||j==a && i==a+1 ||j==a+2 && i==a+1 )
                    {
                        System.out.print("*");
                    }
                    else
                        System.out.print(".");
                }
                System.out.println();
            }
        
            return a;

    }
    public void clear()
    {
        for(int i=1;i<=40;i++)
            {
                for(int j=1;j<=40;j++)
                {

                        System.out.print(".");
                }
                System.out.println();
            }
        

    }
    public void save(int b, char c)
    {
        System.out.println(b);
        System.out.println(c);
        

    }
    public void load(int b, char c)
    {
        System.out.println(b);
        System.out.println(c);
        Methodpro obj1=new Methodpro();
        if(c=='1')
        {
            obj1.block(b);
        }
        else if(c=='2')
        {
            obj1.square(b);
        }
        else if(c=='3')
        {
            obj1.U(b);
        }
        else 
            System.out.println("nothing is saved");

    }
    public void manual()
    {
        int[][] arr=new int[8][2];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter the row:"+"arr["+i+"]["+j+"]");
                arr[i][j]=s.nextInt();
                
                System.out.println("Enter the column:");
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(" "+arr[i][j]);
            
                
            }
            System.out.println();
        }
        for(int i=0;i<=40;i++)
            {
                for(int j=0;j<40;j++)
                {
                    if(i==arr[0][0] && j==arr[0][0] ||i==arr[1][0] && j==arr[1][0]|| i==arr[2][0] && j==arr[2][0] ||i==arr[3][0] && j==arr[3][0] || i==arr[4][0] && j==arr[4][0] 
                    || i==arr[5][0] && j==arr[5][0] || i==arr[6][0] && j==arr[6][0]|| i==arr[7][0] && j==arr[7][0])
                    {
                        System.out.print("*");
                    }
                    else
                        System.out.print(".");
                }
                System.out.println();
            }
    }



    public static void main(String[] args) {
        Random random=new Random();

        int x=random.nextInt(8);

        Scanner sc=new Scanner(System.in);
        char c2=0,c3,l=0;


        int b=0;

       Methodpro obj=new Methodpro();

        //System.out.println(obj.block(x));


        System.out.println("press 'p'  to continue");
        System.out.println("press 'q' to quit");

        char c=sc.next().charAt(0);

        if(c=='p'|| c=='P')
        {
        do{

        
        System.out.println("[1] press block is view");
        System.out.println("[2] press U is view");
        System.out.println("[3] press square is view");
        System.out.println("[4] press snake is view");

        System.out.println("press 'c' to clear");
        System.out.println("press 'l' to load");
        System.out.println("press 's' to save");
        System.out.println("press 'M' to Manual");
        System.out.println("press 'q' to quit");
        c3=c2;

        c2=sc.next().charAt(0);

        if(c2=='1')
        {
            x=random.nextInt(8);
            obj.block(x);
        }
        else if(c2=='2')
        {
            x=random.nextInt(8);
            obj.square(x);
        }
        else if(c2=='3')
        {
            x=random.nextInt(8);
            obj.U(x);
        }
        else if(c2=='c' || c2=='C')
        {
            obj.clear();
        }
        else if(c2=='s' || c2=='S')
        {
            b=x;
            l=c3;
            obj.save(b,l);
        }
        else if (c2=='l'   || c2=='L')
        {
            obj.load(b,l);
        }
        else if(c2=='m' || c2=='M')
        {
            obj.manual();
        }
        else 
            System.out.println();


    }while(c =='p' && c2 !='q' );
        

        }

    }
    
}
