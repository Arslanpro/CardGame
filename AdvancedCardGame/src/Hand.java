import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    // 构造函数
    public Hand() {
        this.cards = new ArrayList<>();
    }

    // 添加卡牌
    public void addCard(Card card) {
        cards.add(card);
    }

    // 打出卡牌
    public Card playCard() {
        return cards.remove(0);  // 打出顶部卡牌
    }

    // 判断手牌是否为空
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
