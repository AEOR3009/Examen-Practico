program Palindromo;
var
   texto, textoInvertido: string;
   i, longitud: integer;
begin
     write('Ingrese un numero o palabra: ');
     readln(texto);

     textoInvertido := '';
     longitud := length(texto);

     for i := longitud downto 1 do
         textoInvertido := textoInvertido + texto [i];

     if texto = textoInvertido then
        writeln('Es un palindromo')
     else
         writeln('No es un palindromo');
     readln;
end.