import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {





            public static void main(String[] args) {
                // Mapa para armazenar as quantidades de peças por semana
                Map<Integer, Integer> pedidosPorSemana = new HashMap<>();

                // Adicionando os pedidos ao mapa
                pedidosPorSemana.put(1, 7);
                pedidosPorSemana.put(2, 6);
                pedidosPorSemana.put(3, 4);
                pedidosPorSemana.put(4, 1);
                pedidosPorSemana.put(5, 5);

                // Total de peças a serem enviadas
                int totalEnviado = 19;

                // Iterando sobre as semanas
                for (int semana = 1; semana <= 5; semana++) {
                    // Verificando se há pedidos para a semana atual
                    if (pedidosPorSemana.containsKey(semana)) {
                        int quantidadePedido = pedidosPorSemana.get(semana);

                        // Verificando se ainda há peças a serem enviadas
                        if (totalEnviado > 0) {
                            // Verificando quantas peças serão enviadas nesta semana
                            int enviarNestaSemana = Math.min(quantidadePedido, totalEnviado);

                            // Atualizando as quantidades
                            pedidosPorSemana.put(semana, quantidadePedido - enviarNestaSemana);
                            totalEnviado -= enviarNestaSemana;
                        }
                    }
                }

                // Exibindo o resultado
                System.out.println("Pedidos restantes por semana:");
                for (int semana = 1; semana <= 5; semana++) {
                    if (pedidosPorSemana.containsKey(semana)) {
                        int quantidadeRestante = pedidosPorSemana.get(semana);
                        System.out.println("Semana " + semana + ": " + quantidadeRestante + " peças");
                    }
                }
            }
        }

    }
