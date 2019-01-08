package fr.sogilis.blog.article.javaobjectmother;

import static fr.sogilis.blog.article.javaobjectmother.Hero.Caste.KNIGHT;

public class HeroMother {

    public static HeroBuilder one() {
        return new HeroBuilder()
            .name("Leodagan")
            .allegiance(KingdomMother.one().build())
            .caste(KNIGHT);
    }

    public static HeroBuilder deadAt() {
        return new HeroBuilder()
            .name("Leodagan")
            .allegiance(KingdomMother.one().build())
            .caste(KNIGHT);
    }
}

