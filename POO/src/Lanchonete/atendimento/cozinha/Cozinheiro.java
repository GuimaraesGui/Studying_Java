package Lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche no balcão");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando vitamina no balcão");
    }
    public void adicionarComboNoBalcao(){
        System.out.println("Adicionando combo no balcão");
    }

    void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }
    void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    void prepararLanche(){
        System.out.println("Preparando lanche");
    }

    void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, ovo e carne.");
    }
    void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco.");
    }

    void lavarIngredientes(){
        System.out.println("Lavando os ingredientes.");
    }

    void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador.");
    }
    void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo para o hambúrguer.");
    }

    void pedirParaTrocarGas(Almoxarife colaborador){
        System.out.println("A cozinha está pedindo para trocar o gás.");
        colaborador.trocarGas();
    }
    public void pedirIngredientes(Almoxarife colaborador){
        colaborador.entregarIngredientes();
    }
}