**Liskov Substitution Principle**
- Uma classe derivada deve ser substituível por sua classe base
- Classes filhas devem respeitar os contratos estabelecidos pelas classes pai

Cenário do código: Imagine um cenário de um banco, onde existem 2 tipos de conta: ContasComum e ContasEstudante. 
A ideia é mostrar um cenário utilizando herança para mostrar que ContaEstudante É UMA ContaComum, e os perigos de usar essas abordagem.
ContaEstudante não pode `render` e a ContaComum pode `render`.

