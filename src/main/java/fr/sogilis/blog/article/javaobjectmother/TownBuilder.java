package fr.sogilis.blog.article.javaobjectmother;

public class TownBuilder {

    private String name;

    public TownBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Town build() {
        return new Town(name);
    }
}
