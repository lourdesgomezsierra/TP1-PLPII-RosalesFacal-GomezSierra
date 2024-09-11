public class Pieza {
    private int[][] forma;
    private int posX, posY;

    public Pieza(int[][] is) {
        this.forma = is;
    }

    public int[][] obtenerForma() {
        return forma;
    }

    public void establecerPosicion(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
}

