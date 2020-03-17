package ru.job4j.chess;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
public class LogicMoveTest {
    @Test
    public void whenMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        assertThat(logic.move(Cell.A1, Cell.C3), is(true));
    }
    @Test(expected = IllegalStateException.class)
    public void whenNotMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        assertThat(logic.move(Cell.A1, Cell.A2), is(false));
    }
    @Test
    public void whenBarrier() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.C3));
        assertThat(logic.move(Cell.A1, Cell.C3), is(false));
    }
}
