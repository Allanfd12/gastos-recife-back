package com.api.nyx.gastosrecife.dtos;

import java.math.BigDecimal;

public class TotalDespesasByCategoriaDto {

    private int ano;
    private BigDecimal empenho;
    private BigDecimal liquidacao;
    private BigDecimal pagamento;

    private String categoriaCodigo;
    private String categoriaNome;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public BigDecimal getEmpenho() {
        return empenho;
    }

    public void setEmpenho(BigDecimal empenho) {
        this.empenho = empenho;
    }

    public BigDecimal getLiquidacao() {
        return liquidacao;
    }

    public void setLiquidacao(BigDecimal liquidacao) {
        this.liquidacao = liquidacao;
    }

    public BigDecimal getPagamento() {
        return pagamento;
    }

    public void setPagamento(BigDecimal pagamento) {
        this.pagamento = pagamento;
    }

    public String getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(String categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }
}
