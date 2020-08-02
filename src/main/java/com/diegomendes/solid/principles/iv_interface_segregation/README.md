**Interface Segregation Principle**
- Uma classe não deve ser forçada a implementar interfaces e métodos que não irá utilizar

Cenário do código: Imagine um cenário no qual você deseja calcular o preço de 
aluguel para cada inquilino através de uma tabela de preço, mas futuramente você também 
terá uma nova tabela de Preço Diferenciada para alguns clientes. Neste cenário todos que 
tiverem Aluguel padrão não deverão pagar a taxa de água que custa R$ 50,00 
de desenvolvimento disso.

