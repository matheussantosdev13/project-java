package zoo;

public class App{

    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cao = new Cachorro();
        Jacare jaca = new Jacare();
        
        jaca.setNome("Jacare");
        jaca.setCor("verde");
        jaca.setRaca("Papo Amarelo");
        System.out.println(jaca.getNome());
        jaca.setPeso(50);
        jaca.brincar();
        System.out.println("O jacaré pesa : " + jaca.getPeso());
        
        cao.setNome("Cachorro");
        System.out.println(cao.getNome());
        cao.setCor("Preto");  
        cao.setRaca("Bull Terrier");  
        cao.setPeso(25);
        cao.brincar();
        
        gato.setNome("Gato");
        System.out.println(gato.getNome());
        gato.setCor("Branco");  
        gato.setRaca("Vira lata");  
        gato.setPeso(5);  
        gato.brincar();
    }
}
