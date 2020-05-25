    /**
     * Represents the individual entries of review from the XML file
     *
     * @author Mehwish
     */
    public class Reviewer {
        private String sn;
        private String personID;
        private String date;
        private String score;

        /**
         * Getters for this class
         */
        public String getSn() { return sn; }
        public String getPersonID() { return personID; }
        public String getDate() { return date; }
        public String getScore() { return score; }

        /**
         * Setters for this class
         */
        public void setSn(String sn) { this.sn = sn; }
        public void setPersonID(String personID) { this.personID = personID; }
        public void setDate(String date) { this.date = date; }
        public void setScore(String score) { this.score = score; }

        @Override
        public String toString() {
            return "Review [SN=" + sn + ",personID=" + personID + ", date=" + date +
                    ", score=" + score + "]";

        }
    }
