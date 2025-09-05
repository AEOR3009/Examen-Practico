program MayorMenor;
var
   n, i: integer;
   num, mayor, menor: real;
begin
     write ('Cuantos numero desea ingresar? ');
     readln(n);

     write ('Ingrese el numero 1: ');
     readln(num);
     mayor := num;
     menor := num;

     for i := 2 to n do
     begin
          write('Ingrese el numero ', i, ': ');
          readln(num);

          if num > mayor then
             mayor := num;

          if num < menor then
             menor := num;
     end;

     writeln('El numero mayor es: ', mayor:0:2);
     writeln('El numero menor es: ', menor:0:2);
     readln;
end.
