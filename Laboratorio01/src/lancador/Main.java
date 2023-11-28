package lancador;

import aplicacao.entidades.Aluno;
import aplicacao.entidades.CachorroQuente;
import aplicacao.entidades.Venda;
import aplicacao.dados.BaseDadosAluno;
import aplicacao.dados.BaseDadosVendas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INICIALIZAR A BASE DE DADOS DE ALUNOS CADASTRADOS
        BaseDadosAluno baseAlunos = new BaseDadosAluno();

        // INICIALIZAR A BASE DE DADOS DAS VENDAS REALIZADAS
        BaseDadosVendas baseVendas = new BaseDadosVendas();

        // INICIALIZAR O SCAM PARA LEITURA DO TECLADO
        Scanner entrada = new Scanner(System.in);

        //VARIAVEL RESPONSAVEL PELO LOOP
        boolean repetirOperacao = true;

        // APLICAÇÃO -----------------------------------------------------------
        System.out.println("--------- Cachorro Quente Gera Árvore --------- ");

        do {
            System.out.println("VERIFICAÇÃO DE ALUNO CADASTRADO ");

            System.out.print("NOME DO ALUNO: ");
            String nomeAluno = entrada.next();
            System.out.print("MATRICULA DO ALUNO: ");
            int matriculaAluno = entrada.nextInt();

            Aluno alunoAtual = baseAlunos.verificaAluno(nomeAluno, matriculaAluno);

            if (alunoAtual != null) {

                CachorroQuente novoCachorroQuente = new CachorroQuente();
                int selecaoItem = 0;

                // PROTEINA
                System.out.println("ESCOLHA A PROTEINA:");
                System.out.println("SALSICHA - 1:");
                System.out.println("LINGUIÇA - 2:");
                System.out.println("FRANGO - 3:");
                System.out.println("BACON - 4:");
                selecaoItem = entrada.nextInt();
                novoCachorroQuente.adicionarProteina(selecaoItem);

                // QUEIJO
                System.out.println("ESCOLHA O QUEIJO:");
                System.out.println("MUSSARELA - 1:");
                System.out.println("PRATO - 2:");
                System.out.println("PARMESÃO - 3:");
                System.out.println("COALHO - 5:");
                selecaoItem = entrada.nextInt();
                novoCachorroQuente.adicionarQueijo(selecaoItem);

                // IGREDIENTES ADICIONAIS
                System.out.println("ESCOLHA OS INGREDIENTES ADICIONAIS:");
                System.out.println("MAIONESE?");
                System.out.println("SIM - 1:");
                System.out.println("NÃO - 2:");
                selecaoItem = entrada.nextInt();
                if (selecaoItem == 1 || selecaoItem == 2) {
                    if (selecaoItem == 1) {
                        novoCachorroQuente.adicionarIngredientesAdicionais(1);
                    }
                }
                System.out.println("KETCHUP?");
                System.out.println("SIM - 1:");
                System.out.println("NÃO - 2:");
                selecaoItem = entrada.nextInt();
                if (selecaoItem == 1 || selecaoItem == 2) {
                    if (selecaoItem == 1) {
                        novoCachorroQuente.adicionarIngredientesAdicionais(2);
                    }
                }
                System.out.println("OVO?");
                System.out.println("SIM - 1:");
                System.out.println("NÃO - 2:");
                selecaoItem = entrada.nextInt();
                if (selecaoItem == 1 || selecaoItem == 2) {
                    if (selecaoItem == 1) {
                        novoCachorroQuente.adicionarIngredientesAdicionais(3);
                    }
                }
                System.out.println("BATATA-PALHA?");
                System.out.println("SIM - 1:");
                System.out.println("NÃO - 2:");
                selecaoItem = entrada.nextInt();
                if (selecaoItem == 1 || selecaoItem == 2) {
                    if (selecaoItem == 1) {
                        novoCachorroQuente.adicionarIngredientesAdicionais(4);
                    }
                }

                // BEBIDA
                System.out.println("ESCOLHA A BEBIDA:");
                System.out.println("Coca-Cola - 1:");
                System.out.println("Del Rico - 2:");
                System.out.println("Suco do Chaves - 3:");
                selecaoItem = entrada.nextInt();
                novoCachorroQuente.adicionarBebida(selecaoItem);

                //VERIFICANDO SE O ALUNO JA FEZ ALGUM OUTRO PEDIDO -------------------
                if (baseVendas.verificaAlunoDentroBaseDadosVenda(alunoAtual) != null) {
                    baseVendas.verificaAlunoDentroBaseDadosVenda(alunoAtual).getCachorrosQuenteComprados().add(novoCachorroQuente);
                } else {
                    Venda novaVenda = new Venda();
                    novaVenda.adicionarVenda(alunoAtual, novoCachorroQuente);
                    baseVendas.getBaseVendasRealizadas().add(novaVenda);
                }
                // -----------------------------------------------------------

                System.out.println("PEDIDO FINALIZADO: \n");

                System.out.println(baseVendas + "\n");

                System.out.println("Deseja comprar outro cachorro-quente");
                System.out.println("SIM - 1");
                System.out.println("NÃO - 2");
                int verifica = entrada.nextInt();
                if (verifica == 1 || verifica == 2) {
                    if (verifica == 2) {
                        repetirOperacao = false;
                    }
                } else {
                    System.out.println("Numero nao reconhecido");
                    repetirOperacao = false;
                }

            } else {
                System.out.println("Nome ou Matrícula INCORRETO ou Esse Aluno NÃO ESTÁ CADASTRADO");
                System.out.println("Deseja tentar denovo?");
                System.out.println("SIM - 1");
                System.out.println("NÃO - 2");
                int verifica = entrada.nextInt();
                if (verifica == 1 || verifica == 2) {
                    if (verifica == 2) {
                        repetirOperacao = false;
                    }
                } else {
                    System.out.println("Numero nao reconhecido");
                    repetirOperacao = false;
                }
            }
        } while (repetirOperacao);
    }
}