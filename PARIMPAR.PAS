program parImpar;
var
   num: integer;
begin
     write('Ingrese un numero ');
     readln(num);

     if num mod 2 = 0 then
        writeln('El numero ', num, ' es par')
     else
         writeln('El numero ', num, ' es impar');
     readln;
end.