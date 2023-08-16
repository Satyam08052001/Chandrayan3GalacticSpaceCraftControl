public class GalacticSpaceCraftControl {
    public static void main(String[] args) {
        int[] position = {0, 0, 0};  // Initial position (x, y, z)
        char initialDirection = 'N'; // Initial direction (N, S, E, W, U, D)

        char[] commands = {'f', 'r', 'u', 'b', 'l'}; // Example commands

        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward(position, initialDirection);
                    break;
                case 'b':
                    moveBackward(position, initialDirection);
                    break;
                case 'r':
                    turnRight(initialDirection);
                    break;
                case 'l':
                    turnLeft(initialDirection);
                    break;
                case 'u':
                    turnUp(initialDirection);
                    break;
                case 'd':
                    turnDown(initialDirection);
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }

        System.out.println("Final Position: (" + position[0] + ", " + position[1] + ", " + position[2] + ")");
        System.out.println("Final Direction: " + initialDirection);
    }

    public static void moveForward(int[] position, char direction) {
        // moving forward logic based on the direction
    }

    public static void moveBackward(int[] position, char direction) {
        // moving backward logic based on the direction
    }

    public static void turnRight(char direction) {
        // turning right logic
    }

    public static void turnLeft(char direction) {
        // turning left logic
    }

    public static void turnUp(char direction) {
        // turning up logic
    }

    public static void turnDown(char direction) {
        // turning down logic
    }
}