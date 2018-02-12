package calculadora;

public class Calculadora {

    protected int x, y, r;

    void sumar() {
        r = x + y;
    }

    void restar() {
        if (x < y) {
            int a;
            a = x;
            x = y;
            y = a;
        }
        if (x < 0) {
            x = -x;
            y = -y;

        }
        r = x - y;
    }

    void multiplicar() {
        r = x * y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

}
