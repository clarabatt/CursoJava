/* Quando você executa o programa java via linha de comando, 
pode ser passado argumentos para ele */
// Java é uma linguagem compilada e interpretada, pois você compila e depois executa
// Para passar argumentos utilize o seguinte código
// java Argumentos DigiteSeuArgumento
class Argumentos {
    public static void main(String[] args){
        System.out.println("Você digitou " + args[0]);
    }
}