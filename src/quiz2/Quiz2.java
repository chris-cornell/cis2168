/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import java.util.LinkedList;
/**
 *
 * @author corne
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> a = new LinkedList<String>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add(a.remove(a.size()/2));
        for(int i=0; i<4; i++){
            System.out.println(a.get(i));
        }
    }
    
}
