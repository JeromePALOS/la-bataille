// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upmc.game;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jerom
 */
public class Bataille {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Choix du mode
        System.out.println("Bonjour, \n Choissisez un mode : \n (1) Jouez contre l'ordinateur \n (2) Mode 2 joueurs");
        Game game1 = new Game();
        game1.Mode();
              
        
        //TP2
                
        MenuPseudo menu_pseudo = new MenuPseudo();
        menu_pseudo.modeLecturePseudo(game1);
        
        
        
        //creation joueur
       /* System.out.println("Creation des joueurs ...");
        System.out.println("Votre nom : ");
        System.out.flush();
        Scanner sc_nom_1 = new Scanner(System.in);
        String nom_joueur_1 = sc_nom_1.nextLine();
        
        System.out.println("Votre nom de l'adversaire : ");
        System.out.flush();
        Scanner sc_nom_2 = new Scanner(System.in);  
        String nom_joueur_2 = sc_nom_2.nextLine();
        
        Joueur j1 = new Joueur(0);
        Joueur j2 = new Joueur(0); */
        

             
        
       
    }
}
