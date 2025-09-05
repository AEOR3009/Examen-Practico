program TablaMultiplicar;
var
   num, i: integer;
begin
     write('Ingrese un numero: ');
     readln(num);

     writeln('Tabla de multiplicar del ', num);
     for i := 1 to 10 do
         writeln(num, ' x ', i, ' = ', num * i);
     readln;
end.