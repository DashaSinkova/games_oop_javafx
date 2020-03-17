package ru.job4j.chess.firuges;

public interface Figure {
    /**
     *
     * @return позиция фигуры в поле
     */
    Cell position();

    /**
     *
     * @param source клетка имточник
     * @param dest клетка назначение
     * @return массив с клетками, которые должна пройти фигура
     */
    Cell[] way(Cell source, Cell dest);

    /**
     *Реализация по умолчанию
     * @return возвращает имя картинки фигуры
     */
    default String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );
    }

    /**
     *При переходе из одной клетки в другую,
     * создается новый объект с новой позицией
     * старый удаляется
     * Подход избавляет от вечных ссылок.
     * @param dest позиция
     * @return объект класса с позицией dest
     */
    Figure copy(Cell dest);
}
