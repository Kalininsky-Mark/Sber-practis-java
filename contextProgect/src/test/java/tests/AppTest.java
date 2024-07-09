package tests;

import applications.MainApplication;
import main.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {Main.class})
public class AppTest {

    private final int TEST_SENDER_ID = 666;
    private final int TEST_PHONE_NUMBER = 999;
    private final int TEST_VALUE = 69;

    @Autowired
    private MainApplication application;

    @Test
    @DisplayName("Verify that MainApplication component works correctly")
    public void testApplicationCorrectness() {
        assertDoesNotThrow(() -> application.run(TEST_SENDER_ID, TEST_PHONE_NUMBER, TEST_VALUE));
    }
}
