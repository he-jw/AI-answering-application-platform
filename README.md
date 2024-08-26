#AI 答题应用平台

## 项目简介

### 项目介绍

基于 Spring Boot、MySQL、Redis、ChatGLM、Caffeine和 SSE 的 AI 答题应用平台。用户可以通过 AI 快速生成题目并创建应用，经过管理员审核后，用户可以在线答题，并根据多种评分算法或 AI 生成回答总结。管理员还可以集中管理全站内容，并进行统计分析。

### 项目展示

应用详情页：

![image](https://github.com/user-attachments/assets/b5ab95a8-b76b-4d93-a6f7-277693529a13)


用户答题页面：

![image](https://github.com/user-attachments/assets/2918b194-d511-40c4-8671-800c0296bedc)


创建应用页：

![image](https://github.com/user-attachments/assets/33e15bb0-313f-413e-87c1-b9e3fcda40ac)


创建题目页，涉及复杂动态嵌套表单的开发：
![image](https://github.com/user-attachments/assets/889d21c2-127c-437e-9d20-f36d06bbc6a7)




应用管理页面：

![image](https://github.com/user-attachments/assets/4f15f9db-011d-4980-8c97-8b9762733258)



统计分析页面：

![](https://pic.yupi.icu/1/20240604145230905.png)

应用分享功能：

![](https://pic.yupi.icu/1/20240604145231269.png)

## 架构设计

### 1、核心业务流程图

![](https://pic.yupi.icu/1/20240604145232082.png)

### 2、时序图

![](https://pic.yupi.icu/1/20240604145232239.png)

### 3、架构设计图

![](https://pic.yupi.icu/1/20240604145232474.png)



## 技术选型

### 后端

- Java Spring Boot 开发框架（万用后端模板）
- 存储层：MySQL 数据库 + Redis 缓存 + 腾讯云 COS 对象存储
- MyBatis-Plus 及 MyBatis X 自动生成
- Redisson 分布式锁
- Caffeine 本地缓存
- ⭐️ 基于 ChatGLM 大模型的通用 AI 能力
- ⭐️ RxJava 响应式框架 + 线程池隔离实战 
- ⭐️ SSE 服务端推送
- ⭐️ Shardingsphere 分库分表
- ⭐️ 幂等设计 + 分布式 ID 雪花算法
- ⭐️ 多种设计模式
- ⭐️ 多角度项目优化：性能、稳定性、成本优化、产品优化等



### 前端

#### Web 网页开发

- Vue 3 
- Vue-CLI 脚手架
- Axios 请求库
- Arco Design 组件库
- 前端工程化：ESLint + Prettier + TypeScript
- 富文本编辑器
- QRCode.js 二维码生成
- ⭐️ Pinia 状态管理
- ⭐️ OpenAPI 前端代码生成

#### 小程序开发

- React
- Taro 跨端开发框架
- Taro UI 组件库

### 开发工具

- 前端 IDE：JetBrains WebStorm
- 后端 IDE：JetBrains IDEA
- [CodeGeeX 智能编程助手](https://codegeex.cn/)
