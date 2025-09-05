program Fibonacci;
var
   n, i, a, b, temp: integer;
begin
     write ('Cuantos terminos de Fibonacci desea? ');
     readln(n);

     a := 0;
     b := 1;

     writeln('Serie de Fibonacci:');
     for i := 1 to n do
     begin
          writeln(a);
          temp := a + b;
          a := b;
          b := temp;
     end;
     readln;
end.