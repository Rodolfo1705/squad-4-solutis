/*Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a idade e a altura. Para sinalizar o
fim da lista será fornecido “fim” no nome do último paciente.
Exiba um relatório contendo:
i.    a quantidade de pacientes.
ii.   a média de idade dos homens.
iii.  a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
iv.  a quantidade de pessoas com idade entre 18 e 25.
v.   o nome do paciente mais velho.
vi.  o nome da mulher mais baixa.
vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio47 {
    public static void run(){
        Divisor.printExercise(47);

        List<Patient> patients = new ArrayList<>();
        String opcao;

        do {
            System.out.println("Digite os dados do paciente: ");

            Patient patient = patientData();
            patients.add(patient);

            opcao = InputHandler.getStringInput("Deseja adicionar um novo paciente? (Para sair, escreva fim) ");
        } while(!opcao.equalsIgnoreCase("fim"));

        System.out.println("\nRelatório da Clínica:");
        System.out.println("Número de pacientes: " + patients.size());
        System.out.println("Média de idade dos homens: " + middleAgeMen(patients));
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + amountWomen(patients));
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + youngAdults(patients));
        System.out.println("Nome do paciente mais velho: " + olderPatient(patients).getName());
        System.out.println("Nome da paciente mais baixa: " + shorterWoman(patients).getName());
        System.out.println("...");
    }

    private static Patient patientData() {
        String name = InputHandler.getStringInput("Nome: ");
        String sex = InputHandler.getStringInput("Sexo (M ou F): ");
        double weight = InputHandler.getDoubleInput("Peso (em kg): ");
        int age = InputHandler.getIntInput("Idade: ");
        double height = InputHandler.getDoubleInput("Altura (em metros): ");

        return new Patient(name, sex, weight, age, height);
    }

    private static double middleAgeMen(List<Patient> patients){
        return patients.stream()
                .filter(p -> p.getSex().equalsIgnoreCase("M"))
                .mapToInt(Patient::getAge)
                .average()
                .orElse(0);
    }

    private static long amountWomen(List<Patient> patients) {
        return patients.stream()
                .filter(p -> p.getSex().equalsIgnoreCase("F"))
                .filter(p -> p.getHeight() >= 1.6 && p.getHeight() <= 1.7 && p.getWeight() > 70)
                .count();
    }

    private static long youngAdults(List<Patient> patients) {
        return patients.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 25)
                .count();
    }

    private static Patient olderPatient(List<Patient> patients) {
        return patients.stream()
                .max(Comparator.comparingInt(Patient::getAge))
                .orElse(null);
    }

    private static Patient shorterWoman(List<Patient> patients) {
        return patients.stream()
                .filter(p -> p.getSex().equalsIgnoreCase("F"))
                .min(Comparator.comparingDouble(Patient::getHeight))
                .orElse(null);
    }
}

class Patient{
    private String name;
    private String sex;
    private double weight;
    private int age;
    private double height;

    public Patient(String name, String sex, double weight, int age, double height) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
