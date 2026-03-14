
JAR_FILE = build/libs/app-1.0-SNAPSHOT.jar

.PHONY: all build run clean

# Цель по умолчанию: собрать и запустить
all: build run

# Сборка проекта
build:
	chmod +x gradlew
	./gradlew build

# Запуск JAR файла
run:
	java -jar $(JAR_FILE)

# Очистка проекта
clean:
	./gradlew clean
