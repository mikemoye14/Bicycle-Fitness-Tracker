/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

/**
 *
 * @author MTM5313
 */
public class User {
    
    private String name = "";    
    private int age = 25;
    
    public User(){ 
    }
    
    public User(int age){        
        setAge(age);        
    }
    
    private void setAge(int age){
        this.age = age;
    }
    
    private int getAge(){
        return this.age;        
    }
    
}
