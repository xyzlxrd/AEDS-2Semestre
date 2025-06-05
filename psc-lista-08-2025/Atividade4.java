package com.mycompany.psc.lista;

public class Atividade4 {
    public static void main(String args[]) {
        int argumento = 0;
        
        char resultado = valorChar(argumento);
        System.out.println(resultado);
        
        valorChar(argumento);
    }
    
    public static char valorChar(int argumento){
        char valor;
        
        if (argumento > 0){
            return 'P';
        }
        else{
            return 'N';
        }
    }
}
