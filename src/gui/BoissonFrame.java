package gui;

import dec.Boisson;
import dec.Deca;
import dec.Espresso;
import dec.Sumatra;
import decorateur.Chocolat;
import decorateur.Lait;
import decorateur.Sucre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by X-MART on 01-May-17.
 */
public class BoissonFrame extends JFrame {
    private JButton jButtonEspresso=new JButton("Espresso");
    private JButton jButtonDeca=new JButton("Deca");
    private JButton jButtonSumatra=new JButton("Sumatra");
    private JButton jButtonIngLait=new JButton("Lait");
    private JButton jButtonIngChocolat=new JButton("Chocolat");
    private JButton jButtonIngSucre=new JButton("Sucre");
    private JLabel jLabeldescription=new JLabel("Description: ");
    private JLabel jLabelprix=new JLabel("Prix: ");
    private Boisson boisson;

    public BoissonFrame() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel jpc=new JPanel();
        jpc.setLayout(new GridLayout(2,1));

        JPanel jPanel=new JPanel();
        jPanel.setLayout(new FlowLayout());
        jPanel.add(jButtonDeca);
        jPanel.add(jButtonEspresso);
        jPanel.add(jButtonSumatra);

        JPanel jPanel2=new JPanel();
        jPanel2.setLayout(new FlowLayout());
        jPanel2.add(jButtonIngLait);
        jPanel2.add(jButtonIngChocolat);
        jPanel2.add(jButtonIngSucre);
        jpc.add(jPanel);
        jpc.add(jPanel2);
        this.add(jpc,BorderLayout.NORTH);
        JPanel jPanelC=new JPanel();
        jPanelC.setLayout(new FlowLayout());
        jPanelC.add(jLabeldescription);
        jPanelC.add(jLabelprix);
        this.add(jPanelC,BorderLayout.CENTER);
        this.setSize(400,500);
        this.setVisible(true);

        jButtonEspresso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boisson=new Espresso();
                jLabeldescription.setText(boisson.getDescription());
                jLabelprix.setText(""+boisson.cout());
            }
        });
        jButtonDeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boisson=new Deca();
                jLabeldescription.setText(boisson.getDescription());
                jLabelprix.setText(""+boisson.cout());
            }
        });
        jButtonSumatra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boisson=new Sumatra();
                jLabeldescription.setText(boisson.getDescription());
                jLabelprix.setText(""+boisson.cout());
            }
        });
        jButtonIngChocolat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boisson=new Chocolat(boisson);
                jLabeldescription.setText(boisson.getDescription());
                jLabelprix.setText(""+boisson.cout());
            }
        });
        jButtonIngLait.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boisson=new Lait(boisson);
                jLabeldescription.setText(boisson.getDescription());
                jLabelprix.setText(""+boisson.cout());
            }
        });
        jButtonIngSucre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boisson=new Sucre(boisson);
                jLabeldescription.setText(boisson.getDescription());
                jLabelprix.setText(""+boisson.cout());
            }
        });
    }

    public static void main(String[] args) {
        new BoissonFrame();
    }
}
