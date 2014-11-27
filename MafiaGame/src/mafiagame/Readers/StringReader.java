/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiagame.Readers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pellecarlsen
 */
public class StringReader {

    public static ArrayList<Integer> readString(String s) {
        Scanner scan = new Scanner(s);
        ArrayList<Integer> drugs = new ArrayList();

        //while (scan.hasNext()) {  //File found. Reading one line. 
        String linje = scan.next();
        //scan.nextInt().useDelimiter(",");
        Scanner sc = new Scanner(linje).useDelimiter(",");
        
        int heroin = sc.nextInt();
        int cocain = sc.nextInt();
        int amphetamine = sc.nextInt();
        int acid = sc.nextInt();
        int angelDust = sc.nextInt();
        int crystalMeth = sc.nextInt();
        int hash = sc.nextInt();
        int weed = sc.nextInt(); 
        int mushrooms = sc.nextInt();
        drugs.add(heroin);
        drugs.add(cocain);
        drugs.add(amphetamine);
        drugs.add(acid);
        drugs.add(angelDust);
        drugs.add(crystalMeth);
        drugs.add(hash);
        drugs.add(weed);
        drugs.add(mushrooms);
        

        // }
        return drugs;
    }
}
