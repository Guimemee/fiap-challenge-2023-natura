package br.com.fiap.natura.embalagens;

/**
 * 🌿 Natura Innovation Challenge — Sistema de Gestão de Embalagens Sustentáveis
 * 
 * Disciplina: Algoritmos de Alta Performance
 * Turma: 2ECR / 2ECB — Engenharia de Computação (FIAP)
 * 
 * @author Guilherme Macário da Silva (RM 84057) & Equipe
 * @version 2.0 (Clean Code & Performance Polished)
 */
import java.util.Scanner;

public class EmbalagemNatura {

    private String codigoLote;
    private String tipoMaterial;
    private double volumeMl;
    private double pesoGramas;
    private double pegadaCarbonoGramas;
    private boolean ehBiodegradavel;

    public EmbalagemNatura(String codigoLote, String tipoMaterial, double volumeMl, double pesoGramas, double pegadaCarbonoGramas, boolean ehBiodegradavel) {
        this.codigoLote = codigoLote;
        this.tipoMaterial = tipoMaterial;
        this.volumeMl = volumeMl;
        this.pesoGramas = pesoGramas;
        this.pegadaCarbonoGramas = pegadaCarbonoGramas;
        this.ehBiodegradavel = ehBiodegradavel;
    }

    public double calcularIndiceSustentabilidade() {
        // Cálculo ponderado: menor pegada de carbono e material biodegradável geram maior pontuação
        double bonusBio = ehBiodegradavel ? 1.5 : 1.0;
        if (pegadaCarbonoGramas <= 0) return 100.0;
        return ((volumeMl / pegadaCarbonoGramas) * bonusBio);
    }

    public void exibirResumo() {
        System.out.println("==================================================");
        System.out.println("📦 LOTE DE EMBALAGEM NATURA: " + codigoLote);
        System.out.println("--------------------------------------------------");
        System.out.println("Material: " + tipoMaterial);
        System.out.println("Volume: " + volumeMl + " mL | Peso: " + pesoGramas + " g");
        System.out.println("Pegada de Carbono: " + pegadaCarbonoGramas + " g CO2e");
        System.out.println("Biodegradável: " + (ehBiodegradavel ? "SIM" : "NÃO"));
        System.out.printf("Índice de Sustentabilidade: %.2f\n", calcularIndiceSustentabilidade());
        System.out.println("==================================================");
    }

    public static void main(String[] args) {
        System.out.println("🚀 Iniciando Motor de Análise de Embalagens Sustentáveis — Natura 2023");
        
        EmbalagemNatura e1 = new EmbalagemNatura("NAT-2023-ECO-01", "Plástico Verde (Cana-de-Açúcar)", 250.0, 18.5, 12.0, true);
        EmbalagemNatura e2 = new EmbalagemNatura("NAT-2023-STD-02", "PET Reciclado Pós-Consumo", 400.0, 32.0, 24.5, false);

        e1.exibirResumo();
        e2.exibirResumo();
    }
}
