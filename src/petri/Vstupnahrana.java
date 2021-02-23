package petri;

public class Vstupnahrana  extends Hrana{
    public Vstupnahrana(int id, int vaha,Miesto m) {
        super(id, vaha,m);
    }

    Vstupnahrana() {
        super();
    }
    public boolean dostatok_tokenov(){
        boolean hodnota =false;
        int pocet= this.getVaha();
        if(pocet>m.getTokeny()){
            hodnota=false;
        }
        else{
            hodnota=true;
        }
        return hodnota;
    }
    public void odober_tokeny(){
            m.setTokeny(m.getTokeny()-this.getVaha());

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
