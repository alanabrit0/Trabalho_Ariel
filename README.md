# Implementação de Pilha e Fila em Java utilizando Arrays

**Aluna:** Alana Escobar de Brito  
**Disciplina:** Estruturas de Dados  

---

## 🎯 Objetivo
Desenvolver a compreensão prática das estruturas de dados **Pilha** e **Fila**, implementando ambas manualmente em Java, utilizando **arrays** como estrutura base, sem uso de classes prontas como `Stack`, `Queue`, `ArrayList`, `LinkedList` ou similares.

Este projeto consiste em um sistema didático que demonstra o funcionamento das estruturas de dados **Pilha (LIFO)** e **Fila (FIFO)**.  
O programa possui um **menu interativo no console** que permite ao usuário escolher qual estrutura deseja testar e executar as operações disponíveis.

---

## 📂 Estrutura do Projeto
- **Principal.java** → Classe principal com o menu interativo  
- **PilhaArray.java** → Implementação da pilha usando array  
- **FilaArray.java** → Implementação da fila usando array  

---

## ⚙️ Funcionalidades da Pilha
- `push()` → Empilhar um elemento  
- `pop()` → Desempilhar um elemento  
- `peek()` → Visualizar o elemento do topo  
- `isEmpty()` → Verificar se a pilha está vazia  
- `isFull()` → Verificar se a pilha está cheia  
- `display()` → Exibir todos os elementos da pilha  
- `clear()` → Limpar a pilha *(desafio extra)*  
- `size()` → Exibir quantidade de elementos *(desafio extra)*  

---

## ⚙️ Funcionalidades da Fila
- `enqueue()` → Inserir um elemento na fila  
- `dequeue()` → Remover um elemento da fila  
- `front()` → Visualizar o primeiro elemento  
- `isEmpty()` → Verificar se a fila está vazia  
- `isFull()` → Verificar se a fila está cheia  
- `display()` → Exibir todos os elementos da fila  
- `clear()` → Limpar a fila *(desafio extra)*  
- `size()` → Exibir quantidade de elementos *(desafio extra)*  
- Implementação de **fila circular** *(desafio extra)*  

---

## 🔎 Como funciona

### 🧱 Pilha
- Segue a lógica **LIFO (Last In, First Out)** → o último elemento inserido é o primeiro a sair.  
- Controlada pela variável **topo**, que indica a posição do último elemento.  
- Exemplo: Inserir `10, 20, 30` → topo = `30`.  
  - Ao remover (`pop`), o `30` sai primeiro, restando `10` e `20`.  

### 🚦 Fila
- Segue a lógica **FIFO (First In, First Out)** → o primeiro elemento inserido é o primeiro a sair.  
- Controlada pelas variáveis **início** e **fim**.  
- Exemplo: Inserir `10, 20, 30` → início = `10`, fim = `30`.  
  - Ao remover (`dequeue`), o `10` sai primeiro, restando `20` e `30`.  

👉 Em resumo:  
- **Pilha** funciona como uma pilha de pratos: o último colocado é o primeiro retirado.  
- **Fila** funciona como uma fila de pessoas: o primeiro que entra é o primeiro que sai.  

---

## ✨ Melhorias implementadas
- Usuário define o tamanho da pilha e da fila no início do programa.  
- Opção para limpar pilha e fila.  
- Exibição da quantidade de elementos atuais.  
- Implementação da fila circular.  
- Interface textual do menu melhorada.  
- Validação de entradas do usuário.  

---

## ▶️ Como compilar e executar

### Pré-requisitos
- Ter um APP instalado que funcione o JAVA
- Ter um terminal/console disponível 
- Estar dentro da pasta do projeto onde estão os arquivos `.java`.

### Passo 1 – Compilar
No terminal, digite o que se pede, como:
- Tamanho pilha;
- Tamanho fila;
- Escolha no menu interativo;
E assim por diante, empilhando ou enfileirando os elementos conforme a estrutura.




