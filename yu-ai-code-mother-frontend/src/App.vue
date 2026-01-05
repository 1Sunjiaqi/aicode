<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'

import { healthCheck } from '@/api/healthController.ts'
import { useLoginUserStore } from '@/stores/loginUser.ts'

const loginUserStore = useLoginUserStore();
loginUserStore.fetchLoginUser();
</script>

<template>
  <BasicLayout />
</template>

<style></style>
