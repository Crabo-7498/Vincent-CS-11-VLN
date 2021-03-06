import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class DepositTests {
    Deposit dTest;
    double amt;
    Date date;
    String account;
    Random r;

    @Before
    public void setup() {
        r = new Random();
        amt = r.nextDouble() * 100;
        account = Customer.SAVING;
        date = new Date();

        dTest = new Deposit(amt, date, account);
    }

    @Test
    public void testToString() {
        assertEquals(dTest.toString(), "Deposit of: $" + amt + " Date: " + date + " into Account: " + account);
    }
}
