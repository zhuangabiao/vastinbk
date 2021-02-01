module.exports = {
    title: 'ReadMark',
    description: '我的个人网站',
    head: [ // 注入到当前页面的 HTML <head> 中的标签
        ['link', { rel: 'icon', href: '/logo.jpg' }], // 增加一个自定义的 favicon(网页标签的图标)
    ],
    base: '/', // 这是部署到github相关的配置
    markdown: {
        lineNumbers: false // 代码块显示行号
    },
    themeConfig: {
        nav:[ // 导航栏配置
            {text: '前端基础', link: '/accumulate/' },
            {text: '算法题库', link: '/algorithm/'},
            {text: '微博', link: 'https://baidu.com'},
            { text: '学习',
                items: [
                    { text: '英语', link: '/study/english/english01' },
                    { text: '数学', link: '/study/math/math01' },
                ]
            }
        ],
        // 侧边栏配置
        sidebar: {
          '/home/':{
              title: '',
              collapsable: false,
              children: [
                  { title: '生活测试01', path: '/life/life01' },
                  { title: '生活测试02', path: '/life/life02' },
                  { title: '生活测试03', path: '/life/life03' },
              ]
          }
        },
        sidebarDepth: 2, // 侧边栏显示2级
    }
};