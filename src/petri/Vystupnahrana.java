package petri;

public class Vystupnahrana extends Hrana{

    public Vystupnahrana(int id, int vaha,Miesto m) {
        super(id, vaha,m);
    }

    Vystupnahrana() {
        super();
    }

    public void pridaj_tokeny(){
        m.setTokeny(m.getTokeny()+this.getVaha());
    }

    @Override
    public Miesto getM() {
        return super.getM();
    }

    @Override
    public void setM(Miesto m) {
        super.setM(m);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getVaha() {
        return super.getVaha();
    }

    @Override
    public void setVaha(int vaha) {
        super.setVaha(vaha);
    }
}
