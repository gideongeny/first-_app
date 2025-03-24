import java.util.Scanner;

public class MyVariables {
    int a;
    int b;
    String first_name;
    String last_name;
    String third_name;
    public void calculate(){

        Scanner na=new Scanner(System.in);
        System.out.println("Enter Number 1");
        a=Integer.parseInt(na.nextLine());

        Scanner nb=new Scanner(System.in);
        System.out.println("Enter Number 2");
        b=Integer.parseInt(nb.nextLine());

        int c;
        c=a+b;
        System.out.println(c);
    }
    public void join_names(){
        String full_name;
        Scanner fn = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        first_name=fn.nextLine();

        Scanner fn2 = new Scanner(System.in);
        System.out.println("Enter Last Name: ");
        last_name=fn2.nextLine();

        full_name= first_name + " " + last_name + " ";
        System.out.println(full_name);

    }
}