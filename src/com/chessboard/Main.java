package com.chessboard;

public class Main {
    public static void main(String[] args) {
        ChessBoard chess = new ChessBoard();
        if (args.length < 2) {
            System.out.println("Please provide valid arguments");
            return;
        }
            String piece = args[0].replaceAll(",", "").trim();
            String initialPosition = args[1].trim();

        System.out.println(chess.move(piece, initialPosition));
    }
}