###Adult Download

一个简单的自动化下载小程序，包括图片下载,种子和图片下载两部分。

请勿卵用,哦不是乱用!!!

请勿乱用，请勿乱用，请勿乱用!!!

不要传播,不要传播,不要传播!!!

重要事情说三遍。

欢迎提交Issues(你的任何想法,或想加入的xxx网站,或代码优化,或不合理的代码等等...)

Fork来提交PR吧,骚年...

别叫我老司机,叫我无人机

### 技术

- 完全使用Jsoup请求解析
- typesafe config处理配置文件
- junit测试

目前只支持两个网站。

- xxx图片站,功能是全站多线程下载图片保存磁盘。
- xxx论坛站,功能是登录论坛,请求帖子列表页,多线程解析种子附件下载地址,图片地址,下载保存磁盘。


***
以下是2015年7月份的,可以忽略了

### 技术

- 使用HttpClient请求数据
- 使用Jsoup解析Html
- 模拟登陆
- 构建Cookie
- 解析论坛附件信息
- 下载附件
- 下载帖子图片

目前都是单线程下载，只支持论坛第一页请求解析下载，未支持分页请求解析等，以后需求大了，再完善吧。

### 如何使用

1. 修改HttpClientDemo中的DOWNLOAD_PATH字段属性，指定下载目录.

2. 运行HttpClientDemo中的Main方法,Enjoy...

运行部分日志如下:

```
------开始登录------
------登录成功------
------构建Cookie------
------构建Cookie成功------
------构建Context------
------构建Context成功------
------开始解析帖子列表------
------解析成功 一共22个帖子------
------开始处理第1个10月29日 最新pornograph.tv am156ayumi-あゆみ in千駄ヶ谷（24）------
------新建目录: /Users/zhujiajun/Downloads/torrent/ASIA-YOUMA/10月29日 最新pornograph.tv am156ayumi-あゆみ in千駄ヶ谷（24）/------
------新建目录成功------
------开始解析附件地址------
------解析附件地址成功------
------开始解析图片地址------
------解析图片地址成功------
------开始下载图片------
------下载图片成功------
------附件名称: am156ayumi.torrent------
------开始下载附件,目录: /Users/zhujiajun/Downloads/torrent/ASIA-YOUMA/10月29日 最新pornograph.tv am156ayumi-あゆみ in千駄ヶ谷（24）/ 请耐心稍等------
------附件下载成功,目录: /Users/zhujiajun/Downloads/torrent/ASIA-YOUMA/10月29日 最新pornograph.tv am156ayumi-あゆみ in千駄ヶ谷（24）/
------开始处理第2个[2fa1][avi] ipz648 18歳 DEBUT制服美少女濃厚4本番 真志田麻日里------
```