/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaomoedas;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Conversaomoedas {

    private double vlr, moeda;
    private final double moedaD = 5.44;
    private final double moedaE = 6.54;
    private final double moedaY = 0.05;
    private JFrame janela;
    private JPanel painel;
    private TextField txt;
    private JButton calcular;
    private JLabel lbl1, lbl2;
    private JRadioButton dolar, euro, iene;

    public static void main(String[] args) {
        new Conversaomoedas().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        preparaEventos();
    }

    private void preparaJanela() {
        janela = new JFrame("Conversão de Moedas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel = new JPanel();
        painel.setLayout(new FlowLayout(3, 30, 10));
        janela.add(painel);

        lbl1 = new JLabel("Informe o valor em Reais: ");
        txt = new TextField(10);

        lbl2 = new JLabel("");

        painel.add(lbl1);
        painel.add(txt);

        dolar = new JRadioButton("Dolar");
        euro = new JRadioButton("Euro");
        iene = new JRadioButton("Iene");
        
        dolar.setSelected(true);
                
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(dolar);
        grupo.add(euro);
        grupo.add(iene);
        painel.add(dolar);
        painel.add(euro);
        painel.add(iene);
    }

    private void preparaEventos() {
        calcular = new JButton("Calcular");
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dolar.isSelected()) {
                    vlr = Double.parseDouble(txt.getText());
                    lbl2.setText(String.valueOf(String.format("US$ %.2f", (vlr / moedaD))));
                }
                if (euro.isSelected()) {
                    vlr = Double.parseDouble(txt.getText());
                    lbl2.setText(String.valueOf(String.format("€ %.2f", (vlr / moedaE))));
                }
                if (iene.isSelected()) {
                    vlr = Double.parseDouble(txt.getText());
                    lbl2.setText(String.valueOf(String.format("¥ %.2f", (vlr / moedaY))));
                }
            }
        });
        
        painel.add(calcular);
        painel.add(lbl2);
        janela.pack();
        janela.setSize(600, 200);
        janela.setVisible(true);
    }
}
