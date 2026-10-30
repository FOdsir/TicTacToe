import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] board = {'1', '2', '3',
                        '4', '5', '6',
                        '7', '8', '9'};
        char player = 'X';

        for (int i = 0; i < 9; i++) {
            System.out.println(board[0]+" | "+ board[1]+" | "+ board[2]);
            System.out.println("---------");
            System.out.println(board[3]+" | "+ board[4]+" | "+ board[5]);
            System.out.println("---------");
            System.out.println(board[6]+" | "+ board[7]+" | "+ board[8]);

            System.out.println("Take your square:");
            int square = scanner.nextInt() - 1;

            board[square] = player;

            if ((board[0]== player && board[1]== player && board[2]== player) ||
                    (board[3]== player && board[4]== player && board[5]== player) ||
                    (board[6]== player && board[7]== player && board[8]== player) ||
                    (board[0]== player && board[3]== player && board[6]== player) ||
                    (board[1]== player && board[4]== player && board[7]== player) ||
                    (board[2]== player && board[5]== player && board[8]== player) ||
                    (board[0]== player && board[4]== player && board[8]== player) ||
                    (board[2]== player && board[4]== player && board[6]== player)) {
                System.out.println("Player " + player + " won!");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
}