## Comandos básicos do GIT:

Clonar um projeto:

```
git clone https://github.com/dedecastrobr/<NOME_DO_PROJETO>.git

```

Criar uma branch para efetuar as alterações:

```
cd <NOME_DO_PROJETO>
git checkout -b <NOME_DA_BRANCH>

```

Se tudo correr bem você deve ver algo assim:

```
Switched to a new branch '<NOME_DA_BRANCH>'

```

Para verificar a branch atual digite:

```
git branch

```

E verá algo como:

```
* <NOME_DA_BRANCH>
  master
```

Para mudar para uma branch digite:

```
git checkout <NOME_DA_BRANCH>
```

Para commitar basta seguir os passos normais e depois informar a branch que está sendo enviada no push, por exemplo:

```
git add .
git commit -m "Minhas alterações na branch."
git push origin <NOME_DA_BRANCH>
```
