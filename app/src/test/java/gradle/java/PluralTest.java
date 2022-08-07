package gradle.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PluralTest {

    @Test
    void is_plural_when_my_input_is_zero(){
        Integer input = 0;
        Boolean output = true;

        Plural myNewObject = new Plural();
        Boolean result = myNewObject.isPlural(input);

        assertThat(result).isEqualTo(output);
    }

    @Test
    void is_not_a_plural_when_my_input_is_one(){
        Integer input = 1;
        Boolean output = false;

        Plural myNewObject = new Plural();
        Boolean result = myNewObject.isPlural(input);

        assertThat(result).isEqualTo(output);
    }

    @Test
    void is_not_a_plural_when_my_input_is_two_or_more(){
        Integer input = 2;
        Boolean output = true;

        Plural myNewObject = new Plural();
        Boolean result = myNewObject.isPlural(input);

        assertThat(result).isEqualTo(output);
    }

}
