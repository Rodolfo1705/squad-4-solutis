package Enterprise;

public class Empresa {
    private FuncionarioIF[] funcionarios = new FuncionarioIF[10];

    public void populateFuncionarios(){
        for(int i = 0; i < funcionarios.length; i++){
            if(i < 4){
                funcionarios[i] = new FuncionarioEscola("Rodolfo","555", "Integrado");
            } else if (i < 8){
                funcionarios[i] = new FuncionarioEnsinoMedio("Camila", "777", "Ser");
            }
            funcionarios[i] = new FuncionarioEnsinoSuperior("Alessandro", "999", "Educação");
        }
    }

    public double calcularGastos(){
        populateFuncionarios();

        double gastos = 0;

        for (FuncionarioIF funcionario : funcionarios) {
            gastos += funcionario.calcularRendaAdicional();
        }
        return gastos;
    }
}
