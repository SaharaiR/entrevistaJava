package com.mycompany.ejercicioentrevista;

public class EjercicioEntrevista {
    
    public void isPalindrome(int number){
        /*String numeroCadena = String.valueOf(numero);
        StringBuilder numeroInvertido = new StringBuilder(numeroCadena);
        //numeroInvertido.reverse();
        System.out.println(numeroCadena);
        String cadenaInvertida = numeroInvertido.reverse().toString();
        System.out.println(cadenaInvertida);
        if( numeroCadena.equals(cadenaInvertida))
            System.out.println("Es palindrome");
        else
            System.out.println("No es palindrome");*/
        
        /*CODE WITH RESTRICTION OF NOT CONVERTING TO STRING
        Algorithm to reverse an integer:
        - Get the last digit, you can get the last digit with MODULE 10 (% 10)
        - Add this nomber to the variable that will form the reversed number. To obtain the reversed number, 
        we multiply by 10 to shift its digits to the left and add the unit.
        - Remove the last digit and get the last digit again. To remove the last digit of the number, an integer 
        division is performed, as it discards the remainder and only keeps the integer part.
        - It repeats as long as the number is different from 0. */
        int originalNumber = number;
        int reversedNumber = 0, lastDigit;
        while( number != 0 ){
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println("Number: " + originalNumber);
        System.out.println("Reversed number: " + reversedNumber);
        if( originalNumber == reversedNumber )
            System.out.println("The number is a palindrome");
        else
            System.out.println("The number is not a palindrome");
    }
    
    public static void main(String[] args) {
        /*EjercicioEntrevista mandarNumero = new EjercicioEntrevista();
        mandarNumero.esPalindrome(121);*/
        EjercicioEntrevista sendNumber = new EjercicioEntrevista();
        sendNumber.isPalindrome(121);
    }
}
