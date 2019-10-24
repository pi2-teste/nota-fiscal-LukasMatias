package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;
import javax.swing.table.AbstractTableModel;

public class NotaFiscalTable extends AbstractTableModel {

    private String[] columnNames = {"NumNota", "ValNota", "NomeProduto"};
    NotaFiscal a = new NotaFiscal();

    public int getColumnCount() {
        return 2;
    }

    public int getRowCount() {
        NotaFiscalDAO.conta();
        return 3;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col, int not) {
        a = NotaFiscalDAO.linha(10);

        a.getNumNota();
        a.getValNota();
        a.getNomProduto();

        return a;
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
