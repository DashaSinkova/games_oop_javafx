package ru.job4j.chess.firuges.black;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class BishopBlackTest {
    @Test
    public void whenDiagonalSuccess() {
        assertThat(new BishopBlack(Cell.C1).way(Cell.C1, Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
    @Test
    public void whenDiagonalSuccess1() {
        assertThat(new BishopBlack(Cell.F2).way(Cell.F2, Cell.D4), is(new Cell[]{ Cell.E3, Cell.D4}));
    }
    @Test (expected = IllegalStateException.class)
    public void whenDiagonalUnsuccessful() {
        assertThat(new BishopBlack(Cell.A1).way(Cell.A1, Cell.D3), is("Could not way by diagonal from A1 to D3"));
    }
    @Test
    public void whenPosition() {
        assertThat(new BishopBlack(Cell.A1).position(), is(Cell.A1));
    }
    @Test
    public void whenCopy() {
        assertThat(new BishopBlack(Cell.A1).copy(Cell.D4).position(), is(Cell.D4));
    }
}
