package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BtSoSanh extends JFrame {

	private JPanel contentPane;
	private static JTextField txtDenA;
	private static JTextField txtNumA;
	private static JTextField txtDenB;
	private static JTextField txtNumB;
	private static JTextField txtOperator;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BtSoSanh frame = new BtSoSanh();
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
	public BtSoSanh() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BtSoSanh.class.getResource("/images/icons8_discount_60px_1.png")));
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		txtDenA = new JTextField();
		txtDenA.setText("1");
		txtDenA.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenA.setEditable(false);
		txtDenA.setColumns(10);
		
		txtNumA = new JTextField();
		txtNumA.setText("1");
		txtNumA.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumA.setEditable(false);
		txtNumA.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumA, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtNumA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		txtDenB = new JTextField();
		txtDenB.setText("1");
		txtDenB.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenB.setEditable(false);
		txtDenB.setColumns(10);
		
		txtNumB = new JTextField();
		txtNumB.setText("1");
		txtNumB.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumB.setEditable(false);
		txtNumB.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		txtOperator = new JTextField();
		txtOperator.setHorizontalAlignment(SwingConstants.CENTER);
		txtOperator.setColumns(10);
		
		JLabel label = new JLabel("H\u1ECD t\u00EAn");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton button = new JButton("T\u1EA1o s\u1ED1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generateFraction();
			}
		});
		
		JButton button_1 = new JButton("Ki\u1EC3m Tra");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				if (txtOperator.getText().length() == 0) {
					JOptionPane.showMessageDialog(contentPane, "Hãy điền >, <, =");
				}
				else if ((txtOperator.getText().equals(">")) || (txtOperator.getText().equals("<"))
						|| (txtOperator.getText().equals("="))){
					int numA = Integer.parseInt(txtNumA.getText());
					int denA = Integer.parseInt(txtDenA.getText());
					
					int numB = Integer.parseInt(txtNumB.getText());
					int denB = Integer.parseInt(txtDenB.getText());
					
					Fraction a = new Fraction(numA, denA);
					Fraction b =new Fraction(numB, denB);
					
					Fraction c = new Fraction();
					String operator = c.commpareFractions(a, b);
					
					if(operator.equals(txtOperator.getText())) {
						int b1 = JOptionPane.showConfirmDialog(contentPane, "Bạn có muốn thử lại với bài tập mới");
						if (b1 == 0) {
							generateFraction();
						}
					}
					else
						JOptionPane.showMessageDialog(contentPane, "Sai rồi thằng ngu à!");
					
						
					
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "Dấu biểu thức không hợp lệ!");
					txtOperator.setText("");
				}
					
				
			}
		});
		
		JButton button_2 = new JButton("K\u1EBFt th\u00FAc");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(122, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtOperator, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(119))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(167, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(62)
							.addComponent(txtOperator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1)
						.addComponent(button_2))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		generateFraction();
		
		
	}

	public static void generateFraction() {
		int numA = (int) ((Math.random() * 10) * 1.1) + 1;
		int denA = (int) ((Math.random() * 10) * 1.1)+ 1;
		
		int numB = (int) ((Math.random() * 10) * 1.1) + 1;
		int denB = (int) ((Math.random() * 10) * 1.1) + 1;
		
		Fraction a = new Fraction(numA, denA);
		Fraction b =new Fraction(numB, denB);
		a = a.minimalize(a);
		b = a.minimalize(b);
		
		txtNumA.setText(Integer.toString(a.getNumerator()));
		txtDenA.setText(Integer.toString(a.getDenomirator()));
		
		txtNumB.setText(Integer.toString(b.getNumerator()));
		txtDenB.setText(Integer.toString(b.getDenomirator()));
		
		txtOperator.setText("");
	}
}
