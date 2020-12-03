package ClassAndInstance;


/*
包名规范
公司域名倒序.项目名.模块名.功能名
例如 package de.unistuttgart.Shuttle.remote.user;
 */

import Control.Method;

public class Instance {

    // static code block: executed when class loaded
    static {
        System.out.println("Class --> Instance loaded" + "\n");
    }
    public static void main(String[] args){
        System.out.println(Student.UNI_NAME);
        Method.method1();
        Student userA = new Student("userA",1,19,true,"John",
                new Address("London","MainStreet",25));
        Student userB = new Student("userB",2,25,false,"Alex",
                new Address("Berlin","DuckStreet",102));
        Student userC = new Student();


    }

/*
修饰符访问权限
public      公开
protected   同包 子类
缺省         同包
private     同类
 */

}

