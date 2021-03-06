## 微信
### 微信支付技术分享
- [Java中的微信支付（1）：API V3版本签名详解](https://mp.weixin.qq.com/s/iiTCr57FgbAb6s0P0hT-9Q)
- [Java中的微信支付（2）：API V3 微信平台证书的获取与刷新](https://mp.weixin.qq.com/s/O_YcnIRcl2MltElBupm3Hg)
- [Java中的微信支付（3）：API V3对微信服务器响应进行签名验证](https://mp.weixin.qq.com/s/cb2eTTRjHifNYUGpQETMCQ)
### 微信支付V3中的坑
- 代金券制券后不能修改，所以一定要注意
- 代金券激活券和制券要有一定的间隔时间，官方说是1分钟
- 发券不需要靠微信服务号，官方的描述是错误的，有一个支持微信登录的appid就行了
- 不要过分相信微信文档，微信文档不一定是真的，要问就问他们客服

## 支付宝

### 证书

请注意因为未来**SHA1withRSA**将被淘汰，因此采用最新的**SHA256withRSA**证书，旧的模式将不提供支持。步骤如下：

1.使用支付宝开发助手申请CSR文件

![先申请密钥对，再申请csr](./img/csr.png)
申请成功后看文件说明：

![](./img/file_info.png)

2.上传CSR设置证书

![](./img/set.png)

上传成功后需要下载证书，和配置的对应关系为：

![](./img/cert_path.png)

