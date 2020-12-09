/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        String cadena = "Loja";
        char valor;
        int valorNumerico;
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i);
            valorNumerico = (int) valor;
            System.out.printf("%s (%d)\n", valor, valorNumerico);
        }
    }
}
