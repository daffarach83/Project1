/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author Office
 */
public class PolymorphismAnimalCow extends PolymorphismAnimal{
    @Override
    public String sound(String cow){
        if(cow.equals("cow")){
            cow="yes you're right this is a "+cow;
            return cow;
        }
        return cow;
    }
}
