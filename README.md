# Exceptional-Calculator
Harmanjit Randhawa 
Please view TestCases.xlsx for further possible inputs and results

The primary goal of this project is to try to implement exception handling without using any if else, while or for loop 
This project have just 1 switch statement no other loops or if else statements
A basic GUI is used to get input and show result
This calculator assumes that user will enter the expressions as description
Integer Operand Integer ( note space between integers and operand)
Following operands are supported ( +,-,/,*.%,^)
Also it supports unary addition/subtraction ( 2+, -3, 3-)

If there are multiple errors in the description, it will indicate first error.
In case user enters the expression without space between operand and operator.foloowing cases 
2+3 : Second operand and operator missing
2+ 4: Error in result. treats the expression as unary and calculates according to that
2 %0: Missing second operand 
2 +p: Missing second operand 
p +2: String index out of range 
p+ 2: Operator must be + or - 
p+2 : Operator must be + or - 
