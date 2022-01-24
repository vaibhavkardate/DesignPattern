/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational  ;

/**
 *
 * @author vaibh
 */

interface PrototypeDesign {  
  
     public PrototypeDesign getClone();  
      
}

class EmployeeRecord implements PrototypeDesign{  
      
   private int id;  
   private String name, designation;  
   private double salary;  
   private String address;    
 public  EmployeeRecord(int id, String name, String designation, double salary, String address) {  
         
        this.id = id;  
        this.name = name;  
        this.designation = designation;  
        this.salary = salary;  
        this.address = address;  
    }  
      
  public void showRecord(){  
          
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);  
   }  
  
    @Override  
    public PrototypeDesign getClone() {  
          
        return new EmployeeRecord(id,name,designation,salary,address);  
    }  
}


public class Prototype {
    public static void main(String[] args) {
        EmployeeRecord e1=new EmployeeRecord(1,"vaibhav","JSE",60000,"MP");  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
    }
    
}
