public class Celular {

    private String nombre;

    public Celular(String nombre){
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Celular iphone = new Celular("4");
        System.out.println(">> " + iphone.nombre);
    }

}