/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
    // static method 
    static void myStaticMethod (){
        System.out.println ("Static method can  be called without creating objects");
    }
    
    // public method 
    public void myPubicMethod (){
        System.out.println ("Public methodhs must be called by creating objects");
    }
    
    //main method 
    public static void main (String []args){
        myStaticMethod();//call the ststic method 
        
        MyClass myObj = new MyClass ();
        myObj.myPubicMethod();
    }
}
