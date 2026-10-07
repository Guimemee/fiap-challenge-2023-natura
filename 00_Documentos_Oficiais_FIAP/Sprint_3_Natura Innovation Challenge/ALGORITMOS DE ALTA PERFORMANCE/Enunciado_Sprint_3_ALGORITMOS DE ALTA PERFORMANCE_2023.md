# Challenge Sprint 3 - ALGORITMOS DE ALTA PERFORMANCE

**Título do Challenge:** Natura Innovation Challenge
**Turma:** 2ECB | **Ano:** 2023
**Período para Entrega:** 08/09/2023
                                            -
                                            29/09/2023
**Status:** NOTA: 95
**Cabeçalho Original:** ALGORITMOS DE ALTA PERFORMANCE - Sérgio Ricardo Rota NOTA: 95

## 1. Enunciado e Instruções do Professor

Dentro do ambiente da loja conceito da Natura, clientes que participam de uma determinada experiência, devem cadastrar um login para poder interagir e, depois receber seu prêmio. Neste cenário, faça um programa que receba o nome completo de um cliente e gere como saída seu login, sempre com letras minúsculas. Segue a regra para geração do login: (1) 1ª letra do primeiro nome + último sobrenome; (2) Caso existam dois nomes OU dois sobrenomes, deve-se gerar 1ª letra do primeiro nome + 1ª letra do primeiro nome/sobrenome + sobrenome; e (3) caso existam três OU mais nomes/sobrenomes, deve-se proceder como no item (2).

Exemplos:

nome:  Isaac Newton

login: inewton

nome:  Rosalind Elsie Franklin

login: refranklin

nome:  Niels Henrik David Bohr

login: nhbohr

 

Além do login, o programa também deve gerar, de forma completamente aleatória, uma “senha forte” de 20 caracteres, contendo 5 letras maiúsculas, 5 letras minúsculas, 5 dígitos e 5 caracteres especiais.

Exemplos:

h@n3wV1.e5LrUAK89.;,

KDD6=85>pBGt{=9EUY33qSxo6y8{B#@&(e

 

A fim de aumentar a segurança do sistema, a senha que será efetivamente atribuída aos clientes deve ser a “senha forte” gerada inicialmente com todos os seus caracteres invertidos através da utilização de uma pilha. Ou seja, por exemplo, caso a “senha forte” gerada tenha sido "9EUY33qSxo6y8{B#@&(e" a senha que será efetivamente atribuída ao cliente será "e(&@#B{8y6oxSq33YUE9".

