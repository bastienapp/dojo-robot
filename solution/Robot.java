import java.util.Arrays;

class Robot {

	public static int move(int size, String itinerary) {		
		int[][] grid = new int[size][size];
		char[] direction = itinerary.toCharArray();
		int x = 0;
		int y = 0;
		int count = 1;
		grid[y][x] = 1;
		for (int i = 0; i < direction.length; i++) {
			switch (direction[i]) {
				case 'N':
					if (y - 1 >= 0) {
						y--;
					}
					break;

				case 'S':
					if (y + 1 < size) {
						y++;
					}
					break;

				case 'W':
					if (x - 1 >= 0) {
						x--;
					}
					break;

				case 'E':
					if (x + 1 < size) {
						x++;
					}
					break;
			}
			if (grid[y][x] == 0) {
				grid[y][x] = 1;
				count++;
			}
		}

		return count;
	}
}
