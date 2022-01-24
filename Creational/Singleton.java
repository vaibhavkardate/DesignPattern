/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational;

/**
 *
 * @author vaibh
 */

class SingletonObj
{
    private static SingletonObj obj;
 
    // private constructor to force use of
    // getInstance() to create Singleton object
    private SingletonObj() {
        System.out.println("constr.. called");
    }
 
    public static SingletonObj getInstance()
    {
        if (obj==null)
            obj = new SingletonObj();
        return obj;
    }
}
public class Singleton {
    public static void main(String[] args) {
       SingletonObj obj= SingletonObj.getInstance();
    }
}
