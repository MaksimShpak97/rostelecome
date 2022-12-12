# Проект по автоматизации тестирования для новогодней игры Ростелеком

[//]: # (<img src="images/favicon.ico" width="25" height="25"  alt="Jenkins"/></a> Jenkins job)
<a target="_blank"  href="https://igra.rt.ru/"><img src="images/favicon.ico" width="25" height="25"  alt="Jenkins"/>Новогодняя онлайн-игра | Генератор подарков</a>
<p align="center">
<a href="https://miro.com/"><img src="images/generator_promo.png" width="900" height="400"  alt="IDEA"/></a>

</p>

## :scroll: Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#scroll-реализованные-проверки)
- [Сборка в Jenkins](#-jenkins-job)
- [Запуск тестов из терминала](#computer-Запуск-тестов-из-терминала)
- [Allure отчет](#-отчет-в-allure-report)
- [Интеграция с Allure TestOps](#Интеграция-с-Allure-TestOps)
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
- :heavy_check_mark: Проверка отображения вакансий выбранного города при клике на иконку столицы.
- :heavy_check_mark: Проверка наличия логотипа при смене языка.
- :heavy_check_mark: Проверка, что страница меняет свое названия при смене языка.
- :x: Пример упавшего теста.

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/rostelecome/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/rostelecome/"><img src="images/Jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

* BrowserName (браузер, по умолчанию chrome)
* BrowserVrersion (версия браузера, по умолчанию 91.0)
* BrowserSise (размер окна браузера, по умолчанию 1920x1080)
* BrowserMobile (название мобильного устройства, для примера iPhone X)
* remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
* videoStorage (адрес, по которому можно получить видео)

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
-DbrowserMobileView="${BROWSER_MOBILE}"
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/miro-e2e-tests-jenkins/45/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/Allure_main.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/Allure_tests.png">
</p>

### Гафики

<p align="center">
<img title="Allure Graphics" src="images/Allure_graphics.png">
</p>

## <img src="images/Allure_EE.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/16057">Allure TestOps</a>

### Дашборд

<p align="center">
<img title="Allure TestOps Dashboard" src="images/testOps_main.png">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure TestOps Tests" src="images/testOps_tests.png">
</p>


## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/telegram_report.png">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video_1.gif" width="250" height="153"  alt="video"> <img title="Selenoid Video" src="images/video_2.gif" width="250" height="153"  alt="video"> 
</p>