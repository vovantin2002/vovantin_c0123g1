//package bai_8;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//public class Test {
//    @Test
//    public void testGetScore() {
//        // Score 0-0
//        assertEquals("Love-All", TennisGame.getScore("Alice", "Bob", 0, 0));
//
//        // Score 1-1
//        assertEquals("Fifteen-All", TennisGame.getScore("Alice", "Bob", 1, 1));
//
//        // Score 2-2
//        assertEquals("Thirty-All", TennisGame.getScore("Alice", "Bob", 2, 2));
//
//        // Score 3-3
//        assertEquals("Deuce", TennisGame.getScore("Alice", "Bob", 3, 3));
//
//        // Score 4-4
//        assertEquals("Deuce", TennisGame.getScore("Alice", "Bob", 4, 4));
//
//        // Score 1-0
//        assertEquals("Fifteen-Love", TennisGame.getScore("Alice", "Bob", 1, 0));
//
//        // Score 2-0
//        assertEquals("Thirty-Love", TennisGame.getScore("Alice", "Bob", 2, 0));
//
//        // Score 3-0
//        assertEquals("Forty-Love", TennisGame.getScore("Alice", "Bob", 3, 0));
//
//        // Score 4-0
//        assertEquals("Win for player1", TennisGame.getScore("Alice", "Bob", 4, 0));
//
//        // Score 0-4
//        assertEquals("Win for player2", TennisGame.getScore("Alice", "Bob", 0, 4));
//
//        // Score 3-3, player 1 scores
//        assertEquals("Advantage player1", TennisGame.getScore("Alice", "Bob", 4, 3));
//
//        // Score 3-3, player 2 scores
//        assertEquals("Advantage player2", TennisGame.getScore("Alice", "Bob", 3, 4));
//    }
//}