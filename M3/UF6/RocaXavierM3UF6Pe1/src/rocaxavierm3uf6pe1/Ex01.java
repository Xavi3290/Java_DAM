/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocaxavierm3uf6pe1;

import model.Pokemon;
import persist.*;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n1- Creacio de taula i netejar-la\n");

        try {

            try {
                BDUtil.createEstructuraMysql();
            } catch (Exception e) {
                System.out.println(e.toString());
                // e.printStackTrace();
                System.out.println("Base de dades ja creada");
            }

            BDUtil.netejaTaules();

            System.out.println("\n2- Afegir 5 Pokemons\n");

            PokemonDAO pDao = new PokemonDAO();

            Pokemon pok = new Pokemon(1, "Pikachu", 5, "Electrico", 0.5);
            Pokemon pok2 = new Pokemon(5, "Charizar", 25, "Fuego", 5.5);
            Pokemon pok3 = new Pokemon(2, "Raichu", 20, "Electrico", 1.5);
            Pokemon pok4 = new Pokemon(3, "Mew", 15, "Misterioso", 1);
            Pokemon pok5 = new Pokemon(3, "Mewtwo", 30, "Misterioso", 2);

            System.out.println(pDao.insert(pok));
            System.out.println(pDao.insert(pok2));
            System.out.println(pDao.insert(pok3));
            System.out.println(pDao.insert(pok4));
            System.out.println(pDao.insert(pok5));

            System.out.println("\n3- Llistar Pokemons ordenats per codi\n");

            System.out.println(pDao.getPokemonListCodi().toString());

            System.out.println("\n4- Eliminar un Pokemon existent i un d'inexistent\n");
           
            System.out.println(pDao.delete(4));
            System.out.println(pDao.delete(10));
            
            System.out.println("\n5- Llistar Pokemons ordenats per codi\n");
            
            System.out.println(pDao.getPokemonListCodi().toString());
            
            System.out.println("\n6- Modificar Pokemon\n");
            
            
            System.out.println(pDao.getPokemon(1).toString());
            pok.setNivell(100);
            System.out.println(pDao.update(pok));
            System.out.println(pDao.getPokemon(1).toString());
            
            System.out.println("\n7- Cercar i mostrar el Pokemon amb codi 1\n");
            
            System.out.println(pDao.getPokemon(1).toString());
            
            System.out.println("\n8- Llistar Pokemons ordenats per nivell\n");
            
            System.out.println(pDao.getPokemonListNivell().toString());
            
            System.out.println("\n9- Llistar Pokemons que tenen el mateix tipus que te el del codi 1\n");
                       
           // System.out.println(pDao.getPokemonListTipus(pok.getTipus()));
            System.out.println(pDao.getPokemonListTipus("Electrico"));
            
            
            
            
            

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

}
