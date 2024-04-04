package concessionaria;

public class Carro {
	
    String marca;
    String modelo;
    int ano;
    String cor;
    int numero_de_portas;

    public Carro(String marca, String modelo, int ano, String cor, int numero_de_portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numero_de_portas = numero_de_portas;
    }
    
    public String descricao() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano +
               ", Cor: " + cor + ", Número de portas: " + numero_de_portas;
    }
}
