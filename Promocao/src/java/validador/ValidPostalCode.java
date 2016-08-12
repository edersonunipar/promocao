/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;






/**
 *
 * @author CPD
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidPostalCodeImpl.class)
public @interface ValidPostalCode  {

    String message() default "postal invalido";
    Class<?>[] groups() default{};
    Class< ? extends Payload>[] payload()default{};
    
    
    
   
    
}
