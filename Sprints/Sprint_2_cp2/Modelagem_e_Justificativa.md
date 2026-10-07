# Modelagem Técnica e Justificativa de Engenharia

**Projeto:** Natura Innovation Challenge (Bioeconomia & IoT)
**Empresa Parceira:** Natura Innovation Challenge
**Ano Letivo:** 2023 | **Turma:** 2ECB
**Fase:** Sprint 2

### Especificação do Desafio
Dimensionar os nós sensores autônomos operando na frequência LoRaWAN de 915 MHz sob dossel florestal denso com atenuação por folhagem úmida. Projetar o sistema de alimentação com mini painel solar fotovoltaico de 5 V / 200 mA e supercapacitor de 50 F com bateria de suporte Li-ion 18650 para suportar até 5 dias consecutivos de chuva intensa sem insolação direta.

### Formulação Matemática e Física
$$\text{Atenuação Florestal (Weissberger)} = 1,33 \cdot f^{0,284} \cdot d^{0,588}, \quad P_{\text{painel}} \ge P_{\text{sensor}} \cdot \frac{24}{\text{HSP}}$$
