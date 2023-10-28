package Data.Model;
        /*1. Создать package – data. Работу продолжаем в нем
        2. Реализовать абстрактный класс User и его наследники Student и Teacher.
        Родитель имеет в себе общие данные (пример: фио, год рождения и тд),
        а наследники собственные параметры
        ( – Пример: studentId для Student, disciplesTaught для Teacher).
         */
public class User {
    protected String name;
    protected String surname;
    protected int birthday;

            public User(String name, String surname, int birthday) {
                this.name = name;
                this.surname = surname;
                this.birthday = birthday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSurname() {
                return surname;
            }

            public void setSurname(String surname) {
                this.surname = surname;
            }

            public int getBirthday() {
                return birthday;
            }

            public void setBirthday(int birthday) {
                this.birthday = birthday;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", birthday=" + birthday +
                        '}';
            }
        }
