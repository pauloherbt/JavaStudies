## Collections.sort vs List.sort
### Para comparar objetos em java, é necessário o uso de algumas interfaces. 
O método sort da interface **Collections** é interessante quando não se tem outras formas de comparar o objeto, por ex um objeto Som, classificar uma lista de sons, com base apenas em seu título.
	Utiliza-se a implementação da interface **COMPARABLE** e o metodo compareTo dentro da classe Som.
### Mas se houver mais ordenações ?
Se for necessário comparar o nome dos artistas da música, é recomendado o uso da interface Comparator, pode ser usado de parâmetro para o método sort das interfaces Collections e da List.
### Diferenças
A diferença é que o Comparable é interno na classe que será ordenada, enquanto o Comparator não requer que herde ou implemente, pois ele é uma classe externa que tem um metodo **compare** que compara os dois objetos especificados passados como parametro. É uma classe separada. 
	Para evitar verbosidade, utiliza-se expressões lambda. programação funcional que declaram a classe em poucas linhas de código.	
### Interfaces Funcionais
O comparator é uma interface funcional, pois implementa apenas um método (compare), aproveitamos disso para evitar excesso de código e utilizamos expressões lambdas, que omitem toda a declaração de uma classe.
Ex:
	`class test implements Comparator<Som>{ 
		`public int compare(Song one, Song two){
			`return one.getTitle().compareTo(two.gettitle());`  essa linha é tudo que ele precisa saber.
		}`
	
Toda essa declaração da classe, e do metodo compare é inutil, uma vez que o compilador pode inferir todas essas estruturas, quando for utilizado ex:
`list.sort((one,two)-> one.getTitle().compareTo(two.getTitle());
tem o mesmo efeito e menos linhas de código.
### Ideia de Projeto *reprodutor de mídia*
### Estrutura de dados que casam com esse conteudo
+ Set
+ List
+ Map
#### Set
Sets são estrutura de dados, semelhantes ao arraylist, porém não permite adicionar objetos iguais, ou seja apenas objetos unicos serão armazenados.
Para isso faz-se uso do equals e hashcode no objeto citado. 
#### Hashset
Não tem uma ordem predefinida, mas pode ser usado o comparator ou comparable posteriormente
#### TreeSet
Permite armazenar os objetos com base numa ordem predefinida utilizando um Comparator na sua inicialização, para que ele sempre mantenha o conjunto ordenado com base no que foi pedido. **É necessário que ou o objeto que será armazenado implemente Comparable ou o programador inicialize o Comparator**.
#### Map
Mapeamento chave-valor, cada chave tem seu objeto associado. Você pode ter objetos iguais, mas nunca chaves iguais. Usa se dois parametros<chave,valor> e os metodos put para adicionar e get para pegar o valor associado a uma chave.

### Generics e Polimorfismo
Seja um método que aceita como parametro List<Animal>.
Por que uma Lista de objetos que são subclasses de Animal não são aceitos?
por que iria ferir o type safety, quem garante que todos os animais seriam apenas da Classe Gato ou da classe cachorro? 
Para resolver isso temos os wildcards 
List<(? extends Animal)> permite que tenhamos uma lista da classe Animal ou de uma subclasse de Animal(cachorro,gato)