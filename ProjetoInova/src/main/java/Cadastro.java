import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.sql.*



;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		textField_1 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 176, SpringLayout.WEST, contentPane);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 21, SpringLayout.SOUTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 176, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		textField.setColumns(10);
		contentPane.add(textField);
		
		textField_2 = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 23, SpringLayout.SOUTH, textField);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 176, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_1);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_3, -125, SpringLayout.WEST, comboBox);
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, -10, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, 334, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, -96, SpringLayout.EAST, contentPane);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Potencial Cliente");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 79, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("E-Mail");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEmail, 3, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblEmail, -26, SpringLayout.WEST, textField);
		contentPane.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTelefone, 0, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTelefone, -24, SpringLayout.WEST, textField_2);
		contentPane.add(lblTelefone);
		
		JLabel lblDeInvestidor = new JLabel("Tipo de Investidor");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDeInvestidor, 41, SpringLayout.SOUTH, lblTelefone);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDeInvestidor, 79, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblDeInvestidor, -196, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblDeInvestidor, -416, SpringLayout.EAST, contentPane);
		contentPane.add(lblDeInvestidor);
		
		JComboBox comboBox_1 = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_3, 44, SpringLayout.SOUTH, comboBox_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_1, -1, SpringLayout.NORTH, lblDeInvestidor);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_1, 0, SpringLayout.WEST, textField_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox_1, 162, SpringLayout.EAST, lblDeInvestidor);
		contentPane.add(comboBox_1);
		
		JLabel lblTipoDeRisco = new JLabel("Tipo de Risco");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTipoDeRisco, 0, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTipoDeRisco, -8, SpringLayout.WEST, textField_3);
		contentPane.add(lblTipoDeRisco);
		
		JLabel lblSugestoDeFundo = new JLabel("Sugestão de Fundo");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSugestoDeFundo, 0, SpringLayout.NORTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblSugestoDeFundo, -15, SpringLayout.WEST, comboBox);
		contentPane.add(lblSugestoDeFundo);
		
		JButton btnNewButton = new JButton("Salvar Perfil");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 54, SpringLayout.SOUTH, textField_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, lblNewLabel);
		contentPane.add(btnNewButton);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFechar, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFechar, 51, SpringLayout.EAST, btnNewButton);
		contentPane.add(btnFechar);
	}
}
