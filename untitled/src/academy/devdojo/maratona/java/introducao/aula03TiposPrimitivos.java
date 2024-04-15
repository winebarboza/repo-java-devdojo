package academy.devdojo.maratona.java.introducao;
/* prática

imprimir a seguinte mensagem utilizando variáveis:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.

 */

public class aula03TiposPrimitivos {
        public static void main(String[]args){
            String nome = "Kirito";
            String endereco = "Rua Itaitinga";
            double salario = 1330.20;
            String data = "05/04/2024";
            String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+" na data "+data+".";
            System.out.println(relatorio);
        }
}
