package fr.sogilis.blog.article.javaobjectmother;

import java.time.LocalDate;

public class Hero {

    private String name;

    private Kingdom allegiance;

    private Caste caste;

    private LocalDate deathDate;

    public enum Caste {
        KING,
        WIZARD,
        KNIGHT
    }

    public Hero(String name, Kingdom allegiance, Caste caste, LocalDate deathDate) {
        this.name = name;
        this.allegiance = allegiance;
        this.caste = caste;
        this.deathDate = deathDate;
    }

    public String getName() {
        return name;
    }

    public Kingdom getAllegiance() {
        return allegiance;
    }

    public Caste getCaste() {
        return caste;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public boolean canGiveOrderTo(Hero hero) {
        return caste.ordinal() > hero.caste.ordinal();
    }
}
