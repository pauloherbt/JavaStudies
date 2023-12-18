## FORMULARIO DE CADASTRO DE USUÁRIOS
Esse projeto trata-se de um CRUD, baseado na criação de um formulário, onde o usuário pode adicionar e exluir perguntas nele. Foi utilizado a arquitetura MVC para que no futuro seja criado uma camada view.
### Conhecimentos adquiridos ao longo do desenvolvimento:
+ Maior domínio da biblioteca java.io para manipulação de arquivos, escrita, leitura e criação de pastas.
+ Uso prático de streams, expressões lambda e manipulações de string.
+ Ordenação de listas.
+ Validações da regra de negócio e lançamento de exceções.
+ Arquitetura MVC.
### Funcionalidades
#### Cadastrar usuário
Permite a criação de um novo usuário, com base nos dados solicitados no formulário de cadastro, ao ser cadastrado será criado um arquivo txt com o nome do usuário e seus dados no momento de cadastro.<br>
![Pasted image 20231217201617](https://github.com/pauloherbt/JavaStudies/assets/101981462/4416231c-76d2-4a20-ba25-a5bc6cb6b86c)

#### Listar usuários
Permite exibir no terminal o nome de todos os usuários cadastrados, a partir dos arquivos .txt com seus respectivos dados.
![Pasted image 20231217201938](https://github.com/pauloherbt/JavaStudies/assets/101981462/24c6ba8b-3074-4052-a9be-f9642b8cbe9d)

#### Buscar usuários por nome
Foi implementado a função de pesquisa por nome, se for digitado "pa", será listado todos os usuários cujo nome começa com "pa".
#### Cadastrar pergunta no formulário
O usuário também pode adicionar uma nova pergunta ao formulário de cadastro, com isso os novos cadastrados terão que responde-la no cadastro. A alteração é salva no arquivo .txt do formulario
#### Deletar pergunta do formulário
É possível deletar uma pergunta do formulário, contanto que ela não seja uma das 4 perguntas obrigatórias para o cadastro de um usuário.
