/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

/**
 *
 * @author Admin
 */
public class Game {



    public static final int MAX_TURNS = 10;



    public static void main(String[] args) {



        Player player1 = new Player("ping");

        Player player2 = new Player("pong");



        player1.setNextPlayer(player2);

        player2.setNextPlayer(player1);



        System.out.println("Game starting...!");



        player1.play();



        System.out.println("Game finished!");

    }


    
}
