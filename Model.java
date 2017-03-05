
class Model {
    String username;
    String idNumber;
    Data data;

    private Machine statsGrabber;

    public Model() {
        statsGrabber = new Machine();
    }

    void update(String username, String idNumber) {
        this.username = username;
        this.idNumber = idNumber;
        statsGrabber.updateStats(username, idNumber);
        data = new Data(statsGrabber.getRawStats());

    }

    Data getData() {
        return data;
    }

}