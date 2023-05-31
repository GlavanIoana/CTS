package suite;

import clase.Tag1;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.AgentieTurismTest;
import teste.PachetTuristicTest;
import teste.PachetTuristicVarstaTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({AgentieTurismTest.class, PachetTuristicTest.class, PachetTuristicVarstaTest.class})
@Categories.IncludeCategory(Tag1.class)
public class SuitaCompleta {
}
