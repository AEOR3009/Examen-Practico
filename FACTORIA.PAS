program Factorial;
var
   n, i, fact: integer;
begin
     write('Ingrese un numero: ');
     readln(n);

     fact := 1;
     for i := 1 to n do
         fact := fact * i;

     writeln ('El factorial de ', n, ' es ', fact);
     readln;
end.

