class Schedule {
    private String date;
    private String time;
    private String room;

    public Schedule(String date, String time, String room) {
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public void createSchedule() {
        System.out.println("Schedule created");
    }
}
