//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger logger = new SimpleLogger();
        logger.log("Пробуждение");
        logger.log("Почистить зубы");
        logger.log("Зарядка");
        logger.log("Завтрак");
        logger.log("Прилечь отдохнуть - ошибка");
        Logger logger1 = new SmartLogger();
        logger1.log("Пробуждение");
        logger1.log("Почистить зубы");
        logger1.log("Зарядка");
        logger1.log("Завтрак");
        logger1.log("Прилечь отдохнуть - ошибка");

        }
    }
