package sec06.chap09;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime thisTime = LocalTime.now();
        System.out.println(thisTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        System.out.println("\n-----------\n");

        LocalDate christmas23 = LocalDate.of(2023, 12, 25);
        System.out.println(christmas23);

        LocalTime lunchTime = LocalTime.of(12, 30);
        LocalTime lunchTimeDetailed = LocalTime.of(12, 30, 0, 0);
        System.out.println(lunchTime);
        System.out.println(lunchTimeDetailed);

        LocalDateTime familyDinner = LocalDateTime.of(2023, 12, 25, 18, 00);
        System.out.println(familyDinner);

        System.out.println("\n-----------\n");

        today.plusDays(1);
        var tomorrow = today.plusDays(1);
        var yesterday = today.minusDays(1);

        for (var day : new LocalDate[]{today, tomorrow, yesterday}) {
            System.out.println(day);
        }

        var threeMonthsLater = today.plusMonths(3);
        var tenYearsBefore = today.minusYears(10);

        var hourAndHalfLater = thisTime.plusHours(1)
                .plusMinutes(30);

        var randomPast = now
                .minusYears(1)
                .plusMonths(2)
                .minusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .plusSeconds(6)
                .minusNanos(7);

        System.out.println("\n- - - - -\n");

        ZonedDateTime nowHere = ZonedDateTime.now();
        System.out.println(nowHere);

        var hereZone = nowHere.getZone();
        var newYorkYaer = ZonedDateTime.of(2023, 1, 1, 0, 0, 0, 0, ZoneId.of("America/New_York"));
        System.out.println(hereZone);

        var childrenDay30 = LocalDate.of(2030, 5, 5);
        Period toChldDay30 = Period.between(today, childrenDay30);
        int[] toChldDay30inUnits = {
                toChldDay30.getYears(),
                toChldDay30.getMonths(),
                toChldDay30.getDays()
        };

        var year2000 = LocalDateTime.of(2000, 1, 1, 0, 0);

        Duration from2000 = Duration.between(year2000, now);
        long[] from2000inUnits = {
                from2000.toDays(),
                from2000.toHours(),
                from2000.toMinutes(),
                from2000.toSeconds()

        };

        DateTimeFormatter formatter1 =
                DateTimeFormatter.ofPattern("1.yyyy-MM-dd");

        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("2. yyyy/MM/dd HH:mm:ss");

        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofPattern("3. yy.MM.dd");

        DateTimeFormatter formatter4 =
                DateTimeFormatter.ofPattern("4. dd/MM/yyyy hh a");

        DateTimeFormatter formatter5 =
                DateTimeFormatter.ofPattern("5. yyyy년 MM월 dd일 HH시");

        for (var formatter : new DateTimeFormatter[]{
                formatter1,
                formatter2,
                formatter3,
                formatter4,
                formatter5,
        }) {
            //  💡 형식에 따라 시간을 문자열로
            System.out.println(now.format(formatter));
        }

        //  역 : 문자열에서 시간 인스턴스로

        var christmas25str = "2025-12-25";
        DateTimeFormatter formatterA =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        var christmas25 = LocalDate
                .parse(christmas25str, formatterA);
        //  ⚠️ 시간 정보는 없으므로 LocalDateTime으로 하면 오류 발생

        var christmas25dinnerStr = "2025/12/25 18:00:00";
        DateTimeFormatter formatterB =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        var christmas25dinner = LocalDateTime
                .parse(christmas25dinnerStr, formatterB);

    }
}
