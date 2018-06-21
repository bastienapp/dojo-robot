import java.util.Arrays;

class Robot {

	public static int move(int n, String itinerary) throws IndexOutOfBoundsException, IllegalArgumentException {
		if (n <= 0) {
			throw new IllegalArgumentException("n <= 0");
		}
		int[][] grid = new int[n][n];
		int x = 0;
		int y = 0;
		grid[y][x] = 1; // robot starts here
		int count = 1;
		for (int i = 0; i < itinerary.length(); i++) {
			switch (itinerary.charAt(i)) {
				case 'N':
					y--;
					break;
				case 'S':
					y++;
					break;
				case 'W':
					x--;
					break;
				case 'E':
					x++;
					break;
			}
            if (x < 0 || x >= n || y < 0 || y >= n) {
                throw new IndexOutOfBoundsException("Robot is out of bounds");
            }
			if (grid[y][x] == 0) {
				// robot never been here
				grid[y][x] = 1;
				count++;
			}
		}

		return count;
	}
}
