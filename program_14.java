public class program_14 
{
    public static void main(String[] args) {
        // Declare and initialize a 3D array with dimensions 2x3x4.
        int[][][] numbers = new int[2][3][4];

        // Initialize the elements of the 3D array with values.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    numbers[i][j][k] = i * 100 + j * 10 + k;
                }
            }
        }

        // Access and print elements from the 3D array.
        System.out.println("Elements of the 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println(); // Move to the next level (2D array).
            }
            System.out.println(); // Separate 2D arrays with an empty line.
        }
    }
}
