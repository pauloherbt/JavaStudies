# Lambda  e Streams Anotações
Consiste em dizer ao computador apenas o que nós queremos, e não como ele deve fazer (estruturas que o próprio compilador detecta).
É uma forma de passar um comportamento, sequência de instruções, ao invés de um objeto contendo dados.
.forEach(color -> print(color));
faz o mesmo que um loop for verboso.
## Expressões lambda multi-linhas
É possível ter exressões lambda com mais de uma linha, porém com um só retorno, como por exemplo:
(String s1,String s2) -> {
	int a = s1.size; b = s2.size;
	return a-b;
}
## Algumas expressões podem ou não retornar algo
É o caso do Consumer, que só executa o que está dentro da função, exemplo forEach().
### Pode ter zero, um ou vários parâmetros
O número de parâmetros dependerá dos parâmetros que a interface funcional requer. Ex: Runnable, não requer parametros, ( ) -> method
Consumer: requer 1, logo não é ncessário **( )** variable -> do something
Compare: requer 2 params, logo é necessário **( )** (var1,var2) -> do something.

### Algun exercícios do livro Head First para praticar Streams:
### 01:
***The data in the updated song list contains the genre of the song. Lou’s noticed that the  
diner’s clientele seem to prefer variations on rock music, and he wants to see a list of all  
the songs that fall under some genre of “rock.”*
### 02:
***Can you write a filter operation that can select  
songs: By The Beatles, That start with “H”, More recent than 1995
### 03:
He wants a list of all the genres of the songs that have been played and no repeated

Todos esses problemas foram resolvidos em código, na pasta exercise.

### Streams são como se fosse uma espécie de pipeline
 São obrigatoriamente compostas de um início e fim, e pode ou não ter operações intermediárias que realizam filtragens, iterações, comparações e diversas outras operações.
### Method References
Podem substituir expressões lambda, e são uma forma de deixar o código mais legível e menos verboso., principalmente quando a operação em questão seria uma expressão lambda simples e previsível.
