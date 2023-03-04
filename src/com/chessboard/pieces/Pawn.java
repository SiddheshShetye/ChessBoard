package com.chessboard.pieces;

public class Pawn implements Piece {
    @Override
    public PieceType getType() {
        return PieceType.PAWN;
    }

    @Override
    public String getPossibleMovementsFrom(String position) {
        return null;
    }
}
