const base = {
    get() {
        return {
            url : "http://localhost:8080/jianshenfanghuiyuan/",
            name: "jianshenfanghuiyuan",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jianshenfanghuiyuan/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健身房会员管理系统"
        } 
    }
}
export default base
