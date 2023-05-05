package bg.tu_varna.sit.a1.f21621551.visitor;

import bg.tu_varna.sit.a1.f21621551.visited.BoardGames;
import bg.tu_varna.sit.a1.f21621551.visited.Books;
import bg.tu_varna.sit.a1.f21621551.visited.Toys;

public interface Visitor {
    void visit(Books product);
    void visit(Toys product);
    void visit(BoardGames product);
}
