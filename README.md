# Exercícios para a aula de 17/05

Este projeto é uma versão modificada da que criamos em aula para trabalhar com SQL nos programas em Java. Ele deve funcionar sem problemas com o banco de dados que você tem e com a tabela de alunos existente.


Você deve baixar o projeto e commitar suas alterações em uma branch como seu nome. As instruções para trabalhar com o git e a sua branch podem ser encontradas [clicando aqui](Git.md).

Depois de baixar o projeto e criar a sua branch, importe o projeto no eclipse execute as tarefas abaixo.

# Tarefas

* Altere a classe "DBConnection" e configure as variáveis USER e PASSWD com seu usuário e senha do seu banco local;


* Implemente o método "create()" da classe Aluno. Ele deve efetuar o insert na tabela alunos do seu banco e exibir as informações inseridas em caso de sucesso. Dica: Use os atributos da classe para obter os valores do insert;


* Implemente o método "listarAlunos()" da classe DadosBancoTasks. Ele deve mostrar uma listagem de alunos;


* Note que a classe Aluno tem dois construtores. Um deles recebe um long "matricula". A ideia desse construtor é criar um objeto com base no resultado de uma consulta ao banco. Ao instanciar um Aluno já informando a matricula, o programa tenta buscar um aluno com aquela matrícula. Por isso, o construtor tem um "ResultSet" que espera ser preenchido pelo método "getByMatricula()". Você deve implementar esse método. Ele vai buscar com um select pela matricula, caso encontre retorna o "ResultSet" encontrado. Utilizando o ResultSet retornado pelo método, você deve terminar de implementar o construtor, preenchendo os atributos, com os valores do banco. Dica: Lembre que o ResultSet é um conjunto de linhas e colunas e pode ter seus valores extraídos diretamente atráves de "getString()", "getLong()" e etc.
 

* Crie um menu utilizando a classe Menu.java para acessar as funcionalidades implementadas. O menu deve ser ter as seguintes opções: "Inserir Aluno",  "Listar Alunos" e "Buscar por Matrícula";







# Bom trabalho!