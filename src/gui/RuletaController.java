/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static java.lang.Math.*;

/**
 *
 * @author omarc
 */
public class RuletaController {
    
    public double generateX(int k, int n, double resolution){        
        return resolution*(1-cos(k*(2*Math.PI/n)));               
    }
    
    public double generateY(int k, int n, double resolution){                
        return resolution*(1-sin(k*(2*Math.PI/n)));
    }
    public static void main(String[]arg){
        for(int i = 1; i <5 ;++i){
            System.out.println("X: " + new RuletaController().generateX(i,4,1000));
            System.out.println("Y: " + new RuletaController().generateY(i,4,1000));
        }
    }
}
