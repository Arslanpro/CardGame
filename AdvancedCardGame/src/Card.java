import java.util.Map;

public class Card {
    private String name; // 卡牌名称
    private Map<String, Integer> attributes; // 卡牌属性

    // 卡牌构造函数
    public Card(String name, int volume, int attitude, int cool, int eclecticism, int hair) {
        this.name = name;
        attributes = Map.of(
                "volume", volume,
                "attitude", attitude,
                "cool", cool,
                "eclecticism", eclecticism,
                "hair", hair
        );
    }

    // 获取卡牌某一属性值
    public int getAttribute(String attribute) {
        return attributes.getOrDefault(attribute, -1); // 如果该属性不存在，返回-1
    }

    // 获取卡牌名称
    public String getName() {
        return name;
    }

    // 转化为字符串用于打印
    @Override
    public String toString() {
        return name + " " + attributes;
    }
}
