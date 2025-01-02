# Collections And Methods

# Comparação de Dados em Java

## String Pool em Java
- **Strings Literais**:
  - Strings criadas de forma literal, como `String s1 = "Test";`, são armazenadas em um pool especial de memória chamado "String Pool".
  - Exemplo:
    ```java
    String s1 = "Test";
    String s2 = "Test";
    ```
    Neste caso, `s1` e `s2` apontam para a mesma localização de memória no pool de Strings, então `s1 == s2` será `true`.

- **Strings Instanciadas com `new`**:
  - Strings criadas com a palavra-chave `new` são criadas no heap e não são automaticamente armazenadas no String Pool. No entanto, se a string já existir no pool, o `new` retornará a referência para o objeto existente no pool.
  - Exemplo:
    ```java
    String s3 = new String("Test");
    String s4 = new String("Test");
    ```
    Aqui, `s3` e `s4` são diferentes instâncias na memória, portanto, `s3 == s4` será `false`, mas `s3.equals(s4)` será `true`.

- **Por Que Isso Importa?**:
  - **Eficiência de Memória**: O uso do String Pool economiza memória, pois Strings imutáveis com o mesmo conteúdo não são duplicadas.
  - **Comparação de Strings**: Para comparar Strings por conteúdo, sempre use `equals()` em vez de `==`, a menos que você tenha certeza de que elas são do String Pool.

## `equals()` e `hashCode()`

- **`equals()`**: Compara o conteúdo dos objetos. Se dois objetos possuem o mesmo conteúdo, `equals()` retornará `true`.
- **`hashCode()`**: Também está relacionado ao conteúdo dos objetos. Dois objetos que são considerados iguais segundo o método `equals()` devem retornar o mesmo valor de `hashCode()`. Isso é crucial para o correto funcionamento de coleções baseadas em hash, como `HashMap` e `HashSet`.

## Operador `==`

- **Tipos Primitivos**: Para tipos primitivos como `int`, `float`, `char`, etc., o operador `==` compara os valores diretamente.
- **Tipos de Referência**: Para objetos (tipos de referência), o operador `==` compara as referências de memória. Isso significa que ele verifica se os dois objetos apontam para a mesma localização de memória, e não se o conteúdo dos objetos é igual.

## Resumo

- **`equals()` e `hashCode()`**: Comparação de conteúdo.
- **`==`**:
  - Tipos primitivos: Comparação de valores.
  - Tipos de referência: Comparação de referências de memória.

# Set `<T>`
- Set é uma interface
- Representa um conjunto de elementos (similar ao da Álgebra)
- Não admite repetições
- Elementos não possuem posição
- Acesso, inserção e remoção de elementos são rápidos
- Oferece operações eficientes de conjunto: interseção, união, diferença.
- Principais implementações:
  - `HashSet` - mais rápido (operações O(1) em tabela hash) e não ordenado
  - `TreeSet` - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
  compareTo do objeto (ou Comparator)
  - `LinkedHashSet` - velocidade intermediária e elementos na ordem em que são adicionados 