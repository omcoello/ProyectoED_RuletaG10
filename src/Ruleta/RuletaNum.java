package Ruleta;

import TDA.CircularlyDoubleLinkedList;

import java.util.Random;



/**
 *
 * @author Alexis
 */
public class RuletaNum {
    
    private CircularlyDoubleLinkedList<Integer> ruleta;
    
    public RuletaNum(){
        this.ruleta = null;
    }
    
    public RuletaNum(CircularlyDoubleLinkedList<Integer> ruleta) {
        this.ruleta = ruleta;
    }
    
    public int calcularValor() {
        int total = 0;
        int aux;
        for (int i = 0; i < ruleta.size(); i++) {
            aux = ruleta.get(i);
            total += aux;
        }
        return total;
    }
    
    public CircularlyDoubleLinkedList<Integer> rotarDerecha() {
        
        CircularlyDoubleLinkedList<Integer> aux = new CircularlyDoubleLinkedList<>();
        CircularlyDoubleLinkedList<Integer> retornar = new CircularlyDoubleLinkedList<>();
        for(int i = ruleta.size()-1; i<=ruleta.size()*2-1; i++){
            aux.add(i+1, ruleta.get(i));
        }
        for (int i = 0; i<aux.size(); i++){
            retornar.add(i, aux.get(i)+1);
        }
        ruleta = retornar;
        return ruleta;
        
    }
    
    public CircularlyDoubleLinkedList<Integer> rotarIzquierda() {
        
        CircularlyDoubleLinkedList<Integer> aux = new CircularlyDoubleLinkedList<>();
        CircularlyDoubleLinkedList<Integer> retornar = new CircularlyDoubleLinkedList<>();

        for(int i = 0; i<=ruleta.size(); i++){
            aux.add(i, ruleta.get(i+1));
        }
        for (int i = 0; i<aux.size(); i++){
            retornar.add(i, aux.get(i)-1);
        }
        ruleta = retornar;
        return ruleta;
    }
    
    public void eliminar(int index) {
        ruleta.remove(index);
    }
    
    public void llenarRuleta(int numero_elementos) {
        Random r = new Random();
        int numeroRandom;
        for (int i = 0; i < numero_elementos; i++) {
            numeroRandom = r.nextInt(10);
            ruleta.add(i, numeroRandom);
        }
    }
    
    public CircularlyDoubleLinkedList<Integer> getRuleta() {
        return ruleta;
    }
    
    public void setRuleta(CircularlyDoubleLinkedList<Integer> ruleta) {
        this.ruleta = ruleta;
    }
    
}
