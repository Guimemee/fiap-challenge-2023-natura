# Modelagem Técnica e Justificativa de Engenharia

**Projeto:** Natura Innovation Challenge (Bioeconomia & IoT)
**Empresa Parceira:** Natura Innovation Challenge
**Ano Letivo:** 2023 | **Turma:** 2ECB
**Fase:** Sprint 3

### Especificação do Desafio
Desenvolver um modelo de aprendizado de máquina supervisionado (Random Forest Regressor) combinando índices espectrais de vegetação (NDVI, EVI) derivados de imagens de satélite Sentinel-2 com dados de telemetria de solo coletados em campo para predição da biomassa florestal e produtividade de castanhais nativos. Avaliar o coeficiente de determinação R² e erro RMSE.

### Formulação Matemática e Física
$$\text{NDVI} = \frac{\text{NIR} - \text{RED}}{\text{NIR} + \text{RED}}, \quad R^2 = 1 - \frac{\sum (y_i - \hat{y}_i)^2}{\sum (y_i - \bar{y})^2} \ge 0,90$$
