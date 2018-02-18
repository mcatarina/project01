package org.academiadecodigo.hexallents;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Level {

    public int[][] level1() {
        return new int[][]{
                {1, 2, 3, 0, 4, 5},
                {0, 0, 0, 0, 6, 0},
                {0, 0, 3, 0, 0, 0},
                {0, 0, 4, 0, 0, 0},
                {1, 0, 6, 0, 0, 0},
                {2, 0, 5, 0, 0, 0}
        };
    }

    public int[][] level2() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 2, 3},
                {0, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 5, 0, 0},
                {0, 0, 4, 0, 6, 0, 0},
                {0, 0, 0, 0, 3, 6, 0},
                {0, 0, 0, 0, 0, 1, 5}
        };
    }

    public int[][] level3() {
        return new int[][]{
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 2, 0, 3, 4},
                {0, 0, 0, 0, 3, 4, 0, 2},
                {0, 0, 0, 5, 6, 0, 0, 0},
                {0, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 6, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0}
        };
    }

    public int[][] level4() {
        return new int[][]{
                {1, 2, 3, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {5, 0, 5, 6, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {6, 0, 0, 0, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {1, 4, 0, 3, 0, 0, 0, 0}
        };
    }
}
