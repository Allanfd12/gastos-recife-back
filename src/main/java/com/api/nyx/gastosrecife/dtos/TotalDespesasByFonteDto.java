package com.api.nyx.gastosrecife.dtos;

import java.math.BigDecimal;

public class TotalDespesasByFonteDto {
    private int ano;
    private BigDecimal empenho;
    private BigDecimal liquidacao;
    private BigDecimal pagamento;

    private String fonteCodigo;
    private String fonteNome;

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

    public String getFonteCodigo() {
        return fonteCodigo;
    }

    public void setFonteCodigo(String fonteCodigo) {
        this.fonteCodigo = fonteCodigo;
    }

    public String getFonteNome() {
        return fonteNome;
    }

    public void setFonteNome(String fonteNome) {
        this.fonteNome = fonteNome;
    }
}
