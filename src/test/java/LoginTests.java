import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.LoginSteps;
import util.DriverManager;

import java.io.IOException;

public class LoginTests {

    @BeforeAll
    public static void setUpDriver() throws IOException, ParseException {
        DriverManager manager = new DriverManager();
        manager.setup();
    }
    @Test
    public void verifyUserLogsInSuccessfully()
    {
       LoginSteps login = new LoginSteps();
       String logoutText = login.loginWithCreds("test@test.com", "abcd1234");
       Assertions.assertEquals(logoutText, "Logout");
    }

    @AfterAll
    public static void tearDown()
    {
        DriverManager.driver.close();
    }

}
