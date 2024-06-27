const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootqi5z1/",
            name: "springbootqi5z1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootqi5z1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线宠物用品交易网站"
        } 
    }
}
export default base
