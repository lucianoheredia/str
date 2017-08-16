package br.com.desafio.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AppStreamExecute {

	protected static List<String> blocoDados = new ArrayList<>();

	public static char firstChar(StreamInterfaceImpl input) {

		/*
		 * Vari�veis auxiliares para valida��o;
		 */
		char currValue = 0;
		String currValueStr = null;

		/*
		 * Map para associar as letras com a quantidade de vezes repetidas na
		 * string.
		 */
		Map<String, Integer> strMap = new LinkedHashMap<String, Integer>();

		/*
		 * Bloco Respons�vel por inserir a quantidade de vezes que as letras
		 * aparecem na Stream. Ainda nesse Bloco, � identificada
		 */
		while (input.hasNext()) {
			currValue = input.getNext();
			currValueStr = String.valueOf(currValue).toUpperCase();

			addDadoLista(currValueStr);

			if (isVogalValida(currValueStr)) {
				if (strMap.containsKey(currValueStr)) {
					strMap.put(currValueStr, strMap.get(currValueStr) + 1);
				} else {
					strMap.put(currValueStr, 1);
				}
			}
		}

		/*
		 * Fazendo uma analogia, no bloco de cima foi realizado um
		 * particionamento; Com isso, a procura pelo dado fica mais r�pida.
		 */
		if (strMap.values().contains(1)) {
			for (String strM : strMap.keySet()) {
				if (strMap.get(strM).intValue() == 1 && validarVogalAnteriorEConsoante(strM)) {
					char valueCorrect = strM.charAt (0);
					return valueCorrect;
				}
			}
		}
		// Z = Sem retorno.
		return "Z".charAt(0);
	}

	public static void addDadoLista(String currValueStr) {
		blocoDados.add(currValueStr);
	}

	private static boolean validarVogalAnteriorEConsoante(String currValueStr) {
		String ptEsq = null, meio = null, ptDir = null;
		for (String str : blocoDados) {

			ptEsq = meio;
			meio = ptDir;
			ptDir = str;

			if (currValueStr.equals(str)) {
				if (meio != null && !isVogalValida(meio)) {
					if (isVogalValida(ptEsq)) {
						return true;
					}
				}
			}
		}

		return false;
	}

	private static boolean isVogalValida(String currValueStr) {
		return StreamInterfaceImpl.VOGAIS.contains(currValueStr);
	}
}
