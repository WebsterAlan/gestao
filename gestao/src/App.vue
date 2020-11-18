<template>
<!--Início App -->
  <div id="app">

<!-- Início div wrapper -->
    <div id="wrapper">

        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

           <!-- <hr class="sidebar-divider my-0"> -->
           <hr>
            <li class="nav-item active">
                <a class="nav-link" href="/">
                   <!-- <i class="fas fa-fw fa-tachometer-alt"></i> -->
                    <i class="fas fa-users"></i>
                    <span>Gestão de Atendimentos</span></a>
            </li>
            <hr>
            <li class="nav-item active">
                   <router-link class="nav-link" to="/abrir-chamado" style="padding: 0;">   
                    <!-- <a class="nav-link" href="/abrir-chamado" style="padding: 0;"> -->
                   <i class="fas fa-fw"></i>
                   <button type="button" style="border-color: white;" class="btn btn-primary">Abrir Chamado</button>
                  <!-- </a> -->
                   </router-link>
            </li> 
            <hr>
  
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                  
			<!--	<i class="fas fa-fw fa-folder"></i> -->
      <i class="fas fa-headset"></i>
                    <span>Chamados</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <router-link class="collapse-item" to="/suporte-page">Suporte</router-link>
                        <router-link class="collapse-item" to="/bug-page">Bug</router-link>
                        <router-link class="collapse-item" to="/falha-page">Falha</router-link>
                        <router-link class="collapse-item" to="/treinamento-page">Treinamento</router-link>
                        <router-link class="collapse-item" to="/consultoria-page">Consultoria</router-link>
                        <router-link class="collapse-item" to="/novos-projetos-page">Novos Projetos</router-link>
						
                    </div>
                </div>
            </li>

            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="true" aria-controls="collapseUtilities">
                <!--<i class="fas fa-fw fa-folder"></i> -->
                <i class="fas fa-filter"></i>
                    <span>Filtros</span>
                </a>
                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                    data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="empresa.html">Empresa</a>
                        <a class="collapse-item" href="status.html">Status</a>
                    </div>
                </div>
            </li>

            <hr class="sidebar-divider">

            <hr class="sidebar-divider d-none d-md-block">

        
           <!-- <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div> -->
      </ul>
   

   
        <div id="content-wrapper" class="d-flex flex-column">

           
          <div id="content">
             <div class="container-fluid" id="base-container">
             
                
               <router-view/>
             
             </div>
          </div>
       

            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; IS SAUDE 2020</span>
                    </div>
                </div>
            </footer>
     

        </div>
      

    


    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    </div>
    <!--Fim Wrapper -->
  </div>
  <!--Fim id App -->
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}

#base-container{
  padding: 3%;
}

</style>

<script>
export default {
  name: "AppAction",
  props: {},
  computed: {},
  methods: {}
};
</script>