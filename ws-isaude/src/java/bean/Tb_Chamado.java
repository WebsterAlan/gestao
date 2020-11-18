
package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tb_Chamado {
    
    private String Protocolo_Chamado;
    private String Data_Hora_Abertura;
    private String ID_Cliente;
    private String Cod_IS_Responsavel;
    private String Cod_Responsável_Solicitante;
    private String Cod_Status_Chamado;
    private String Contato;
    private String Cod_Prioridade_Cliente;
    private String Justificativa;
    private String Cod_Servico;
    private String Cod_Funcionalidade;
    private String Descricao;
    private String Cod_Anexo;

    public Tb_Chamado() {
    }

    
    public String getProtocolo_Chamado() {
        return Protocolo_Chamado;
    }

    public void setProtocolo_Chamado(String Protocolo_Chamado) {
        this.Protocolo_Chamado = Protocolo_Chamado;
    }

    public String getData_Hora_Abertura() {
        return Data_Hora_Abertura;
    }

    public void setData_Hora_Abertura(String Data_Hora_Abertura) {
        this.Data_Hora_Abertura = Data_Hora_Abertura;
    }

    public String getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(String ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getCod_IS_Responsavel() {
        return Cod_IS_Responsavel;
    }

    public void setCod_IS_Responsavel(String Cod_IS_Responsavel) {
        this.Cod_IS_Responsavel = Cod_IS_Responsavel;
    }

    public String getCod_Responsável_Solicitante() {
        return Cod_Responsável_Solicitante;
    }

    public void setCod_Responsável_Solicitante(String Cod_Responsável_Solicitante) {
        this.Cod_Responsável_Solicitante = Cod_Responsável_Solicitante;
    }

    public String getCod_Status_Chamado() {
        return Cod_Status_Chamado;
    }

    public void setCod_Status_Chamado(String Cod_Status_Chamado) {
        this.Cod_Status_Chamado = Cod_Status_Chamado;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    public String getCod_Prioridade_Cliente() {
        return Cod_Prioridade_Cliente;
    }

    public void setCod_Prioridade_Cliente(String Cod_Prioridade_Cliente) {
        this.Cod_Prioridade_Cliente = Cod_Prioridade_Cliente;
    }

    public String getJustificativa() {
        return Justificativa;
    }

    public void setJustificativa(String Justificativa) {
        this.Justificativa = Justificativa;
    }

    public String getCod_Servico() {
        return Cod_Servico;
    }

    public void setCod_Servico(String Cod_Servico) {
        this.Cod_Servico = Cod_Servico;
    }

    public String getCod_Funcionalidade() {
        return Cod_Funcionalidade;
    }

    public void setCod_Funcionalidade(String Cod_Funcionalidade) {
        this.Cod_Funcionalidade = Cod_Funcionalidade;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getCod_Anexo() {
        return Cod_Anexo;
    }

    public void setCod_Anexo(String Cod_Anexo) {
        this.Cod_Anexo = Cod_Anexo;
    }
    
    
    
}
