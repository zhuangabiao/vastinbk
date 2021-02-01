module.exports = {
    host: 'localhost',  //ip
    port: '8099',
    title: 'ReadMark',
    description: '我的个人网站',
    base: '/', // 这是部署到github相关的配置
    head: [ // 注入到当前页面的 HTML <head> 中的标签
        ['link', { rel: 'icon', href: '/images/logo.jpg' }], // 增加一个自定义的 favicon(网页标签的图标)
    ],
    markdown: {
        lineNumbers: false // 代码块显示行号
    },
    themeConfig: {
        logo: '/images/logo.jpg',
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
        sidebar: [
            {
                title: 'items01',
                collapsable: false,
                children: [
                    { title: 'items01', path:'/dev_manage/'},
                    { title: 'items02', path:'/dev_manage/aaa'}
                ]
            },
            {
                title: 'items02',
                collapsable: false,
                children: [
                    { title: 'items01', path:'/literature/aaa'},
                    { title: 'items02', path:'/literature/bbbb'}
                ]
            },
            {
                title: 'items03-1',
                collapsable: false,
                children: [
                    { title: 'items01', path:'/guide/'},
                    { title: 'items01', path: '/guide/bbbb' }
                ]
            },
                {
                    title: 'items03-2',
                    collapsable: false,
                    children: [
                        { title: 'items01', path:'/guide/aaaa/'},
                        { title: 'items01', path:'/guide/bbb/'}
                    ],
                },
            {
                title: 'items04',
                collapsable: false,
                children: [
                    { title: 'Chinese', path:'/language/chinese/'},
                    { title: 'English', path:'/language/english/'}
                ]
            }
        ],
        sidebarDepth: 2, // 侧边栏显示2级
    }
};