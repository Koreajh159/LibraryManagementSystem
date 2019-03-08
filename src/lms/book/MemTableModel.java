/*
 * JTable은 껍데기(View)에 불과하기 때문에 데이터(Model)를 제공해주는
 * 컨트롤러에 의존적이다!!
 */

package lms.book;

import javax.swing.table.AbstractTableModel;

public class MemTableModel extends AbstractTableModel {
   String[] columnTitle = { "회원번호", "회원이름", "회원상태", "연락처", "주소", "이메일","대출권수"};
   //Object[][] data;

   public int getColumnCount() {
      return columnTitle.length;
   }

   
   public String getColumnName(int col) {
      return columnTitle[col];
   }


   @Override
   public int getRowCount() {
      // TODO Auto-generated method stub
      return 2;
   }


   @Override
   public Object getValueAt(int arg0, int arg1) {
      // TODO Auto-generated method stub
      return null;
   }

}