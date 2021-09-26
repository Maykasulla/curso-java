public class Programa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("André");
        p.setIdade(20);

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
    }
}
