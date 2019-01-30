/*
 * JTable은 껍데기(View)에 불과하기 때문에 데이터(Model)를 제공해주는
 * 컨트롤러에 의존적이다!!
 */

package lms.book;

import javax.swing.table.AbstractTableModel;

public class LibTableModel extends AbstractTableModel {
   String[] columnTitle = { "도서번호", "도서명", "출판사", "저자", "대출일", "반납일"};
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