<template>
  <div id="app" class="container-fluid">
    <div class="site-info">
      <br />
      <img src="./assets/h2-logo-2.png" />
      <h1 style="color: orange">SA62</h1>
      <!-- <img :src="require('./assets/h2-client-server.png')" /> -->
      <h3>Vue SpringBoot H2</h3>
      <!-- <img width="640" height="480" src="https://spring.io/img/homepage/diagram-boot-reactor.svg" /> -->
    </div>
    <nav>
      <router-link class="btn btn-warning" to="/">Customers</router-link>&nbsp;
      <router-link class="btn btn-success" to="/add">Add</router-link>&nbsp;
      <router-link class="btn btn-danger" to="/search">Search</router-link>
    </nav>
    <br />
    <router-view />
  </div>
</template>

<script>
export default {
  name: "app"
};
</script>

<style>
.site-info {
  color: blue;
  margin-bottom: 20px;
}

.btn-primary {
  margin-right: 5px;
}

.container-fluid {
  text-align: center;
}
</style>
