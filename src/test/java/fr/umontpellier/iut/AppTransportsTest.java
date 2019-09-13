package fr.umontpellier.iut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTransportsTest {

    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> AppTransports.main(new String[1]));
    }

}