package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

public class NotaFiscalController {

    public static boolean salvar(int numeroNota, double valorNota, String NomeProduto) {
        NotaFiscal nota = new NotaFiscal();
        NotaFiscalDAO dao = new NotaFiscalDAO();
        dao.addNota(nota);
        nota.setValNota(valorNota);
        nota.setNumNota(numeroNota);
        nota.setNomProduto(NomeProduto);

        System.out.println(numeroNota);
        System.out.println(valorNota);
        System.out.println(NomeProduto);
        return true;

    }

}
