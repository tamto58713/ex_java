package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BtTinhToan extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private static JTextField txtNumA;
	private static JTextField txtDenA;
	private static JTextField txtNumB;
	private static JTextField txtDenB;
	private static JTextField txtNumC;
	private static JTextField txtDenC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BtTinhToan frame = new BtTinhToan();
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
	private boolean isNaN(String numberString) {
		
		if (numberString.length() == 0)
			return true;
		int i = 0;
		while (i < numberString.length()) {
			if ((numberString.charAt(i) < 48) ||(numberString.charAt(i) > 57))
				return true;
			i++;
		}
		return false;
	}
	
	public BtTinhToan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BtSoSanh.class.getResource("/images/icons8_discount_60px_1.png")));
		setTitle("L\u00E0m b\u00E0i t\u1EADp ph\u00E2n s\u1ED1");
		setBounds(100, 100, 490, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblHTn = new JLabel("H\u1ECD t\u00EAn");
		
		textName = new JTextField();
		textName.setColumns(10);
		
		final JLabel lb_operator = new JLabel("+");
		lb_operator.setEnabled(false);
		lb_operator.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("=");
		label.setEnabled(false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Ph\u00E9p to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JRadioButton radioButton = new JRadioButton("Chia");
		radioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lb_operator.setText("/");
			}
		});
		radioButton.setActionCommand("4");
		
		JRadioButton radioButton_1 = new JRadioButton("Tr\u1EEB");
		radioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lb_operator.setText("-");
			}
		});
		radioButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		radioButton_1.setActionCommand("2");
		
		JRadioButton radioButton_2 = new JRadioButton("C\u1ED9ng");
		radioButton_2.setActionCommand("1");
		
		radioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lb_operator.setText("+");
			}
		});
		radioButton_2.setSelected(true);
		radioButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		JRadioButton radioButton_3 = new JRadioButton("Nh\u00E2n");
		radioButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lb_operator.setText("*");
			}
		});
		radioButton_3.setActionCommand("3");
		
		

		final ButtonGroup btnG_oprerator = new ButtonGroup();
		
		btnG_oprerator.add(radioButton_2);
		btnG_oprerator.add(radioButton_1);
		btnG_oprerator.add(radioButton);
		btnG_oprerator.add(radioButton_3);
	
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 110, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton)
						.addComponent(radioButton_1)
						.addComponent(radioButton_2)
						.addComponent(radioButton_3))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 188, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(radioButton_2)
					.addGap(18)
					.addComponent(radioButton_1)
					.addGap(18)
					.addComponent(radioButton_3)
					.addGap(18)
					.addComponent(radioButton)
					.addGap(66))
		);
		panel.setLayout(gl_panel);
		
		JButton button = new JButton("T\u1EA1o s\u1ED1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generateFraction();
			}
		});
		
		JButton button_1 = new JButton("Ki\u1EC3m Tra");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numA = Integer.parseInt(txtNumA.getText());
				int denA = Integer.parseInt(txtDenA.getText());
				
				int numB = Integer.parseInt(txtNumB.getText());
				int denB = Integer.parseInt(txtDenB.getText());
				int numC = 0, denC = 1;
				if (isNaN(txtNumC.getText())|| (isNaN(txtDenC.getText()))) {
					JOptionPane.showMessageDialog(contentPane, "Lỗi! Hãy điền vào ô trống!");
				}
				else {
					numC = Integer.parseInt(txtNumC.getText());
					denC = Integer.parseInt(txtDenC.getText());
				}
					
				String action = btnG_oprerator.getSelection().getActionCommand();
				
				Fraction a = new Fraction(numA, denA);
				Fraction b = new Fraction(numB, denB);
				Fraction c = new Fraction();
				
				
				if (action == "1")
					c = c.addition(a, b);
				else if (action == "2") 
					c = c.subtraction(a, b);
				else if (action == "3")
					c = c.multiple(a, b);
				else
					c = c.divition(a, b);
				
				if ((c.getNumerator() == numC) && (c.getDenomirator() == denC)) {
					int b1 = JOptionPane.showConfirmDialog(contentPane, "Bạn có muốn thử lại với bài tập mới");
					if (b1 == 0) {
						generateFraction();
					}
					
				}
				else {
					JOptionPane.showMessageDialog(contentPane,"Sai rồi! liu liu");
				}
					
				
				
			}
		});
		
		JButton button_2 = new JButton("K\u1EBFt th\u00FAc");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		txtNumA = new JTextField();
		txtNumA.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumA.setText("123");
		txtNumA.setEnabled(false);
		txtNumA.setColumns(10);
		
		txtDenA = new JTextField();
		txtDenA.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenA.setText("456");
		txtDenA.setEnabled(false);
		txtDenA.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 60, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNumA, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDenA, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
		txtNumB.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumB.setText("1");
		txtNumB.setEnabled(false);
		txtNumB.setColumns(10);
		
		txtDenB = new JTextField();
		txtDenB.setText("3");
		txtDenB.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenB.setEnabled(false);
		txtDenB.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 60, Short.MAX_VALUE)
				.addGap(0, 60, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNumB, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDenB, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
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
		txtNumC.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumC.setColumns(10);
		
		txtDenC = new JTextField();
		txtDenC.setHorizontalAlignment(SwingConstants.CENTER);
		txtDenC.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 60, Short.MAX_VALUE)
				.addGap(0, 60, Short.MAX_VALUE)
				.addGap(0, 60, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNumC, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDenC, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGap(0, 75, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtNumC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDenC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblHTn, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textName, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(36)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lb_operator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addGap(11)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGap(34)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addContainerGap(29, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHTn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(textName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(50)
									.addComponent(lb_operator))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(82)
							.addComponent(label)))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_2)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
		
		txtNumC.setText("");
		txtDenC.setText("");
		
	}
}
