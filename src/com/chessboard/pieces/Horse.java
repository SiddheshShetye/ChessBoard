package com.chessboard.pieces;

public class Horse implements Piece {
    @Override
    public PieceType getType() {
        return PieceType.HORSE;
    }

    @Override
    public String getPossibleMovementsFrom(String position) {
        return null;
    }
}
