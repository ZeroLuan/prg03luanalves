/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author a1591
 */
public class Fatorial {
    
        // Inicializa variáveis para armazenar o número, o fatorial e a fórmula
        private int num = 0;       // Número cujo fatorial será calculado
        private int fat = 1;       // Valor do fatorial
        private String formula = ""; // Representação da fórmula do fatorial

        // Método para definir o valor do número e calcular seu fatorial
        public void setValor(int n){
            num = n;              // Armazena o número fornecido
            int f = 1;           // Inicializa o fatorial como 1
            String s = "";       // Inicializa a string para a fórmula

            // Calcula o fatorial e constrói a fórmula
            for(int c = n; c > 1; c--){
                f *= c;          // Multiplica o fatorial pelo valor atual
                s += c + " x "; // Adiciona o número atual à fórmula
            }
            s += "1 = ";         // Adiciona "1 =" ao final da fórmula
            fat = f;             // Armazena o resultado do fatorial
            formula = s;         // Armazena a fórmula criada
        }

        // Método para obter o valor do fatorial calculado
        public int getFatorial(){
            return fat;         // Retorna o valor do fatorial
        }

        // Método para obter a fórmula do fatorial
        public String getFormula(){
            return formula;     // Retorna a fórmula do fatorial
        }
    
}
