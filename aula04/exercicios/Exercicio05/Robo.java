package exercicios.Exercicio05;

public class Robo {
    private int x, y, maxn, maxs, maxl, maxo;

    Robo(int x, int y, int maxn, int maxs, int maxl, int maxo) {
        //this.maxn = maxn;
        //this.maxs = maxs;
        //this.maxl = maxl;
        //this.maxo = maxo;
        setMax(maxn, maxs, maxl, maxo);
        //this.x = x;
        //this.y = y;
        setCoordenadas(x, y);
    }

    public void setMax(int n, int s, int l, int o) {
        maxn = n;
        maxs = s;
        maxl = l;
        maxo = o;
    }

    public void setCoordenadas(int x, int y) {
        if ((x <= maxo) && (x >= maxl)) {
            this.x = x;
        } else {
            System.out.println("Coordenada X inválida!");
        }
        
        if ((y >= maxs) && (y <= maxn)) {
            this.y = y;
        } else {
            System.out.println("Coordenada Y inválida!");
        }
    }

    public void ondeEstou() {
        System.out.println("Estou em coordenadas (X,Y): " + x + "," + y);
    }

    public void moverNorte() {
        setCoordenadas(x, y+1);
    }

    public void moverSul() {
        setCoordenadas(x, y-1);
    }

    public void moverLeste() {
        setCoordenadas(x+1, y);
    }

    public void moverOeste() {
        setCoordenadas(x-1, y);
    }
}
