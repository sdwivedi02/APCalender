public static int numberOfLeapYears(int year1, int year2){

    int lowYear = 0;
    int highYear = 0;

    if(year1 > year2){
        highYear = year1;
        lowYear = year2;
    }else if(year2 > year1){
        highYear = year2;
        lowYear = year1;
    }

    int leapYearCount = 0;

    for(int i = lowYear, i < highYear, i++){
        if(isLeapYear(i)){
            leapYearCount++;
        }
    }

    return leapYearCount;

}

public static int dayOfWeek(int month, int day, int year){

    int firstDayOfYear = firstDayOfYear(year);
    int dayOfYear = dayOfYear(month, day, year);

    int dayOfWeek = (Math.floor(dayOfYear/7) - dayOfYear%7-1;

    int inputDayOfWeek = (day + Math.floor(2.6*month-0.2) - 2*(Math.floor(year/100)) + year + Math.floor(year/4) + Math.floor(Math.floor(year/100)/4))%4;

    return inputDayOfWeek;

}
