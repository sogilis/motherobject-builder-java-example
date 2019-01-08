package fr.sogilis.blog.article.javaobjectmother;

public class TownMother {

    public static TownBuilder one() {
        return new TownBuilder()
            .name("Vannes");
    }
}
