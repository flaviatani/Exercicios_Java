/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora {

       double vlr1, vlr2;
    String sinal;
    private JFrame janela;
    private JPanel painelEntrada, painelBotoes;
    private TextField txt;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPto, btnRes, btnDiv, btnMult, btnSub, btnSoma, btnC;

    public static void main(String[] args) {
        new Calculadora().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        definirEventos();
    }

    private void preparaJanela() {
        janela = new JFrame("Calculdora");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painelEntrada = new JPanel();
        painelEntrada.setLayout(new BoxLayout(painelEntrada, BoxLayout.PAGE_AXIS));
        janela.add(painelEntrada, BorderLayout.NORTH);

        painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(5, 4));
        janela.add(painelBotoes, BorderLayout.CENTER);

        txt = new TextField("");
        painelEntrada.add(txt);

        btn7 = new JButton("7");
        painelBotoes.add(btn7);

        btn8 = new JButton("8");
        painelBotoes.add(btn8);

        btn9 = new JButton("9");
        painelBotoes.add(btn9);

        btnDiv = new JButton("/");
        painelBotoes.add(btnDiv);

        btn4 = new JButton("4");
        painelBotoes.add(btn4);

        btn5 = new JButton("5");
        painelBotoes.add(btn5);

        btn6 = new JButton("6");
        painelBotoes.add(btn6);

        btnMult = new JButton("*");
        painelBotoes.add(btnMult);

        btn1 = new JButton("1");
        painelBotoes.add(btn1);

        btn2 = new JButton("2");
        painelBotoes.add(btn2);

        btn3 = new JButton("3");
        painelBotoes.add(btn3);

        btnSub = new JButton("-");
        painelBotoes.add(btnSub);

        btn0 = new JButton("0");
        painelBotoes.add(btn0);

        btnPto = new JButton(".");
        painelBotoes.add(btnPto);

        btnRes = new JButton("=");
        painelBotoes.add(btnRes);

        btnSoma = new JButton("+");
        painelBotoes.add(btnSoma);
        
        btnC = new JButton("C");
        painelBotoes.add(btnC);
        
        janela.pack();
        janela.setSize(300, 300);
        janela.setVisible(true);
    }

    private void definirEventos() {

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "9");
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vlr1 = 0;
                vlr2 = 0;
                txt.setText("");
            }
        });
        btnPto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + ".");
            }
        });
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vlr1 = Double.parseDouble(txt.getText());
                txt.setText("");
                sinal = "soma";
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vlr1 = Double.parseDouble(txt.getText());
                txt.setText("");
                sinal = "subt";
            }
        });
         btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vlr1 = Double.parseDouble(txt.getText());
                txt.setText("");
                sinal = "mult";
            }
        });
          btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vlr1 = Double.parseDouble(txt.getText());
                txt.setText("");
                sinal = "div";
            }
        });
        btnRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vlr2 = Double.parseDouble(txt.getText());
                if(sinal == "soma"){
                    txt.setText(String.valueOf(vlr1 + vlr2));
                }
                if(sinal == "subt"){
                    txt.setText(String.valueOf(vlr1 - vlr2));
                }
                if(sinal == "mult"){
                    txt.setText(String.valueOf(vlr1 * vlr2));
                }
                if(sinal == "div"){
                    txt.setText(String.valueOf(vlr1 / vlr2));
                }
            }
        });
    }
}
