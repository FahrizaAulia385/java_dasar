/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
class Bike {
    // data or attributes
    
    boolean Power;
    int Speed;
    
    //operattions or methods or behavior
    
    void Start(){
        Power = true;
        Speed = 0;
    }
    
    void Stop(){
        Power = true;
        Speed = 0;
    }
    
    void Accelerate (int newSpeed){
        Speed = newSpeed;
    }
    
    void PrintState(){
        System.out.println("Current state");
        System.out.println("Power = " +Power);
        System.out.println("Speed = " +Speed);
    }
}
public class Main {
    public static void main (String []args){
        Bike Honda, Suzuki;
        Honda = new Bike();
        Suzuki = new Bike();
        
        Honda.Start();
        Suzuki.Start();
        
        Honda.Accelerate(50);
        
        Honda.PrintState();
        Suzuki.PrintState();
    }
}
