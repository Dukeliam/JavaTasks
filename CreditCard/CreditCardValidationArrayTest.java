import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CreditCardValidationTest{
      @Test
      public void testThatTheCardIsValid(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            boolean actual = creditCardValidation.isValid(new char[]{'1','2','3','4','5','6','7','8','9','1','0','1','2','5','4','3','6','3'});
            boolean expected = false;
            
            Assertions.assertFalse(actual);
      }
      @Test
      public void testThatTheCardNumberReturnsTheSumOfDigit(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            int actual = creditCardValidation.cardDigit(new char[]{'4','3','8','8','5','7','6','0','1','8','4','0','2','6','2','6'});
            int expected = 37;
            
            Assertions.assertEquals(actual, expected);
      }
      @Test
      public void testThatTheCardNumberReturnsTheSumOfOddPlace(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            int actual = creditCardValidation.sumOfOddPlace(new char[]{'4','3','8','8','5','7','6','0','1','8','4','0','2','6','2','6'});
            int expected = 39;
            
            Assertions.assertEquals(actual, expected);
      }
      public void testThatTheCardNumberReturnsTheCardIsValidated(){
            CreditCardValidation creditCardValidation = new CreditCardValidation();
            boolean actual = creditCardValidation.isCardValid(new char[]{'4','3','8','8','5','7','6','0','1','8','4','0','2','6','2','6'});
            boolean expected = true;
            
            Assertions.assertEquals(actual, expected);
      }
}
