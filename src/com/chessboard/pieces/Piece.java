package com.chessboard.pieces;

public interface Piece {
    String getType();
    String getPossibleMovementsFrom(String position);
}
