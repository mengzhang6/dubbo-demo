本工程为dubbo一个demo工程
参考自：
https://mp.weixin.qq.com/s?__biz=MzAxNDMwMTMwMw==&mid=2247485250&idx=2&sn=e0cdcea3d46dd15edc6b073d2f949f20
https://mp.weixin.qq.com/s?__biz=MzAxNDMwMTMwMw==&mid=2247485250&idx=3&sn=27937375498b13e09b6bad234b0b88a7

1.下载zookeeper
在官网下载zookeeper后进行解压
https://zookeeper.apache.org/

2.解压完成后，进入conf目录
将zoo_sample.cfg改名为zooe.cfg
配置项使用默认配置即可

3.进入bin目录
运行zkServer.cmd

4.出现以下信息表示启动成功
tickTime set to 2000
binding to port 0.0.0.0/0.0.0.0:2181

5.在模块provider下
运行meng.study.dubbo.provider.Main类
启动服务提供方

6.在模块consumer下
运行meng.study.dubbo.consumer.Test类
启动服务消费方

