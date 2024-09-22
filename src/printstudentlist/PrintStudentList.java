/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentlist;

/**
 *
 * @author Owner
 */
public class PrintStudentList {
 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(1);
        s1.setName("Alia");
        Student s2=new Student();
        s2.setId(2);
        s2.setName("Bibi");
        Student s3=new Student();
        s3.setId(3);
        s3.setName("Poule");
        Student[]list=new Student[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getId()+" "+list[i].getName());
        }
        // TODO code application logic here
    }
    
}
