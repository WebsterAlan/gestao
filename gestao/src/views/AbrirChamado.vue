<template>
    <div class="container" id="div-component-form-abrir-chamado">
       <h3>Abertura de Chamado </h3>
       <h1>{{dadosteste}}</h1>
      <hr>
<form id="app" v-on:submit.prevent="abrirChamado">
  <div class="form-row">

    <div class="form-group col-md-6">
      <label for="inputNomeCliente">Nome Cliente</label>
      <!-- <input type="email" class="form-control" id="email" placeholder="Email"> -->
       <input type="text" class="form-control" id="inputCliente" v-model="nomeCliente" placeholder="Nome Cliente">
    </div>

    <div class="form-group col-md-6">
      <label for="inputIS_Responsavel">IS_Responsável</label>
      <input type="text" class="form-control" id="inputIS_Responsavel" v-model="isResponsavel" placeholder="Senha">
    </div>

  </div>

 <div class="form-row">

  <div class="form-group col-md-6">
    <label for="inputContato">Contato</label>
    <input type="text" class="form-control" id="inputContato" v-model="contato" placeholder="Contato">
  </div>

  <div class="form-group col-md-6">
    <label for="inputEmailSolicitante">Email Solicitante</label>
    <input type="text" class="form-control" id="inputEmailSolicitante" v-model="emailSolicitante" placeholder="Email Solicitante">
  </div>

 </div>

  <div class="form-row">

    <div class="form-group col-md-3">
      <label for="inputCity">Cidade</label>
      <select id="inputCity" class="form-control" v-model="selectedCidade">
        <option selected>Escolha uma cidade</option>
        <option>...</option>
      </select>
    </div>

    <div class="form-group col-md-3">
      <label for="inputEstado">Estado</label>
      <select id="inputEstado" v-model="selectedEstado" class="form-control">
        <option selected>Escolha um estado</option>
        <option>AC</option>
        <option>AL</option>
        <option>AM</option>
        <option>AP</option>
        <option>BA</option>
        <option>CE</option>
        <option>DF</option>
        <option>ES</option>
        <option>GO</option>
        <option>MA</option>
        <option>MG</option>
        <option>MS</option>
        <option>MT</option>
        <option>PA</option>
        <option>PB</option>
        <option>PE</option>
        <option>PI</option>
        <option>PR</option>
        <option>RJ</option>
        <option>RN</option>
        <option>RO</option>
        <option>RR</option>
        <option>RS</option>
        <option>SC</option>
        <option>SE</option>
        <option>SP</option>
        <option>TO</option>
      </select>
    </div>

    <div class="form-group col-md-6">
      <label for="inputCEP">CEP</label>
      <input type="text" class="form-control" id="inputCEP" v-model="cep">
    </div>

  </div>

  <!--<div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Clique em mim
      </label>
    </div>
  </div> -->

  <!--<button type="submit" v-on:click="abrirChamado" class="btn btn-primary">Confirmar</button> -->
  <button type="submit"  class="btn btn-primary">Confirmar</button>
</form>
</div>
</template>

<script>

//const url = 'http://localhost:8080/abrir-chamado'
  const url = 'http://code.jsontest.com/'

export default {
  name: "AbrirChamadoAction",
  data(){
    return {
       /* produto: {
        nome: '',
        codigoDeBarra: '',
        estoque: '',
        valorUn: ''
        }, */
        nomeCliente :'Digite o nome do cliente',
        isResponsavel: 'Digite o nome do responsável',
        contato : 'Digite o contato',
        emailSolicitante : 'Digite o email solicitante',
        selectedCidade: '',
        selectedEstado: '',
        cep : '',
        dadosteste: []
    }
  },
  props: {},
  computed: {},
  methods: {
       abrirChamado() {
           console.log("teste de conexão");
            this.$axios.get(url, {params: {
            nomeCliente : this.nomeCliente,
            isResponsavel : this.isResponsavel,
            contato : this.contato,
            emailSolicitante : this.emailSolicitante,
            
          }}).then(response => this.dadosteste = response.data);}
          //console.log(this.cep)
          /*this.$http.post(url, this.produto).then((response) => {
             console.log(response, 'funcionou')
           }).catch((error) => {
             console.log(error, 'nao funcionou')
        })
          console.log("Entrou aqui");
          return null; 
        }*/, //Não esquecer da vrigula para separação de métodos
       mudarRota() {
         //this.$router.push("/search?"+this.foobar);
         return null;
       }

  }
};
</script>

<style scoped>
#div-component-form-abrir-chamado{
  text-align: left;
}
</style>