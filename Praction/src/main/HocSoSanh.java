package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HocSoSanh extends JFrame {

	private JPanel contentPane;
	private static JTextField txtNumA;
	private static JTextField txtDenA;
	private static JTextField txtNumB;
	private static JTextField txtDenB;
	private static JLabel label_operator;
	private static JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HocSoSanh frame = new HocSoSanh();
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
	public HocSoSanh() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(BtSoSanh.class.getResource("/images/icons8_discount_60px_1.png")));

		setTitle("H\u1ECDc so s\u00E1nh");
		setBounds(100, 100, 561, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblNewLabel = new JLabel("H\u01B0\u1EDBng d\u1EABn");

		label_operator = new JLabel("=");

		JButton btnNewButton = new JButton("Ph\u00E2n s\u1ED1 m\u1EDBi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generateFraction();
			}
		});

		JButton btnKtThc = new JButton("K\u1EBFt th\u00FAc");
		btnKtThc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(36)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_operator)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(btnNewButton)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnKtThc, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
				.addGap(65)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(20).addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(85).addComponent(label_operator)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(54)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton)
								.addComponent(btnKtThc))
						.addGap(33)));

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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(13, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addContainerGap()
				.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(15, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		txtNumA = new JTextField();
		txtNumA.setEditable(false);
		txtNumA.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumA.setText("1");
		txtNumA.setColumns(10);

		txtDenA = new JTextField();
		txtDenA.setText("1");
		txtDenA.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenA.setEditable(false);
		txtDenA.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNumA, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addComponent(txtNumA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(15, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);

		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(gl_contentPane);
		generateFraction();
	}

	public static void generateFraction() {
		int numA = (int) ((Math.random() * 10) * 1.1) + 1;
		int denA = (int) ((Math.random() * 10) * 1.1) + 1;

		int numB = (int) ((Math.random() * 10) * 1.1) + 1;
		int denB = (int) ((Math.random() * 10) * 1.1) + 1;

		txtNumA.setText(Integer.toString(numA));
		txtDenA.setText(Integer.toString(denA));

		txtNumB.setText(Integer.toString(numB));
		txtDenB.setText(Integer.toString(denB));

		Fraction a = new Fraction(numA, denA);
		Fraction b = new Fraction(numB, denB);
		a = a.minimalize(a);
		b = a.minimalize(b);

		numA = a.getNumerator();
		denA = a.getDenomirator();
		numB = b.getNumerator();
		denB = b.getDenomirator();
		
		Fraction c = new Fraction();
		String result = c.commpareFractions(a, b);

		String txtResult = "  Bước 1: Tìm mẫu số chung của " + txtDenA.getText() + " và " + txtDenB.getText() + "\n";
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
				+ Integer.toString(gcd) + " = " + Integer.toString(denA * denB / gcd)
				+ "\n\n  Bước 2: So sánh 2 tử số\n  Tử số phân số 1 = " + txtNumA.getText() + " * (" + Integer.toString(gcd)
				+ " / " + txtDenA.getText() +") = " + Integer.toString(numA * ((denA * denB / gcd)/denA)) + "\n  "
				+ "Tử số phân số 2 = " + txtNumB.getText() + " * (" + Integer.toString(gcd) + " / " + txtDenB.getText()
				+ ") = " + Integer.toString(numB * ((denB * denA / gcd)/denB)) + "\n  ";
		
		if (numA * ((denA * denB / gcd)/denA) > (numB * ((denB * denA / gcd)/denB))) {
			txtResult += Integer.toString(numA * ((denA * denB / gcd)/denA)) + " > " + 
					Integer.toString(numB * ((denB * denA / gcd)/denB)) + "  => Phân số 1 lớn hơn phân số 2";
		}
		
		else if (numA * ((denA * denB / gcd)/denA) < (numB * ((denB * denA / gcd)/denB))) {
			txtResult += Integer.toString(numA * ((denA * denB / gcd)/denA)) + " < " + 
					Integer.toString(numB * ((denB * denA / gcd)/denB)) + "  => Phân số 1 nhỏ hơn phân số 2";
		}
		
		else {
			txtResult += Integer.toString(numA * ((denA * denB / gcd)/denA)) + " = " + 
					Integer.toString(numB * ((denB * denA / gcd)/denB)) + "  => Phân số 1 bằng phân số 2";
		}
		
		
		textArea.setText(txtResult);
		label_operator.setText(result);
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
