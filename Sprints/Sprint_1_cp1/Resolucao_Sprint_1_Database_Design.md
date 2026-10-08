# 🗄️ Resolução Técnica — Sprint 1 (Database Design Natura)

.

Faculdade de Informática e Administração Paulista

INFORME O NOME DISCIPLINA

ENTREGÁVEL DA DISCIPLINA

INTEGRANTES

RM

(SOMENTE NÚMEROS)

NOME COMPLEMENTO

(SEM ABREVIAR)

85770

Bruno Tanaui Zanocco

85350

Caio Silva Alves

84057

Guilherme Macario da Silva

93040

Kaique Carvalho da Silva

95267

Murilo José Cressoni

Sumário

1 – Descrição do Projeto e Regras de Negócio5

2 – Dicionário de Dados6

3 – Projeto Lógico do Banco de Dados7

1 – Descrição do Projeto e Regras de Negócio

O objetivo de criar uma tabela em um banco de dados é organizar e armazenar os dados de forma estruturada. As tabelas são as unidades básicas de armazenamento de um banco de dados relacional, e elas são compostas por linhas e colunas. Aqui estão alguns dos principais objetivos de usar tabelas em um banco de dados: Armazenamento estruturado: As tabelas permitem que os dados sejam armazenados de forma organizada e estruturada. Cada coluna em uma tabela representa um atributo específico dos dados, enquanto cada linha contém os valores correspondentes a esses atributos. Gerenciamento de informações: As tabelas fornecem uma maneira eficiente de gerenciar grandes volumes de informações. Elas permitem que os dados sejam inseridos, atualizados, recuperados e excluídos de forma fácil e rápida usando comandos de consulta e manipulação de dados. Relacionamentos entre os dados: As tabelas também permitem estabelecer relacionamentos entre os dados. Isso é feito por meio do uso de chaves primárias e chaves estrangeiras, que ajudam a estabelecer conexões entre diferentes tabelas do banco de dados. Integridade dos dados: As tabelas permitem a aplicação de restrições e regras para garantir a integridade dos dados armazenados. Isso inclui restrições de chave primária, restrições de chave estrangeira, restrições de valor único, restrições de verificação, entre outras. Essas restrições ajudam a manter a consistência e a precisão dos dados. Consultas e análises de dados: As tabelas facilitam a execução de consultas e análises de dados. Os dados armazenados em tabelas podem ser recuperados e filtrados com base em critérios específicos, permitindo que informações relevantes sejam extraídas de maneira eficiente. Em resumo, o uso de tabelas em um banco de dados é fundamental para a organização, armazenamento, manipulação e recuperação eficiente dos dados, além de facilitar a manutenção da integridade e a realização de análises sobre os dados.

2 – Dicionário de Dados

Tabela

JOBS

Descrição

Tabela de trabalhos.

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

JOB_ID

NUMBER

10

PK

Identificador de trabalho

JOB_TITLE

VARCHAR

35

NN

Nome de cada trabalho

MIN_SALARY

NUMBER

20

NN

Salário min. do trabalho

MAX_SALARY

NUMBER

20

NN

Salário máx. do trabalho

Tabela

EMPLOYEES

Descrição

Tabela de Empregados. Relaciona-se com a tabela JOBS

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

EMPLOYEE_ID

NUMBER

100

PK

Identificador de empregados

FIRST_NAME

VARCHAR

50

NN

Primeiro nome do empregado

LAST_NAME

VARCHAR

50

NN

Sobrenome do empregado

EMAIL

VARCHAR

200

NN

Email do empregado

PHONE_NUMBER

NUMBER

400

NN

Número do empregado

HIRE_DATE

NUMBER

80

NN

Dia da demissão do empregado

SALARY

NUMBER

200

NN

Salário do empregado

COMMISSION_PCT

NUMBER

150

NN

Comissão do empregado

Tabela

EMERGENCY CONTACTS

Descrição

Tabela de contatos de emergência. Relaciona-se com a tabela EMPLOYEES

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

CONTACT_ID

NUMBER

5

PK

Identificador de contatos

FIRST_NAME

VARCHAR

50

NN

Primeiro nome do contato

LAST_NAME

VARCHAR

50

NN

Sobrenome do contato

RELATIONSHIP

VARCHAR

5

NN

Relação do contado

HOME_PHONE

NUMBER

40

NN

Telefone de casa do contato

WORK_PHONE

NUMBER

40

NN

Telefone do trabalho do contato

CELL_PHONE

NUMBER

100

NN

Telefone do contato

Tabela

JOB_HISTORY

Descrição

Tabela de Histórico do trabalho. Relaciona-se com a tabela JOBS e EMPLOYEES

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

START_DATE

NUMBER

1

PK

Identificador data de começo

END_DATE

VARCHAR

1

NN

Data de saída

Tabela

DEPARTMENTS

Descrição

Tabela de departamentos. Relaciona-se com a tabela JOB_HISTORY e EMPLOYEES

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

DEPARTMENT_ID

NUMBER

50

PK

Identificador de departamentos

DEPARTMENT_NAME

VARCHAR

50

NN

Nome do departamento

Tabela

LOCATIONS

Descrição

Tabela de localizações. Relaciona-se com a tabela DEPARTMENTS

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

LOCATION_ID

NUMBER

200

PK

Identificador de localização

STREET_ADDRESS

VARCHAR

5

NN

Nome da rua

POSTAL_CODE

NUMBER

2

NN

Código postal

CITY

VARCHAR

2

NN

Nome da cidade

STATE _PROVINCE

VARCHAR

100

NN

Provincia do estado

Tabela

COUNTRIES

Descrição

Tabela de localizações. Relaciona-se com a tabela LOCATIONS

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

COUNTRY_ID

NUMBER

193

PK

Identificador de país

COUNTRY_NAME

VARCHAR

193

NN

Nome do país

Tabela

REGIONS

Descrição

Tabela de regiões. Relaciona-se com a tabela COUNTRIES

Coluna

Tipo de Dados

Tamanho

Constraint

Descrição

REGIONS_ID

NUMBER

1500

PK

Identificador de região

REGION_NAME

VARCHAR

1500

NN

Nome da região

3 – Projeto Lógico do Banco de Dados