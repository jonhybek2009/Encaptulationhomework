public class University {
        String name;
        String city;
        int foundationYear;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getFoundationYear() {
            return foundationYear;
        }
        public void setFoundationYear(int foundationYear) {
            this.foundationYear = foundationYear;
        }

        @Override
        public String toString() {
            return "University" + "name=" + name + ", city='" + city + " foundationYear=" + foundationYear ;
        }
    }




