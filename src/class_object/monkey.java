/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object;

/**
 *
 * @author Vimal
 */
public class monkey {
    
    
   public void walking() {
       System.out.println("walking");
   }
    public void eating() {
        System.out.println("eating");
    }
    public class human extends monkey {
     public String name;
     public String gender;
     public float height;
     public float width;
     human()
     {
         name="raj";
         gender="male";
         height="59";
         width="50";
         System.out.println("name:"+name+",gender"+gender+",height"+height+",width"+width);
     }  
     human(String name1,String gender1,float height1,float width1)
     {
         name=name1;
         gender=gender1;
         height=height1;
         width=width1;
         System.out.println("\"name:\"+name+\",gender\"+gender+\",height\"+height+\",width\"+width");
                
     }
     public String get_details() {
             return("name:"+name+",gender"+gender+",height"+height+",width"+width);
     
     }
     pubic String get_details(String status)
     {
         String value="";
         if(status=="name");
         {
             value="name:"+name;
         }
         else if(status=="height:"+height)
                 {
                 value="height:"+height;
                 }
         return value;
     }
     public void eating() {
         System.out.println("human eat only hygeic food");
     }
   }
 
         
    
     
        