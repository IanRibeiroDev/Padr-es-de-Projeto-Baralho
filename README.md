## Gerador de Baralhos - Padrões de Projeto

### Grupo: Ian, Márcio e Ricardo

### 1. Abstract Factory (Fábrica Abstrata)

**Objetivo:** Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

**Aplicação:**

- A interface `Baralho` define a estrutura básica de um baralho, enquanto as classes concretas `BaralhoTradicional` e `BaralhoUno` implementam a criação das cartas específicas de cada jogo.
- A classe `BaralhoFactory` fornece um ponto único de acesso para a criação de diferentes tipos de baralhos, encapsulando a lógica de instanciação das classes concretas.

**Justificativa:**

- Permite adicionar novos tipos de baralhos facilmente, sem modificar o código existente.
- O cliente (ex: `MainBaralho`) não precisa conhecer os detalhes de implementação de cada tipo de baralho, apenas interage com a fábrica abstrata.

### 2. Factory Method (Método de Fábrica)

**Objetivo:** Definir uma interface para criar objetos, mas deixar que as subclasses decidam quais classes instanciar.

**Aplicação:**

- O método abstrato `criarCartas()` na classe abstrata `Baralho` define a operação para criar as cartas do baralho.
- Cada subclasse (`BaralhoTradicional`, `BaralhoUno`) implementa o método `criarCartas()` para gerar as cartas específicas do seu tipo de baralho.

**Justificativa:**

- Centraliza a lógica de criação das cartas na classe base `Baralho`, evitando duplicação de código.
- Permite que cada subclasse defina a implementação específica para criar suas cartas, garantindo flexibilidade na criação de diferentes tipos de baralho.