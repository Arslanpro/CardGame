import java.util.*;

public class Game {
    private Player player1; // 玩家1
    private Player player2; // 玩家2
    private List<String> attributes; // 属性列表
    private Random random; // 随机数生成器
    private String lastWinner; // 上一轮胜者

    // 游戏构造函数
    public Game() {
        player1 = new Player("Player 1"); // 初始化玩家1
        player2 = new Player("Player 2"); // 初始化玩家2

        attributes = Arrays.asList("volume", "attitude", "cool", "eclecticism", "hair"); // 初始化属性列表
        random = new Random(); // 初始化随机数生成器

        // 发牌给玩家
        for(int i=0; i<5; i++){
            player1.receiveCard(new Card("Card " + (i+1), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10)));
            player2.receiveCard(new Card("Card " + (i+6), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10), random.nextInt(10)));
        }

        lastWinner = "Player 1"; // 设置初始赢家为玩家1
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in); // 初始化输入扫描器
        while (player1.hasCards() && player2.hasCards()) { // 当两个玩家都有牌时，游戏继续
            Card card1 = player1.peekCard(); // 玩家1查看手中的第一张牌
            Card card2 = player2.peekCard(); // 玩家2查看手中的第一张牌

            String chosenAttribute;

            // 如果是玩家1赢了上一轮，则由玩家1选择属性
            if (lastWinner.equals("Player 1")) {
                System.out.println("Player 1's card: " + card1); // 打印玩家1手中的牌
                System.out.println("Player 1, choose an attribute: 0 - volume, 1 - attitude, 2 - cool, 3 - eclecticism, 4 - hair");
                int attributeIndex = scanner.nextInt();
                chosenAttribute = attributes.get(attributeIndex);
            } else { // 否则由玩家2选择属性
                System.out.println("Player 2's card: " + card2); // 打印玩家2手中的牌
                System.out.println("Player 2, choose an attribute: 0 - volume, 1 - attitude, 2 - cool, 3 - eclecticism, 4 - hair");
                int attributeIndex = scanner.nextInt();
                chosenAttribute = attributes.get(attributeIndex);
            }

            // 玩家出牌
            card1 = player1.playCard();
            card2 = player2.playCard();

            int value1 = card1.getAttribute(chosenAttribute); // 获取玩家1的牌的对应属性值
            int value2 = card2.getAttribute(chosenAttribute); // 获取玩家2的牌的对应属性值

            System.out.println("Player 1 plays card with " + chosenAttribute + ": " + value1);
            System.out.println("Player 2 plays card with " + chosenAttribute + ": " + value2);

            if (value1 > value2) {
                System.out.println("Player 1 wins this round");
                lastWinner = "Player 1"; // 如果玩家1赢了，设置lastWinner为Player 1
            } else if (value1 < value2) {
                System.out.println("Player 2 wins this round");
                lastWinner = "Player 2"; // 如果玩家2赢了，设置lastWinner为Player 2
            } else {
                System.out.println("It's a draw"); // 如果平局，则lastWinner不变
            }

            System.out.println("----------");
        }
    }
}


