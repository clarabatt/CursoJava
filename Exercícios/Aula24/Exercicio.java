public class Exercicio{
    public static void main(String[] arg){
        Lampada lampada = new Lampada();
        lampada.modelo = "A60"
        lampada.tensao = "Bivolt"
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;

        lampada.tipos = new String[5]; // Instanciando arrays, é necessário declarar o tamanho
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
    }
}  