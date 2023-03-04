package com.chessboard.pieces;

public class Queen implements Piece {
    @Override
    public PieceType getType() {
        return PieceType.QUEEN;
    }

    @Override
    public String getPossibleMovementsFrom(String position) {
        return null;
    }
}
