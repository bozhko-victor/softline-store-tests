# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/%s">allure.autotests.cloud/project/%s</a> (ask admin@qa.guru for access)

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/%s">jenkins.autotests.cloud/job/%s</a>


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>

# Автоматизация тестирования


## :atom: Стек


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

## :desktop_computer: Запуск тестов из командной строки

Запуск тестов с remote.properties:
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

### Автотесты можно запустить из Jenkins

<p align="center">
  <img src="img/story/story_jenkins.png">
</p>

### О пройденных тестах приходит уведомление через Telegram бота

<p align="center">
  <img src="img/story/story_telegram.png">
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