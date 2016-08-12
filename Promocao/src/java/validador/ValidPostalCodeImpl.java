/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author CPD
 */
public class ValidPostalCodeImpl implements ConstraintValidator<ValidPostalCode, String>{

    
    @Override
    public void initialize(ValidPostalCode constraintAnnotation) {
      
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
       Pattern pat = Pattern.compile("[0-9]{5} - [0-9] {3}");
       Matcher m = pat.matcher(value);
       return m.matches();
    }
    
    
    
}
