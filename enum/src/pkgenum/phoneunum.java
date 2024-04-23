
package pkgenum;

public class phoneunum {
    
    public enum Phone {
        Phone1("iPhone", 2024, "15"),
        Phone2("xiaomi", 2022, "Note8t"),
        Phone3("Samsung", 2024, "s24");
    }

        private final String phonename;
        private final int year;
        private final String version;

    public phoneunum(String phonename, int year, String version) {
        this.phonename = phonename;
        this.year = year;
        this.version = version;
    }

        

            public String getPhonename() {
                return phonename;
            }

            public int getYear() {
                return year;
            }

            public String getVersion() {
                return version;
            }
}
    
