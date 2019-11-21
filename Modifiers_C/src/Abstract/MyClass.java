/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author WINDOWS 10
 */

  abstract class Persone{ 
    public String fname = "Aulia";
    public int age = 19;
    public abstract void study ();
  }
  
  class Student extends Persone {
      public int graduationYear = 2018;
      public void study () {
          System.out.println ("Studying all day long");
      }
  }
  class MyClass{
    public static void main (String [] args ){
        Student myObj = new Student();
          
          System.out.println ("Name : " + myObj.fname);
          System.out.println ("Age : " + myObj.age);
          System.out.println ("Graduation Year : " +myObj.graduationYear);
          myObj.study();
    }
}

