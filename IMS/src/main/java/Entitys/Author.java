/**
 * @Author(author="Alex")
 */

package Entitys;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Author {
	String author();
}
