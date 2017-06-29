# java文档注释规范

## 什么地方加注释
### 基本注释（必须加）
1. 类/接口/枚举的注释
2. 构造方法的注释
3. 方法的注释
4. 全局变量的注释
5. 字段/属性的注释

> 备注：逻辑简单的做简单注释即可，另外，持久化对象、vo或dto对象的getter、setter方法不需加注释。

### 特殊注释（必须加）
1. 算法及复杂逻辑必须有注释
2. 在代码不明处必须有注释
3. 在循环和分支处必须有注释
4. 对外提供的接口必须有注释

## 注释的格式
### 单行注释
```
if ("AL0001".equals(bnkTranCo)) {
    // 身份鉴权(其实就是发短信)
    singleVirement.sendSms(dto);
} else if ("AL0005".equals(bnkTranCo)) {
    // 签约
    singleVirement.verify(dto);
} else {
    throw new CommandException("调度指令不支持的执行指令");
}
```

### 块注释
```
/**
 * 准备响应数据
 */
ReturnDto returnDto = new ReturnDto();
ResponsionDto respDto = new ResponsionDto();
TransactionMessageDto tranMsgDto = new TransactionMessageDto();
String serialNo = dto.getSerialNo();
String state = null;
String respCo = null;
String respMsg = null;
String merRespCo = null;
String merRespMsg = null;
String tranSt = null;
```

### 文档注释
```
/**
 * 根据用户名查找指定用户
 *
 * @param username 用户名
 * @return 返回查找到的唯一用户，如果没查到就会返回null
 */
User findUserByUsername(String username);
```

### 文档注释标签语法
<table>
    <tr>
        <th>标签</th>
        <th>标签类型</th>
        <th>说明</th>
    </tr>
    <tr>
        <td>@author 作者</td>
        <td>包、类、接口</td>
        <td>作者标识</td>
    </tr>
    <tr>
        <td>@version 版本号</td>
        <td>包、类、接口</td>
        <td>版本号</td>
    </tr>
    <tr>
        <td>@param 参数名 描述</td>
        <td>方法</td>
        <td>方法的入参名及描述信息，如入参有特别要求，可在此注释。</td>
    </tr>
    <tr>
        <td>@return 描述</td>
        <td>方法</td>
        <td>对方法返回值的注释</td>
    </tr>
    <tr>
        <td>@deprecated 过期文本</td>
        <td>包、类、接口、属性、方法</td>
        <td>标识随着程序版本的提升，当前API已经过期，仅为了保证兼容性依然存在，以此告之开发者不应再用这个API。</td>
    </tr>
    <tr>
        <td>@throws 异常类名</td>
        <td>方法</td>
        <td>方法所会抛出的异常。</td>
    </tr>
    <tr>
        <td>@exception 异常类名</td>
        <td>方法</td>
        <td>同@throws</td>
    </tr>
    <tr>
        <td>@see 引用</td>
        <td>包、类、接口、属性、 方法</td>
        <td>查看相关内容，如类、方法、变量等。</td>
    </tr>
    <tr>
        <td>@since 描述文本</td>
        <td>包、类、接口、属性、 方法</td>
        <td>API在什么程序的什么版本后开发支持。</td>
    </tr>
    <tr>
        <td>{@link包.类#成员 标签}</td>
        <td>包、类、接口、属性、 方法</td>
        <td>链接到某个特定的成员对应的文档中。</td>
    </tr>
    <tr>
        <td>{@value}</td>
        <td>静态值域</td>
        <td>当对常量进行注释时，如果想将其值包含在文档中，则通过该标签来引用常量的值。</td>
    </tr>
</table>

## 生成文档
### 使用jdk自带的命令
语法：

```
javadoc -d 指定生成目录 源文件.java 
```

例子：

```
javadoc -d /Users/kyg/docs/hello /Users/kyg/Hello.java
```

执行完成后在hello文件夹中打开index.html即可。

### 使用idea工具生成
> Idea > Tools > Generate JavaDoc...

如图：

![生成javadoc](https://kangyonggan.com/upload/javadoc.png)

## 其他
1. 接口必须写注释，实现不需要写注释，因为生成的javasoc中会自动使用接口的注释。
2. 文档描述使用的是html语法，换行使用<br>，段落使用<p>等。
3. 如果使用的是idea，可以在"File and Code Templates"中配置文件模板。
4. 生成文档过程中，如果注释写的不规范，生成过程会报警告，可以按警告提示去完善注释，也可以直接忽略。
5. 我的一个小[demo](https://github.com/kangyonggan/javadoc.git)


