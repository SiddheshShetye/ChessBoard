package com.chessboard.pieces;

public class Rook implements Piece {
    @Override
    public PieceType getType() {
        return PieceType.ROOK;
    }

    @Override
    public String getPossibleMovementsFrom(String position) {
        return null;
    }
}
