<template>
    <body>
       <title>Suporte - Chamados</title>
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Chamados Falha</h6>
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
  name: "FalhaPageAction",
  data(){
    return {
        /*produto: {
        nome: '',
        codigoDeBarra: '',
        estoque: '',
        valorUn: ''
      }, */
      listChamadosFalha : []
    }
  },
  props: {},
  computed: {},
  methods: {

    /* mudarRota(){
          this.$router.push("/search?"+this.foobar);
      }, */
      listarTodosChamadoFalha(){
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



</style>