
package okulpuan;

public class OkulPuan {

   
    public static void main(String[] args) {
        int sayi=(int) (Math.random() * 100);
        System.out.println(sayi);
        if(sayi>=0&&sayi<35){
            System.out.println("Notunuz FF");
    }
        else if(sayi>=35&&sayi<50){
        System.out.println("Notunuz DC");
    }
        else if(sayi>=50&&sayi<70){
            System.out.println("Notunuz BB");
        }
        else{
        System.out.println("Notunuz AA");
    }
}
}

