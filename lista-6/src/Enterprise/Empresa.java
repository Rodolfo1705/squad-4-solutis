package Enterprise;

public class Empresa {
    private final FuncionarioIF[] funcionarios = new FuncionarioIF[10];
    private final FuncionarioIF[] funcionariosCargo = new FuncionarioIF[10];

    private void populateFuncionarios(){
        for(int i = 0; i < funcionarios.length; i++){
            if(i < 4){
                funcionarios[i] = new FuncionarioEscola("Rodolfo","555", "Integrado", 0);
            } else if (i < 8){
                funcionarios[i] = new FuncionarioEnsinoMedio("Camila", "777", "Ser", 0);
            }
            funcionarios[i] = new FuncionarioEnsinoSuperior("Alessandro", "999", "Educação", 0 );
        }
    }

    public double calcularGastos(){
        populateFuncionarios();

        double gastos = 0;

        for (FuncionarioIF funcionario : funcionarios) {
            gastos += funcionario.calcularRendaTotal();
        }
        return gastos;
    }

    private void populateFuncionariosCargo(){
        for(int i = 0; i < funcionariosCargo.length; i++){
            if(i < 1){
                funcionariosCargo[i] = new Gerente("Rodolfo","555", 0);
            } else if (i < 3){
                funcionariosCargo[i] = new Supervisor("Camila", "777", 0);
            }
            funcionariosCargo[i] = new Vendedor("Alessandro", "999", 0 );
        }
    }

    public double calcularGastosCargos(){
        populateFuncionariosCargo();

        double gastos = 0;

        for (FuncionarioIF funcionarioCargo : funcionariosCargo) {
            gastos += funcionarioCargo.calcularRendaTotal();
        }

        return gastos;
    }
}
