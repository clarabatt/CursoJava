// Forma geral de uma classe
class NomeDaClasse{
    // Atributos
    int var1;
    int var2;

    // Declaração de Métodos
    void metodo (int parametros){
        // Corpo do método
    }
}

// Definição de uma Classe Carro
class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
}

// Instanciação de Objetos
// Instanciado novo carro chamado van
Carro van = new Carro();
van.marca = "Fiat";
van.modelo = "Ducato";
van.numPassageiros = 10;
van.capCombustivel = 100;
van.consumoCombustivel = 0.2;

System.out.println(van.marca); // Imprime a marca da van
System.out.println(van.modelo); // Imprime o modelo da van

// Instanciado novo carro chamado fusca
Carro fusca = new Carro();
van.marca = "Volkswagen";
van.modelo = "Fusca";
van.numPassageiros = 4;
van.capCombustivel = 30;
van.consumoCombustivel = 0.15;

System.out.println(fusca.marca); // Imprime a marca do fusca
System.out.println(fusca.modelo); // Imprime o modelo do fusca