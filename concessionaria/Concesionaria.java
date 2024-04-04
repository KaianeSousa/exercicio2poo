package concessionaria;



public class Concesionaria{
	    public static void main(String[] args) {
	        Carro c = new Carro("Toyota", "Corolla", 2020, "Preto", 4);
	        Moto m = new Moto("Honda", "CBR500R", 2021, "Vermelho", 500);
	        
	        c.marca = "Toyota";
	        c.ano = 2022;
	        c.cor = "Prata";
	        c.numero_de_portas = 4;

	        m.marca = "Honda";
	        m.modelo = "CB 500";
	        m.ano = 2021;
	        m.cor = "Vermelha";
	        m.cilindradas = 500;

	        // Exibindo a descrição da moto
	        System.out.println(m.descricao());
	        System.out.println(c.descricao());
	        
	
	    }
	}



