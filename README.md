# Проект по автоматизации тестирования для новогодней игры Ростелеком

<a target="_blank"  href="https://igra.rt.ru/"><img src="images/favicon.ico" width="25" height="25"  alt="Jenkins"/> Новогодняя онлайн-игра | Генератор подарков</a>
<p align="center">
<a href="https://igra.rt.ru/"><img src="images/generator_promo.png" width="900" height="400"  alt="IDEA"/></a>

</p>

## :scroll: Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#scroll-реализованные-проверки)
- [Сборка в Jenkins](#-jenkins-job)
- [Запуск тестов из терминала](#computer-Запуск-тестов-из-терминала)
- [Отчет в Telegram](#-уведомление-в-telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#-примеры-видео-о-прохождении-тестов)

## :rocket: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/intellij-idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :scroll: Реализованные-проверки

- :heavy_check_mark: Проверка работы разделов в неавторизованной зоне;
- :heavy_check_mark: Авторизация пользователя;
- :heavy_check_mark: Кнопка 'отправить' в разделе 'Написать нам' не кликабельна при незаполненных полях;

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/rostelecome/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/rostelecome/"><img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

* BROWSER_NAME (браузер, по умолчанию chrome)
* BROWSER_VERSION (версия браузера, по умолчанию 99.0)
* BROWSER_SIZE (размер окна браузера, по умолчанию 1920x1080)
* REMOTE_DRIVER_URL (логин, пароль и адрес удаленного сервера selenoid)


### :computer: Запуск тестов из терминала

```bash
gradle clean test
```

### :robot: Удаленный запуск:

```bash
clean
test
-DremoteUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub
-Dbrowser_name=${BROWSER_NAME}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_size=${BROWSER_SIZE}
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```


## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/telegram_report.jpg" width="290" height="290">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video_1.gif" width="300" height="200"  alt="video">
</p>