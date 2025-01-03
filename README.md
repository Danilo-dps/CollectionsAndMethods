# Collections and Methods
## List, Set, Map são interfaces ideais para coleções, e aqui será tratado um pouco desse comportamento

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

# List `<T>`

- Representa uma coleção ordenada de elementos
- Permite elementos duplicados
- Mantém a ordem de inserção dos elementos
- Acesso e modificação de elementos por índice
- Oferece métodos para manipulação de sublistas, busca de elementos e iteração eficiente

## Principais Implementações

- **ArrayList**: baseado em array dinâmico, oferece acesso rápido por índice (operações O(1) para acesso), mas inserções e remoções podem ser lentas (operações O(n))
- **LinkedList**: baseado em lista duplamente encadeada, permite inserções e remoções rápidas (operações O(1) para inserção/remoção), mas acesso por índice é mais lento (operações O(n))
- **Vector**: similar ao `ArrayList`, mas sincronizado para garantir segurança em ambientes com múltiplas threads (menos utilizado hoje em dia em comparação ao `ArrayList`)

# Set `<T>`

- Representa um conjunto de elementos (similar ao da Álgebra)
- Não admite repetições
- Elementos não possuem posição
- Acesso, inserção e remoção de elementos são rápidos
- Oferece operações eficientes de conjunto: interseção, união, diferença.

## Principais Implementações

- `HashSet` - mais rápido (operações O(1) em tabela hash) e não ordenado
- `TreeSet` - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo `compareTo` do objeto (ou `Comparator`)
- `LinkedHashSet` - velocidade intermediária e elementos na ordem em que são adicionados

# Map `<K, V>`

- Representa uma coleção de pares chave-valor
- Não permite chaves duplicadas, mas permite valores duplicados
- Cada chave está mapeada para exatamente um valor
- Oferece métodos eficientes para buscar, inserir e remover pares chave-valor

## Principais Implementações

- **HashMap**: baseado em tabela hash, oferece desempenho rápido para operações de busca, inserção e remoção (operações O(1)), mas não mantém a ordem dos elementos
- **TreeMap**: baseado em árvore rubro-negra, mantém as chaves ordenadas de acordo com a ordem natural ou um `Comparator` fornecido (operações O(log(n)))
- **LinkedHashMap**: combinação de `HashMap` e lista duplamente encadeada, mantém a ordem de inserção das entradas (operações O(1) para busca, inserção e remoção)

# Log entry 
- Nesse exercício resolvido, a ideia é ver quantos usuários diferentes acessaram a plataforma
- Como aqui não importa ordem, apenas saber quais são diferentes, o `set`, com a implementação `HashSet` já resolve.

# Stock 
- Nesse exercício resolvido, a ideia é ver se determinado produto já foi inserido na coleção

# Votes
- Nesse exercício, a ideia e fazer uma contagem de votos