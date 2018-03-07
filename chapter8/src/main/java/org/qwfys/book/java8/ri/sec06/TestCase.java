package org.qwfys.book.java8.ri.sec06;

import java.lang.annotation.*;

@Repeatable(TestCases.class)
public @interface TestCase {
   String params();
   String expected();   
}
