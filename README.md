# docker-test

#### 介绍
docker测试

#### 软件架构
##### 1.  pom.xml文件添加Docker 构建插件
##### 2.  如何构建docker镜像，请查看src/main/docker/Dockerfile

#### 安装教程

##### 1.  yum install docker -> 安装docker
##### 2.  service docker start -> 启动 docker 服务
##### 3.  chkconfig docker on -> 设置为开机启动
##### 4.  配置Docker加速器
vi  /etc/docker/daemon.json
｛
"registry-mirrors": ["https://registry.docker-cn.com"],
"live-restore": true
｝
##### 5.  service docker restart -> 重新启动 docker 服务
##### 6.  docker version -> 查看docker版本
##### 7.  安装jdk
##### 8.  安装maven -> 查看根目录下的README.txt
##### 9.  mvn package docker:build -> 使用 DockerFile 构建镜像

#### 使用说明

##### 1.  docker images -> 查看构建好的镜像
##### 2.  docker run -p 8080:8080 -t springboot/docker-test -> 运行该镜像
##### 3.  docker ps -> 查看正在运行的镜像
##### 4.  docker stop CONTAINER_ID -> 通过container_id停止镜像

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 码云特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5.  码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
