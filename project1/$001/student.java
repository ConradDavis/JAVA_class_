package $001;
import java.util.Scanner;
public class student {
         int age;
         String name;
         boolean gender;
         void printInfo() {
        	 System.out.println(age+"\t"+name+"\t"+gender);
         }
                 
         void printGender() {
        	 if(gender = true) {
        		 System.out.println("��");
        	 }else {
        		 System.out.println("Ů");
        	 }
         }
         
         void printAlphabet() {
        	 int i=97;
        	 for(i=97;i<123;i++)
          	 System.out.println((char)i);
              //while(i<123)
        	 //System.out.println(i++" ");
         }
         void printlmc() {
        	 System.out.println("�뾶��");
        	 Scanner sc= new Scanner(System.in);
              double r=sc.nextDouble();
              double l=2*r*Math.PI;
			  System.out.println("   "+l);
     } 	
}
