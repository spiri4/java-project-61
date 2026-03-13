[![Actions Status](https://github.com/spiri4/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/spiri4/java-project-61/actions)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=bugs)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=spiri4_java-project-61&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=spiri4_java-project-61)

## Brain Games (Java)

Небольшой учебный проект Brain Games: набор консольных мини‑игр для тренировки арифметики и логики.  
Игры запускаются из одного entrypoint‑класса `App` и работают в терминале.

### Доступные игры

- **1 – Greet**: простое приветствие по имени.
- **2 – Even**: определить, является ли число чётным.
- **3 – Calc**: посчитать значение случайного арифметического выражения.
- **4 – GCD**: найти наибольший общий делитель двух чисел.
- **5 – Progression**: найти пропущенное число в арифметической прогрессии.
- **6 – Prime**: определить, является ли число простым.

Каждая игра:
- сначала приветствует игрока (имя запрашивается перед стартом игры),
- задаёт по одному вопросу в трёх раундах,
- завершает программу либо с поздравлением, либо с сообщением об ошибке.

### Требования

- Установленная **Java 17+** (подходит и JDK 21, проверено).
- Терминал / командная строка.

### Сборка и запуск

Из корня проекта:

```bash
# Компиляция
javac -d out $(find src/main/java -name "*.java")

# Запуск
java -cp out io.hexlet.App
```

После запуска вы увидите меню с доступными играми. Выберите номер, нажмите Enter и следуйте подсказкам в консоли.

Пример игрового процесса: https://asciinema.org/a/GOvyfPr4xGxfD47k
