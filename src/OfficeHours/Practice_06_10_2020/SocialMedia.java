package OfficeHours.Practice_06_10_2020;

public abstract class SocialMedia {
    /*
    Social Media
(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)

     */

    protected String url;
    protected int accountLength;
    protected static String platform;

    public abstract boolean directMessage(String userName,String message);

    public abstract boolean createPost(String body);

    public abstract void notification(int time);



}
