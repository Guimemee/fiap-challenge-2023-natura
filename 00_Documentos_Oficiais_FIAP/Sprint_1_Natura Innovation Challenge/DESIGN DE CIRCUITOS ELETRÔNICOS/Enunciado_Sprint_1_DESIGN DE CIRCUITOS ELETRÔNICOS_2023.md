# Challenge Sprint 1 - DESIGN DE CIRCUITOS ELETRÔNICOS

**Título do Challenge:** Natura Innovation Challenge
**Turma:** 2ECB | **Ano:** 2023
**Período para Entrega:** 14/05/2023
                                            -
                                            05/11/2023
**Status:** NÃO ENTREGUE
**Cabeçalho Original:** DESIGN DE CIRCUITOS ELETRÔNICOS - Nivaldo Zafalon Junior NÃO ENTREGUE

## 1. Enunciado e Instruções do Professor

**1)           Introdução**

               Neste ano o Challenge do 2EC envolve, o a melhoria da experiência em lojas Natura. Que tal usarmos displays de LED para este desafio? Esta disciplina propõe projetar e simular um sistema baseado em painel de LED para informar quantas pessoas já levaram um determinado produto em destaque no dia.

Painéis de LED painéis diferem em tecnologia sendo os mais comuns painéis capazes de mostrar números decimais em displays de LED, veja **Figura 1**.

**Figura 1 –** Painéis de LED.

 

               Projete e simule um painel destes!

 

**2)           Teoria:**

**               2.1)        Display de LED de sete segmentos**

               Displays de LED de sete segmentos, também chamados apenas por displays de sete segmentos ou displays de LED, são arranjos de LEDs que corretamente ente acedidos exibem o dígito decimal desejado podendo ainda exibir os símbolos da base hexadecimal ou até mesmo símbolos especiais a depender de sua construção. Vamos ficar com os mais simples! A **Figura 2** apresenta alguns displays de LED.

**Figura 2 –** Displays de LED de 7 segmentos.

               Os displays de LED de sete segmentos possuem, para a geração dos caracteres, 8 LEDs que podem ser comandados independentemente e, para cada LED um pino de acionamento próprio. Adicionalmente eles possuem um pino comum conectado ao anodo de todos os LEDs ou ao catodo de todos os LEDs. Muito frequentemente o pino comum aparece duplicado, meramente por uma questão de construção e basta usar apenas 1. Por fim, dependendo do tamanho do display, pode-se ter muitos LEDs para cada segmento e, nesse caso, é necessário usar um driver de acionamento para fornecer a energia capaz de acender os segmentos. Vamos ficar com os modelos mais simples:

*             Dois pinos comuns conectados ao catodo (polo negativo) de todos os LEDs;

*             Um pino para cada segmento mais um pino para o ponto decimal (dot pitch – DP), que não será usado, 10 pinos ao todo;

*             Um único LED por segmento.

 

               A **Figura 3** mostra a pinagem de um display deste tipo, com ela você pode entender a função de cada pino. Ela também mostra como acender um segmento, no caso o segmento A, para tanto é necessário colocar um resistor de 510R entre o pino específico do segmento e a saída lógica que irá acendê-lo. Para cada segmento e mesmo para o DP é necessário um resistor.

**Figura 3 –** Pinagem e conexão dos pinos de um display de LED de sete segmentos.

 

**2.2)        Circuito integrado decodificador binário para decimal – CD4511**

               O CD4511 é um Circuito Integrado (CI) que recebe valores binários de 4 bits, através de 4 entradas nomeadas de A até D e, de acordo com o valor binário comanda sete saídas que, devidamente conectadas aos pinos de um display de LED de sete segmentos mostra o caractere correspondente em decimal. A entrada A é a entrada binária menos significativa. Adicionalmente ele possui uma entrada de controle LT para acender simultaneamente todos os segmentos e testar se eles estão funcionando, uma entrada de controle BI para apagar todos os segmentos e uma última entrada de controle LE para travar o valor mostrado no display.  A **Figura 4** mostra uma fotografia do CI CD4511, sua pinagem e sua tabela verdade.

**Figura 4 –** CD4511.

 

**3)           Desafio**

               A **Figura 5** apresenta um diagrama onde três displays de LED de sete segmentos estão conectados à um arduino por meio de três CIs CD4511.

**Figura 5 –** Diagrama da montagem de três displays de LED de sete segmentos à um arduino UNO R3 por meio de CIs CD4511.

               A partir do diagrama da **Figura 5** com as informações passadas nos itens anteriores monte no Tinkercad um painel de LED com as seguintes especificações:

**a)**           Com 3 displays de LED;

**b)**           Quando inicializado comece mostrando o valor 0000;

**c)**           Que possua um botão conectado ao arduino para incrementar o valor mostrado;

**d)**           Que possua um botão conectado ao arduino para decrementar o valor mostrado;

Não é necessário programar o Arduino, caso o grupo faça isso corretamente, a nota será multiplicada por 1,2, caso a nota final após a multiplicação passe do valor máximo, os pontos excedentes serão desconsiderados.

**f)**            Apresente o projeto na forma de um documento .docx onde conste **(a)** uma capa; **(b)** uma introdução falando sobre a aplicabilidade do painel, de preferência no contexto do seu projeto, e suas características gerais de funcionamento; **(c)** diagrama final da montagem; **(d)** montagem no TinkerCad; **(e)** programa desenvolvido e **(e)** se houver! Bibliografia apontando as fontes de pesquisa.

 

               A **Figura 6** apresenta um print da tela do TinkerCad com todos os componentes que serão necessários.

**Figura 6 –** Componentes necessários para montagem no TinkerCad. OBS: Serão necessários muito mais resistores do que o mostrado, além disso, se o grupo achar necessário pode utilizar outros componentes não mostrados na figura ou mesmo os mesmos componentes em maior ou menor quantidade.

  

**Bom trabalho.**

