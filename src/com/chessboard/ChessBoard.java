package com.chessboard;

import com.chessboard.pieces.Piece;
import com.chessboard.pieces.PieceFactory;
import com.sun.istack.internal.NotNull;

public class ChessBoard {

    public @NotNull String move(String pieceType, String initialPosition) throws IllegalArgumentException {
        Piece piece = PieceFactory.create(pieceType);
        return piece.getPossibleMovementsFrom(initialPosition);
    }
}
