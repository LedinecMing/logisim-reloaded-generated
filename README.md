# logisim-reloaded-generated
Исправления в коде ванильного logisim, чтобы создать новый интерфейс и новые элементы, ускорение моделирования.
Будет изменен тип передачи информации, что позволит симулировать объекты используя матрицу данных (ускорение элементов и параллельное использование, разрядность 32+, моделирование квантовых компьютеров)

Текущее состояние разработки: 
<p>&nbsp&nbsp&nbsp-дорабатывается класс среды работы (приостановлено, завершено на 90%)</p> 
<p>&nbsp&nbsp&nbsp-создается оболочка GUI (приостановлено, завершено на 5-10%)</p>
<p>&nbsp&nbsp&nbsp-идет поиск методов импорта внешних модулей (приостановлено, не завершено)</p>
<p>&nbsp&nbsp&nbsp-планировка JFrame для объединения фонового awt и swing (приостановлено, завершено на 80-90%)</p>
<p>&nbsp&nbsp&nbsp-почти закончены классы портов и компонентов (приостановлено, завершено на 80-90%)</p>
<p>&nbsp&nbsp&nbsp-идет работа над взаимодействием с компонентами (приостановлено, завершено на 50-60%)</p>
<p>&nbsp&nbsp&nbsp-идет работа над парсером портов (приостановлено, завершено на ~100%)</p>

Текущая версия: 0

В текущем коде есть экспериментальные фрагменты, они нужны для проверки работы.
Брать исходный код под основу чего-либо пока рано!

<h1>Как запустить проект?</h1>
через cmd:
<p>&nbsp&nbsp&nbsp1. Перейти в корневую папку каталога: cd &lt;path_to_project_folder&gt;</p>
<p>&nbsp&nbsp&nbsp2. Скомпилировать проект (если нет в папке файлов .class): javac mainclassfolder\Main.java</p>
<p>&nbsp&nbsp&nbsp3. Зпустить главный класс: java mainclassfolder.Main</p>
через VScode:
<p>&nbsp&nbsp&nbsp1. Открыть файл Main.java</p>
<p>&nbsp&nbsp&nbsp1. Запустить функцию main в этом файле</p>

Внимание, чтобы русские символы отображались после компиляции кореектно установите кодировку при компиляции windows-1251!
Использовалась Java 16, другие версии не испытывались

Проект будет заморожен 2 сентября на неопределенный срок из-за того, что один из авторов не сможет вносить в него вклад (большая часть кода написана им).
Но проект будет разморожен, как только смогут присоединится другие программисты (ответвлений на другие языки не допустимы, но блок взаимодействия проекта(в этой программе) с кодом других языков допустимо).

Файлы sample&lt;number&gt; в корне проекта не несут смысловой нагрузки, они были необходимы для экспериметов

Посмотрите youtube плэйлист, чтобы посмотреть демонстрацию развития проекта. Также можно задавать вопросы в комментариях. ССылка на него: https://www.youtube.com/playlist?list=PLjB-AbJkJAiyMtiaTJtBDmIA5xvY2EBH3

Контакты:
https://vk.com/communistic_sistema - для написания сообщений отправьте запрос в друзья, сразу указав причину (вопросы по logisim-reloaded)
https://vk.com/logisim - группа с открытым чатом, где есть @communistic_sistema

<p aling="center">![Image alt](resources/logisim-reloaded.png)</p>