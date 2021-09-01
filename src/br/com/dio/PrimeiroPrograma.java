package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato("Morganna", "marrom", 27);

        System.out.println(gato.toString());
    }
}
