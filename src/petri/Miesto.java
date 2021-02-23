package petri;

import java.util.ArrayList;

public class Miesto {
    private int id;
    private int tokeny;
    Miesto(int id,int tokeny){
        this.id=id;
        this.tokeny=tokeny;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getTokeny() {
        return tokeny;
    }

    public void setTokeny(int tokeny) {
        this.tokeny = tokeny;
    }
}
