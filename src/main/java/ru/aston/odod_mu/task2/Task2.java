package main.java.ru.aston.odod_mu.task2;

public class Task2 {
    public static void main(String[] args){
        User admin = new User();
        User commonUser = new User("user", "user123", "Misha", 26);
        User babyUser = new User("user", "user123");
        User[] users = {admin, commonUser, babyUser};

        for(User user: users){
            user.somethingForAdmin();
            user.private_content();
        }
    }
}

class User{
    private final String login;
    private final String password;
    public String name;
    public int age;

    public User(){
        this.login = "admin";
        this.password = "admin123";
        this.age = 18;
    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String name){
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public User(String login, String password, String name, int age){
        this.login = login;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    public void somethingForAdmin(){
        if (this.login.equals("admin") && this.password.equals("admin123")){
            System.out.println("You are admin");
        }else{
            System.out.printf("You are not admin, you are %s \n", this.name);
        }
    }

    public void private_content(){
        if (this.age >= 18){
            System.out.println("Vodka\n");
        }else{
            System.out.println("No vodka, you are baby\n");
        }
    }


}