package core.helpDesk;
import core.BaseSeleniumTest;
import helpers.TestValues;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static helpers.StringModifier.getUniqueString;

public class HelpDeskTest extends BaseSeleniumTest {

    @Test
    public void checkTicket() {
        String title = getUniqueString (TestValues.TEST_TITLE);
        String body = TestValues.TEST_BODY;
        String email = TestValues.TEST_EMAIL;
        TicketPage ticketPage = new MainPage().createTicket(title, body, email)
                .openLoginPage()
                .auth("admin", "adminat")
                .findTicket(title);
        Assertions.assertTrue(ticketPage.getTitle().contains(title));
        Assertions.assertEquals(ticketPage.getBody(), TestValues.TEST_BODY);
        Assertions.assertEquals(ticketPage.getBody(), TestValues.TEST_BODY);

    }
}
