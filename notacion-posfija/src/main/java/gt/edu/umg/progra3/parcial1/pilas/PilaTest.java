/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3.parcial1.pilas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell Latitude 3190
 */
public class PilaTest implements Pila {
    private List<String> pila = new ArrayList<>();

    @Override
    public void push(String item) {
        pila.add(item);
    }

    @Override
    public String pop() {
        return pila.remove(pila.size()-1);

    }

    @Override
    public String peek() {
        return pila.get(pila.size()-1);
    }

    @Override
    public int size() {
        return pila.size();
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }
}
