
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/ui/FileGrid"

import IndexManager from "./components/ui/IndexGrid"

import VideoManager from "./components/ui/VideoGrid"

import NotificationManager from "./components/ui/NotificationGrid"

import FileStatusManager from "./components/ui/FileStatusGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },

            {
                path: '/notifications',
                name: 'NotificationManager',
                component: NotificationManager
            },

            {
                path: '/fileStatuses',
                name: 'FileStatusManager',
                component: FileStatusManager
            },



    ]
})
