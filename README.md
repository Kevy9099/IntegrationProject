# Java Basic Programming 
- Java 8 Primitive Data-types: A primitive type is predefined by the language and is named by a reserved keyword. Primitive values do not share state with other primitive values. The range of values is calculated as −(2^(n−1)) to (2^(n−1))−1; where n is the number of bits required.
    - byte: 8-bit, Range of values that can be stored: are from -128(min) to 127(max). The byte data type can be useful for saving memory in large arrays. byte = 103;
    - short: 16-bit, Range of values can be stored are from −32768(min) to 32767(max). Also, using short data type to save memory in large arrays. short = 4323;
    - int: 32-bit, Range of values can be stored are from -2^31(min) to 2^(31-(1))(max). We use int data type to define a 32-bit undefined integer. int = 4;
    - long: 64-bit,Range of values that can be stored are from -2^63(min) to 2^(63-(1))(max). long data type to represent large integer values. long = 230,465,323L;
    - float: A single-precision 32-bit floating point. Float data type represent, save memory in large arrays of floating point numbers. float = 8.0f
    - double: A double-precision 64-bit floating point. double = 4.0; Used for decimal values this data type should never be used for precise values, such as currency.
    - boolean: Has only two possible values: true and false. This data type represents one bit of information. boolean = true/false;
    - char: A single 16-bit Unicode character. char = 'A';
- Operator Precedence: When two operators share an operand the operator with the higher
  precedence goes first. For example, 1 + 2 * 3 is treated as 1 + (2 * 3). Whereas 1 * 2 + 3 is
  treated as (1 * 2) + 3 since multiplication has a higher precedence than addition. Therefore,
  we can use these with other operands such as : 1 ( lowest) = assignment , where 16(highest) =
  access array, element access, object member.  
- Variable and Scope: A Variable is a container that holds values. Instance variables Any
  method in the class definition can access these variables Parameter variables Only the method
  where the parameter appears can access these variables. This is how information is passed to
  the object. Local variables Only the method where the parameter appears can access these
  variables. These variables are used to store intermediate results. A Scope means the variable
  is available when the variable was declared.
- The Final keyword makes variables value unchangeable: Final is define differently, depending
  on how its used. Final Variable: A final variable can only be initialized once. Final Method:
  A final method cannot be overridden by subclasses. Final Class: A final class cannot be
  subclass.
- Escape Sequence: In these array of questions, the "\n" is being used to start a new line.
         


