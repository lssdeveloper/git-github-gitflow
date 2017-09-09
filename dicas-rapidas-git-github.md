# Curso de Git e GitHub (UDEMY)

### Resumo

git clone `<url>`

git init

git status

git add .

git add `<file-pasta>`

git commit -m `''`

git push

git branch

git branch `<feature/novo_branch>`

git checkout --`<arquivo>`

git checkout `<ramo>`

git push -u origin `<feature/novo_branch>`

git pull

git fetch

git merge `<feature/update_master>`

git branch -D `<feature/novo_branch>`

git rm -r .

git log

git tag `<1.0>`

## Dicas:
#### Comandos de acessos Rápidos

Para excluir um projeto no github entre em confiurações e exclua o memso.

Para excluir uma pasta rastreada pelo git simplesmente apague a pasta oculta .git se não quiser excluir toda a pasta na máquina e ou então exclua toda a pasta local.

git status => informa o branch (ramo) atual utilizado, informa o status se está atualizado (up-to-date) e se há algum commit a ser realizado, se algum arquivo foi adicionado, se arquivo foi modificado, enfim um comando bastante utilizado.

git add .=> adiciona todos os arquivos e ou pasta.

git add `<file>` => adiciona somente um aqruivo ou pasta.

git commit -m `‘    ‘`=>  faz o commit do projeto.

git push => upa as alterações para o github

git branch => informa todos os branches existente e se estiver em verde com * é o que está sendo utilizado no momento.

git branch feature/projeto_produto => cria um branch secundário, quando forem trabalhar em projeto isolado, ou um outro desenvolvedor está trabalhando isoladamente, no caso se precisar realizar um merge com o master cria-se então um branch secundário, geralmente o branch MASTER é utilizado para exibir o projeto no contexto total e então um release (TAG) é criado a aprtir dos respectivos merges dos secundários.

OBS: é possível criar um merge pelo github também, como padrão de nomenclatura usa-se o feature/nome_projeto

git checkout – `<arquivo>`  => descarta a mudança realizada no arquivo local

git checkout feature/projeto_produto => alterna entre os branch. neste caso estou direcionando o branch para feature/projeto.

git push -u origin feature/projeto => upando o branch secundário para o github.

Git pull => baixando um commit do github

Git fetch => atualizando as brands locais

Git merge => é quando uma branch especial (secundária) está voltando para a master, com todo o seu código especial, o merge pode ser feito pelo github ou pelo terminal, sendo que pelo github conta com um sistema de revisão e aprovação, ou seja este é um procedimento mas complexo.

Sempre no final do merge de um git push para subir as atualizações para o github.

**Obs:** sempre que for fazer o merge verificar o branch pois o mesmo deve estar sempre no master ou naquele que ira receber as atualizações.

*Ex:* foi feita atualizações no update_template e agora quero fazer um merge para o master

mas é possível também que exista a seguinte situação um terceiro branch que irá realizar um merge com o segundo branch e depois um merge com o master.

**DICA:** Terminou o merge com sucesso os commit estão iguais tanto no master quanto na secundária remova a  branch secundária.

Eu prefiro remover a branch no github,e depois pelo teminal.

`git branch -D feature/update_template`

**IMPORTANTE:**

Sempre que criar uma feature nova (nova branch) ela será sempre uma cópia atual do branch master ou seja um clone da master.


**Como resolver problemas de conflito**

*Solução 1:* 

`merge (Não aconselhado pois faz uma bagunça no log)`

*Solução 2:* rebase
 `git cherry-pick => selecionando commits, de alguma branch.`


git reset => comando para reverter mudanças na sua branch

**Obs:** ele apaga os commits mas não apaga o trabalho realizado em arquivos.

É importante quando forma feitos vários commits numa mesmo arquivo e no fim do dia você quer limpar todos estes commits deixando apaenas um mais evidente e definido.

git clean -f => diferente do rm (remove este os tracks rastreados) o clean irá apagar definitivamente o arquivo em si.

Quando der um git status o github vai avisar que ele está a frente ou que eu esteja atrás dele.

Então neste caso daremos um git push -f 

git push -f => é um push forçado para que não haja reclamação de diferenças e ou conflitos, ou seja vai considerar o histórico local e não o do github.

git reset HEAD-2 => aqui está voltando dois commits (apagando) do HEAD.

**OBS:** para efetivar estes comandos sempre se faz necessário o comando PUSH no fim, pois o github só reconhece as atualizações a paritir de um pusch, claro uma vez feito push não há reversão e se não foi feito push as alterações ainda estão salvas.

git stash / git pop => salvando seu trabalho

git stash => limpa o diretótio sem que eu perca os arquivos que estou mudando.

git stash pop => volta o estágio inicial passo a passo