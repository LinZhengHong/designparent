package com.linzhenhong.desgin.patten.creational.singleton.enumsingleton;

/**
 * 枚举类-单例模式
 * @author LinZhenHong
 */

public enum EnumInstance {
        INSTANCE{
            @Override
            protected void printTest(){
                System.out.println("linzhenghong printTest");
            }
        };
        protected abstract void printTest();
        private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
