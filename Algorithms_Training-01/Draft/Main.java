package Draft;

public class Main {
    public static void main(String args[]) {
        System.out.println(check("GNGSA,A,3,05,22,20,14,13,,,,,,,,6.75,4.53,5.00*1F"));
        System.out.println(check("GPGGA,123519,4807.038,N,01131.000,E,1,08,0.9,545.4,M,46.9,M,,*47"));

        System.out.println(check("IIVHW,48.4,T,48.4,M,3.5,N,6.5,K*50"));
        System.out.println(check("GPGLL,3456.742673,S,13832.041213,E,102059.659,A*25"));
        System.out.println(check("GPGSV,4,4,13,30,72,100,*4C"));
        System.out.println(check("GPRMC,123823.532,A,3445.124541,S,13832.258835,E,6.7,1.6,010224,,,*37"));

        System.out.println(calculateChecksum("GNGGA,064004.00,5540.33861,N,03716.00482,E,1,03,6.38,194.6,M,13.7,M,,*43"));
        System.out.println(calculateChecksum("GPGGA,123519,4807.038,N,01131.000,E,1,08,0.9,545.4,M,46.9,M,,*47"));

        System.out.println(calculateChecksum("IIVHW,48.4,T,48.4,M,3.5,N,6.5,K*50"));
        System.out.println(calculateChecksum("GPGLL,3456.742673,S,13832.041213,E,102059.659,A*25"));
        System.out.println(calculateChecksum("GPGSV,4,4,13,30,72,100,*4C"));
        System.out.println(calculateChecksum("GPRMC,123823.532,A,3445.124541,S,13832.258835,E,6.7,1.6,010224,,,*37"));


//        System.out.println(calculateChecksum("GNGGA,064004.00,5540.33861,N,03716.00482,E,1,03,6.38,194.6,M,13.7,M,,*43"));
//        System.out.println(calculateChecksum("GPGGA,123519,4807.038,N,01131.000,E,1,08,0.9,545.4,M,46.9,M,,*47"));
//        System.out.println(calculateChecksum("IIVHW,48.4,T,48.4,M,3.5,N,6.5,K*50"));
//        System.out.println(calculateChecksum("GPGLL,3456.742673,S,13832.041213,E,102059.659,A*25"));
//        System.out.println(calculateChecksum("GPGSV,4,4,13,30,72,100,*4C"));
//        System.out.println(calculateChecksum("GPRMC,123823.532,A,3445.124541,S,13832.258835,E,6.7,1.6,010224,,,*37"));
    }

    public static boolean check(String msg)
    {
        int msglen = msg.length();

        if (msglen > 4)
        {
            if (msg.charAt(msglen - 3) == '*')
            {
                // perform NMEASentenceParser checksum calculation

                String chk_s = checkSum(msg.substring(0, msglen - 3));

                // compare checksum to encoded checksum in msg
                return (msg.substring(msglen - 2, msglen).equals(chk_s));
            }
            else
            {
                // message doesn't have a checksum: accept it
                return true;
            }
        }

        // don't accept messages without checksum
        return false;
    }
    private static String checkSum(String msg)
    {
        // perform NMEASentenceParser checksum calculation
        int chk = 0;
        for (int i = 0; i < msg.length(); i++)
        {
            chk ^= msg.charAt(i);
        }

        String chk_s = Integer.toHexString(chk).toUpperCase();

        // checksum must be 2 characters!
        while (chk_s.length() < 2)
        {
            chk_s = "0" + chk_s;
        }

        return chk_s;
    }
    private static String calculateChecksum(String sentence) {
        int checksum = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);

            if (character == '*') {
                break; // Если достигнут символ '*', выходим из цикла
            } else {
                checksum ^= character;
            }
        }

        String checksumHex = Integer.toHexString(checksum).toUpperCase();

        if (checksumHex.length() < 2) {
            checksumHex = "0" + checksumHex;
        }

        return checksumHex;
    }
}
