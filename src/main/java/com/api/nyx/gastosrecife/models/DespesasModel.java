package com.api.nyx.gastosrecife.models;



import com.api.nyx.gastosrecife.util.converter.BigDecimalConverter;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
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
    @CsvBindByName(column = "ano_movimentacao")
    private int anoMovimentacao;
    @Column(name = "mes_movimentacao", nullable = false, length = 2)
    @CsvBindByName(column = "mes_movimentacao")
    private int mesMovimentacao;
    @Column(name = "orgao_codigo", nullable = false, length = 3)
    @CsvBindByName(column = "orgao_codigo")
    private String orgaoCodigo;
    @Column(name = "orgao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "orgao_nome")
    private String orgaoNome;
    @Column(name = "unidade_codigo", nullable = false, length = 6)
    @CsvBindByName(column = "unidade_codigo")
    private String unidadeCodigo;
    @Column(name = "unidade_nome", nullable = false, length = 150)
    @CsvBindByName(column = "unidade_nome")
    private String unidadeNome;
    @Column(name = "categoria_economica_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "categoria_economica_codigo")
    private String categoriaEconomicaCodigo;
    @Column(name = "categoria_economica_nome", nullable = false, length = 150)
    @CsvBindByName(column = "categoria_economica_nome")
    private String categoriaEconomicaNome;
    @Column(name = "grupo_despesa_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "grupo_despesa_codigo")
    private String grupoDespesaCodigo;
    @Column(name = "grupo_despesa_nome", nullable = false, length = 150)
    @CsvBindByName(column = "grupo_despesa_nome")
    private String grupoDespesaNome;
    @Column(name = "modalidade_aplicacao_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "modalidade_aplicacao_codigo")
    private String modalidadeAplicacaoCodigo;
    @Column(name = "modalidade_aplicacao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "modalidade_aplicacao_nome")
    private String modalidadeAplicacaoNome;
    @Column(name = "elemento_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "elemento_codigo")
    private String elementoCodigo;
    @Column(name = "elemento_nome", nullable = false, length = 150)
    @CsvBindByName(column = "elemento_nome")
    private String elementoNome;
    @Column(name = "subelemento_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "subelemento_codigo")
    private String subelementoCodigo;
    @Column(name = "subelemento_nome", nullable = false, length = 150)
    @CsvBindByName(column = "subelemento_nome")
    private String subelementoNome;
    @Column(name = "funcao_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "funcao_codigo")
    private String funcaoCodigo;
    @Column(name = "funcao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "funcao_nome")
    private String funcaoNome;
    @Column(name = "subfuncao_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "subfuncao_codigo")
    private String subfuncaoCodigo;
    @Column(name = "subfuncao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "subfuncao_nome")
    private String subfuncaoNome;
    @Column(name = "programa_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "programa_codigo")
    private String programaCodigo;
    @Column(name = "programa_nome", nullable = false, length = 150)
    @CsvBindByName(column = "programa_nome")
    private String programaNome;
    @Column(name = "acao_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "acao_codigo")
    private String acaoCodigo;
    @Column(name = "acao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "acao_nome")
    private String acaoNome;
    @Column(name = "fonte_recurso_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "fonte_recurso_codigo")
    private String fonteRecursoCodigo;
    @Column(name = "fonte_recurso_nome", nullable = false, length = 150)
    @CsvBindByName(column = "fonte_recurso_nome")
    private String fonteRecursoNome;
    @Column(name = "empenho_ano", nullable = false, length = 4)
    @CsvBindByName(column = "empenho_ano")
    private int empenhoAno;
    @Column(name = "empenho_modalidade_nome", nullable = false, length = 150)
    @CsvBindByName(column = "empenho_modalidade_nome")
    private String empenhoModalidadeNome;
    @Column(name = "empenho_modalidade_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "empenho_modalidade_codigo")
    private String empenhoModalidadeCodigo;
    @Column(name = "empenho_numero", nullable = false, length = 6)
    @CsvBindByName(column = "empenho_numero")
    private String empenhoNumero;
    @Column(name = "subempenho", nullable = false, length = 6)
    @CsvBindByName(column = "subempenho")
    private String subempenho;
    @Column(name = "indicador_subempenho", nullable = false, length = 1)
    @CsvBindByName(column = "indicador_subempenho")
    private String indicadorSubempenho;
    @Column(name = "credor_codigo", nullable = false, length = 8)
    @CsvBindByName(column = "credor_codigo")
    private String credorCodigo;
    @Column(name = "credor_nome", nullable = false, length = 150)
    @CsvBindByName(column = "credor_nome")
    private String credorNome;
    @Column(name = "modalidade_licitacao_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "modalidade_licitacao_codigo")
    private String modalidadeLicitacaoCodigo;
    @Column(name = "modalidade_licitacao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "modalidade_licitacao_nome")
    private String modalidadeLicitacaoNome;
    @Column(name = "valor_empenhado", nullable = false, length = 20)
    @CsvCustomBindByName(column = "valor_empenhado", converter = BigDecimalConverter.class)
    private BigDecimal valorEmpenhado;
    @Column(name = "valor_liquidado", nullable = false, length = 20)
    @CsvCustomBindByName(column = "valor_liquidado", converter = BigDecimalConverter.class)
    private BigDecimal valorLiquidado;
    @Column(name = "valor_pago", nullable = false, length = 20)
    @CsvCustomBindByName(column = "valor_pago", converter = BigDecimalConverter.class)
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
