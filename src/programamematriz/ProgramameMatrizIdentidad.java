/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamematriz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salcu
 */
public class ProgramameMatrizIdentidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
//        System.out.println("2");
//        System.out.println("100");
//        String largo="5000";
//        for (int i = 1; i < 100; i++) {
//            largo+=" 5000";
//            
//        }
//        System.out.println(largo);
//        System.out.println("0");
//        System.exit(0);
//        String[] dd=largo.split("\\p{Space}+");
        
        int filas;
        try{filas=Integer.valueOf(ent.nextLine().trim());}catch(Exception e){filas=0;}
        //if(consumidas==0.0) System.out.println("");
        while (filas!=0) {
            
            
            
            //String ocult=entSt.nextLine().replaceAll("\\p{Space}", "");
            //String regexp="[^"+ocult+"]";
            //text.replaceAll(regexp, "");
            //text=Pattern.compile(regexp).matcher(text).replaceAll("");
            boolean identidad=true;
            int actual =0;
            while(actual<filas){
                String[] datos=null;
                String entrada=ent.nextLine().trim();
                if (identidad){
                    try{datos=entrada.split("\\p{Space}+");}catch(Exception e){datos=new String[]{"0"};}
                    for (int i = 0; i < datos.length && identidad; i++) {
                        int dato = Integer.valueOf(datos[i]);
                        identidad=(i==actual && dato==1) || (i!=actual && dato==0);    
                    }
                }
                actual++;
            }
            if(identidad){ System.out.println("SI");

            }else System.out.println("NO");
            try{filas=Integer.valueOf(ent.nextLine().trim());}catch(Exception e){filas=0;}
        }
        ent.close();
    }
    
}
 