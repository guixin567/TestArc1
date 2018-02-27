### 实现效果
![Alt text](https://github.com/guixin567/TestArc1/blob/master/image/main.gif)
### 实现方式Room
    LiveData+ViewModel+Room
    Word:
        单词表
    WordDao:
        单词表的操作接口
    WordDB:
        单词表对应的数据库
    WordActivity:
        View层，进行数据的展示
    WordViewModel:
        持有数据，用于业务逻辑的处理
    WordRepository:
        提供数据，可以是数据库持久化数据，也可以是网络数据
        
### 实现方式ObjectBox
    LiveData+ViewModel+ObjectBox
    
    Word:
        单词表
    App：
        初始化ObjectBox,并提供BoxStore
        MyObjectBox.builder().androidContext(getApplicationContext()).build();
      WordActivity:
        View层，进行数据的展示
    WordViewModel:
        持有数据，用于业务逻辑的处理
    WordRepository:
        提供数据，可以是数据库持久化数据，也可以是网络数据
    
    
    注意事项：
        ObjectBox不需要数据库操作接口，也不需要手动创建数据库
        ObjectBox比Room更加的快，作者说在移动数据库中是最快的
        ObjectBox同样可以通过ObjectBoxLiveData将查询的数据封装成LiveData类型的数据
    
