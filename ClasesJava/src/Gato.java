public class Gato extends Felino implements Mascota, Carnivoro {
    private String colorPelo;
    private byte numeroDeVidas;
    private String raza;
    static int numeroGatos = 0;

    public Gato(String colorPelo, byte numeroDeVidas, String raza, int tamañoGarras, boolean cazan) {
        super(tamañoGarras, cazan);
        this.colorPelo = colorPelo;
        this.numeroDeVidas = numeroDeVidas;
        this.raza = raza;
        numeroGatos++;
    }
    public String getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public byte getNumeroDeVidas() {
        return numeroDeVidas;
    }
    public void setNumeroDeVidas(byte numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    //@ decorador no funcional, solo informativo - Override es sobreescribir el método del papá
    @Override
    public boolean arañanFuerte(String edad) { //Define su propio método
        if(edad.equals("cachorro")){
            return false;
        }else{
            return true;
        }
    }
    @Override
    public void saludar() {
        System.out.println("Sobando la pierna");
    }
    @Override
    public String formaDePedirComida() {
        return "Maullan mucho";
    }
    @Override
    public String formaDeOrinar() {
        return "En el arenero";
    }
    @Override
    public void comerCarne() {
        System.out.println("Despacio");
    }
    @Override
    public String afilaDientes() {
        return "En el sofá";
    }

    public static void maullan(){
        System.out.println("MIAUUUU");
    }
}
