/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author Office
 */
public class PolymorphismAnimalHamster extends PolymorphismAnimal {
    @Override
    public String sound(String hamster){
        if(hamster.equals("hamster")){
            hamster="yes you're right this is a hamster";
            return hamster;
        }
        return hamster;
    }
}
