package com.chessboard.pieces;

import com.sun.istack.internal.NotNull;

public interface Piece {
    enum PieceType
    {
        KING,
        QUEEN,
        ROOK,
        PAWN,
        BISHOP,
        HORSE;
    }
    PieceType getType();
    @NotNull String getPossibleMovementsFrom(String position);
}
