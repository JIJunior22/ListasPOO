package Lista2;

public class teste {
    public static void main(String[] args) {


            String nome = "João"; // Insira o nome da pessoa aqui
            int idade = 30; // Insira a idade da pessoa aqui

            String mensagem = criarMensagemAniversario(nome, idade);
            System.out.print(mensagem);
        }

        public static String criarMensagemAniversario (String nome,int idade){
            String mensagem = "Feliz Aniversário, " + nome + "!";
            mensagem += "\nEsperamos que este seja um dia incrível para você.";
            mensagem += "\nQue seus " + idade + " anos sejam cheios de alegria e realizações.";
            mensagem += "\nParabéns e muitas felicidades! 🎉🎂";

            return mensagem;
        }
    }



