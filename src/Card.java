public class Card {
    String name;
    int volume;
    int attitude;
    int cool;
    int eclecticism;
    int hair;

    public Card(String name, int volume, int attitude, int cool, int eclecticism, int hair) {
        this.name = name;
        this.volume = volume;
        this.attitude = attitude;
        this.cool = cool;
        this.eclecticism = eclecticism;
        this.hair = hair;
    }

    public String getName() {
        return this.name;
    }

    // Add getters for other attributes here
}
