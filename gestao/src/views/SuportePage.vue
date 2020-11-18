<template>
    <body>
       <title>Suporte - Chamados</title>
            <div class="card shadow mb-4">
                <div class="card-header py-3">
                    <h6 class="m-0 font-weight-bold text-primary">Chamados Suporte</h6>
                </div>
                
                <div class="card-body">
                    <div class="table-responsive">
                     <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Protocolo</th>
                                <th>Código Serviço</th>
                                <th>ID_Cliente</th>
                                <th>Age</th>
                                <th>{{listSuporte}}</th>
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
                         <!--   <tr v-for="suporte in listSuporte" :key="suporte.protocolo">
                                    <td>{{suporte.protocolo}}</td> -->
                                    <td>System Architect</td>
                                    <td>Edinburgh</td>
                                    <td>61</td>
                                    <td>125</td>
                                    <td>2011/04/25</td>
                                    <!--<td> <button v-on:click="mock" type="button" style="border-color: white;" class="btn btn-primary">Visualizar Chamado</button></td> -->
                                    <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalPush">Launch modal</button></td>
                            </tr>
                         </tbody>
                    </table>
              </div>
        </div>
  </div>
  <!-- Passando valores para o props do elemento filho -->
   <detalhar dadosteste="762537235273"></detalhar>
  </body>      
</template>

<script>
import DetalharVue from './Detalhar.vue';

//const url = 'http://localhost:8080/abrir-chamado'
  const url = 'http://localhost:8084/ws-isaude/rest/service/'
  
export default {
  name: "SuportePageAction",
  data(){
    return {
       /* produto: {
        nome: '',
        codigoDeBarra: '',
        estoque: '',
        valorUn: ''
      }, */
       listSuporte : []
    }
  },
  mounted(){
    this.listarTodosChamadosSuporteMock();
  },
  components :{
     'detalhar': DetalharVue
  },
  props:{},
  computed: {},
  methods: {
      /* mudarRota(){
          this.$router.push("/search?"+this.foobar);
      } */
      listarTodosChamadosSuporte(){
        this.$axios.get(url, {params: {
            nomeCliente : this.nomeCliente,
            isResponsavel : this.isResponsavel,
            contato : this.contato,
            emailSolicitante : this.emailSolicitante,
            
          }}).then(response => this.dadosteste = response.data);
      },
      mock(){
        console.log("teste");
      },
      listarTodosChamadosSuporteMock() {
         this.$axios.get(url + "listarTodosChamadosSuporte",{ headers : {"Access-Control-Allow-Origin": "*"}}).then(response => this.listSuporte = response.data);
    }
  },
};
</script>

<style scoped>



</style>