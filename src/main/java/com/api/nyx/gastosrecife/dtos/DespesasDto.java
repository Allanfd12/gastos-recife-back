package com.api.nyx.gastosrecife.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class DespesasDto {

    @NotBlank
    private int anoMovimentacao;
    @NotBlank
    private int mesMovimentacao;
    @NotBlank
    @Size(max = 3)
    private String orgaoCodigo;
    @NotBlank
    @Size(max = 100)
    private String orgaoNome;
    @NotBlank
    @Size(max = 6)
    private String unidadeCodigo;
    @NotBlank
    @Size(max = 100)
    private String unidadeNome;
    @NotBlank
    @Size(max = 2)
    private String categoriaEconomicaCodigo;
    @NotBlank
    @Size(max = 100)
    private String categoriaEconomicaNome;
    @NotBlank
    @Size(max = 2)
    private String grupoDespesaCodigo;
    @NotBlank
    @Size(max = 100)
    private String grupoDespesaNome;
    @NotBlank
    @Size(max = 2)
    private String modalidadeAplicacaoCodigo;
    @NotBlank
    @Size(max = 100)
    private String modalidadeAplicacaoNome;
    @NotBlank
    @Size(max = 2)
    private String elementoCodigo;
    @NotBlank
    @Size(max = 100)
    private String elementoNome;
    @NotBlank
    @Size(max = 2)
    private String subelementoCodigo;
    @NotBlank
    @Size(max = 100)
    private String subelementoNome;
    @NotBlank
    @Size(max = 2)
    private String funcaoCodigo;
    @NotBlank
    @Size(max = 100)
    private String funcaoNome;
    @NotBlank
    @Size(max = 4)
    private String subfuncaoCodigo;
    @NotBlank
    @Size(max = 100)
    private String subfuncaoNome;
    @NotBlank
    @Size(max = 4)
    private String programaCodigo;
    @NotBlank
    @Size(max = 150)
    private String programaNome;
    @NotBlank
    @Size(max = 4)
    private String acaoCodigo;
    @NotBlank
    @Size(max = 150)
    private String acaoNome;
    @NotBlank
    @Size(max = 4)
    private String fonteRecursoCodigo;
    @NotBlank
    @Size(max = 100)
    private String fonteRecursoNome;
    @NotBlank
    private int empenhoAno;
    @NotBlank
    @Size(max = 100)
    private String empenhoModalidadeNome;
    @NotBlank
    @Size(max = 4)
    private String empenhoModalidadeCodigo;
    @NotBlank
    @Size(max = 6)
    private String empenhoNumero;
    @NotBlank
    @Size(max = 6)
    private String subempenho;
    @NotBlank
    @Size(max = 1)
    private String indicadorSubempenho;
    @NotBlank
    @Size(max = 8)
    private String credorCodigo;
    @NotBlank
    @Size(max =  150)
    private String credorNome;
    @NotBlank
    @Size(max = 4)
    private String modalidadeLicitacaoCodigo;
    @NotBlank
    @Size(max = 100)
    private String modalidadeLicitacaoNome;
    @NotBlank
    private BigDecimal valorEmpenhado;
    @NotBlank
    private BigDecimal valorLiquidado;
    @NotBlank
    private BigDecimal valorPago;

    public int getAnoMovimentacao() {
        return anoMovimentacao;
    }

    public void setAnoMovimentacao(int anoMovimentacao) {
        this.anoMovimentacao = anoMovimentacao;
    }

    public int getMesMovimentacao() {
        return mesMovimentacao;
    }

    public void setMesMovimentacao(int mesMovimentacao) {
        this.mesMovimentacao = mesMovimentacao;
    }

    public String getOrgaoCodigo() {
        return orgaoCodigo;
    }

    public void setOrgaoCodigo(String orgaoCodigo) {
        this.orgaoCodigo = orgaoCodigo;
    }

    public String getOrgaoNome() {
        return orgaoNome;
    }

    public void setOrgaoNome(String orgaoNome) {
        this.orgaoNome = orgaoNome;
    }

    public String getUnidadeCodigo() {
        return unidadeCodigo;
    }

    public void setUnidadeCodigo(String unidadeCodigo) {
        this.unidadeCodigo = unidadeCodigo;
    }

    public String getUnidadeNome() {
        return unidadeNome;
    }

    public void setUnidadeNome(String unidadeNome) {
        this.unidadeNome = unidadeNome;
    }

    public String getCategoriaEconomicaCodigo() {
        return categoriaEconomicaCodigo;
    }

    public void setCategoriaEconomicaCodigo(String categoriaEconomicaCodigo) {
        this.categoriaEconomicaCodigo = categoriaEconomicaCodigo;
    }

    public String getCategoriaEconomicaNome() {
        return categoriaEconomicaNome;
    }

    public void setCategoriaEconomicaNome(String categoriaEconomicaNome) {
        this.categoriaEconomicaNome = categoriaEconomicaNome;
    }

    public String getGrupoDespesaCodigo() {
        return grupoDespesaCodigo;
    }

    public void setGrupoDespesaCodigo(String grupoDespesaCodigo) {
        this.grupoDespesaCodigo = grupoDespesaCodigo;
    }

    public String getGrupoDespesaNome() {
        return grupoDespesaNome;
    }

    public void setGrupoDespesaNome(String grupoDespesaNome) {
        this.grupoDespesaNome = grupoDespesaNome;
    }

    public String getModalidadeAplicacaoCodigo() {
        return modalidadeAplicacaoCodigo;
    }

    public void setModalidadeAplicacaoCodigo(String modalidadeAplicacaoCodigo) {
        this.modalidadeAplicacaoCodigo = modalidadeAplicacaoCodigo;
    }

    public String getModalidadeAplicacaoNome() {
        return modalidadeAplicacaoNome;
    }

    public void setModalidadeAplicacaoNome(String modalidadeAplicacaoNome) {
        this.modalidadeAplicacaoNome = modalidadeAplicacaoNome;
    }

    public String getElementoCodigo() {
        return elementoCodigo;
    }

    public void setElementoCodigo(String elementoCodigo) {
        this.elementoCodigo = elementoCodigo;
    }

    public String getElementoNome() {
        return elementoNome;
    }

    public void setElementoNome(String elementoNome) {
        this.elementoNome = elementoNome;
    }

    public String getSubelementoCodigo() {
        return subelementoCodigo;
    }

    public void setSubelementoCodigo(String subelementoCodigo) {
        this.subelementoCodigo = subelementoCodigo;
    }

    public String getSubelementoNome() {
        return subelementoNome;
    }

    public void setSubelementoNome(String subelementoNome) {
        this.subelementoNome = subelementoNome;
    }

    public String getFuncaoCodigo() {
        return funcaoCodigo;
    }

    public void setFuncaoCodigo(String funcaoCodigo) {
        this.funcaoCodigo = funcaoCodigo;
    }

    public String getFuncaoNome() {
        return funcaoNome;
    }

    public void setFuncaoNome(String funcaoNome) {
        this.funcaoNome = funcaoNome;
    }

    public String getSubfuncaoCodigo() {
        return subfuncaoCodigo;
    }

    public void setSubfuncaoCodigo(String subfuncaoCodigo) {
        this.subfuncaoCodigo = subfuncaoCodigo;
    }

    public String getSubfuncaoNome() {
        return subfuncaoNome;
    }

    public void setSubfuncaoNome(String subfuncaoNome) {
        this.subfuncaoNome = subfuncaoNome;
    }

    public String getProgramaCodigo() {
        return programaCodigo;
    }

    public void setProgramaCodigo(String programaCodigo) {
        this.programaCodigo = programaCodigo;
    }

    public String getProgramaNome() {
        return programaNome;
    }

    public void setProgramaNome(String programaNome) {
        this.programaNome = programaNome;
    }

    public String getAcaoCodigo() {
        return acaoCodigo;
    }

    public void setAcaoCodigo(String acaoCodigo) {
        this.acaoCodigo = acaoCodigo;
    }

    public String getAcaoNome() {
        return acaoNome;
    }

    public void setAcaoNome(String acaoNome) {
        this.acaoNome = acaoNome;
    }

    public String getFonteRecursoCodigo() {
        return fonteRecursoCodigo;
    }

    public void setFonteRecursoCodigo(String fonteRecursoCodigo) {
        this.fonteRecursoCodigo = fonteRecursoCodigo;
    }

    public String getFonteRecursoNome() {
        return fonteRecursoNome;
    }

    public void setFonteRecursoNome(String fonteRecursoNome) {
        this.fonteRecursoNome = fonteRecursoNome;
    }

    public int getEmpenhoAno() {
        return empenhoAno;
    }

    public void setEmpenhoAno(int empenhoAno) {
        this.empenhoAno = empenhoAno;
    }

    public String getEmpenhoModalidadeNome() {
        return empenhoModalidadeNome;
    }

    public void setEmpenhoModalidadeNome(String empenhoModalidadeNome) {
        this.empenhoModalidadeNome = empenhoModalidadeNome;
    }

    public String getEmpenhoModalidadeCodigo() {
        return empenhoModalidadeCodigo;
    }

    public void setEmpenhoModalidadeCodigo(String empenhoModalidadeCodigo) {
        this.empenhoModalidadeCodigo = empenhoModalidadeCodigo;
    }

    public String getEmpenhoNumero() {
        return empenhoNumero;
    }

    public void setEmpenhoNumero(String empenhoNumero) {
        this.empenhoNumero = empenhoNumero;
    }

    public String getSubempenho() {
        return subempenho;
    }

    public void setSubempenho(String subempenho) {
        this.subempenho = subempenho;
    }

    public String getIndicadorSubempenho() {
        return indicadorSubempenho;
    }

    public void setIndicadorSubempenho(String indicadorSubempenho) {
        this.indicadorSubempenho = indicadorSubempenho;
    }

    public String getCredorCodigo() {
        return credorCodigo;
    }

    public void setCredorCodigo(String credorCodigo) {
        this.credorCodigo = credorCodigo;
    }

    public String getCredorNome() {
        return credorNome;
    }

    public void setCredorNome(String credorNome) {
        this.credorNome = credorNome;
    }

    public String getModalidadeLicitacaoCodigo() {
        return modalidadeLicitacaoCodigo;
    }

    public void setModalidadeLicitacaoCodigo(String modalidadeLicitacaoCodigo) {
        this.modalidadeLicitacaoCodigo = modalidadeLicitacaoCodigo;
    }

    public String getModalidadeLicitacaoNome() {
        return modalidadeLicitacaoNome;
    }

    public void setModalidadeLicitacaoNome(String modalidadeLicitacaoNome) {
        this.modalidadeLicitacaoNome = modalidadeLicitacaoNome;
    }

    public BigDecimal getValorEmpenhado() {
        return valorEmpenhado;
    }

    public void setValorEmpenhado(BigDecimal valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public BigDecimal getValorLiquidado() {
        return valorLiquidado;
    }

    public void setValorLiquidado(BigDecimal valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }
}
