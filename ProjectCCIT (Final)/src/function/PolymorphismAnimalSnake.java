/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author Office
 */
public class PolymorphismAnimalSnake extends PolymorphismAnimal{
    @Override
    public String sound(String snake){
        if(snake.equals("snake")){
            snake="yes you're right this is a "+snake;
        return snake;
        }
        return snake;
    }
}
