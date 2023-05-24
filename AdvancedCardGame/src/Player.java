import java.util.LinkedList;
import java.util.Queue;

public class Player {
    private String name; // 玩家名称
    private Queue<Card> hand; // 玩家手中的牌

    // 玩家构造函数
    public Player(String name) {
        this.name = name; // 设置玩家名称
        this.hand = new LinkedList<>(); // 初始化手牌为空
    }

    // 玩家接收一张牌
    public void receiveCard(Card card) {
        hand.add(card); // 将牌添加到手中
    }

    // 玩家出一张牌
    public Card playCard() {
        return hand.poll(); // 返回并移除手中的第一张牌
    }

    // 玩家查看手中的第一张牌（不移除）
    public Card peekCard() {
        return hand.peek(); // 返回但不移除手中的第一张牌
    }

    // 检查玩家是否还有牌
    public boolean hasCards() {
        return !hand.isEmpty(); // 如果手中无牌，返回false；否则返回true
    }

    // 获取玩家名称
    public String getName() {
        return name;
    }
}
