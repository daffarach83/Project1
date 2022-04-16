/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import frame.chicken1;
import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author Office
 */
public class Encapsulation extends chicken1{
    private int point;
    
    public void popupTrue(){
        JOptionPane.showMessageDialog(this, "Kamu benar!");
        
    }
    
    public void popupFalse(){
        JOptionPane.showMessageDialog(this, "Kesempatan habis, kamu salah!");
    }
    
    public int getPoint() {
        return point;
    }
    
    public void setPoint(int Point) {
        this.point = Point;
    }
    
}
