<template>
  <div class="sidebar">
    <nav class="sidebar-nav">
      <ul class="nav">
        <li class="nav-item">
          <router-link :to="'/dashboard'" class="nav-link"><i class="icon-speedometer"></i> 仪表盘</router-link>
        </li>
        <li class="nav-item nav-dropdown">
          <a class="nav-link nav-dropdown-toggle" href="#" @click="handleClick"><i class="icon-star"></i> 内容页面</a>
          <ul class="nav-dropdown-items">
            <li class="nav-item">
              <router-link :to="'/table'" class="nav-link" exact><i class="icon-puzzle"></i> 分页表格</router-link>
            </li>
          </ul>
        </li>
        <li class="nav-item nav-dropdown">
          <a class="nav-link nav-dropdown-toggle" href="#" @click="handleClick"><i class="icon-star"></i> 独立页面</a>
          <ul class="nav-dropdown-items">
            <li class="nav-item">
              <router-link :to="'/pages/login'" class="nav-link" exact><i class="icon-puzzle"></i> 登录</router-link>
            </li>
            <li class="nav-item">
                <router-link :to="'/pages/404'" class="nav-link" exact><i class="icon-puzzle"></i> 404错误</router-link>
            </li>
            <li class="nav-item">
              <router-link :to="'/pages/500'" class="nav-link" exact><i class="icon-puzzle"></i> 500错误</router-link>
            </li>
          </ul>
        </li>
      </ul>
    </nav>
  </div>
</template>
<script>

export default {
  name: 'sidebar',
  methods: {
    handleClick (e) {
      e.preventDefault()
      e.target.parentElement.classList.toggle('open')
    }
  }
}
</script>

<style lang="css">
  .nav-link {
    cursor:pointer;
  }
</style>
