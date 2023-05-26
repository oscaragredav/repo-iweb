public class ObjetoCurativo extends Objeto{

    private int vidaRestaurada;

    public ObjetoCurativo(int vidaRestaurada) {
        this.setVidaRestaurada(vidaRestaurada);
    }


    public int getVidaRestaurada() {
        return vidaRestaurada;
    }

    public void setVidaRestaurada(int vidaRestaurada) {
        this.vidaRestaurada = vidaRestaurada;
    }
}
