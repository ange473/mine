
public static Calendar getInstance(TimeZone zone, Locale aLocale) {

    return createCalendar(zone, aLocale);

}

 

private static Calendar createCalendar(TimeZone zone, Locale aLocale) {

    CalendarProvider provider = LocaleProviderAdapter.getAdapter(CalendarProvider.class, aLocale).getCalendarProvider();

    if (provider != null) {

        try {

            return provider.getInstance(zone, aLocale);

        } catch (IllegalArgumentException iae) {

        }

    }

 

    Calendar cal = null;

 

    if (aLocale.hasExtensions()) {

        String caltype = aLocale.getUnicodeLocaleType("ca");

        if (caltype != null) {

            switch (caltype) {

	            case "buddhist":

	            	cal = new BuddhistCalendar(zone, aLocale); break;

	            case "japanese":

	                cal = new JapaneseImperialCalendar(zone, aLocale); break;

	            case "gregory":

	                cal = new GregorianCalendar(zone, aLocale); break;

            }

        }

    }

    if (cal == null) {

        if (aLocale.getLanguage() == "th" && aLocale.getCountry() == "TH") {

            cal = new BuddhistCalendar(zone, aLocale);

        } else if (aLocale.getVariant() == "JP" && aLocale.getLanguage() == "ja" && aLocale.getCountry() == "JP") {

            cal = new JapaneseImperialCalendar(zone, aLocale);

        } else {

            cal = new GregorianCalendar(zone, aLocale);

        }

    }

    return cal;

}