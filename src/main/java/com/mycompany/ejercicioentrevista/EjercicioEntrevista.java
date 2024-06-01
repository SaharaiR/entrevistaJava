package com.mycompany.ejercicioentrevista;

public class EjercicioEntrevista {
    
    public void esPalindrome(int numero){
        String numeroCadena = String.valueOf(numero);
        StringBuilder numeroInvertido = new StringBuilder(numeroCadena);
        //numeroInvertido.reverse();
        System.out.println(numeroCadena);
        String cadenaInvertida = numeroInvertido.reverse().toString();
        System.out.println(cadenaInvertida);
        if( numeroCadena.equals(cadenaInvertida))
            System.out.println("Es palindrome");
        else
            System.out.println("No es palindrome");
    }
    
    public static void main(String[] args) {
        EjercicioEntrevista mandarNumero = new EjercicioEntrevista();
        mandarNumero.esPalindrome(121);
    }
}
