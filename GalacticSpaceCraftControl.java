import java.util.Scanner;
public class GalacticSpaceCraftControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input initial position
        System.out.println("hi");
        System.out.print("Enter initial position (x y z): ");
        int[] position = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        // Input initial direction
        System.out.print("Enter initial direction (N, S, E, W, U, D): ");
        char initialDirection = scanner.next().charAt(0);

        // Input commands
        System.out.print("Enter commands (without spaces): ");
        String commandsStr = scanner.next();
        char[] commands = commandsStr.toCharArray();

        // Simulate spacecraft movement and rotation

        for (char command : commands) {
            switch (command) {
                case 'f':
                    moveForward(position, initialDirection);
                    break;
                case 'b':
                    moveBackward(position, initialDirection);
                    break;
                case 'r':
                    initialDirection = turnRight(initialDirection);
                    break;
                case 'l':
                    initialDirection = turnLeft(initialDirection);
                    break;
                case 'u':
                    initialDirection = turnUp(initialDirection);
                    break;
                case 'd':
                    initialDirection = turnDown(initialDirection);
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }

        System.out.println("Final Position: (" + position[0] + ", " + position[1] + ", " + position[2] + ")");
        System.out.println("Final Direction: " + initialDirection);
    }

    public static void moveForward(int[] position, char direction) {
        switch (direction) {
            case 'N':
                position[1]++;
                break;
            case 'S':
                position[1]--;
                break;
            case 'E':
                position[0]++;
                break;
            case 'W':
                position[0]--;
                break;
            case 'U':
                position[2]++;
                break;
            case 'D':
                position[2]--;
                break;
        }
    }

    public static void moveBackward(int[] position, char direction) {
        switch (direction) {
            case 'N':
                position[1]--;
                break;
            case 'S':
                position[1]++;
                break;
            case 'E':
                position[0]--;
                break;
            case 'W':
                position[0]++;
                break;
            case 'U':
                position[2]--;
                break;
            case 'D':
                position[2]++;
                break;
        }
    }

    public static char turnRight(char direction) {
        switch (direction) {
            case 'N':
                return 'E';
            case 'S':
                return 'W';
            case 'E':
                return 'S';
            case 'W':
                return 'N';
            default:
                return direction;
        }
    }

    public static char turnLeft(char direction) {
        switch (direction) {
            case 'N':
                return 'W';
            case 'S':
                return 'E';
            case 'E':
                return 'N';
            case 'W':
                return 'S';
            default:
                return direction;
        }
    }

    public static char turnUp(char direction) {
        switch (direction) {
            case 'N':
                return 'U';
            case 'S':
                return 'D';
            case 'E':
                return 'E';
            case 'W':
                return 'W';
            default:
                return direction;
        }
    }

    public static char turnDown(char direction) {
        switch (direction) {
            case 'N':
                return 'D';
            case 'S':
                return 'U';
            case 'E':
                return 'E';
            case 'W':
                return 'W';
            default:
                return direction;
        }
    }
}
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
                    initialDirection = turnRight(initialDirection);
                    break;
                case 'l':
                    initialDirection = turnLeft(initialDirection);
                    break;
                case 'u':
                    initialDirection = turnUp(initialDirection);
                    break;
                case 'd':
                    initialDirection = turnDown(initialDirection);
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }

        System.out.println("Final Position: (" + position[0] + ", " + position[1] + ", " + position[2] + ")");
        System.out.println("Final Direction: " + initialDirection);
    }

    public static void moveForward(int[] position, char direction) {
        switch (direction) {
            case 'N':
                position[1]++;
                break;
            case 'S':
                position[1]--;
                break;
            case 'E':
                position[0]++;
                break;
            case 'W':
                position[0]--;
                break;
            case 'U':
                position[2]++;
                break;
            case 'D':
                position[2]--;
                break;
        }
    }

    public static void moveBackward(int[] position, char direction) {
        switch (direction) {
            case 'N':
                position[1]--;
                break;
            case 'S':
                position[1]++;
                break;
            case 'E':
                position[0]--;
                break;
            case 'W':
                position[0]++;
                break;
            case 'U':
                position[2]--;
                break;
            case 'D':
                position[2]++;
                break;
        }
    }

    public static char turnRight(char direction) {
        switch (direction) {
            case 'N':
                return 'E';
            case 'S':
                return 'W';
            case 'E':
                return 'S';
            case 'W':
                return 'N';
            default:
                return direction;
        }
    }

    public static char turnLeft(char direction) {
        switch (direction) {
            case 'N':
                return 'W';
            case 'S':
                return 'E';
            case 'E':
                return 'N';
            case 'W':
                return 'S';
            default:
                return direction;
        }
    }

    public static char turnUp(char direction) {
        switch (direction) {
            case 'N':
                return 'U';
            case 'S':
                return 'D';
            case 'E':
                return 'E';
            case 'W':
                return 'W';
            default:
                return direction;
        }
    }

    public static char turnDown(char direction) {
        switch (direction) {
            case 'N':
                return 'D';
            case 'S':
                return 'U';
            case 'E':
                return 'E';
            case 'W':
                return 'W';
            default:
                return direction;
        }
    }
}
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
                    initialDirection = turnRight(initialDirection);
                    break;
                case 'l':
                    initialDirection = turnLeft(initialDirection);
                    break;
                case 'u':
                    initialDirection = turnUp(initialDirection);
                    break;
                case 'd':
                    initialDirection = turnDown(initialDirection);
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }
        }

        System.out.println("Final Position: (" + position[0] + ", " + position[1] + ", " + position[2] + ")");
        System.out.println("Final Direction: " + initialDirection);
    }

    public static void moveForward(int[] position, char direction) {
        switch (direction) {
            case 'N':
                position[1]++;
                break;
            case 'S':
                position[1]--;
                break;
            case 'E':
                position[0]++;
                break;
            case 'W':
                position[0]--;
                break;
            case 'U':
                position[2]++;
                break;
            case 'D':
                position[2]--;
                break;
        }
    }

    public static void moveBackward(int[] position, char direction) {
        switch (direction) {
            case 'N':
                position[1]--;
                break;
            case 'S':
                position[1]++;
                break;
            case 'E':
                position[0]--;
                break;
            case 'W':
                position[0]++;
                break;
            case 'U':
                position[2]--;
                break;
            case 'D':
                position[2]++;
                break;
        }
    }

    public static char turnRight(char direction) {
        switch (direction) {
            case 'N':
                return 'E';
            case 'S':
                return 'W';
            case 'E':
                return 'S';
            case 'W':
                return 'N';
            default:
                return direction;
        }
    }

    public static char turnLeft(char direction) {
        switch (direction) {
            case 'N':
                return 'W';
            case 'S':
                return 'E';
            case 'E':
                return 'N';
            case 'W':
                return 'S';
            default:
                return direction;
        }
    }

    public static char turnUp(char direction) {
        switch (direction) {
            case 'N':
                return 'U';
            case 'S':
                return 'D';
            case 'E':
                return 'E';
            case 'W':
                return 'W';
            default:
                return direction;
        }
    }

    public static char turnDown(char direction) {
        switch (direction) {
            case 'N':
                return 'D';
            case 'S':
                return 'U';
            case 'E':
                return 'E';
            case 'W':
                return 'W';
            default:
                return direction;
        }
    }
}
