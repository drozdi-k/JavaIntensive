package ObjectsInMemory;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CreditCardTest {
    @Test
    public void test(){
        var card = new CreditCard("1234 5678 0000","5555");
        card.setCreditLimit(500);
        card.deposit("5555",150);
        card.withdraw("5555",50);
        card.setLoanDebt(200);
        assertEquals(100,card.getBalance());
        card.deposit("5555",150);
        assertEquals(50,card.getLoanDebt());
        Assertions.assertThrows(ExceptionCreditCard.class, () -> {
            card.deposit("1255",500);
        });
        Assertions.assertThrows(ExceptionCreditCard.class, () -> {
            card.withdraw("1255",500);
        });
        Assertions.assertThrows(ExceptionCreditCard.class, () -> {
            card.withdraw("5555",5000);
        });
    }

}