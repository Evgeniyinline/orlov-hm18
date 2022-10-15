package test;

import base.TestBase;
import data.UserData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.TestData;

public class DemoWeb extends TestBase {
    static UserData userData = new UserData();
    static UserData userDataChange = new UserData();
    static TestData testData = new TestData();

    @Test
    @DisplayName("Регистрация нового пользователя на сайте")
    public void registrationTest() {
        testData.registration(userData);
    }

    @Test
    @DisplayName("Авторизация на сайте")
    public void login() {
        testData.login(userData);
        testData.openUserAccount(userData);
    }

    @Test
    @DisplayName("Редактирование профиля")
    public void changeProfile() {
        testData.registration(userData);
        testData.login(userData);
        testData.openUserAccount(userData);
        testData.changeProfile(userDataChange);
    }
}
