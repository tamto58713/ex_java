package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HocTinhToan extends JFrame {

	private JPanel contentPane;
	private static JTextField txtNumA;
	private static JTextField txtDenA;
	private static JTextField txtNumB;
	private static JTextField txtDenB;
	private static JTextField txtNumC;
	private static JTextField txtDenC;
	private static JTextArea textArea;
	private static int option = 1;
	private static String txtResult = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HocTinhToan frame = new HocTinhToan();
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
	public HocTinhToan() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(BtSoSanh.class.getResource("/images/icons8_discount_60px_1.png")));
		
		setTitle("H\u1ECDc t\u00EDnh to\u00E1n hai ph\u00E2n s\u1ED1");
		setBounds(100, 100, 804, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ph\u00E9p to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblHngDn = new JLabel("H\u01B0\u1EDBng d\u1EABn");
		
		JButton btnPhnSMi = new JButton("Ph\u00E2n S\u1ED1 M\u1EDBi");
		btnPhnSMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generate(option);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		txtNumA = new JTextField();
		txtNumA.setText("1");
		txtNumA.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumA.setEditable(false);
		txtNumA.setColumns(10);
		
		txtDenA = new JTextField();
		txtDenA.setText("1");
		txtDenA.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenA.setEditable(false);
		txtDenA.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumA, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtNumA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		txtNumB = new JTextField();
		txtNumB.setText("1");
		txtNumB.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumB.setEditable(false);
		txtNumB.setColumns(10);
		
		txtDenB = new JTextField();
		txtDenB.setText("1");
		txtDenB.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenB.setEditable(false);
		txtDenB.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		txtNumC = new JTextField();
		txtNumC.setText("1");
		txtNumC.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumC.setEditable(false);
		txtNumC.setColumns(10);
		
		txtDenC = new JTextField();
		txtDenC.setText("1");
		txtDenC.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenC.setEditable(false);
		txtDenC.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDenC, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNumC, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtNumC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDenC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JButton btnKtThc = new JButton("K\u1EBFt th\u00FAc");
		btnKtThc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		final JLabel label = new JLabel("+");
		label.setEnabled(false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel("=");
		label_1.setEnabled(false);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnPhnSMi)
							.addGap(18)
							.addComponent(btnKtThc, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblHngDn, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(8)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(33)
											.addComponent(label))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
											.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnPhnSMi)
										.addComponent(btnKtThc))
									.addGap(44))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblHngDn)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_1))))))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("C\u1ED9ng");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numA = Integer.parseInt(txtNumA.getText());
				int denA = Integer.parseInt(txtDenA.getText());
				
				int numB = Integer.parseInt(txtNumB.getText());
				int denB = Integer.parseInt(txtDenB.getText());
				
				Fraction a = new Fraction(numA, denA);
				Fraction b = new Fraction(numB, denB);
				Fraction c = new Fraction();
				c = c.addition(a, b);
				
				txtNumC.setText(Integer.toString(c.getNumerator()));
				txtDenC.setText(Integer.toString(c.getDenomirator()));
				label.setText("+");
				option = 1;
				
				int gcd = GCD(denA, denB);
				int denBoth =  denA * denB / gcd;
				String txtResult2 = "";
				txtResult2 += txtNumA.getText() + " * (" +  Integer.toString(denBoth) + " / " + txtDenA.getText() + ") + "
						 + txtNumB.getText() + " * (" + Integer.toString(denB * denA / gcd) + " / " + txtDenB.getText() + ") = " 
						 + Integer.toString((numA * (denBoth/denA) + (numB * (denBoth/denB))));
				txtResult2 += "\n  -  Mẫu số  =  " + Integer.toString(denBoth); 
			}
		});
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setActionCommand("1");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tr\u1EEB");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numA = Integer.parseInt(txtNumA.getText());
				int denA = Integer.parseInt(txtDenA.getText());
				
				int numB = Integer.parseInt(txtNumB.getText());
				int denB = Integer.parseInt(txtDenB.getText());
				
				Fraction a = new Fraction(numA, denA);
				Fraction b = new Fraction(numB, denB);
				Fraction c = new Fraction();
				c = c.subtraction(a, b);
				
				txtNumC.setText(Integer.toString(c.getNumerator()));
				txtDenC.setText(Integer.toString(c.getDenomirator()));
				label.setText("-");
				option = 2;
				
				int gcd = GCD(denA, denB);
				int denBoth =  denA * denB / gcd;
				String txtResult2 = "";

				txtResult2 += txtNumA.getText() + " * (" +  Integer.toString(denBoth) + " / " + txtDenA.getText() + ") - "
						 + txtNumB.getText() + " * (" + Integer.toString(denB * denA / gcd) + " / " + txtDenB.getText() + ") = " 
						 + Integer.toString((numA * (denBoth/denA) - (numB * (denBoth/denB))));
				txtResult2 += "\n  -  Mẫu số  =  " + Integer.toString(denBoth);
				
				textArea.setText(txtResult + txtResult2);
				
			}
		});
		rdbtnNewRadioButton_1.setActionCommand("2");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nh\u00E2n");
		rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numA = Integer.parseInt(txtNumA.getText());
				int denA = Integer.parseInt(txtDenA.getText());
				
				int numB = Integer.parseInt(txtNumB.getText());
				int denB = Integer.parseInt(txtDenB.getText());
				
				Fraction a = new Fraction(numA, denA);
				Fraction b = new Fraction(numB, denB);
				Fraction c = new Fraction();
				c = c.multiple(a, b);
				
				txtNumC.setText(Integer.toString(c.getNumerator()));
				txtDenC.setText(Integer.toString(c.getDenomirator()));
				label.setText("*");
				option = 3;
				
				int gcd = GCD(denA, denB);
				int denBoth =  denA * denB / gcd;
				String txtResult2 = "";

				txtResult2 += txtNumA.getText() + " * " + txtNumB.getText() + " = " + Integer.toString(numA * numB);
				txtResult2 += "\n  -  Mẫu số  =  " +  txtDenA.getText() + " * " + txtDenB.getText() + " = " + Integer.toString(denA * denB);
				
			}
		});
		rdbtnNewRadioButton_2.setActionCommand("3");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Chia");
		rdbtnNewRadioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numA = Integer.parseInt(txtNumA.getText());
				int denA = Integer.parseInt(txtDenA.getText());
				
				int numB = Integer.parseInt(txtNumB.getText());
				int denB = Integer.parseInt(txtDenB.getText());
				
				Fraction a = new Fraction(numA, denA);
				Fraction b = new Fraction(numB, denB);
				Fraction c = new Fraction();
				c = c.divition(a, b);
				
				txtNumC.setText(Integer.toString(c.getNumerator()));
				txtDenC.setText(Integer.toString(c.getDenomirator()));
				label.setText("/");
				option = 4;
				
				int gcd = GCD(denA, denB);
				int denBoth =  denA * denB / gcd;
				String txtResult2 = "";

				txtResult2 += txtNumA.getText() + " * " + txtDenB.getText() + " = " + Integer.toString(numA * denB);
				txtResult2 += "\n  -  Mẫu số  =  " + txtDenA.getText() + " * " + txtNumB.getText() + " = " + Integer.toString(denA * numB);
			}
		});
		rdbtnNewRadioButton_3.setActionCommand("4");
		
		
		ButtonGroup btnG_oprerator = new ButtonGroup();
		btnG_oprerator.add(rdbtnNewRadioButton);
		btnG_oprerator.add(rdbtnNewRadioButton_1);
		btnG_oprerator.add(rdbtnNewRadioButton_2);
		btnG_oprerator.add(rdbtnNewRadioButton_3);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_2))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(rdbtnNewRadioButton)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_1)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_2)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_3)
					.addGap(66))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		generate(option);
	
		
		
	}
	
	public static void generate(int option) {
		int numA = (int) ((Math.random() * 10) * 1.1) + 1;
		int denA = (int) ((Math.random() * 10) * 1.1)+ 1;
		
		int numB = (int) ((Math.random() * 10) * 1.1) + 1;
		int denB = (int) ((Math.random() * 10) * 1.1) + 1;
		
		Fraction a = new Fraction(numA, denA);
		Fraction b =new Fraction(numB, denB);
		a = a.minimalize(a);
		b = a.minimalize(b);
		Fraction c = new Fraction();
		
		txtNumA.setText(Integer.toString(a.getNumerator()));
		txtDenA.setText(Integer.toString(a.getDenomirator()));
		
		txtNumB.setText(Integer.toString(b.getNumerator()));
		txtDenB.setText(Integer.toString(b.getDenomirator()));
		
		numA = a.getNumerator();
		denA = a.getDenomirator();
		numB = b.getNumerator();
		denB = b.getDenomirator();
		
		if (option == 1)
			c = c.addition(a, b);
		else if (option == 2)
			c = c.subtraction(a, b);
		else if (option == 3)
			c = c.multiple(a, b);
		else 
			c = c.divition(a, b);
		
		
		txtNumC.setText(Integer.toString(c.getNumerator()));
		txtDenC.setText(Integer.toString(c.getDenomirator()));
		
		txtResult = "  Bước 1: Tìm mẫu số chung của " + txtDenA.getText() + " và " + txtDenB.getText() + "\n";
		txtResult += "  -  Các ước số của " + txtDenA.getText() + ":     1, ";

		for (int i = 2; i <= (int) denA / 2; i++) {
			if (denA % i == 0)
				txtResult += Integer.toString(i) + ", ";
		}

		if (denA != 1)
			txtResult += Integer.toString(denA);

		txtResult += "\n  -  Các ước số của " + txtDenB.getText() + ":     1, ";

		for (int i = 2; i <= (int) denB / 2; i++) {
			if (denB % i == 0)
				txtResult += Integer.toString(i) + ", ";
		}
		if (denB != 1)
			txtResult += Integer.toString(denB);

		int gcd = GCD(denA, denB);
		txtResult += "\n  =>  Ước số chung lớn nhất:     " + Integer.toString(gcd)
				+ "\n  =>  Mẫu số chung: (" + txtDenA.getText() + " * " + txtDenB.getText() + ") / "
				+ Integer.toString(gcd) + " = " + Integer.toString(denA * denB / gcd);
		txtResult += "\n\n  Bước 2: Kết quả\n  -  Tử số  =  ";
		
		int denBoth =  denA * denB / gcd;
		String txtResult2 = "";
		if (option == 1) {
			txtResult2 += txtNumA.getText() + " * (" +  Integer.toString(denBoth) + " / " + txtDenA.getText() + ") + "
					 + txtNumB.getText() + " * (" + Integer.toString(denB * denA / gcd) + " / " + txtDenB.getText() + ") = " 
					 + Integer.toString((numA * (denBoth/denA) + (numB * (denBoth/denB))));
			txtResult2 += "\n  -  Mẫu số  =  " + Integer.toString(denBoth); 
		}
		else if (option == 2) {
			txtResult2 += txtNumA.getText() + " * (" +  Integer.toString(denBoth) + " / " + txtDenA.getText() + ") - "
					 + txtNumB.getText() + " * (" + Integer.toString(denB * denA / gcd) + " / " + txtDenB.getText() + ") = " 
					 + Integer.toString((numA * (denBoth/denA) - (numB * (denBoth/denB))));
			txtResult2 += "\n  -  Mẫu số  =  " + Integer.toString(denBoth);
		}
		else if (option == 3) {
			txtResult2 += txtNumA.getText() + " * " + txtNumB.getText() + " = " + Integer.toString(numA * numB);
			txtResult2 += "\n  -  Mẫu số  =  " +  txtDenA.getText() + " * " + txtDenB.getText() + " = " + Integer.toString(denA * denB);
		}
		else {
			txtResult2 += txtNumA.getText() + " * " + txtDenB.getText() + " = " + Integer.toString(numA * denB);
			txtResult2 += "\n  -  Mẫu số  =  " + txtDenA.getText() + " * " + txtNumB.getText() + " = " + Integer.toString(denA * numB);
		}
		 
		
		textArea.setText(txtResult + txtResult2);
		
	}
	private static int GCD(int a, int b) {
		while (b != 0) {
			a = a % b;
			int temp = b;
			b = a;
			a = temp;
		}

		return a;
	}
}
