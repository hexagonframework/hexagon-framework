import Vue from 'vue'
import Router from 'vue-router'

// Containers
import Full from '@/containers/Full'

// Views
import Page404 from '@/views/pages/Page404'
import Page500 from '@/views/pages/Page500'
import Login from '@/views/pages/Login'
import Dashboard from '@/views/Dashboard'
import Table from '@/views/Table'

Vue.use(Router)

export default new Router({
    mode: 'hash', // Demo is living in GitHub.io, so required!
    linkActiveClass: 'open active',
    scrollBehavior: () = > ({y: 0}),
  routes
:
[
  {
    path: '/',
    redirect: '/dashboard',
    name: '首页',
    component: Full,
    beforeEnter: (to, from, next) = > {
    if (!sessionStorage.getItem('access_token')
)
{
  next({
    path: '/pages/login',
    query: {redirect: to.fullPath}
  })
}
else
{
  next()
}
},
children: [
  {
    path: 'dashboard',
    name: '仪表盘',
    component: Dashboard
  },
  {
    path: 'table',
    name: '分页表格',
    component: Table
  }
]
},
{
  path: '/pages',
    redirect
:
  '/pages/404',
    name
:
  '页面',
    component
:
  {
    render(c)
    {
      return c('router-view')
    }
  }
,
  children: [
    {
      path: '404',
      name: '404页面',
      component: Page404
    },
    {
      path: '500',
      name: '500页面',
      component: Page500
    },
    {
      path: 'login',
      name: '登录页面',
      component: Login,
      beforeEnter: (to, from, next) = > {
      if (sessionStorage.getItem('access_token')
)
  {
    next('/dashboard')
  }
else
  {
    next()
  }
}
}
]
}
]
})
