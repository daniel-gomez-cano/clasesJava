public abstract class Felino {
    private int tamañoGarras;
    private boolean cazan;

    public Felino(int tamañoGarras, boolean cazan) {
        this.tamañoGarras = tamañoGarras;
        this.cazan = cazan;
    }
    public int getTamañoGarras() {
        return tamañoGarras;
    }
    public void setTamañoGarras(int tamañoGarras) {
        this.tamañoGarras = tamañoGarras;
    }
    public boolean isCazan() {
        return cazan;
    }
    public void setCazan(boolean cazan) {
        this.cazan = cazan;
    }
    
    public abstract boolean arañanFuerte(String edad); //Solo define el método, pero cada clase hijo se encargará de definirla.
    //Heredar cosas directas a mis hijos. Que los hijos cumplan cierto estándar, exigido.
}
