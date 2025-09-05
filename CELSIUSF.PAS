program CelsiusFahrenheit;
var
   celsius, fahrenheit: real;
begin
     write ('Ingrese grados Celsius: ');
     readln(celsius);

     fahrenheit := (celsius * 9/5) + 32;

     writeln(celsius:0:2, '§C= ', fahrenheit:0:2, '§F');
     readln;
end.