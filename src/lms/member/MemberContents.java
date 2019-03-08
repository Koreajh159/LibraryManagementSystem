package lms.member;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import lms.MainFrame;

public class MemberContents extends JPanel{
	

	//���� ���̺� �г�
	JPanel p_west;
	JPanel p_west1;
	JPanel p_west2;
	JPanel p_west3;
	JLabel l_memList;
	JButton bt_allSelect, bt_selectedDel, bt_excel;
	
	//���̺� ���� ��ǰ�� ������ ��
	JTable table;
	JScrollPane scroll;
	MemberTableModel model;
	
	JLabel l_search;
	Choice ch_search;
	JTextField t_search;
	JButton bt_search;

	//������ �����Է� �г�
	JPanel p_east, p_east2;
	
	JLabel l_info;
	JLabel l_number, l_name, l_phon, l_addres, l_email;
	JTextField t_number, t_name, t_phon, t_addres, t_email;
	JLabel l_state, l_rent, l_reserve;
	Choice ch_state;
	JTextField t_rent, t_reserve;
	JButton bt_join, bt_alter, bt_del;
	JPanel p_bt;
	
	
	
	
	public MemberContents() {
		setLayout(new BorderLayout());
		String font="HY����L";
		int h2=18;
		int h3=15;
		
		
		//���� ��ǰ
		p_west=new JPanel();
		p_west.setLayout(new BorderLayout());
		p_west1=new JPanel();
		p_west2=new JPanel();
		p_west3=new JPanel();
		l_memList=new JLabel("ȸ�����");
		l_memList.setFont(new Font(font, Font.BOLD, h2));
		bt_allSelect=new JButton("��ü����");
		bt_selectedDel=new JButton("���û���");
		bt_excel=new JButton("Excel�� ����");
		
		table=new JTable();//model ���� ����
		scroll = new JScrollPane(table);
		
		l_search=new JLabel("�˻�");
		l_search.setFont(new Font(font, Font.BOLD, h2));
		ch_search=new Choice();
		ch_search.setFont(new Font(font, Font.BOLD, h3));
		t_search=new JTextField(20);
		bt_search=new JButton("�˻�");
		
		//���� ��ǰ
		p_east = new JPanel();
		p_east.setLayout(new BorderLayout());
		p_east2 = new JPanel();
		l_info=new JLabel("ȸ������");
		l_info.setHorizontalAlignment(SwingConstants.CENTER);
		l_info.setFont(new Font(font, Font.BOLD, h2));
		l_number=new JLabel("ȸ����ȣ");
		l_number.setFont(new Font(font, Font.BOLD, h3));
		t_number=new JTextField();
		t_number.setFont(new Font(font, Font.BOLD, h3));
		l_name=new JLabel("ȸ���̸�");
		l_name.setFont(new Font(font, Font.BOLD, h3));
		t_name=new JTextField();
		t_name.setFont(new Font(font, Font.BOLD, h3));
		l_phon=new JLabel("����ó");
		l_phon.setFont(new Font(font, Font.BOLD, h3));
		t_phon=new JTextField();
		t_phon.setFont(new Font(font, Font.BOLD, h3));
		l_addres=new JLabel("�ּ�");
		l_addres.setFont(new Font(font, Font.BOLD, h3));
		t_addres=new JTextField();
		t_addres.setFont(new Font(font, Font.BOLD, h3));
		l_email=new JLabel("�̸���");
		l_email.setFont(new Font(font, Font.BOLD, h3));
		t_email=new JTextField();
		t_email.setFont(new Font(font, Font.BOLD, h3));
		l_state=new JLabel("ȸ������");
		l_state.setFont(new Font(font, Font.BOLD, h3));
		ch_state=new Choice();
		ch_state.setFont(new Font(font, Font.BOLD, h3));
		l_rent=new JLabel("����/���ɱǼ�");
		l_rent.setFont(new Font(font, Font.BOLD, h3));
		t_rent=new JTextField();
		t_rent.setFont(new Font(font, Font.BOLD, h3));
		l_reserve=new JLabel("����/���ɱǼ�");
		l_reserve.setFont(new Font(font, Font.BOLD, h3));
		t_reserve=new JTextField();
		t_reserve.setFont(new Font(font, Font.BOLD, h3));
		bt_join=new JButton("�űԵ��");
		bt_join.setFont(new Font(font, Font.BOLD, h3));
		bt_alter=new JButton("��������");
		bt_alter.setFont(new Font(font, Font.BOLD, h3));
		bt_del=new JButton("ȸ������");
		bt_del.setFont(new Font(font, Font.BOLD, h3));
		p_bt=new JPanel();
		
		
		//���� ����
		table.setModel(model=new MemberTableModel());
		l_memList.setPreferredSize(new Dimension(100, 30));
		p_west1.add(l_memList);
		p_west1.add(bt_allSelect);
		p_west1.add(bt_selectedDel);
		p_west1.add(bt_excel);
		
		scroll.setPreferredSize(new Dimension(600,380));
		p_west2.add(scroll);
		p_west3.add(l_search);
		l_search.setPreferredSize(new Dimension(60,30));
		for(int i=0;i<model.columnTitle.length-3;i++) {
			ch_search.add(model.columnTitle[i]);
		}
		p_west3.add(ch_search);
		p_west3.add(t_search);
		t_search.setPreferredSize(new Dimension(250,28));
		p_west3.add(bt_search);
		
		p_west.add(p_west1,BorderLayout.NORTH);
		p_west.add(p_west2);
		p_west.add(p_west3,BorderLayout.SOUTH);

		//p_west.setSize(MainFrame.WIDTH*3/5,550);
		p_west.setBounds(0,50,MainFrame.WIDTH*3/5,550);
		add(p_west,BorderLayout.WEST);
		
		//���� ����
		//���̵��1 - > ���̶� �ʵ� ���� �迭�� �ְ� for�� ������ -> �������� ������ ��������� �Ⱒ
		Dimension l=new Dimension(130,35);
		Dimension t=new Dimension(250,25);
		
		p_east2.add(l_info);	l_info.setPreferredSize(new Dimension(400,70));
		p_east2.add(l_number);	l_number.setPreferredSize(new Dimension(l));
		p_east2.add(t_number);	t_number.setPreferredSize(new Dimension(t));	t_number.setEnabled(false);
		p_east2.add(l_name);	l_name.setPreferredSize(new Dimension(l));
		p_east2.add(t_name);	t_name.setPreferredSize(new Dimension(t));
		p_east2.add(l_phon);	l_phon.setPreferredSize(new Dimension(l));
		p_east2.add(t_phon);	t_phon.setPreferredSize(new Dimension(t));
		p_east2.add(l_addres);	l_addres.setPreferredSize(new Dimension(l));
		p_east2.add(t_addres);	t_addres.setPreferredSize(new Dimension(t));
		p_east2.add(l_email);	l_email.setPreferredSize(new Dimension(l));
		p_east2.add(t_email);	t_email.setPreferredSize(new Dimension(t));
		p_east2.add(l_state);	l_state.setPreferredSize(new Dimension(l));
		//�̺κ� ���� db��������� ��ü����
		ch_state.add("����");
		ch_state.add("��ü��");
		ch_state.add("��������");
		ch_state.add("�������");
		p_east2.add(ch_state);	ch_state.setPreferredSize(new Dimension(t));
		
		p_east2.add(l_rent);	l_rent.setPreferredSize(new Dimension(l));
		p_east2.add(t_rent);	t_rent.setPreferredSize(new Dimension(t));	t_rent.setEnabled(false);
		p_east2.add(l_reserve);	l_reserve.setPreferredSize(new Dimension(l));
		p_east2.add(t_reserve);	t_reserve.setPreferredSize(new Dimension(t));	t_reserve.setEnabled(false);
		
		p_bt.add(bt_join);
		p_bt.add(bt_alter);
		p_bt.add(bt_del);
		p_east.add(p_bt, BorderLayout.NORTH);
		p_east.add(p_east2, BorderLayout.CENTER);
		
		p_east2.setPreferredSize(new Dimension(MainFrame.WIDTH*1/3, MainFrame.HEIGHT-100));
		add(p_east,BorderLayout.CENTER);
		
		setSize(MainFrame.WIDTH,MainFrame.HEIGHT-55);
		setVisible(true);
		//setBackground(Color.BLUE);

		
	}
}
