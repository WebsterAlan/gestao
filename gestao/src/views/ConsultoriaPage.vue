<template>
    <body>
       <title>Suporte - Chamados</title>
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Chamados Consultoria</h6>
                </div>
                
                <div class="card-body">
                    <div class="table-responsive">
                     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Protocolo</th>
                                <th>Position</th>
                                <th>Office</th>
                                <th>Age</th>
                                <th>Start date</th>
                                <th>Visualizar</th>
                            </tr>
                        </thead>

                      <!--  <tfoot>
                             <tr>
                                <th>Name</th>
                                <th>Position</th>
                                <th>Office</th>
                                <th>Age</th>
                                <th>Start date</th>
                                <th>Salary</th>
                             </tr>
                        </tfoot> -->

                        <tbody>
                             <tr>
                                    <td>Tiger Nixon</td>
                                    <td>System Architect</td>
                                    <td>Edinburgh</td>
                                    <td>61</td>
                                    <td>2011/04/25</td>
                                    <td> <button type="button" style="border-color: white;" class="btn btn-primary">Visualizar Chamado</button></td>
                                    <td><svg viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><title/><g id="coupon"><path d="M23,3H1A1,1,0,0,0,0,4V9a1,1,0,0,0,1,1,2,2,0,0,1,0,4,1,1,0,0,0-1,1v5a1,1,0,0,0,1,1H23a1,1,0,0,0,1-1V4A1,1,0,0,0,23,3ZM22,19H2V15.87A4,4,0,0,0,2,8.13V5H22Z"/><path d="M10,8a1,1,0,0,0,0,2A1,1,0,0,0,10,8Z"/><path d="M9,6a1,1,0,0,0,2,0A1,1,0,0,0,9,6Z"/><path d="M10,11a1,1,0,0,0,0,2A1,1,0,0,0,10,11Z"/><path d="M10,14a1,1,0,0,0,0,2A1,1,0,0,0,10,14Z"/><path d="M11,18a1,1,0,0,0-2,0A1,1,0,0,0,11,18Z"/><path d="M14,9h5a1,1,0,0,0,0-2H14A1,1,0,0,0,14,9Z"/><path d="M14,13h5a1,1,0,0,0,0-2H14A1,1,0,0,0,14,13Z"/></g></svg> Média Prioridade</td>
                                
                                </tr>
                        </tbody>
                    </table>
              </div>
        </div>
  </div>   
  </body>      
</template>

<script>


//const url = 'http://localhost:8080/abrir-chamado'
  const url = 'http://code.jsontest.com/'

export default {
  name: "ConsultoriaPageAction",
  data(){
    return {
        /*produto: {
        nome: '',
        codigoDeBarra: '',
        estoque: '',
        valorUn: ''
      }, */

     listChamadosConsultoria : []
      
    }
  },
  props: {},
  computed: {},
  methods: {
    
    /* mudarRota(){
          this.$router.push("/search?"+this.foobar);
      }, */
      listarTodosChamadosConcultoria(){
        this.$axios.get(url, {params: {
            nomeCliente : this.nomeCliente,
            isResponsavel : this.isResponsavel,
            contato : this.contato,
            emailSolicitante : this.emailSolicitante,
            
          }}).then(response => this.dadosteste = response.data);
        
        }
      }
};
</script>

<style scoped>
svg{
   stroke: yellow;
   height: 22px;
}


</style>