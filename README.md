### nyou
spring native

### graalvm
```
#下载地址
https://github.com/graalvm/graalvm-ce-builds/releases

#环境变量
export JAVA_HOME="/data/tools/graalvm"
export PATH="$PATH:$JAVA_HOME/bin"
export MAVEN_HOME="/data/tools/apache-maven-3.8.1"
export PATH="$PATH:$MAVEN_HOME/bin"
```

### native-image
> 参考https://www.graalvm.org/reference-manual/native-image/
```
gu install native-image
```
> 如果gu安装失败，和谐的方式下载jar直接安装
```
#根据提示复制jar路径然后下载
wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-21.1.0/native-image-installable-svm-java11-linux-amd64-21.1.0.jar
#安装
gu -L install native-image-installable-svm-java11-linux-amd64-21.1.0.jar
```
### 其他所需编译包
```
#centos
sudo yum install gcc glibc-devel zlib-devel
#ubuntu 
sudo apt-get install build-essential libz-dev zlib1g-dev
#other
sudo dnf install gcc glibc-devel zlib-devel libstdc++-static
#macOS
xcode-select --install
```

### pom.xml配置
> 参考https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/#_sample_project_setup
