package fr.sogilis.blog.article.javaobjectmother;

public class Kingdom {

    private String name;

    private Town capital;

    public Kingdom(String name, Town capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public Town getCapital() {
        return capital;
    }
}
