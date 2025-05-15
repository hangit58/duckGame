public class World {
    private char[][] grid;
    private int width, height;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new char[height][width];
        clearGrid();
    }

    // Clear the grid
    public void clearGrid() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = '.'; // Empty spot
            }
        }
    }

    // Set an entity at a specific position
    public void setEntity(int x, int y, char symbol) {
        if (x >= 0 && x < height && y >= 0 && y < width) {
            grid[x][y] = symbol;
        }
    }

    // Print the world grid (map)
    public void printGrid() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}