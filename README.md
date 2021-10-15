# Non-Russian languages
[English](docs/English.md)
# logisim-reloaded-generated
<div>
    <h1>Что такое logisim-reloaded?</h1>
    <p>Это исправления в коде ванильного logisim, чтобы создать новый интерфейс и новые элементы, ускорение моделирования. Будет изменен тип передачи информации, что позволит симулировать объекты используя матрицу данных (ускорение элементов и параллельное использование, разрядность 32+, моделирование квантовых компьютеров).</p>
    <p>Из-за резких изменений реализаций методов использование исходного кода ванильного logisim невозможно. Проект был построен на своей системе данных и не своместим с ванильным logisim и logisim evolution (и с hc edition!)</p>
</div>
<div>
    <h1> Текущее состояние разработки:</h1>
    <dl>
        <dd>-дорабатывается класс среды работы (приостановлено, завершено на 90%)</dd>
        <dd>-создается оболочка GUI (приостановлено, завершено на 5-10%)</dd>
        <dd>-идет поиск методов импорта внешних модулей (приостановлено, не завершено)</dd>
        <dd>-планировка JFrame для объединения фонового awt и swing (приостановлено, завершено на 80-90%)</dd>
        <dd>-почти закончены классы портов и компонентов (приостановлено, завершено на 80-90%)</dd>
        <dd>-идет работа над взаимодействием с компонентами (приостановлено, завершено на 50-60%)</dd>
        <dd>-идет работа над парсером портов (приостановлено, завершено на ~100%)</dd>
    </dl>
</div>
<div>
    <h1>Общая информация:</h1>
    <dl>
        <dd>Текущая версия: 0</dd> 
        <dd>В текущем коде есть экспериментальные фрагменты, они нужны для проверки работы. Брать исходный код под основу чего-либо пока рано!</dd>
        <dd>Внимание, чтобы русские символы отображались после компиляции кореектно установите кодировку при компиляции windows-1251!</dd>
        <dd>Использовалась Java 16, другие версии не испытывались</dd>
        <dd>README переведен в html форму, для улучшение интерфейса</dd>
    </dl>
</div>
<div>
    <h1>Как запустить проект?</h1>
    <dl>
        <dt>через cmd:</dt>
        <dd>1. Перейти в корневую папку каталога: cd &lt;path_to_project_folder&gt;</dd>
        <dd>2. Скомпилировать проект (если нет в папке файлов .class): javac mainclassfolder\Main.java</dd>
        <dd>3. Зпустить главный класс: java mainclassfolder.Main</dd>
        <dt>через VScode:</dt>
        <dd>1. Открыть файл Main.java</dd>
        <dd>2. Запустить функцию main в этом файле</dd>
    </dl>
</div>
<div>
    <h1>Важная информация:</h1>
    <dl>
        <dd>Проект будет заморожен 2 сентября на неопределенный срок из-за того, что один из авторов не сможет вносить в него вклад (большая часть кода написана им).</dd>
        <dd>Но проект будет разморожен, как только смогут присоединится другие программисты (ответвлений на другие языки не допустимы, но блок взаимодействия проекта(в этой программе) с кодом других языков допустимо).</dd>
        <dd>Файлы sample&lt;number&gt; в корне проекта не несут смысловой нагрузки, они были необходимы для экспериметов.</dd>
        <dd>Посмотрите <a href="https://www.youtube.com/playlist?list=PLjB-AbJkJAiyMtiaTJtBDmIA5xvY2EBH3">youtube плэйлист</a>, чтобы посмотреть демонстрацию развития проекта. Также можно задавать вопросы в комментариях.</dd>
    </dl>
</div>
<div>
    <h1>Контакты:</h1>
    <dl>
        <dd>
            <a href="https://vk.com/communistic_sistema">Павел</a> - для написания сообщений отправьте запрос в друзья, сразу указав причину (вопросы по logisim-reloaded)
        </p>
        <dd>
            <a href="https://vk.com/lllzebralll">Зёбра</a>
        </p>
        <dd>
            <a href="https://vk.com/logisim">группа ВК</a> с открытым чатом, где есть @communistic_sistema и @lllzebralll
        </p>
    </dl>
</div>
<div align="center">
  <img src="resources/logisim-reloaded.png">
  <p>Новая иконка</p>
</div>
