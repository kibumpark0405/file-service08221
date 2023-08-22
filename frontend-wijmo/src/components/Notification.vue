<template>
    <div>
        <String label="알림 유형" v-model="value.notificationType" :editMode="editMode"/>
        <String label="유저" v-model="value.user" :editMode="editMode"/>
        <notificationTypeType offline label="알림 유형 유형" v-model="value.notificationTypeType" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Notification',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "notifications"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

