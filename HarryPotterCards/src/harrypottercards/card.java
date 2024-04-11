package harrypottercards;

public class card {

    private String type;
    private String name;
    private String desc;
    private Integer mana;
    private String game;

    public card(String type, String name, String desc, Integer mana, String game) {
        this.type = type;
        this.name = name;
        this.desc = desc;
        this.mana = mana < 0 ? 0 : mana;
        this.game = game;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getMana() {
        return this.mana;
    }

    public String getGame() {
        return this.game;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public void setGame(String game) {
        this.game = game;
    }

}
