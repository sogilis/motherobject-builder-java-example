package fr.sogilis.blog.article.javaobjectmother;

import fr.sogilis.blog.article.javaobjectmother.Hero.Caste;

public class HeroBuilder {

    private String name;

    private Kingdom allegiance;

    private Caste caste;

    public HeroBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder allegiance(Kingdom allegiance) {
        this.allegiance = allegiance;
        return this;
    }

    public HeroBuilder caste(Caste caste) {
        this.caste = caste;
        return this;
    }

    public Hero build() {
        return new Hero(name, allegiance, caste);
    }
}
