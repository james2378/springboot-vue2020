const base = {
    get() {
        return {
            url : "http://localhost:8080/gerenyunpanguanli/",
            name: "gerenyunpanguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gerenyunpanguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人云盘管理系统"
        } 
    }
}
export default base
