package app;

public class SzemelyiStatisztika {

    public static void main(String[] args) {

        
        feladat();
        
    }

    private static void feladat() throws IllegalArgumentException {
        String nev = "Ábel";
        int szulEv = 1980;
        
        /*
        köszöntés
        életkor: 2026 -
        nyugdíjig hátralévő évek száma : 65
        */
        boolean keveres = true;
        koszontes(nev);
        koszontes(nev, keveres);
        
        if(!hatvanotAlatt(szulEv)){
            throw new IllegalArgumentException("Már elérte a nyugdíj határt ez a személy");
        }
        
        if(!ideiEvAlatt(szulEv)){
            throw new IllegalArgumentException("A jövőből jöttél?");
        }
        
        
        int kor = eletkor(szulEv);
        
        int ny = nyugdijigEv(kor);
        
        String adat = "Mivel %d éves vagy, ezért a nyugdíjig hátralévő évek száma: %d\n".formatted(kor, ny);
        
        kiir(adat);
    }
    
    private static void kiir(String t){
        System.out.print(t);
    }
    
    private static void koszontes(String nev){
        koszontes(nev, false);
    }
    
    private static void koszontes(String nev, boolean keveres) {
        
        String[] koszonesek = {"Jónapot", "Szervusz", "Helló"};
        
        String koszones = koszonesek[0];
        if(keveres){
        int koszontesSzam = (int) (Math.random()*koszonesek.length);
        koszones = koszonesek[koszontesSzam];
        }

        kiir(koszones + " " + nev + "!\n");
        
    }
    
    private static int eletkor(int szulEv){
        return 2026-szulEv;
    }
    
    private static int nyugdijigEv(int kor){
        return 65-kor;
    }
    
    private static boolean hatvanotAlatt(int szulEv){
        return szulEv > 2026 - 65;
    }
    
    private static boolean ideiEvAlatt(int szulEv){
        return szulEv <= 2026;
    }

    
    
}
