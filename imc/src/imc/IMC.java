/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IMC {

        private double imc;
    private double peso;
    private double altura;
    private TextField txt1, txt2;
    private JLabel lbl1, lbl2, lbl3;
    private JButton calcular;
    private JFrame janela;
    private JPanel painel;

    public static void main(String[] args) {
        new IMC().montaTela();
    }

    private void montaTela() {
        prepText();
        prepLabel();
        prepBotao();
        prepJanela();
        prepPainel();
    }

    private void prepJanela() {
        janela = new JFrame("Cálculo do IMC");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setSize(400, 200);
        janela.setVisible(true);
    }

    private void prepPainel() {
        painel = new JPanel();
        painel.setLayout(new FlowLayout(3, 30, 10));
        janela.add(painel);
        painel.add(lbl1);
        painel.add(txt1);
        painel.add(lbl2);
        painel.add(txt2);
        painel.add(calcular);
        painel.add(lbl3);
    }

    private void prepBotao() {
        calcular = new JButton("Calcular");
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peso = Double.parseDouble(txt1.getText());
                altura = Double.parseDouble(txt2.getText());
                imc = peso / (altura * altura);
                if(imc < 18.5)
                lbl3.setText(String.valueOf(String.format("IMC = %.2f - Você está abaixo do peso ideal", imc)));
                else if(imc >= 18.5 && imc < 24.9)
                lbl3.setText(String.valueOf(String.format("IMC = %.2f - Parabéns — você está em seu peso normal!", imc)));
                else if(imc >= 25 && imc < 29.9)
                lbl3.setText(String.valueOf(String.format("IMC = %.2f - Você está acima de seu peso (sobrepeso)", imc)));
                else if(imc >= 30 && imc < 34.9)
                lbl3.setText(String.valueOf(String.format("IMC = %.2f - Obesidade grau I", imc)));
                else if(imc >= 35 && imc < 39.9)
                lbl3.setText(String.valueOf(String.format("IMC = %.2f - Obesidade grau II", imc)));
                else
                lbl3.setText(String.valueOf(String.format("IMC = %.2f - Obesidade grau III", imc)));
            }
        });
    }

    private void prepText() {
        txt1 = new TextField(6);
        txt2 = new TextField(6);
    }

    private void prepLabel() {
        lbl1 = new JLabel("Informe  o  peso   em   Kg    : ");
        lbl2 = new JLabel("Informe a altura em metros: ");
        lbl3 = new JLabel("IMC");
    }

}
