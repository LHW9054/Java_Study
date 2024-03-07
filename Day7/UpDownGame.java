package Day7;
import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
    private static final int MAX_TRIES = 5; // 최대 시도 횟수
    private static final int RANGE = 100; // 랜덤 숫자 범위
    private static final int MAX_RECENT_GAMES = 3; // 최근 게임 표시 개수

    private int[] recentGames; // 최근 게임 기록
    private int recentIndex; // 최근 게임 기록 인덱스
    private int score; // 전체 게임 스코어

    public UpDownGame() {
        recentGames = new int[MAX_RECENT_GAMES];
        recentIndex = 0;
        score = 0;
    }

    public void startGame() {
        System.out.println("게임을 시작합니다. 1부터 " + RANGE + " 사이의 숫자를 맞춰보세요.");

        Random random = new Random();
        int targetNumber = random.nextInt(RANGE) + 1;
        Scanner scanner = new Scanner(System.in);

        int tries = 0;
        while (tries < MAX_TRIES) {
            System.out.print("숫자를 입력하세요: ");
            int guess = scanner.nextInt();
            tries++;

            if (guess < targetNumber) {
                System.out.println("Up!");
            } else if (guess > targetNumber) {
                System.out.println("Down!");
            } else {
                System.out.println("정답입니다!");
                updateScore(true);
                break;
            }
        }

        if (tries == MAX_TRIES) {
            System.out.println("게임 오버! 정답은 " + targetNumber + "입니다.");
            updateScore(false);
        }
    }

    private void updateScore(boolean win) {
        if (win) {
            score++;
        }
        recentGames[recentIndex] = win ? 1 : 0;
        recentIndex = (recentIndex + 1) % MAX_RECENT_GAMES;
    }

    public void displayRecentGames() {
        System.out.println("최근 게임 결과:");
        for (int i = 0; i < MAX_RECENT_GAMES; i++) {
            System.out.print(recentGames[i] == 1 ? "성공 " : "실패 ");
        }
        System.out.println();
    }

    public void displayScore() {
        System.out.println("전체 게임 스코어: " + score);
    }

    public static void main(String[] args) {
        UpDownGame game = new UpDownGame();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 게임시작");
            System.out.println("2. 게임전적");
            System.out.println("3. 게임종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    game.startGame();
                    break;
                case 2:
                    game.displayRecentGames();
                    game.displayScore();
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }
}
