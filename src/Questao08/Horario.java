package Questao08;


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

    public static void somarHorario(Horario horario1, Horario horario2) {
        Horario horario3 = new Horario();

        int hora = horario1.getHora() + horario2.getHora();
        if (hora >= 0 && hora <= 23) {
            horario3.setHora(hora);
        } else {
            System.out.println("A soma das horas ultrapassa 24 horas. Tente novamente");
        }

        int minuto = horario1.getMinuto() + horario2.getMinuto();
        if (minuto >= 0 && minuto <= 59) {
            horario3.setMinuto(minuto);
        } else {
            System.out.println("A soma dos minutos ultrapassa 59 minutos. Tente novamente");
        }

        int segundo = horario1.getSegundo() + horario2.getSegundo();
        if (segundo >= 0 && segundo <= 59) {
            horario3.setSegundo(segundo);
        } else {
            System.out.println("A soma dos segundos ultrapassa 59 segundos. Tente novamente.");
        }
        horario3.setSegundo(segundo);

        System.out.println(horario3);
    }

}
