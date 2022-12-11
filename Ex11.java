package Lista05ex11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();
        System.out.println("Informe o mês: ");
        int mes = sc.nextInt();
        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();
        sc.close();
        extenso(dia, mes, ano);
    }

    static void extenso(int dia, int mes, int ano) {
        if (mes == 1) {
            System.out.println(dia + "/Janeiro/" + ano);
        } else if (mes == 2) {
            System.out.println(dia + "/Fevereiro/" + ano);
        } else if (mes == 3) {
            System.out.println(dia + "/Março/" + ano);
        } else if (mes == 4) {
            System.out.println(dia + "/Abril/" + ano);
        } else if (mes == 5) {
            System.out.println(dia + "/Maio/" + ano);
        } else if (mes == 6) {
            System.out.println(dia + "/Junho/" + ano);
        } else if (mes == 7) {
            System.out.println(dia + "/Julho/" + ano);
        } else if (mes == 8) {
            System.out.println(dia + "/Agosto/" + ano);
        } else if (mes == 9) {
            System.out.println(dia + "/Setembro/" + ano);
        } else if (mes == 10) {
            System.out.println(dia + "/Outubro/" + ano);
        } else if (mes == 11) {
            System.out.println(dia + "/Novembro/" + ano);
        } else if (mes == 12) {
            System.out.println(dia + "/Dezembro/" + ano);
        }

    }

}