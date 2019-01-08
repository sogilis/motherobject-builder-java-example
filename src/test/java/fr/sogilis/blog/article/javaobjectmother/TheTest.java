package fr.sogilis.blog.article.javaobjectmother;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static fr.sogilis.blog.article.javaobjectmother.Hero.Caste.KING;
import static fr.sogilis.blog.article.javaobjectmother.Hero.Caste.WIZARD;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TheTest {

    @Test
    @DisplayName("Can you see all information I have to write in order to build a single knight?")
    void without_mother_object() {
        Kingdom kingdom = new Kingdom("Logres", new Town("Kaamelott"));
        Hero aKing = new Hero("Arthur", kingdom, KING);
        Hero aWizard = new Hero("Merlin", kingdom, WIZARD);
        assertFalse(aKing.canGiveOrderTo(aWizard));
    }

    @Test
    @DisplayName("Now, if we ignore one() and build() boilerplate, we only have to provide which class and which caste")
    void with_mother_object() {
        Hero aKing = HeroMother.one().caste(KING).build();
        Hero aWizard = HeroMother.one().caste(WIZARD).build();
        assertFalse(aKing.canGiveOrderTo(aWizard));
    }
}
