# Desafio Combate

## Descrição do Desafio
Em um jogo de combate, cada jogador controla um campeão, que possui os seguintes atributos:
- **Nome**
- **Ataque**
- **Armadura**
- **Vida**

O combate ocorre em turnos, onde:
- Cada campeão ataca o outro simultaneamente em cada turno.
- A batalha termina quando um dos campeões perde toda a sua vida (vida igual a 0).

### Regras para o cálculo de dano:
1. A vida de um campeão A deve ser reduzida pela quantidade de ataque do campeão B, descontada a armadura de A.
2. **Vida mínima**: Mesmo que a armadura de A seja maior ou igual ao ataque de B, A sempre perderá pelo menos 1 de vida.
3. A vida resultante não pode ser menor que 0.

O programa deve:
- Instanciar dois campeões com seus atributos.
- Executar N turnos de combate.
- Mostrar a cada turno o status de ambos os campeões.
- Finalizar o combate ao término da vida de qualquer campeão, exibindo a mensagem `FIM DO COMBATE`.

---

## Estrutura do Projeto

### Classe: **Champion**
Responsável por representar os campeões e as regras de combate.

#### **Atributos**:
- `name: String` - Nome do campeão.
- `life: int` - Quantidade de vida.
- `attack: int` - Quantidade de ataque.
- `armor: int` - Quantidade de armadura.

#### **Métodos**:
- `takeDamage(other: Champion): void`  
  Calcula o dano recebido do outro campeão e reduz a vida, conforme as regras mencionadas.

- `status(): String`  
  Retorna o nome do campeão e sua situação de vida. Caso a vida seja igual a 0, retorna a mensagem indicando que o campeão "morreu".

---

## Exemplo de Uso

### Entrada:
```text
Digite os dados do primeiro campeão:

Nome: Darius
Vida inicial: 50
Ataque: 8
Armadura: 1

Digite os dados do segundo campeão:
Nome: Fiora
Vida inicial: 40
Ataque: 10
Armadura: 2

Quantos turnos você deseja executar? 2
```

### Saída:
```text
Resultado do turno 1:
Darius: 41 de vida
Fiora: 34 de vida

Resultado do turno 2:
Darius: 32 de vida
Fiora: 28 de vida

FIM DO COMBATE
```

## Tecnologias Utilizadas
![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
