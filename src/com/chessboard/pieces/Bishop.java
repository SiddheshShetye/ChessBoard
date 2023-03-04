package com.chessboard.pieces;

public class Bishop implements Piece {
    @Override
    public PieceType getType() {
        return PieceType.BISHOP;
    }

    @Override
    public String getPossibleMovementsFrom(String position) {
        return null;
    }
}
