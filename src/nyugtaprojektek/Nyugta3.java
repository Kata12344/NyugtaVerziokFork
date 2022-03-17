package nyugtaprojektek;

public class Nyugta3 {
    
    static String rovidVonalValaszto = "      ";
    static String csillagok = "********************";
    static String duplaVonal = "====================";
    static String szaggatottVonal = "--------------------";
    static String rovidVonal = "_______";
    static int[] tetel= {350, 90, 1320};
    static int osszesen = tetel[0] + tetel[1] + tetel[2];
    static final String HUF = "Ft";
    static int szervizDijMertek = 10;
    static int szervizDij = osszesen / szervizDijMertek;
    static int fizetendo = osszesen + szervizDij;
    static double euro = fizetendo / 350.0;
    static final String eur = "\u20ac";

    
    static void kirovidVonalValaszto(){
        System.out.print(rovidVonalValaszto);
    }
    static void kirovidVonal(){
        System.out.println(rovidVonal);
    }
    static void kiszagatottVonal(){
        System.out.println(szaggatottVonal);
    }
    static void kiduplaVonal(){
        System.out.println(duplaVonal);
    }
    
    static void kiCsillagok(){
        System.out.println(csillagok);
    }
    
    static void kiösszesen(){
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
    }
    
    static void kiszervizdíj(){
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
    }
    
    static void kifizetendő(){
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
    }
    
    static void kieuro(){
        System.out.printf("%10s%7.2f %s\n","", euro, eur);
    }
   
    public static void main(String[] args) {
        String csillagok = "********************";
        kiCsillagok();
        System.out.printf("%14s\n", "Nyugta 3");
        kiCsillagok();
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("%10s%d: %5d %s \n", "Tétel ", i+1, tetel[i], HUF );
        }

        kiduplaVonal();
        
        kiösszesen();
        
        kiszagatottVonal();
        
        kiszervizdíj();
        
        kiduplaVonal();
        
        kifizetendő();

        kieuro();//
        
        kiszagatottVonal();
        
        System.out.println("");
        
        System.out.print(rovidVonal);
        
        kirovidVonalValaszto();
        kirovidVonal();
        System.out.print(" Dátum");
        kirovidVonalValaszto();
        System.out.println("   Név");
        
        kiCsillagok();    
        System.out.println("        CÉG");
        kiCsillagok();
    }

}
