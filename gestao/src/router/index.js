import Vue from 'vue'
import VueRouter from 'vue-router'
import PainelPage from '../views/PainelPage.vue'
import SuportePage from '../views/SuportePage.vue'
import AbrirChamado  from '../views/AbrirChamado.vue'
import BugPage  from '../views/BugPage.vue'
import FalhaPage  from '../views/FalhaPage.vue'
import TreinamentoPage  from '../views/TreinamentoPage.vue'
import ConsultoriaPage  from '../views/ConsultoriaPage.vue'
import NovosProjetosPage  from '../views/NovosProjetosPage'
import Detalhar from '../views/Detalhar'


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'painel-page',
    component: PainelPage
  },
  {
    path: '/suporte-page',
    name: 'Suporte',
    component: SuportePage
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    //component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/abrir-chamado',
    name: 'AbrirChamado',
    component: AbrirChamado
  },
  {
    path: '/bug-page',
    name: 'AbrirChamado',
    component: BugPage
  },
  {
    path: '/falha-page',
    name: 'FalhaPage',
    component: FalhaPage
  },
  {
    path: '/treinamento-page',
    name: 'TreinamentoPage',
    component: TreinamentoPage
  },
  {
    path: '/consultoria-page',
    name: 'ConsultoriaPage',
    component: ConsultoriaPage
  },
  {
    path: '/novos-projetos-page',
    name: 'NovosProjetosPage',
    component: NovosProjetosPage
  },
  //Página de teste para detalhamento
  {
    path: '/detalhar',
    name: 'detalhar',
    component: Detalhar
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
