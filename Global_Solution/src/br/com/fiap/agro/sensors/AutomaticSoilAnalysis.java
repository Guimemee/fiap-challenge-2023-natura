package br.com.fiap.agro.sensors;

/**
 * 🌾 Global Solution 2023 — Combate à Fome & Agro Sustentável
 * Sistema de Telemetria e Monitoramento Automatizado de 20 Sensores de Solo
 * 
 * @author Guilherme Macário da Silva (RM 84057) & Equipe
 */

import java.util.Scanner;
import java.util.Random;

public class AutomaticSoilAnalysis {
	public static final int SENSORES = 20;
	public static final int DIAS = 3;
	public static final int ID_MIN = 4600;
	public static final int ID_MAX = 4800 - ID_MIN;
	public static final int IDS = 20;
	public static final int PH_MIN = 40;
	public static final int PH_MAX = 81 - PH_MIN;
	public static final int UMIDADE_MIN = 20;
	public static final int UMIDADE_MAX = 91 - UMIDADE_MIN;
	public static final float PH_OK_MIN = (float) 5.5;
	public static final float PH_OK_MAX = (float) 6.5;
	public static final int CRESCENTE = 1;
	public static final int DECRESCENTE = 2;
	public static final boolean DEBUG = true;

	public static void main(String[] args) {
		
		/* 
		 * Exemplo para gerao de valores aleatrios no intervalo estabelecido
		 * no enunciado.
		 * 
		 * A constante DEBUG deve ser usada para visualizar quando desejado todos os valores 
		 * gerados para cada dia em cada sensor. 
		 */
		Random r = new Random();
	
		int id = r.nextInt(ID_MAX) + ID_MIN;
		float pH = (float) (r.nextInt(PH_MAX) + PH_MIN) / 10;
		int umidade = r.nextInt(UMIDADE_MAX) + UMIDADE_MIN;
		if (DEBUG) {
				System.out.print("ID=" + id);
				System.out.print("\tpH=" + pH);
				System.out.print("\tum=" + umidade + "%\n");
			}

	}
}
