/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author Office
 */
public class PolymorphismAnimalMonkey extends PolymorphismAnimal{
    @Override
    public String sound(String monkey){
        if(monkey.equals("monkey")){
            monkey="yes you're right this is a monkey";
        return monkey;
        }
        return monkey;
    }
}
