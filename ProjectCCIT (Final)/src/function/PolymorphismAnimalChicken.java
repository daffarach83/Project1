/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author Office
 */
public class PolymorphismAnimalChicken extends PolymorphismAnimal{
    @Override
    public String sound(String chicken){
        if(chicken.equals("chicken")){
            chicken="yes you're right this is a "+chicken;
        return chicken;
        }
        return chicken;
    }

//    public String sound(String monkey){
//        if(monkey.equals("chicken")){
//            monkey="yes you're right this is a chicken";
//        return monkey;
//        }
//        return monkey;
//    }
    
//    public String animalSound(String animalSound){
//        animalSound="yes you're right! this is a chicken";
//        return animalSound;
//    }
}
