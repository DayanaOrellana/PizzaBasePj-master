package edu.formularios;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import edu.pizza.base.Topping;
import edu.pizza.base.Pizza;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;



public class frmPizza {

    private JPanel jPanelPrincipal;
    private JComboBox comboBoxToppings;
    private JTextField txtPizza;
    private JButton btnAgregarIngredientes;
    private JLabel lblTotal;
    private JList lista1;
    private JButton btbPrepararPizza;
    private JLabel Label;
    private JTextField textField1;
    private JLabel Pago;
    private JRadioButton tarjetaDeCreditoRadioButton;
    private JRadioButton efectivoRadioButton;
    private JTextField textField2;

    private List<Topping>ingredientes = new ArrayList<>();

    private double total = 0.0;

    private DefaultListModel modeloLista = new DefaultListModel();
    private Topping topi;

    public JPanel getjPanelPrincipal() {

        return jPanelPrincipal;
    }

    public frmPizza() {
        cargarToppings();
        btnAgregarIngredientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Topping ingrediente= (Topping) comboBoxToppings.getSelectedItem();

                DefaultListModel modeloLista = new DefaultListModel();
                modeloLista.addElement(ingrediente);
                lista1.setModel(modeloLista);
                total = ingredientes.get(comboBoxToppings.getSelectedIndex()).getPrecio()+total;
                lblTotal.setText(String.valueOf(total));
            }
        });
        btbPrepararPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pizza pizza = new Pizza(txtPizza.getText());
                for (int i=0; i<lista1.getModel().getSize(); i++){
                    topi= (Topping)lista1.getModel().getElementAt(i);
                    pizza.addTopping(topi);
                }
                pizza.prepare();
            }
        });
    }

    //cargar toppings

    private void cargarToppings(){
        ingredientes.add(new Topping("champiñones", 5));
        ingredientes.add(new Topping("tomate", 5));
        ingredientes.add(new Topping("cebolla", 5));
        ingredientes.add(new Topping("chucho", 20));
        ingredientes.add(new Topping("salchicha", 10));
        ingredientes.add(new Topping("Anchoas", 10));

        DefaultComboBoxModel model = new DefaultComboBoxModel(ingredientes.toArray());
        comboBoxToppings.setModel(model);
    }

    private void PrepararPizza(){
        Pizza pizza = new Pizza(txtPizza.getText());
        for (int i=0; i<lista1.getModel().getSize(); i++){
            topi= (Topping)lista1.getModel().getElementAt(i);
        }
    }

    //private void comboBoxToppingsActionPerformed(java.out.event.ActionEvent evt){
        //TODO add your handLing code her:
    //}


    private void createUIComponents(){

    }
}
