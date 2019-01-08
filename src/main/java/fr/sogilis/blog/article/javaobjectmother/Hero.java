package fr.sogilis.blog.article.javaobjectmother;

public class Hero {

    private String name;

    private Kingdom allegiance;

    private Caste caste;

    public enum Caste {
        KING,
        WIZARD,
        KNIGHT,
        FARMER
    }

    public Hero(String name, Kingdom allegiance, Caste caste) {
        this.name = name;
        this.allegiance = allegiance;
        this.caste = caste;
    }

    public boolean canGiveOrderTo(Hero hero) {
        return caste.ordinal() > hero.caste.ordinal();
    }

    // Ordres : CLERGYMAN, NOBLE, FARMER
}
