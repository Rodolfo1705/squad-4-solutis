import Exercises.*;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<AnimalAB> animaisCadastrados = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar Animal.");
            System.out.println("2 - Ver detalhes sobre um animal existente.");
            System.out.println("3 - Observar um animal. ");
            System.out.println("4 - sair");
            opcao = InputHandler.getIntInput("O que dejesa fazer agora? ");

            switch (opcao) {
                case 1: {
                    AnimalAB animalCadastrado = cadastrarAnimal();
                    if (animalCadastrado != null) {
                        animaisCadastrados.add(animalCadastrado);
                    }
                    break;
                }
                case 2: {
                    pesquisarAnimal(animaisCadastrados);
                    break;
                }
                case 3: {
                    String animal = InputHandler.getStringInput("Qual o nome do animal que você deseja ver? ");
                    AnimalAB animalEncontrado = checarNome(animal, animaisCadastrados);
                    if (animalEncontrado != null) {
                        System.out.println("O que " + animalEncontrado.getNome() + " está fazendo? ");
                        System.out.println("1 - Comendo.");
                        System.out.println("2 - Se movimentando.");
                        System.out.println("3 - Dormindo.");
                        int acao = InputHandler.getIntInput("");
                        switch (acao) {
                            case 1: {
                                animalEncontrado.comer();
                                break;
                            }
                            case 2: {
                                animalEncontrado.moverse();
                                break;
                            }
                            case 3: {
                                animalEncontrado.dormir();
                                break;
                            }
                            default: {
                                System.out.println("Ação inválida!");
                            }
                        }
                    } else {
                        System.out.println("Animal não encontrado!");
                    }
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }
        } while (opcao != 4);
    }

    private static AnimalAB cadastrarAnimal() {
        System.out.println("\n---- Novo Cadastro ----");
        String animal = InputHandler.getStringInput("Informe o animal: ");

        if (!checarAnimal(animal)) {
            System.out.println("Nenhum animal encontrado com esse nome.\n");
            return null;
        }

        String nome = InputHandler.getStringInput("Informe o nome do " + animal.toLowerCase() + ": ");
        int idade = InputHandler.getIntInput("Informe a idade de " + nome.toLowerCase() + ": ");
        double altura = InputHandler.getDoubleInput("Informe a altura de " + nome.toLowerCase() + ": ");
        double peso = InputHandler.getDoubleInput("Informe o peso de " + nome.toLowerCase() + ": ");

        if (animal.equalsIgnoreCase("pombo")) {
            int quantAsas = InputHandler.getIntInput("Informe a quantidade de asas de " + nome.toLowerCase() + ": ");
            double envergaduraAsa = InputHandler.getDoubleInput("Informe a envergadura das asas de " + nome.toLowerCase() + ": ");
            return new Pombo(nome, "", "", idade, altura, peso, quantAsas, envergaduraAsa);
        } else if (animal.equalsIgnoreCase("peixe")) {
            return new Peixe(nome, "", "", idade, altura, peso);
        }

        int quantPatas = InputHandler.getIntInput("Informe a quantidade de patas de " + nome.toLowerCase() + ": ");
        double quantComida = InputHandler.getDoubleInput("Informe a quantidade de comida que " + nome.toLowerCase() + " come por dia: ");
        double distPercorrida = InputHandler.getDoubleInput("Informe a distância que " + nome.toLowerCase() + " percorre por dia: ");
        double horasSono = InputHandler.getDoubleInput("Informe a quantidade de horas que " + nome.toLowerCase() + " dorme por dia: ");

        return criarAnimalTerrestre(animal, nome, idade, altura, peso, quantPatas, quantComida, distPercorrida, horasSono);
    }

    private static void pesquisarAnimal(List<AnimalAB> listaAnimais) {
        String animal = InputHandler.getStringInput("Qual o nome do animal que você deseja ver? ");
        AnimalAB animalEncontrado = checarNome(animal, listaAnimais);

        if (animalEncontrado == null) {
            System.out.println("Nenhum animal encontrado com esse nome.");
            return;
        }

        System.out.println("Detalhes sobre o animal encontrado:");
        System.out.println("Nome: " + animalEncontrado.getNome());
        System.out.println("Tipo: " + animalEncontrado.getTipoAnimal());
        System.out.println("Habitat: " + animalEncontrado.getHabitat());
        System.out.println("Idade: " + animalEncontrado.getIdade());
        System.out.println("Altura (em m): " + animalEncontrado.getAltura());
        System.out.println("Peso (em kg): " + animalEncontrado.getPeso());

        if (animalEncontrado instanceof Pombo pombo) {
            System.out.println("Quantidade de Asas: " + pombo.getQuantidadeAsas());
            System.out.println("Envergadura da Asa: " + pombo.getEnvergaduraAsa());
        } else if (animalEncontrado instanceof AnimalTerrestreAB animalTerrestre) {
            System.out.println("Quantidade de Patas: " + animalTerrestre.getQuantidadePatas());
            System.out.println("Quantidade de Comida: " + animalTerrestre.getQuantidadeComida());
            System.out.println("Distância Percorrida: " + animalTerrestre.getDistanciaPercorrida());
            System.out.println("Horas de Sono: " + animalTerrestre.getHorasSono());
        }
    }

    private static boolean checarAnimal(String animal) {
        List<String> animais = new ArrayList<>();
        animais.addAll(List.of("Cachorro", "Gato", "Elefante", "Leão", "Peixe", "Pombo"));

        List<String> animaisEncontrados = animais.stream()
                .filter(nomeAnimal -> nomeAnimal.equalsIgnoreCase(animal))
                .collect(Collectors.toList());

        return !animaisEncontrados.isEmpty();
    }

    private static AnimalAB checarNome(String nome, List<AnimalAB> animaisCadastrados) {
        AnimalAB animalEncontrado = animaisCadastrados.stream()
                .filter(animal -> animal.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);

        return animalEncontrado;
    }

    private static AnimalAB checarTipo(String nome, List<AnimalAB> animaisCadastrados) {
        AnimalAB animalEncontrado = animaisCadastrados.stream()
                .filter(animal -> animal.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);

        return animalEncontrado;
    }

    private static AnimalTerrestreAB criarAnimalTerrestre(String animal, String nome, int idade, double altura, double peso, int quantPatas, double quantidadeComida, double distanciaPercurso, double horasSono) {
        if (animal.equalsIgnoreCase("Cachorro")) {
            return new Cachorro(nome, "", "", idade, altura, peso, quantPatas, quantidadeComida, distanciaPercurso, horasSono);
        } else if (animal.equalsIgnoreCase("Gato")) {
            return new Gato(nome, "", "", idade, altura, peso, quantPatas, quantidadeComida, distanciaPercurso, horasSono);
        } else if (animal.equalsIgnoreCase("Leão")) {
            return new Leão(nome, "", "", idade, altura, peso, quantPatas, quantidadeComida, distanciaPercurso, horasSono);
        } else if (animal.equalsIgnoreCase("Elefante"))
            return new Elefante(nome, "", "", idade, altura, peso, quantPatas, quantidadeComida, distanciaPercurso, horasSono);

        return null;
    }
}