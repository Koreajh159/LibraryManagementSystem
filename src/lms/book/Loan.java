package lms.book;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Loan extends JPanel {
   JButton bt_loan, bt_Re;
   JPanel p_north, p_west, p_east;
   JLabel la_member, la_lib;
   JTable table_member, table_lib;
   LibTableModel model_lib;
   MemTableModel model_mem;
   JScrollPane scroll_mem, scroll_lib;
   JButton bt_serch, bt_enter;

   // 오른쪽(east)정리
   JLabel la_member2, member2_id, member2_name, member2_state, member2_phone, member2_addr, member2_email,
         member2_loan, member2_regist;
   JLabel la_lib2, lib2_id, lib2_genre, lib2_name, lib2_pub, lib2_writer, lib2_count;
   // 텍스트필드 주기!!!!
   JTextField t_member2_id, t_member2_name, t_member2_state, t_member2_phone, t_member2_addr, t_member2_email,
         t_member2_loan, t_member2_regist;
   JTextField t_lib2_id, t_lib2_genre, t_lib2_name, t_lib2_pub, t_lib2_writer, t_lib2_count;

   public Loan() {

      p_west = new JPanel();
      p_east = new JPanel();


      p_west.setPreferredSize(new Dimension(700, 400));
      la_member = new JLabel("회원 목록");
      la_member.setFont(new Font("HY엽서L", Font.BOLD, 15));
      table_member = new JTable();
      la_lib = new JLabel("대출 도서 목록");
      la_lib.setFont(new Font("HY엽서L", Font.BOLD, 15));
      table_lib = new JTable();
      scroll_lib = new JScrollPane(table_lib);
      scroll_lib.setPreferredSize(new Dimension(700, 250));
      scroll_mem = new JScrollPane(table_member);
      scroll_mem.setPreferredSize(new Dimension(700, 150));

      // east 부분
      p_east.setPreferredSize(new Dimension(400, 500));
      la_member2 = new JLabel("회원 정보");
      la_member2.setFont(new Font("HY엽서L", Font.BOLD, 15));
      la_member2.setPreferredSize(new Dimension(350, 47));
      member2_id = new JLabel("회원 번호");
      member2_id.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_id.setPreferredSize(new Dimension(60, 27));
      member2_name = new JLabel("회원 이름");
      member2_name.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_name.setPreferredSize(new Dimension(60, 27));
      member2_state = new JLabel("회원 상태");
      member2_state.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_state.setPreferredSize(new Dimension(60, 27));
      member2_phone = new JLabel("회원 연락처");
      member2_phone.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_phone.setPreferredSize(new Dimension(70, 27));
      member2_addr = new JLabel("회원 주소");
      member2_addr.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_addr.setPreferredSize(new Dimension(60, 27));
      member2_email = new JLabel("회원 e-mail");
      member2_email.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_email.setPreferredSize(new Dimension(80, 27));
      member2_loan = new JLabel("대여 날짜");
      member2_loan.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_loan.setPreferredSize(new Dimension(60, 27));
      member2_regist = new JLabel("반납 날짜");
      member2_regist.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      member2_regist.setPreferredSize(new Dimension(60, 27));
      bt_serch = new JButton("검색");
      bt_serch.setPreferredSize(new Dimension(62, 30));
      bt_serch.setFont(new Font("HY엽서L", Font.BOLD, 13));
      bt_serch.setContentAreaFilled(false); // 버튼 배경 투명

      t_member2_id = new JTextField(9);
      t_member2_name = new JTextField(9);
      t_member2_state = new JTextField(8);
      t_member2_state.setEnabled(false);
      t_member2_phone = new JTextField(9);
      t_member2_addr = new JTextField(25);
      t_member2_addr.setEnabled(false);
      t_member2_email = new JTextField(23);
      t_member2_email.setEnabled(false);
      t_member2_loan = new JTextField(7);
      t_member2_loan.setEnabled(false);
      t_member2_regist = new JTextField(7);
      t_member2_regist.setEnabled(false);

      la_lib2 = new JLabel("도서 정보");
      la_lib2.setFont(new Font("HY엽서L", Font.BOLD, 15));
      la_lib2.setPreferredSize(new Dimension(350, 50));
      lib2_id = new JLabel("도서 번호");
      lib2_id.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      lib2_id.setPreferredSize(new Dimension(60, 27));
      lib2_genre = new JLabel("도서 장르");
      lib2_genre.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      lib2_genre.setPreferredSize(new Dimension(60, 27));
      lib2_name = new JLabel("도서명");
      lib2_name.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      lib2_name.setPreferredSize(new Dimension(55, 27));
      lib2_pub = new JLabel("출판사");
      lib2_pub.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      lib2_pub.setPreferredSize(new Dimension(55, 27));
      lib2_writer = new JLabel("저자명");
      lib2_writer.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      lib2_writer.setPreferredSize(new Dimension(50, 27));
      lib2_count = new JLabel("대출 가능 도서");
      lib2_count.setFont(new Font("HY엽서L", Font.PLAIN, 13));
      lib2_count.setPreferredSize(new Dimension(90, 27));

      t_lib2_id = new JTextField(10);
      t_lib2_genre = new JTextField(10);
      t_lib2_name = new JTextField(26);
      t_lib2_pub = new JTextField(26);
      t_lib2_writer = new JTextField(12);
      t_lib2_count = new JTextField(5);

      bt_enter = new JButton("대출");
      bt_enter.setPreferredSize(new Dimension(100, 50));
      bt_enter.setFont(new Font("HY엽서L", Font.BOLD, 20));
      bt_enter.setContentAreaFilled(false); // 버튼 배경 투명


      p_west.add(la_member);
      p_west.add(scroll_mem);
      p_west.add(la_lib);
      p_west.add(scroll_lib);

      p_east.add(la_member2);
      p_east.add(t_member2_id);
      p_east.add(member2_id);
      p_east.add(t_member2_id);
      p_east.add(member2_name);
      p_east.add(t_member2_name);
      p_east.add(member2_state);
      p_east.add(t_member2_state);
      p_east.add(member2_phone);
      p_east.add(t_member2_phone);
      p_east.add(member2_addr);
      p_east.add(t_member2_addr);
      p_east.add(member2_email);
      p_east.add(t_member2_email);
      p_east.add(member2_loan);
      p_east.add(t_member2_loan);
      p_east.add(member2_regist);
      p_east.add(t_member2_regist);
      p_east.add(bt_serch);

      p_east.add(la_lib2);
      p_east.add(lib2_id);
      p_east.add(t_lib2_id);
      p_east.add(lib2_genre);
      p_east.add(t_lib2_genre);
      p_east.add(lib2_name);
      p_east.add(t_lib2_name);
      p_east.add(lib2_pub);
      p_east.add(t_lib2_pub);
      p_east.add(lib2_writer);
      p_east.add(t_lib2_writer);
      p_east.add(lib2_count);
      p_east.add(t_lib2_count);
      p_east.add(bt_enter);


      this.setLayout(new BorderLayout());
      add(p_east, BorderLayout.EAST);
      add(p_west, BorderLayout.WEST);

      setPreferredSize(new Dimension(1150, 500));
 
      // 테이블과 모델 연결!!
      table_member.setModel(model_mem = new MemTableModel());
      table_lib.setModel(model_lib = new LibTableModel());
      // selectAll();
   }

}