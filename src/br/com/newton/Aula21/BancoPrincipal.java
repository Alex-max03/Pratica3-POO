package br.com.newton.Aula21;

import javax.swing.*;

public class BancoPrincipal {
    public static void main(String[] args) {
        int numero;
        double saldo, limite, rendimento;
        int opcao= Integer.parseInt( JOptionPane.showInputDialog("Banco: \n <1>Conta Corrente\n <2>Conta poupanca\n <3>Sair"));
        switch (opcao){
            case 1:
                numero= Integer.parseInt(JOptionPane.showInputDialog(null,"numero da conta?"));
                saldo= Double.parseDouble(JOptionPane.showInputDialog(null,"saldo:"));
                limite=Double.parseDouble(JOptionPane.showInputDialog(null,"limite:"));
                ContaCorrente cc1= new ContaCorrente(numero,saldo,limite);
                JOptionPane.showMessageDialog(null,"saldo"+cc1.getSaldo()+"\n saldo com limite:"+ cc1.consultaSaldoTotal(),"conta corrente",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:numero= Integer.parseInt(JOptionPane.showInputDialog(null,"numero da conta?"));
                saldo= Double.parseDouble(JOptionPane.showInputDialog(null,"saldo:"));
                rendimento=Double.parseDouble(JOptionPane.showInputDialog(null,"rendimento:"));
                ContaPopanca cp1 = new ContaPopanca(numero,saldo,rendimento);
                cp1.atualizaRendimento();
                JOptionPane.showMessageDialog(null,"saldo"+cp1.getSaldo()+"\n conta poupança"+JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "final");
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "entre com a opcao valida", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }
}
