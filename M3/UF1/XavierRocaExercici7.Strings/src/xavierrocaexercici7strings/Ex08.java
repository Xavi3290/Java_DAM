/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici7strings;

/**
 *
 * @author usuari
 */
public class Ex08 {

    public static void main(String[] args) {

        String s1 = "Benvigut a Java";
        String s2 = s1;
        String s3 = new String("Benvingut a Java");
        String s4 = "Benvingut a Java";

        System.out.println("a. s1 == s2 " + (s1 == s2));//Com ja poses que s1 == s2, al posar s1 == s2 els estas comparan y surt true perque són iguals.
        System.out.println("b. s2 == s3 " + (s2 == s3));//Aquí et compara s2 == s3, pero encara que el contingut sigui igual, està en altres llocs i la comparació es false.
        System.out.println("c. s1.equals(s2) " + (s1.equals(s2)));//Aquí et compara el contingut i es true.
        System.out.println("d. s2.equals(s3) " + (s1.equals(s3)));//Aquí compara el contingut i es false perque les posicions poden ser diferents
        System.out.println("e. s1.compareTo(s2) " + (s1.compareTo(s2)));//Aquí et compara el contingut, pero en contes de donarte true o false et dona un numero i si es 0 es que son iguals
        System.out.println("f. s1.compareTo(s3) " + (s1.compareTo(s3)));//Aquí també et compara el contingut, pero com esta en diferents posicions et surt -7 dient que sçon diferents
        System.out.println("g. s1 == s4 " + (s1 == s4));//Aquí et compara s1==s4, pero encara que el congtingut sigui igual, esta en diferents posicions i la comparació surt false
        System.out.println("h. s1.charAt(0) " + (s1.charAt(0)));//Aquí agafa la posicio 0 del string, que es B
        System.out.println("i. s1.indexOf('j') " + (s1.indexOf('j')));//Aquí ens retorna la posició de la lletra que li demanem, pero si no esta ens retorna -1
        System.out.println("j. s1.indexOf('a') " + (s1.indexOf('a')));//Aquí ens retorna la posició de la lletra, que està en la posició 9
        System.out.println("k. s1.lastIndexOf('a') " + (s1.lastIndexOf('a')));//Aquí ens diu la ultima posició de la lletra que li demanem, que està en la posició 14
        System.out.println("l. s1.lastIndexOf(''a'',16)" + (s1.lastIndexOf("a", 16)));//Aquí ens diu la ultima posició de la lletra que li demanem donantli el final que es 16, la posició que ens dona es 14 
        System.out.println("m. s1.length() " + (s1.length()));//Aquí ens diu quants caràcters hi ha en el string
        System.out.println("n. s1.substring(5) " + (s1.substring(5)));//Aquí ens mostra per pantalla el string, menys els 5 primers caràcters
        System.out.println("o. s1.substring(5,11) " + (s1.substring(5, 11)));//Aquí ens mostra per pantalla el string, pero nomes el que hi ha entre la posicó 5 i 11
        System.out.println("p. s1.startsWith(''Ben'') " + (s1.startsWith("Ben")));//Aquí ens compara si comença amb aquests caràcters que l'hi hem posat, si és true és que comença sino ens diria false
        System.out.println("q. s1.endsWith(''Java'') " + (s1.endsWith("Java")));//Aquí ens compara si acaba amb aquests caràcters que l'hi hem posat, si és true és que acaba sino ens diria false 
        System.out.println("r. s1.toLowerCase() " + (s1.toLowerCase()));//Aqui ens posa tot el string en minúscules
        System.out.println("s. s1.toUpperCase() " + (s1.toUpperCase()));//Aqui ens posa tot el string en majúscules
        System.out.println("t. ''Benvingut ''.trim() " + ("Benvingut ".trim()));//La funció trim() elimina els espais inicials i finals
        System.out.println("u. s1.replace('a','T') " + (s1.replace('a', 'T')));//Aqui remplaça les a per les T en tot el string
        System.out.println("v. s1.replaceAll(''a'',''T'') " + (s1.replaceAll("a", "T")));//Aqui remplaça les a per les T en tot el string
        System.out.println("w. s1.replaceFirst(''a'',''T'') " + (s1.replaceFirst("a", "T")));//Aqui remplaça les a per la T en la primera a que troba al string
        System.out.println("x. s1.toCharArray() " + (s1.toCharArray()));//Aquí converteix el string en un array de caràcters

    }

}
