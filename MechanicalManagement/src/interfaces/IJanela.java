package interfaces;

/**
 *
 * @author ctb03
 */
public interface IJanela {

    //Medoto que deve limpar todos os campos da tela
    void limparCampos();
    //Metodo para pegar o valor de todos os campos
    Object obterCampos();
    //Metodo para preencher todos os campos
    void prencherCampos(Object objetc);
    //Metodo para verificar se os campos estão preenchidos
    boolean camposPreenchidos();
}
