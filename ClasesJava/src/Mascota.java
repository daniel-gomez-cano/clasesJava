public interface Mascota { //Aquí solovan o CONSTANTES o MÉTODOS ABSTRACTOS, NADA MÁS
    public static boolean TIENEN_DUEÑO = true; //Para crear constantes //Variable estática final del objeto
    public void saludar();
    public String formaDePedirComida();
    public abstract String formaDeOrinar(); //No hay necesidad de poner abstract, ya que al ser interface es abstracto
}
