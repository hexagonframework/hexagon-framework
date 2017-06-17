<template>
  <div class="app flex-row align-items-center">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-5">
          <div class="card-group mb-0">
            <div class="card p-4">
              <div class="card-block">
                <h1>登录</h1>
                <p class="text-muted">管理后台系统</p>
                <div class="input-group mb-3">
                  <span class="input-group-addon"><i class="icon-user"></i></span>
                  <input type="text" class="form-control" placeholder="用户名" v-model="username" >
                </div>
                <div class="input-group mb-4">
                  <span class="input-group-addon"><i class="icon-lock"></i></span>
                  <input type="password" class="form-control" placeholder="密码" v-model="password">
                </div>
                <div class="row">
                  <div class="col-6">
                    <button type="button" class="btn btn-primary px-4" @click="onLogin">登录</button>
                  </div>
                  <div class="col-6 text-right">
                    <button type="button" class="btn btn-link px-0">忘记密码?</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <alert :show.sync="showError" placement="top" duration="3000" type="warning" width="400px" dismissable>
      <span class="icon-ok-circled alert-icon-float-left"></span>
      <strong>失败</strong>
      <p>登录失败.</p>
    </alert>
  </div>
</template>

<script>
import { alert } from 'vue-strap'
export default {
  name: 'Login',
  components: {
    alert
  },
  data () {
    return {
      username: '',
      password: '',
      showError: false
    }
  },
  methods: {
    onLogin () {
      if (this.username === 'admin' && this.password === 'admin') {
        sessionStorage.setItem('access_token', 'jskdjgkwer12314312jkhk')
        sessionStorage.setItem('username', this.username)
        this.$router.push('/')
      } else {
        this.showError = true
      }
    }
  }
}
</script>
