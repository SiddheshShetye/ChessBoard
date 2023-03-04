package com.chessboard.pieces;

import com.sun.istack.internal.NotNull;

public final class PieceFactory {

    private PieceFactory(){}

    public static @NotNull Piece create(@NotNull String type) throws IllegalArgumentException {
        switch (Piece.PieceType.valueOf(type)) {
            case ROOK:
                return new Rook();
            case KING:
                return new King();
            case PAWN:
                return new Pawn();
            case HORSE:
                return new Horse();
            case QUEEN:
                return new Queen();
            case BISHOP:
                return new Bishop();
            default:
                return new King();
        }
    }
}
