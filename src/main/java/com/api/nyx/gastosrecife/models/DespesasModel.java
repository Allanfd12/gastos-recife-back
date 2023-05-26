package com.api.nyx.gastosrecife.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "DESPESAS")
public class DespesasModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ano_movimentacao", nullable = false, length = 4)
    private int anoMovimentacao;
    @Column(name = "mes_movimentacao", nullable = false, length = 2)
    private int mesMovimentacao;
    @Column(name = "orgao_codigo", nullable = false, length = 3)
    private String orgaoCodigo;
    @Column(name = "orgao_nome", nullable = false, length = 100)
    private String orgaoNome;
    @Column(name = "unidade_codigo", nullable = false, length = 6)
    private String unidadeCodigo;
    @Column(name = "unidade_nome", nullable = false, length = 100)
    private String unidadeNome;
    @Column(name = "categoria_economica_codigo", nullable = false, length = 2)
    private String categoriaEconomicaCodigo;
    @Column(name = "categoria_economica_nome", nullable = false, length = 100)
    private String categoriaEconomicaNome;
    @Column(name = "grupo_despesa_codigo", nullable = false, length = 2)
    private String grupoDespesaCodigo;
    @Column(name = "grupo_despesa_nome", nullable = false, length = 100)
    private String grupoDespesaNome;
    @Column(name = "modalidade_aplicacao_codigo", nullable = false, length = 2)
    private String modalidadeAplicacaoCodigo;
    @Column(name = "modalidade_aplicacao_nome", nullable = false, length = 100)
    private String modalidadeAplicacaoNome;
    @Column(name = "elemento_codigo", nullable = false, length = 2)
    private String elementoCodigo;
    @Column(name = "elemento_nome", nullable = false, length = 100)
    private String elementoNome;
    @Column(name = "subelemento_codigo", nullable = false, length = 2)
    private String subelementoCodigo;
    @Column(name = "subelemento_nome", nullable = false, length = 100)
    private String subelementoNome;
    @Column(name = "funcao_codigo", nullable = false, length = 2)
    private String funcaoCodigo;
    @Column(name = "funcao_nome", nullable = false, length = 100)
    private String funcaoNome;
    @Column(name = "subfuncao_codigo", nullable = false, length = 4)
    private String subfuncaoCodigo;
    @Column(name = "subfuncao_nome", nullable = false, length = 100)
    private String subfuncaoNome;
    @Column(name = "programa_codigo", nullable = false, length = 4)
    private String programaCodigo;
    @Column(name = "programa_nome", nullable = false, length = 150)
    private String programaNome;
    @Column(name = "acao_codigo", nullable = false, length = 4)
    private String acaoCodigo;
    @Column(name = "acao_nome", nullable = false, length = 150)
    private String acaoNome;
    @Column(name = "fonte_recurso_codigo", nullable = false, length = 4)
    private String fonteRecursoCodigo;
    @Column(name = "fonte_recurso_nome", nullable = false, length = 100)
    private String fonteRecursoNome;
    @Column(name = "empenho_ano", nullable = false, length = 4)
    private int empenhoAno;
    @Column(name = "empenho_modalidade_nome", nullable = false, length = 100)
    private String empenhoModalidadeNome;
    @Column(name = "empenho_modalidade_codigo", nullable = false, length = 4)
    private String empenhoModalidadeCodigo;
    @Column(name = "empenho_numero", nullable = false, length = 6)
    private String empenhoNumero;
    @Column(name = "subempenho", nullable = false, length = 6)
    private String subempenho;
    @Column(name = "indicador_subempenho", nullable = false, length = 1)
    private String indicadorSubempenho;
    @Column(name = "credor_codigo", nullable = false, length = 8)
    private String credorCodigo;
    @Column(name = "credor_nome", nullable = false, length = 150)
    private String credorNome;
    @Column(name = "modalidade_licitacao_codigo", nullable = false, length = 4)
    private String modalidadeLicitacaoCodigo;
    @Column(name = "modalidade_licitacao_nome", nullable = false, length = 100)
    private String modalidadeLicitacaoNome;
    @Column(name = "valor_empenhado", nullable = false, length = 20)
    private BigDecimal valorEmpenhado;
    @Column(name = "valor_liquidado", nullable = false, length = 20)
    private BigDecimal valorLiquidado;
    @Column(name = "valor_pago", nullable = false, length = 20)
    private BigDecimal valorPago;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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