<template>
  <!--  <div>
        <h1> Detalhamento de Chamado</h1>
        <div class="jumbotron jumbotron-fluid">
              <div class="container">
                <div class="container">
                    <div class="row">

                        <div class="col-sm protocol border bg-light">
                             Protocolo Chamado : 
                        </div>

                        <div class="col-sm border bg-light">
                            Data/Hora Abertura :
                        </div>

                        <div class="col-sm border bg-light">
                            Nome Cliente :
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            IS_Responsável :
                        </div>

                        <div class="col-sm border bg-light">
                            Responsável Solicitante:
                        </div>

                        <div class="col-sm border bg-light">
                            Prioridade
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                 
                </div>
            </div>
        </div>
    </div> -->

    
  <div class="modal fade" id="modalPush" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
  aria-hidden="true">
  <div class="modal-xl modal-dialog modal-notify modal-info" role="document">
   
    <div class="modal-content text-center">
   
      <div class="modal-header d-flex justify-content-center">
        <p class="heading">Detalhamento</p>
      </div>

     
      <div class="modal-body">

        <div class="jumbotron jumbotron-fluid">
              <div class="container">
                <div class="container">
                    <div class="row">

                        <div class="col-sm protocol border bg-light">
                             Protocolo Chamado : {{dadosteste}}
                        </div>

                        <div class="col-sm border bg-light">
                            Data/Hora Abertura :
                        </div>

                        <div class="col-sm border bg-light">
                            Nome Cliente :
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            IS_Responsável :
                        </div>

                        <div class="col-sm border bg-light">
                            Responsável Solicitante:
                        </div>

                        <div class="col-sm border bg-light">
                            Prioridade
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                    <div class="row">

                        <div class="col-sm border bg-light">
                            Status :
                        </div>

                        <div class="col-sm border bg-light">
                            Email Solicitante :
                        </div>

                        <div class="col-sm border bg-light">
                            Tipo de Serviço
                        </div>

                    </div>

                 
                </div>
            </div>
        </div>

      </div>

      <div class="modal-footer flex-center">
        <a href="https://mdbootstrap.com/pricing/jquery/pro/" class="btn btn-info">Yes</a>
        <a type="button" class="btn btn-outline-info waves-effect" data-dismiss="modal">No</a>
      </div>
    </div>

  </div>
</div>

</template>

<script>

export default {
     name: "detalhar",
     props:{
           dadosteste : String 
      }
}
</script>

<style scoped>
.protocol {
   font-weight: bold;
}

.jumbotron{
    text-align: left;
}

.heading{
    font-weight: bold;
}
</style>