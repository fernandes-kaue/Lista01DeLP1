package QuestoesDe08a12;


/*
Elabore a classe Horario com
-hora (int)
-minuto (int)
-segundo (int)
 */


public class Horario {
    private int hora, minuto, segundo;

    // toString


    @Override
    public String toString() {
        return "O horário guardado é: " + hora + ":" +  minuto + ":" + segundo ;
    }

    // construtor zerado
    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /*
    a. Crie um construtor que receba apenas hora e minuto e inicialize os segundos  com 0.
     */

    public Horario(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    /*
    b. Crie um construtor que receba apenas hora e inicialize os minutos e os segundos  com 0.
     */

    public Horario(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    /*
    Crie os métodos assessores e mutatórios para a classe Horario, bem como  construtor com os 3 argumentos. Valide os dados nos construtores e nos  métodos set.
     */


    // construtor com 3 argumentos e validação

    public Horario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // métodos assessores (getters) e mutatórios (setters)

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora Inválida! Deve estar entre 0 e 23");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && hora <= 23) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minutos Inválidos! Deve estar entre 0 e 59");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 23) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundos Inválidos! Devem estar entre 0 e 59");
        }
    }

    /*
    d. O que poderia ocorrer caso as variáveis de instância de Horario fossem public?

    r= Caso as variáveis de instância de Horario fossem public, elas estariam diretamente acessíveis e modificáveis por qualquer parte do código, sem qualquer tipo de controle ou validação. Isso poderia levar a diversos problemas, como atribuição de valores inválidos, dificuldade na manutenção e quebra do princípio de encapsulamento
     */

    /*
    e. Elabore um método para somar dois horários: public static void soma (Horario  horario1, Horario horario2). Não é para alterar os valores das variáveis de  instância de horario1 e horario2. Apenas somar e imprimir. Este método poderia  ser não static? Justifique.
     */

    public static void soma(Horario horario1, Horario horario2) {
        int novaHora = horario1.getHora() + horario2.getHora();
        int novoMinuto = horario1.getMinuto() + horario2.getMinuto();
        int novoSegundo = horario1.getSegundo() + horario2.getSegundo();

        if (novoSegundo >= 60) {
            novoSegundo -= 60;
            novoMinuto++;
        }

        if (novoMinuto >= 60) {
            novoMinuto -= 60;
            novaHora++;
        }

        if (novaHora >= 24) {
            novaHora -= 24;
        }

        System.out.println("Horário resultante da soma: " + novaHora + ":" + novoMinuto + ":" + novoSegundo);
    }

    /*
    Método soma poderia ser não static?
Sim, este método poderia ser não static, mas isso mudaria sua abordagem de uso. Se o método fosse não estático, ele precisaria ser chamado em um objeto de Horario, e poderia somar esse objeto com outro. A vantagem de ser não estático seria que o método estaria mais diretamente relacionado ao comportamento de um objeto Horario, tornando a operação mais natural na orientação a objetos.
     */

    /*
    f. Elabore um método para somar dois horários com a seguinte assinatura: public  void soma (Horario horario).
     */

    public void soma(Horario horario) {
        this.segundo += horario.getSegundo();
        this.minuto += horario.getMinuto();
        this.hora += horario.getHora();

        if (this.segundo >= 60) {
            this.segundo -= 60;
            this.minuto++;
        }

        if (this.minuto >= 60) {
            this.minuto -= 60;
            this.hora++;
        }

        if (this.hora >= 24) {
            this.hora -= 24;
        }
    }


    /*
    g. Elabore um método para somar dois horários com a seguinte assinatura: public  void soma (int horas, int minutos, int segundos). As horas, minutos e segundos  devem ser somados aos valores do objeto que chamou o método (objeto this).  No entanto, escreva este método sem usar a palavra this (usando os métodos  set).
     */

    public void soma(int horas, int minutos, int segundos) {
        // Somando os segundos
        int novoSegundo = getSegundo() + segundos;
        int novoMinuto = getMinuto() + minutos;
        int novaHora = getHora() + horas;

        if (novoSegundo >= 60) {
            novoSegundo -= 60;
            novoMinuto++;
        }

        if (novoMinuto >= 60) {
            novoMinuto -= 60;
            novaHora++;
        }

        if (novaHora >= 24) {
            novaHora -= 24;
        }

        setSegundo(novoSegundo);
        setMinuto(novoMinuto);
        setHora(novaHora);
    }

    /*
    9) Reescreva uma nova versão do método public void soma (Horario
horario) (feito na questão 7c), com a seguinte assinatura: public static
Horario somar (Horario horario1, Horario horario2). Este
método deve somar os dois horários e instanciar um novo com os valores da soma.
Este novo objeto deve ser retornado.
a. Seria possível este método também chamar-se soma já que o tipo de retorno é
diferente? Por quê?
     */

    public static Horario somar(Horario horario1, Horario horario2) {

        int novaHora = horario1.getHora() + horario2.getHora();
        int novoMinuto = horario1.getMinuto() + horario2.getMinuto();
        int novoSegundo = horario1.getSegundo() + horario2.getSegundo();

        if (novoSegundo >= 60) {
            novoSegundo -= 60;
            novoMinuto++;
        }

        if (novoMinuto >= 60) {
            novoMinuto -= 60;
            novaHora++;
        }

        if (novaHora >= 24) {
            novaHora -= 24;
        }

        return new Horario(novaHora, novoMinuto, novoSegundo);
    }

    /*
    9.a) Sim, o método poderia se chamar soma, mesmo com um tipo de retorno diferente, porque a sobrecarga de métodos permite que mais de um método tenha o mesmo nome, desde que suas assinaturas sejam diferentes. A assinatura de um método é definida pelo nome e pelos tipos e quantidade de parâmetros, e não pelo tipo de retorno. Assim, a linguagem Java seria capaz de distinguir os métodos com base nos parâmetros passados, permitindo que ambos coexistam com o mesmo nome.
     */

    /*
    10)Elabore a classe principal que instancie objetos da classe Horario.
     e
    11) Chame os métodos das questões 7 e, 7 f, e 7g
     e
    12) É possível realizar chamada ao método da questão 7e com um objeto Horario como
handle? Se sim, o faça.
     */

    public static class Principal {
        public static void main(String[] args) {
            Horario horario1 = new Horario(10, 45, 50);
            Horario horario2 = new Horario(2, 30, 20);

            System.out.println("Horário 1: " + horario1.getHora() + ":" + horario1.getMinuto() + ":" + horario1.getSegundo());
            System.out.println("Horário 2: " + horario2.getHora() + ":" + horario2.getMinuto() + ":" + horario2.getSegundo());

            horario1.soma(horario2);
            System.out.println("Horário 1 após soma: " + horario1.getHora() + ":" + horario1.getMinuto() + ":" + horario1.getSegundo());

            Horario horarioSomado = Horario.somar(horario1, horario2);
            System.out.println("Novo horário após somar horário 1 e horário 2: " + horarioSomado.getHora() + ":" + horarioSomado.getMinuto() + ":" + horarioSomado.getSegundo());


            // Chamada do método 7e: static soma sem alterar os horários originais
            System.out.println("\nChamando método estático soma (7e):");
            Horario.soma(horario1, horario2);

            // Chamada do método 7f: soma não estática que altera o objeto chamador
            System.out.println("\nChamando método soma (7f):");
            horario1.soma(horario2);
            System.out.println("Horário 1 após soma: " + horario1.getHora() + ":" + horario1.getMinuto() + ":" + horario1.getSegundo());

            // Chamada do método 7g: soma com parâmetros (horas, minutos, segundos)
            System.out.println("\nChamando método soma (7g) com parâmetros:");
            horario1.soma(1, 20, 40);
            System.out.println("Horário 1 após somar horas, minutos e segundos: " + horario1.getHora() + ":" + horario1.getMinuto() + ":" + horario1.getSegundo());


            // Chamando o método estático soma (7e) usando o objeto "horario1" como handle
            System.out.println("\nChamando método estático soma (7e) usando objeto Horario como handle:");
            horario1.soma(horario1, horario2);  // Chamando soma de forma estática através do objeto
        }
    }







}
