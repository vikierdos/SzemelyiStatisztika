
package app;

public class Statisztika {
    
    
    public void koszontes(String nev, boolean keveres){
        String[] koszonesek = {"Jónapot", "Szervusz", "Helló"};
        
        String koszones = koszonesek[0];
        if(keveres){
        int koszontesSzam = (int) (Math.random()*koszonesek.length);
        koszones = koszonesek[koszontesSzam];
        }

        System.out.print(koszones + " " + nev + "!\n");
    }
    
    public void koszontes(String nev){
        koszontes(nev, false);
    }
    
    public int eletkor(int szEv){
        return 2026-szEv;
    }
    
    public int nyugdijigEv(int szEv){
        return 65-eletkor(szEv);
    }
}
