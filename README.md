# RxLifecycle实践

## 依赖
```groovy
compile 'com.trello:rxlifecycle:1.0'

//用于绑定特点的生命周期
compile 'com.trello:rxlifecycle-android:1.0'

//用于绑定Activity和Fragment及其子类的生命周期  
compile 'com.trello:rxlifecycle-components:1.0'
```

## 使用方式

### 侵入式
直接继承使用RxActivity等类

### 非侵入式
可参考RxActivity的实现方式（未验证）