package TSK_703.TSK_703_3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();

        // Форматируем дату с использованием нескольких спецификаторов
        String formattedDate = String.format("Текущее время: %tH:%tM:%tS", currentDate, currentDate, currentDate);
        String formattedYear = String.format("Год: %tY", currentDate);
        String formattedMonth = String.format("Месяц: %tB", currentDate);
        String formattedDay = String.format("День месяца: %te", currentDate);
        String formattedWeekday = String.format("День недели: %tA", currentDate);
        String formattedShortMonth = String.format("Сокрощенный месяц: %tb", currentDate);
        String formattedShortWeekday = String.format("Сокращенный день недели: %tA", currentDate);
        String formattedTimezone = String.format("Часовой пояс: %tZ", currentDate);
        String formattedEpoch = String.format("Время в миллисекундах с 1 января 1970: %tQ", currentDate);
        String formattedAMPM = String.format("Формат AM/PM: %tp", currentDate);

        System.out.println(formattedDate);
        System.out.println(formattedYear);
        System.out.println(formattedMonth);
        System.out.println(formattedDay);
        System.out.println(formattedWeekday);
        System.out.println(formattedShortMonth);
        System.out.println(formattedShortWeekday);
        System.out.println(formattedTimezone);
        System.out.println(formattedEpoch);
        System.out.println(formattedAMPM);
    }
}