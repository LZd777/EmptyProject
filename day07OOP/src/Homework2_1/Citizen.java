package Homework2_1;

public class Citizen {
    String name;
    MyDate birthday;
    String idNumber;

    String getInfo() {
        return "姓名：" + name + "，身份证号码:" + idNumber + ",生日:" + birthday.dateToString();
    }

    void setBirthday(int year, int month, int day){
        birthday = new MyDate();
        birthday.year = year;
        birthday.month = month;
        birthday.day = day;
    }

}
