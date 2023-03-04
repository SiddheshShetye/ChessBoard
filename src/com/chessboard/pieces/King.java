package com.chessboard.pieces;

public class King implements Piece {
    @Override
    public PieceType getType() {
        return PieceType.KING;
    }

    @Override
    public String getPossibleMovementsFrom(String position) {
        return null;
    }
}
