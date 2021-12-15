
# Проект по автоматизации тестирования интернет-магазина


## Используемый стек технологий:


<p align="center">
<img width="5%" title="IntelliJ IDEA" src="img/Intelij_IDEA.svg">
<img width="5%" title="Java" src="img/Java.svg">
<img width="5%" title="Selenide" src="img/Selenide.svg">
<img width="5%" title="Selenoid" src="img/Selenoid.svg">
<img width="5%" title="Allure Report" src="img/Allure_Report.svg">
<img width="5%" title="Gradle" src="img/Gradle.svg">
<img width="5%" title="JUnit5" src="img/JUnit5.svg">
<img width="5%" title="Github" src="img/Git.svg">
<img width="5%" title="Jenkins" src="img/Jenkins.svg">  
<img width="5%" title="REST-Assured" src="img/Rest-Assured.svg">
<img width="5%" title="Allure TestOps" src="img/Allure_EE.svg">
<img width="5%" title="Jira" src="img/Jira.svg">
<img width="5%" title="Telegram" src="img/Telegram.svg">
</p>

## Автотестами покрыт следующий функционал:
* UI тесты
    * Проверки (позитивная и негативные) авторизации зарегистрированного пользователя
    * Проверка успешности добавления товара в корзину
    * Проверка поиска товара в каталоге по его наименованию
    * Проверка наличия заголовка страницы
    * Проверка на отсутствие ошибок в логах страницы 


## Параметры для запуска тестов

Запуск тестов локально:
```bash
gradle clean test
```

Запуск тестов без remote.properties:
```bash
gradle clean test
-Dbrowser={BROWSER}
-DbrowserVersion={BROWSER_VERSION}
-DbrowserSize={BROWSER_SIZE}
-DbrowserMobileView={BROWSER_MOBILE}
-DremoteDriverUrl=https://{login}:{password}@{REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://{REMOTE_DRIVER_URL}/video/
-Dthreads={THREADS}
```

Ключи:
* Dbrowser - браузер, в котором будут выполняться тесты (по-умолчанию chrome)
* DbrowserVersion - версия браузера (по-умолчанию 91.0)
* DbrowserSize - разрешение окна браузера (по-умолчанию 1920x1080)
* DbrowserMobileView - формат устройства, на котором будут проводиться тесты
* DremoteDriverUrl - логин, пароль и адрес удаленного сервера, где будут выполняться тесты (по-умолчанию https://selenoid.autotests.cloud/wd/hub/)
* DvideoStorage - хранилище видео выполненных тестов (по-умолчанию https://selenoid.autotests.cloud/video/)
* Dthreads - количество параллельных потоков выполняющихся тестов (по-умолчанию 5)

Allure отчет:
```bash
allure serve build/allure-results
```

### Создание параметризованной сборки в Jenkins

<p align="center">
  <img src="img/story/jenkins.png">
</p>


### Видео о прохождении тестов

### Отчёт о прохождении автотестов в Allure Report

<p align="center">
  <img src="img/story/allure_1.png">
</p>

### Список автотестов в Allure Report

### Совместное управление ручным и автоматизированным тестированием в TMS Allure TestOps

<p align="center">
  <img src="img/story/testops.png">
</p>

### Интерграция Allure TestOps с Jira

<p align="center">
  <img src="img/story/jira.png">
</p>

### Уведомления о прохождении автотестов через Telegram бота

<p align="center">
  <img src="img/story/telegram.png">
</p>



### Автотесты можно запустить из Jenkins

<p align="center">
  <img src="img/story/story_jenkins.png">
</p>


### Allure отчет о пройденных тестах можно посмотреть из Jenkins или через бота

<p align="center">
  <img src="img/story/story_allure_report1.png">
</p>

### Каждый отдельный тест можно посмотреть по шагам, присутствуют логи/видео/снапшот

<p align="center">
  <img src="img/story/story_allure_report2.png">
</p>

### Генерируется отчет и для Allure TestOps

<p align="center">
  <img src="img/story/story_allure_testops1.png">
</p>

### Интеграция с Jira через Allure TestOps

<p align="center">
  <img src="img/story/story_jira.png">
</p>

## <img width="4%" title="Selenoid" src="img/Selenoid.svg"> Как запускается тест в Selenoid

<p align="center">
  <img src="img/QAG13 GIF.gif" alt="video" width="1000">
</p>