package test.java.grid;

//import main.java.grid.GridMover;
import org.junit.jupiter.api.Test;

import main.java.grid.GridMover;

import static org.junit.jupiter.api.Assertions.*;

class GridMoverTest {

    @Test
    void 기본_생성자로_맵을_생성할_수_있다() {
        GridMover mover = new GridMover(5, 5);
        int[] pos = mover.getPosition();
        assertArrayEquals(new int[]{0, 0}, pos);
    }

    @Test
    void 시작_위치를_지정하는_생성자를_사용할_수_있다() {
        GridMover mover = new GridMover(5, 5, 2, 2);
        int[] pos = mover.getPosition();
        assertArrayEquals(new int[]{2, 2}, pos);
    }
//
//    @Test
//    void 한_번_이동할_수_있다() {
//        GridMover mover = new GridMover(5, 5);
//        mover.move("R");
//        assertArrayEquals(new int[]{0, 1}, mover.getPosition());
//    }
//
//    @Test
//    void 대각선_이동이_가능하다() {
//        GridMover mover = new GridMover(5, 5, 2, 2);
//        mover.move("UR");
//        assertArrayEquals(new int[]{1, 3}, mover.getPosition());
//    }
//
//    @Test
//    void 여러_번_이동을_순서대로_처리한다() {
//        GridMover mover = new GridMover(5, 5);
//        mover.move("R");
//        mover.move("D");
//        mover.move("DR");
//        assertArrayEquals(new int[]{2, 2}, mover.getPosition());
//    }
//
//    @Test
//    void 맵_밖으로_나가는_이동은_무시된다() {
//        GridMover mover = new GridMover(3, 3);
//        mover.move("L");
//        mover.move("U");
//        assertArrayEquals(new int[]{0, 0}, mover.getPosition());
//    }
//
//    @Test
//    void 복수_명령을_한_번에_처리할_수_있다() {
//        GridMover mover = new GridMover(5, 5);
//        mover.moveAll(new String[]{"R", "R", "D", "DL"});
//        assertArrayEquals(new int[]{2, 1}, mover.getPosition());
//    }
}