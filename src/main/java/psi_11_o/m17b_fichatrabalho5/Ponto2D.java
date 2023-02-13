package psi_11_o.m17b_fichatrabalho5;
/**
 * @version 1.1.0 13-2-2023
 * @author Diogo Costa
 */
public class Ponto2D {    
    private int x;
    private int y;
    
    /**
     * Construtor sem parametros
     */
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    /**
     * Construtor com parametros
     * @param x inicialização do X
     * @param y inicialização do Y
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
     * Metudo para descobrir a distancia de 2 pontos
     * @param a outro objeto do tipo Ponto2D
     * @return valor do objeto da distancia dos 2 pontos
     */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((getX()-a.getX()),2)+Math.pow((getY()-a.getY()),2)));
    }

    /**
     * Devolve o valor do Ponto2D
     * @return o valor do Ponto2D
     */
    @Override
    public String toString() {
        return "Ponto2D[" + getX() + "," + getY() + "]";
    }
    /**
     * @return Devolve o valor de X
     */
    public int getX() {
        return x;
    }

    /**
     * @return Devolve o valor de Y
     */
    public int getY() {
        return y;
    }

    /**
     * @param x mudar o valor de X
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y mudar o valor de Y
     */
    public void setY(int y) {
        this.y = y;
    }    
}
