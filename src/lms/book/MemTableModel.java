/*
 * JTable�� ������(View)�� �Ұ��ϱ� ������ ������(Model)�� �������ִ�
 * ��Ʈ�ѷ��� �������̴�!!
 */

package lms.book;

import javax.swing.table.AbstractTableModel;

public class MemTableModel extends AbstractTableModel {
   String[] columnTitle = { "ȸ����ȣ", "ȸ���̸�", "ȸ������", "����ó", "�ּ�", "�̸���","����Ǽ�"};
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