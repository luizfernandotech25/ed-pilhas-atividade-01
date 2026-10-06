# Atividade 01 — Estrutura de Dados: Pilhas

## 1. Identificação

**Curso:** Tecnologia em Sistemas para Internet (TSI)
**Componente curricular:** Estrutura de Dados 1
**Atividade:** Atividade 01 — Pilhas
**Instituição:** Instituto Federal Goiano (IF Goiano) — Campus Morrinhos
**Aluno:** Luiz Fernando

---

## 2. Descrição

Este projeto foi desenvolvido como parte das atividades da disciplina de **Estrutura de Dados 1**, com o objetivo de aplicar, em Java, os conceitos fundamentais da estrutura de dados **Pilha (Stack)**.

A atividade consiste em utilizar uma pilha para inverter os caracteres de cada palavra de uma frase, mantendo a ordem original das palavras.

A implementação foi realizada utilizando uma estrutura de pilha própria, baseada em um vetor de caracteres (`char[]`) e em um índice que representa o topo da pilha.

---

## 3. Objetivos

### Objetivo geral

Aplicar o conceito de estrutura de dados do tipo **Pilha**, utilizando o princípio **LIFO (Last In, First Out)**, em uma aplicação desenvolvida em Java.

### Objetivos específicos

- Compreender o funcionamento de uma estrutura LIFO;
- Implementar uma pilha utilizando `char[]`;
- Implementar as operações de inserção (`push`) e remoção (`pop`);
- Controlar o estado da pilha por meio do índice `topo`;
- Utilizar a pilha para inverter os caracteres de uma palavra;
- Processar uma frase mantendo a ordem original das palavras;
- Aplicar conceitos de programação orientada a objetos e organização de código;
- Utilizar Git e GitHub para controle de versão e disponibilização do projeto.

---

## 4. Fundamentação

Uma **Pilha** é uma estrutura de dados linear baseada no princípio **LIFO — Last In, First Out**, no qual o último elemento inserido é o primeiro elemento removido.

Neste projeto, a pilha é utilizada para explorar diretamente esse comportamento. Os caracteres de cada palavra são inseridos sequencialmente na estrutura. Ao realizar as operações `pop`, os caracteres são retirados na ordem inversa àquela em que foram inseridos, produzindo a palavra invertida.

### Operações implementadas

| Operação | Descrição |
|---|---|
| `push()` | Insere um caractere no topo da pilha |
| `pop()` | Remove e retorna o caractere que está no topo |
| `isEmpty()` | Verifica se a pilha está vazia |

---

## 5. Funcionamento da solução

Para cada palavra da frase, o programa executa as seguintes etapas:

1. Cria uma nova pilha com capacidade equivalente ao tamanho da palavra;
2. Percorre os caracteres da palavra;
3. Insere cada caractere na pilha utilizando `push()`;
4. Remove os caracteres utilizando `pop()`;
5. Constrói a palavra invertida a partir dos caracteres removidos;
6. Adiciona a palavra invertida ao resultado final;
7. Mantém a ordem original das palavras da frase.

### Exemplo

Entrada:

```text
ESTE EXERCICIO E MUITO FACIL
```

Saída:

```text
ETSE OICICREXE E OTIUM LICAF
```

---

## 6. Estrutura do projeto

```text
ed-pilhas-atividade-01/
├── .gitignore
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            └── br/
                └── edu/
                    └── ifgoiano/
                        └── pilhas/
                            ├── EdPilhasAtividade01.java
                            └── Pilha.java
```

### Principais classes

**`Pilha.java`**

Responsável pela implementação da estrutura de dados Pilha, utilizando um vetor de caracteres e o controle do topo da estrutura.

**`EdPilhasAtividade01.java`**

Contém o método principal da aplicação e a lógica responsável pelo processamento da frase e pela inversão dos caracteres de cada palavra.

---

## 7. Tecnologias e ferramentas

- **Java**
- **JDK 26**
- **Maven**
- **Apache NetBeans**
- **Git**
- **GitHub**

---

## 8. Execução

Para executar o projeto localmente, é necessário possuir o JDK e o Maven instalados.

Clone o repositório:

```bash
git clone https://github.com/luizfernandotech25/ed-pilhas-atividade-01.git
```

Acesse o diretório:

```bash
cd ed-pilhas-atividade-01
```

Compile o projeto utilizando Maven:

```bash
mvn clean package
```

A execução também pode ser realizada diretamente pelo Apache NetBeans.

---

## 9. Controle de versão

O projeto utiliza **Git** para controle de versão e **GitHub** para hospedagem do código-fonte.

O desenvolvimento foi organizado em commits, permitindo registrar a evolução da implementação e manter o projeto sincronizado com o repositório remoto.

Commit principal da implementação:

```text
1bd1ccf feat: implementa inversao de palavras com pilha
```

---

## 10. Considerações finais

A atividade possibilitou a aplicação prática dos conceitos fundamentais de estruturas de dados, especialmente o comportamento **LIFO** característico das pilhas.

A implementação demonstra como uma estrutura de dados simples pode ser utilizada para resolver um problema de manipulação de caracteres, reforçando conceitos de algoritmos, orientação a objetos, organização de código e controle de versão.

---

## 11. Autor

**Luiz Fernando**
Tecnologia em Sistemas para Internet — Instituto Federal Goiano (IF Goiano)
