import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       String [] candidatos = {"FELIPE", "JOÃO", "MARIA", "CARLOS", "ANA"};
       for(String candidato: candidatos){
        entrandoEmContato(candidato);

       }
        
    }
    // METODO = entrando em contato com o candidato;
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do { 
            // randomizando o atender de 0 a 3;
            atendeu = atender();
            // continuar tentando se o atender for false != diferente do que ao se refere;
            continuarTentando = !atendeu;
            if(continuarTentando)
            // adicionando mais as tentativas para no fial exibir corretamente;
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            // Enquanto as duas variaveis for menor do que 3 ;
        } while (continuarTentando && tentativasRealizadas<3);
        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " Realizada");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O " + candidato + ", NÚMERO MAXIMO TENTAIVAS " + tentativasRealizadas + "REALIZADA");
    }

    // METODO = AUXILIAR PARA ATENDER 
    static boolean atender(){

        // randomizando um numero de 3 a 1 e quando o numero for igual a 1 ele para;
        return new Random().nextInt(3)==1;
    }


    // METODO = imprimir os candidatos selecionados; 
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "JOÃO", "MARIA", "CARLOS", "ANA", "LUCAS",};
        System.out.println("Imprimindo a lista de candidatos informando o indice");
        //variavel pra contar, quando ela deve parar, o ++ para nao dar erro na contagem; 
        for(int indice=0; indice < candidatos.length;indice++) {
                                                    // adicionando o indice + 1 para a conta da certo;
            System.out.println("O candidato de n* "+ (indice+1) + " é o " + candidatos[indice]);
                                                                            // informar o candidato conforme o indice;
        }
    }

    // METODO para selecionar os candidatos; 
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE", "JOÃO", "MARIA", "CARLOS", "ANA", "LUCAS", "JULIA", "GABRIEL", "LARISSA", "MATEUS", "BEATRIZ"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        // While para quando os candidatos forem menor do que 5 ele continuar rodando;
        // Enquanto os candidatos atuais não ultrapassarem a qantidade de candidatos ele continua e para;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos [candidatosAtual];
            // randomizando com o metodo 
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato: " + candidato + "Solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Solicitou este valor de salário" + salarioPretendido);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

     } // METODO = criando um metodo para retornar uma double randomizada;
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800,2200);
        }
    
    // METODO = void que nao me retorna nada mas posso usar o analisarcandidato;
    static void analisarCandidato(double salarioPretendido){
        // Codigo do METODO;
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) 
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

