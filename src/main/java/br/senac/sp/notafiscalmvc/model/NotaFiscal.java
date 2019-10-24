package br.senac.sp.notafiscalmvc.model;

public class NotaFiscal {

    double valNota;
    int numNota;
    String NomProduto;

    public String getNomProduto() {
        return NomProduto;
    }

    public void setNomProduto(String NomProduto) {
        System.out.print("O objeto nota recebeu um produto:");
        System.out.println(NomProduto);
        this.NomProduto = NomProduto;

    }

    public NotaFiscal() {
        System.out.println("inicializando um objeto do tipo NotaFiscal");
    }

    public double getValNota() {
        return valNota;
    }

    public void setValNota(double valNota) {
        System.out.print("O objeto nota recebeu um valor:");
        System.out.println(valNota);
        this.valNota = valNota;
    }

    public int getNumNota() {
        return numNota;
    }

    public void setNumNota(int numNota) {
        System.out.print("O objeto nota recebeu um numero de nota:");
        System.out.println(numNota);
        this.numNota = numNota;
    }

}
