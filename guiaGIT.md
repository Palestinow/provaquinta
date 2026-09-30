# Guia rápido de Git

## 1. Configuração inicial

Ver usuário e email:

```bash
git config --global user.name
git config --global user.email
```

Configurar:

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
```

---

## 2. SSH do GitHub

Verificar se já existe uma chave:

```bash
ls ~/.ssh/
```

Se aparecer `id_ed25519` e `id_ed25519.pub`, a chave já existe.

Testar conexão:

```bash
ssh -T git@github.com
```

Se perguntar:

```text
Are you sure you want to continue connecting?
```

Digite:

```text
yes
```

Se aparecer:

```text
Hi SEU_USUARIO! You've successfully authenticated...
```

O SSH está funcionando.

---

## 3. Verificar se o projeto usa SSH ou HTTPS

Dentro do projeto:

```bash
git remote -v
```

HTTPS:

```text
https://github.com/usuario/repositorio.git
```

SSH:

```text
git@github.com:usuario/repositorio.git
```

Para trocar HTTPS por SSH:

```bash
git remote set-url origin git@github.com:usuario/repositorio.git
```

Depois confira:

```bash
git remote -v
```

### Erro: `Password authentication is not supported`

Se aparecer:

```text
remote: Invalid username or token.
remote: Password authentication is not supported for Git operations.
```

O projeto provavelmente está usando HTTPS.

Faça:

```bash
git remote -v
git remote set-url origin git@github.com:usuario/repositorio.git
ssh -T git@github.com
git push
```

---

## 4. Erro: `credential-manager-core`

Se aparecer:

```text
git: 'credential-manager-core' não é um comando git
```

Confira:

```bash
git config --global --get credential.helper
```

Se você estiver usando SSH, pode remover o gerenciador:

```bash
git config --global --unset credential.helper
```

Depois confira:

```bash
git config --global --get credential.helper
```

---

# Branches

## 5. Ver a branch atual

```bash
git branch
```

A branch com `*` é a atual.

Também:

```bash
git status
```

---

## 6. Criar uma branch e entrar nela

```bash
git switch -c nome-da-branch
```

Exemplo:

```bash
git switch -c detalhes
```

Isso cria a branch e já entra nela.

---

## 7. Trocar de branch

```bash
git switch main
```

ou:

```bash
git switch detalhes
```

---

## 8. Criar uma branch a partir da `main` atualizada

```bash
git switch main
git pull
git switch -c nova-feature
```

---

# Commit e Push

## 9. Ver alterações

```bash
git status
```

Ver exatamente o que mudou:

```bash
git diff
```

---

## 10. Adicionar arquivos para o commit

Adicionar tudo:

```bash
git add .
```

Adicionar um arquivo específico:

```bash
git add arquivo.kt
```

---

## 11. Criar um commit

```bash
git commit -m "mensagem do commit"
```

Exemplo:

```bash
git commit -m "adiciona detalhes dos livros"
```

---

## 12. Enviar para o GitHub

Se a branch já estiver configurada:

```bash
git push
```

Na primeira vez que enviar uma branch:

```bash
git push -u origin nome-da-branch
```

Exemplo:

```bash
git push -u origin detalhes
```

Depois disso:

```bash
git push
```

### Importante

Se estiver na branch `detalhes`:

```bash
git push origin detalhes
```

envia para `detalhes`.

Isso **não altera a `main`**.

---

# Pull e Push

## 13. `git pull`

Baixa as alterações do GitHub para o computador:

```bash
git pull
```

**GitHub → computador**

---

## 14. `git push`

Envia seus commits para o GitHub:

```bash
git push
```

**Computador → GitHub**

---

# Conflitos e erros

## 15. Erro `non-fast-forward`

Exemplo:

```text
! [rejected] main -> main (non-fast-forward)
```

Significa que existem alterações no GitHub que você ainda não possui localmente.

Tente:

```bash
git pull
```

Depois:

```bash
git push
```

Se houver conflito, resolva os arquivos conflitantes antes de continuar.

---

## 16. Conflito de merge

Pode aparecer:

```text
CONFLICT (content)
```

Veja quais arquivos estão em conflito:

```bash
git status
```

Dentro do arquivo pode aparecer:

```text
<<<<<<< HEAD
seu código
=======
código do GitHub
>>>>>>> origin/main
```

Escolha/corrija o código que deve permanecer.

Depois:

```bash
git add .
git commit
git push
```

---

# Desfazer alterações

## 17. Desfazer alteração antes do `git add`

Para um arquivo:

```bash
git restore arquivo.kt
```

Para todos:

```bash
git restore .
```

⚠️ Isso apaga as alterações locais desses arquivos.

---

## 18. Desfazer `git add`

Se você fez:

```bash
git add .
```

e quer tirar os arquivos do staging:

```bash
git restore --staged .
```

As alterações nos arquivos continuam existindo.

---

## 19. Corrigir a mensagem do último commit

```bash
git commit --amend -m "nova mensagem"
```

---

## 20. Desfazer o último commit mantendo as alterações

```bash
git reset --soft HEAD~1
```

---

## 21. Desfazer o último commit e tirar do staging

```bash
git reset HEAD~1
```

⚠️ Cuidado com:

```bash
git reset --hard HEAD~1
```

O `--hard` pode apagar alterações.

---

# Branches remotas

## 22. Ver todas as branches

```bash
git branch -a
```

---

## 23. Atualizar informações do GitHub

```bash
git fetch
```

---

## 24. Apagar branch local

```bash
git branch -d nome-da-branch
```

Forçar:

```bash
git branch -D nome-da-branch
```

⚠️ `-D` força a exclusão.

---

## 25. Apagar branch do GitHub

```bash
git push origin --delete nome-da-branch
```

Exemplo:

```bash
git push origin --delete detalhes
```

Isso apaga somente a branch `detalhes`, não a `main`.

---

# Atualizar uma branch com a `main`

Se você está trabalhando em `detalhes` e quer trazer as alterações mais recentes da `main`:

```bash
git switch main
git pull
git switch detalhes
git merge main
```

Se houver conflitos, resolva-os e depois:

```bash
git add .
git commit
```

---

# Histórico

## 26. Ver histórico de commits

```bash
git log --oneline
```

Visualização em gráfico:

```bash
git log --oneline --graph --all
```

---

# Verificar alterações

## 27. Antes do `git add`

```bash
git diff
```

## Depois do `git add`

```bash
git diff --staged
```

---

# Fluxo padrão de trabalho

Na maioria dos projetos, o fluxo será:

```bash
git switch main
git pull

git switch -c minha-feature

# fazer alterações no código

git status
git add .
git commit -m "adiciona minha feature"
git push -u origin minha-feature
```

Depois, no GitHub, pode ser criado um **Pull Request** para juntar a branch na `main`.

---

# Fluxo diário depois que a branch já existe

```bash
git status
git pull

# fazer alterações

git status
git add .
git commit -m "descreve a alteração"
git push
```

---

# Comandos mais importantes para decorar

```bash
git status
git branch
git switch nome-da-branch
git switch -c nova-branch
git add .
git commit -m "mensagem"
git pull
git push
git remote -v
git log --oneline
git diff
```

---

# Se der algum erro

Antes de tentar comandos aleatórios, rode:

```bash
git status
git branch
git remote -v
```

E leia a mensagem de erro.

Esses três comandos normalmente mostram:

- em qual branch você está;
- quais arquivos foram alterados;
- quais arquivos estão preparados para commit;
- se existem conflitos;
- qual é o endereço do GitHub;
- se o projeto está usando SSH ou HTTPS.

**Regra de ouro:** se não souber o que um comando vai fazer, não use `reset --hard`, `push --force` ou comandos de exclusão antes de entender o estado do projeto.
