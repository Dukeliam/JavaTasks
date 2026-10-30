import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CreditCardValidationTest{
      @Test
      public void testThatTheCardIsValid(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            boolean actual = creditCardValidation.isValid(4388576018402626L);
            boolean expected = true;
            
            Assertions.assertTrue(actual);
      }
      @Test
      public void testThatTheCardNumberReturnsTheCardIsValidated(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            boolean actual = creditCardValidation.isCardValid(4388576018402626L);
            boolean expected = false;
            
            Assertions.assertEquals(actual, expected);
      }

      @Test
      public void testThatTheCardNumberReturnsTheCardType(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            int actual = creditCardValidation.getCardType(4388576018402626L);
            int expected = 1;
            
            Assertions.assertEquals(actual, expected);
      }
}
