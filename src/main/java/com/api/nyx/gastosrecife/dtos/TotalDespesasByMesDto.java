package com.api.nyx.gastosrecife.dtos;

import java.math.BigDecimal;

public class TotalDespesasByMesDto {
    private int ano;
    private int mes;
    private BigDecimal empenho;
    private BigDecimal liquidacao;
    private BigDecimal pagamento;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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
}
