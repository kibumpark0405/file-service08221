<template>
    <div>
        <String label="파일 이름" v-model="value.fileName" :editMode="editMode"/>
        <String label="파일 크기" v-model="value.fileSize" :editMode="editMode"/>
        <Boolean label="인덱싱 여부" v-model="value.indexed" :editMode="editMode"/>
        <Boolean label="업로드 여부" v-model="value.uploaded" :editMode="editMode"/>
        <String label="비디오 URL" v-model="value.videoUrl" :editMode="editMode"/>

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
    name: 'FileStatus',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "fileStatuses"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

