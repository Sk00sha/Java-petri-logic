package petri;

public class Hrana {
    private int id;
    private int vaha;
    public Miesto m;
    Hrana(int id,int vaha,Miesto m){
        this.id=id;
        this.vaha=vaha;
        this.m=m;
    }
    Hrana(){

    }

    public Miesto getM() {
        return m;
    }

    public void setM(Miesto m) {
        this.m = m;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }
}
