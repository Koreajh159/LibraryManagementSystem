package lms.book;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BookMain extends JPanel {
	JPanel p_north = new JPanel();
	JPanel p_center = new JPanel();
	JButton bt_loan, bt_Re;
	JPanel[] pages = new JPanel[2];

	public BookMain() {
		setLayout(new BorderLayout());
		p_north.setPreferredSize(new Dimension(700, 45));
		bt_loan = new JButton("¥Î√‚");
		bt_loan.setPreferredSize(new Dimension(100, 35));
		bt_loan.setFont(new Font("HYø±º≠L", Font.BOLD, 25));

		bt_loan.setContentAreaFilled(false);
		bt_Re = new JButton("π›≥≥");
		bt_Re.setPreferredSize(new Dimension(100, 35));
		bt_Re.setFont(new Font("HYø±º≠L", Font.BOLD, 25));
		bt_Re.setContentAreaFilled(false);

		p_north.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		p_north.add(bt_loan);
		p_north.add(bt_Re);
		pages[0] = new Loan();
		pages[1] = new Return();
		setPages();
		bt_loan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showPages(0);
			}
		});

		bt_Re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showPages(1);
			}
		});
		add(p_north, BorderLayout.NORTH);
		add(p_center);
	}

	public void setPages() {
		for (int i = 0; i < pages.length; i++) {
			p_center.add(pages[i]);
		}
	}

	public void showPages(int index) {
		for (int i = 0; i < pages.length; i++) {
			if (i == index) {
				pages[i].setVisible(true);
			} else {
				pages[i].setVisible(false);
			}
		}
	}
}
