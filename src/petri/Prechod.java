package petri;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class Prechod extends MouseAdapter {
    private int id;
    private int x;
    private int y;
    private ArrayList<Vstupnahrana> vstupnehrany = new ArrayList<Vstupnahrana>();
    private ArrayList<Vystupnahrana> vystupnehrany = new ArrayList<Vystupnahrana>();
    Prechod(int id, int x,int y) {
        this.id = id;
        this.x=x;
        this.y=y;
    }

    public void spusti_prechod(){
        boolean flag=true;

        for (Vstupnahrana hrana : vstupnehrany) {
            if(hrana.dostatok_tokenov()==false){
                flag=false;
                break;
            }
        }


        if (flag){
            for (Vstupnahrana hrana : vstupnehrany) {
                hrana.odober_tokeny();
            }
            for (Vystupnahrana hrana : vystupnehrany) {
                hrana.pridaj_tokeny();
            }
        }
        else{
            System.out.println("Nejde spustit prechod");
        }
    }
    public void paint(Graphics g)
    {
        g.drawRect(480, 480, 200, 100);
    }
    public void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        this.paint(g2d);
    }

    public void setvystupneHrany(Vystupnahrana hrany) {
        vystupnehrany.add(hrany);
    }
    public void setvstupneHrany(Vstupnahrana hrany) {
        vstupnehrany.add(hrany);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

